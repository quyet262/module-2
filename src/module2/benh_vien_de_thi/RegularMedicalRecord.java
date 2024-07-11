package module2.benh_vien_de_thi;

import java.util.Date;

class RegularMedicalRecord extends MedicalRecord {
    double hospitalFee;

    public RegularMedicalRecord(int id, String recordCode, String patientCode, String patientName, Date admissionDate, Date dischargeDate, String reason, double hospitalFee) {
        super(id, recordCode, patientCode, patientName, admissionDate, dischargeDate, reason);
        this.hospitalFee = hospitalFee;
    }

    @Override
    public void display() {
        System.out.println("Số Thứ Tự: " + id + ", Mã Bệnh Án: " + recordCode + ", Mã Bệnh Nhân: " + patientCode +
                ", Tên Bệnh Nhân: " + patientName + ", Ngày Nhập Viện: " + dateFormat.format(admissionDate) +
                ", Ngày Ra Viện: " + dateFormat.format(dischargeDate) + ", Lý Do: " + reason + ", Phí Nằm Viện: " + hospitalFee);
    }
}

