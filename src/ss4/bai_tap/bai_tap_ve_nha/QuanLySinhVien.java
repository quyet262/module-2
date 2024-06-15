package ss4.bai_tap.bai_tap_ve_nha;

public class QuanLySinhVien {
   protected SinhVien[] quanLySinhVien;
   protected int limit;
   protected int size;

   public QuanLySinhVien(int limit) {
      this.quanLySinhVien = new SinhVien[limit];
      this.limit = limit;
      this.size = 0;
   }

   public void themSinhVien(SinhVien sinhVien) {
      if (size <= limit) {
         quanLySinhVien[size] = sinhVien;
         size++;
         System.out.println("Sinh viên đã được thêm vào danh sách");
      } else {
         System.out.println("Danh sách sinh viên đã đầy");
      }
   }

   public void suaSinhVien(int maSV, String newTenSv, String newEmail, String newSdt, double newGpa) {
      for (int i = 0; i < size; i++) {
         if (quanLySinhVien[i].getMaSV() == maSV) {
            quanLySinhVien[i].setTenSv(newTenSv);
            quanLySinhVien[i].setEmail(newEmail);
            quanLySinhVien[i].setSdt(newSdt);
            quanLySinhVien[i].setGpa(newGpa);
            System.out.println("Sinh viên đã được cập nhật");
            return;
         }
      }
      System.out.println("Không tìm thấy sinh viên với mã SV: " + maSV);
   }

   public void xoaSinhVien(int maSV) {
      for (int i = 0; i < size; i++) {
         if (quanLySinhVien[i].getMaSV() == maSV) {
            for (int j = i; j < size - 1; j++) {
               quanLySinhVien[j] = quanLySinhVien[j + 1];
            }
            quanLySinhVien[size - 1] = null;
            size--;
            System.out.println("Sinh viên đã được xóa");
            return;
         }
      }
      System.out.println("Không tìm thấy sinh viên với mã SV: " + maSV);
   }

   public void hienThiSinhVien() {
      for (int i = 0; i < size; i++) {
         System.out.println(quanLySinhVien[i]);
      }
   }
}
