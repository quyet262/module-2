package ss4.bai_tap.BaiTapVeNha;

public class SinhVien {
    public int maSV;
    public String tenSv;
    public String email;
    public String sdt;
    public double gpa;

    public SinhVien() {
    }

    public SinhVien(int maSV, String tenSv) {
        this.maSV = maSV;
        this.tenSv = tenSv;
    }

    public SinhVien(int maSV, String tenSv, String email, String sdt, double gpa) {
        this.maSV = maSV;
        this.tenSv = tenSv;
        this.email = email;
        this.sdt = sdt;
        this.gpa = gpa;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV=" + maSV +
                ", tenSv='" + tenSv + '\'' +
                ", email='" + email + '\'' +
                ", sdt=" + sdt +
                ", gpa=" + gpa +
                '}';
    }
}
