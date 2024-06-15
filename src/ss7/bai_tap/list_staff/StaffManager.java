package ss7.bai_tap.list_staff;

public class StaffManager implements IManager<Staff> {
    private Staff[] staffManager;
    private int limit;
    private int size;

    public StaffManager() {
    }

    public StaffManager(int limit) {
        this.staffManager = new Staff[limit];
        this.limit = limit;
        this.size = 0;
    }

    @Override
    public void add(Staff staff) {
        if (size < limit) {
            staffManager[size] = staff;
            size++;
            System.out.println("staff has been added to the list ");
        } else {
            System.out.println("staff list is full ");
        }

    }


    @Override
    public void edit(int id, String name, String phoneNumber, String position) {
        for (int i = 0; i < size; i++) {
            if (staffManager[i].getId() == id) {
                staffManager[i].setName(name);
                staffManager[i].setPhoneNumber(phoneNumber);
                staffManager[i].setPosition(position);
                System.out.println("staff has been edited ");
                return;
            }
        }
        System.out.println("Can't find the staff with id " + id);
    }

    public void edit(int id, String name, String phoneNumber, String position, String factoryCode, String type) {
        for (int i = 0; i < size; i++) {
            if (staffManager[i].getId() == id) {
                staffManager[i].setName(name);
                staffManager[i].setPhoneNumber(phoneNumber);
                staffManager[i].setPosition(position);
                if (staffManager[i] instanceof FactoryStaff) {
                    FactoryStaff factoryStaff = (FactoryStaff) staffManager[i];
                    factoryStaff.setFactoryCode(factoryCode);
                    factoryStaff.setType(type);
                }
                System.out.println("staff has been edited ");
                return;
            }
        }
        System.out.println("Can't find the staff with id " + id);
    }

    public void edit(int id, String name, String phoneNumber, String position, String rangeOfVehicle) {
        for (int i = 0; i < size; i++) {
            if (staffManager[i].getId() == id) {
                staffManager[i].setName(name);
                staffManager[i].setPhoneNumber(phoneNumber);
                staffManager[i].setPosition(position);
                if (staffManager[i] instanceof Shipper) {
                    Shipper shipper = (Shipper) staffManager[i];
                    shipper.setRangeOfVehicle(rangeOfVehicle);
                }
                System.out.println("staff has been edited ");
                return;
            }
        }
        System.out.println("Can't find the staff with id " + id);
    }


    @Override
    public void delete(int id) {
        for (int i = 0; i < size; i++) {
            if (staffManager[i].getId() == id) {
                for (int j = i; j < size - 1; j++) {
                    staffManager[j] = staffManager[j + 1];
                }
                staffManager[size - 1] = null;
                size--;
                System.out.println("staff has been deleted ");
                return;
            }
        }
        System.out.println("Can't find the staff with id " + id);

    }

    @Override
    public void showStaff() {
        for (int i = 0; i < size; i++) {
            System.out.println(staffManager[i]);
        }
    }
    public void showOfficeStaff(){
        for (int i = 0; i < size; i++) {
            if (staffManager[i] instanceof OfficeStaff) {
               System.out.println(staffManager[i]);
            }
        }
    }
    public void showFactoryStaff(){
        for (int i = 0; i < size; i++) {
            if (staffManager[i] instanceof FactoryStaff) {
               System.out.println(staffManager[i]);
            }
        }
    }
    public void showShipperStaff(){
        for (int i = 0; i < size; i++) {
            if (staffManager[i] instanceof Shipper) {
                System.out.println(staffManager[i]);
            }
        }
    }
    public int getStaffcount() {
        return size;
    }
    public int getCountFactoryStaff() {
        int countFactoryStaff = 0;
        for (Staff staff : staffManager) {
            if (staff instanceof FactoryStaff) {
                countFactoryStaff++;
            }
        }
        return countFactoryStaff;
    }
    public int getCountOfficeStaff() {
        int countOfficeStaff = 0;
        for (Staff staff : staffManager) {
            if (staff instanceof OfficeStaff) {
                countOfficeStaff++;
            }
        }
        return countOfficeStaff;
    }
    public int getCountShipper() {
        int countShipper = 0;
        for (Staff staff : staffManager) {
            if (staff instanceof Shipper) {
                countShipper++;
            }
        }
        return countShipper;
    }
}
