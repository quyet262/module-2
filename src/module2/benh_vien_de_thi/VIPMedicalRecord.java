package module2.benh_vien_de_thi;

import java.util.Date;

class VIPMedicalRecord extends MedicalRecord {
    String vipType;
    Date vipExpiryDate;

    public VIPMedicalRecord(int id, String recordCode, String patientCode, String patientName, Date admissionDate, Date dischargeDate, String reason, String vipType, Date vipExpiryDate) {
        super(id, recordCode, patientCode, patientName, admissionDate, dischargeDate, reason);
        this.vipType = vipType;
        this.vipExpiryDate = vipExpiryDate;
    }

    @Override
    public void display() {
        System.out.println("Số Thứ Tự: " + id + ", Mã Bệnh Án: " + recordCode + ", Mã Bệnh Nhân: " + patientCode +
                ", Tên Bệnh Nhân: " + patientName + ", Ngày Nhập Viện: " + dateFormat.format(admissionDate) +
                ", Ngày Ra Viện: " + dateFormat.format(dischargeDate) + ", Lý Do: " + reason + ", Loại VIP: " + vipType + ", Thời Hạn VIP: " + dateFormat.format(vipExpiryDate));
    }
}

