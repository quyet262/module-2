package module2.benh_vien_de_thi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static module2.benh_vien_de_thi.MedicalRecord.dateFormat;

public class MedicalRecordSystem {
    private static final String FILE_PATH = "src/module2/benh_vien_de_thi/data.csv";
    private List<MedicalRecord> records;

    public MedicalRecordSystem() {
        records = new ArrayList<>();
        loadRecords();
    }

    public void addRecord() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập mã bệnh án (BA-XXX): ");
            String recordCode = scanner.nextLine();
            if (!MedicalRecord.isValidRecordCode(recordCode)) {
                throw new IllegalArgumentException("Định dạng mã bệnh án không hợp lệ.");
            }
            for (MedicalRecord record : records) {
                if (record.getRecordCode().equals(recordCode)) {
                    throw new DuplicateMedicalRecordException("Bệnh án đã tồn tại.");
                }
            }

            System.out.print("Nhập mã bệnh nhân (BN-XXX): ");
            String patientCode = scanner.nextLine();
            if (!MedicalRecord.isValidPatientCode(patientCode)) {
                throw new IllegalArgumentException("Định dạng mã bệnh nhân không hợp lệ.");
            }

            System.out.print("Nhập tên bệnh nhân: ");
            String patientName = scanner.nextLine();

            System.out.print("Nhập ngày nhập viện (dd/MM/yyyy): ");
            Date admissionDate = MedicalRecord.parseDate(scanner.nextLine());

            System.out.print("Nhập ngày ra viện (dd/MM/yyyy): ");
            Date dischargeDate = MedicalRecord.parseDate(scanner.nextLine());

            if (admissionDate.after(dischargeDate)) {
                throw new IllegalArgumentException("Ngày nhập viện phải trước hoặc bằng ngày ra viện.");
            }

            System.out.print("Nhập lý do nhập viện: ");
            String reason = scanner.nextLine();

            System.out.print("Đây có phải là bệnh án VIP? (có/không): ");
            String isVip = scanner.nextLine();

            int id = records.size() + 1;
            MedicalRecord newRecord;

            if (isVip.equalsIgnoreCase("có")) {
                System.out.print("Nhập loại VIP (VIP I, VIP II, VIP III): ");
                String vipType = scanner.nextLine();
                if (!vipType.equals("VIP I") && !vipType.equals("VIP II") && !vipType.equals("VIP III")) {
                    throw new IllegalArgumentException("Loại VIP không hợp lệ.");
                }

                System.out.print("Nhập thời hạn VIP (dd/MM/yyyy): ");
                Date vipExpiryDate = MedicalRecord.parseDate(scanner.nextLine());

                newRecord = new VIPMedicalRecord(id, recordCode, patientCode, patientName, admissionDate, dischargeDate, reason, vipType, vipExpiryDate);
            } else {
                System.out.print("Nhập phí nằm viện: ");
                double hospitalFee = Double.parseDouble(scanner.nextLine());

                newRecord = new RegularMedicalRecord(id, recordCode, patientCode, patientName, admissionDate, dischargeDate, reason, hospitalFee);
            }

            records.add(newRecord);
            saveRecords();
            System.out.println("Thêm bệnh án thành công.");

        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public void deleteRecord() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập mã bệnh án để xóa: ");
            String recordCode = scanner.nextLine();

            MedicalRecord recordToDelete = null;
            for (MedicalRecord record : records) {
                if (record.getRecordCode().equals(recordCode)) {
                    recordToDelete = record;
                    break;
                }
            }

            if (recordToDelete == null) {
                System.out.println("Không tìm thấy bệnh án.");
                return;
            }

            System.out.print("Bạn có chắc chắn muốn xóa bệnh án này? (có/không): ");
            String confirmation = scanner.nextLine();

            if (confirmation.equalsIgnoreCase("có")) {
                records.remove(recordToDelete);
                saveRecords();
                System.out.println("Xóa bệnh án thành công.");
            } else {
                System.out.println("Hủy bỏ xóa bệnh án.");
            }

        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public void viewRecords() {
        for (MedicalRecord record : records) {
            record.display();
        }
    }

    private void loadRecords() {
        try (BufferedReader br = Files.newBufferedReader(Paths.get(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0]);
                String recordCode = values[1];
                String patientCode = values[2];
                String patientName = values[3];
                Date admissionDate = MedicalRecord.parseDate(values[4]);
                Date dischargeDate = MedicalRecord.parseDate(values[5]);
                String reason = values[6];

                if (values.length == 8) {
                    double hospitalFee = Double.parseDouble(values[7]);
                    records.add(new RegularMedicalRecord(id, recordCode, patientCode, patientName, admissionDate, dischargeDate, reason, hospitalFee));
                } else if (values.length == 9) {
                    String vipType = values[7];
                    Date vipExpiryDate = MedicalRecord.parseDate(values[8]);
                    records.add(new VIPMedicalRecord(id, recordCode, patientCode, patientName, admissionDate, dischargeDate, reason, vipType, vipExpiryDate));
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi tải bệnh án: " + e.getMessage());
        }
    }

    private void saveRecords() {
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(FILE_PATH))) {
            for (MedicalRecord record : records) {
                if (record instanceof RegularMedicalRecord) {
                    RegularMedicalRecord regRecord = (RegularMedicalRecord) record;
                    bw.write(regRecord.getId() + "," + regRecord.getRecordCode() + "," + regRecord.getPatientCode() + "," +
                            regRecord.patientName + "," + dateFormat.format(regRecord.admissionDate) + "," +
                            dateFormat.format(regRecord.dischargeDate) + "," + regRecord.reason + "," + regRecord.hospitalFee + "\n");
                } else if (record instanceof VIPMedicalRecord) {
                    VIPMedicalRecord vipRecord = (VIPMedicalRecord) record;
                    bw.write(vipRecord.getId() + "," + vipRecord.getRecordCode() + "," + vipRecord.getPatientCode() + "," +
                            vipRecord.patientName + "," + dateFormat.format(vipRecord.admissionDate) + "," +
                            dateFormat.format(vipRecord.dischargeDate) + "," + vipRecord.reason + "," + vipRecord.vipType + "," + dateFormat.format(vipRecord.vipExpiryDate) + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi lưu bệnh án: " + e.getMessage());
        }
    }
}