package module2.benh_vien_de_thi;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class MedicalRecord {
    protected int id;
    protected String recordCode;
    protected String patientCode;
    protected String patientName;
    protected Date admissionDate;
    protected Date dischargeDate;
    protected String reason;
    protected static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public MedicalRecord() {}
    public MedicalRecord(int id, String recordCode, String patientCode, String patientName, Date admissionDate,
                         Date dischargeDate, String reason) {
        this.id = id;
        this.recordCode = recordCode;
        this.patientCode = patientCode;
        this.patientName = patientName;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.reason = reason;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecordCode() {
        return recordCode;
    }

    public void setRecordCode(String recordCode) {
        this.recordCode = recordCode;
    }

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public static SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public static void setDateFormat(SimpleDateFormat dateFormat) {
        MedicalRecord.dateFormat = dateFormat;
    }



    public static Date parseDate(String date) throws Exception {
        return dateFormat.parse(date);
    }

    public static boolean isValidRecordCode(String recordCode) {
        return recordCode.matches("BA-\\d{3}");
    }

    public static boolean isValidPatientCode(String patientCode) {
        return patientCode.matches("BN-\\d{3}");
    }

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "id=" + id +
                ", recordCode='" + recordCode + '\'' +
                ", patientCode='" + patientCode + '\'' +
                ", patientName='" + patientName + '\'' +
                ", admissionDate=" + admissionDate +
                ", dischargeDate=" + dischargeDate +
                ", reason='" + reason + '\'' +
                '}';
    }

    public abstract void display();
}
