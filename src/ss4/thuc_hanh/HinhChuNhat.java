package ss4.thuc_hanh;

public class HinhChuNhat {
    double chieuRong,chieuDai;
    public HinhChuNhat(double chieuRong, double chieuDai) {
        this.chieuRong = chieuRong;
        this.chieuDai = chieuDai;
    }
    public double getChuVi() {
        return (this.chieuDai + this.chieuRong)*2;
    }
    public double getDienTich() {
        return this.chieuDai * this.chieuRong;
    }
    public String hienThi() {
        return "Hình chữ nhật{" + " chiều rộng " + chieuRong + " chiều dài " + chieuDai + "}";
    }
}


