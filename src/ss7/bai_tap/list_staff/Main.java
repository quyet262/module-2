package ss7.bai_tap.list_staff;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Get the maximum number of staff: ");
        int limit = sc.nextInt();
        sc.nextLine();

        StaffManager staffManager = new StaffManager(limit);
        boolean runStaff = true;
        while (runStaff) {
            System.out.println("1. Add staff: ");
            System.out.println("2. Edit staff: ");
            System.out.println("3. Delete staff: ");
            System.out.println("4. Show all staff: ");
            System.out.println("5. Displays the number of all employees: ");
            System.out.println("6. Displays the number of each employee type: ");
            System.out.println("7. Displays a list of employees by each employee type: ");
            System.out.println("8. Exit: ");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    boolean addStaff = true;
                    while (addStaff) {
                        System.out.println("What type of staff do you want to create?: ");
                        System.out.println("1. Add Office staff: ");
                        System.out.println("2. Add Factory staff: ");
                        System.out.println("3. Add Shipper: ");
                        System.out.println("4. Exit: ");
                        System.out.println("Enter your choice: ");
                        int choiceAdd = sc.nextInt();
                        sc.nextLine();
                        switch (choiceAdd) {
                            case 1:
                                System.out.println("Enter id: ");
                                int idOffice = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter name: ");
                                String nameOffice = sc.nextLine();
                                System.out.println("Enter phone number: ");
                                String phoneNumberOffice = sc.nextLine();
                                System.out.println("Enter position: ");
                                String positionOffice = sc.nextLine();
                                Staff officeStaff = new OfficeStaff(idOffice, nameOffice, phoneNumberOffice, positionOffice);
                                staffManager.add(officeStaff);
                                break;
                            case 2:
                                System.out.println("Enter id: ");
                                int idFactory = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter name: ");
                                String nameFactory = sc.nextLine();
                                System.out.println("Enter phone number: ");
                                String phoneNumberFactory = sc.nextLine();
                                System.out.println("Enter position: ");
                                String positionFactory = sc.nextLine();
                                System.out.println("Enter factory code: ");
                                String factoryCode = sc.nextLine();
                                System.out.println("Enter type");
                                String type = sc.nextLine();
                                Staff factoryStaff = new FactoryStaff(idFactory, nameFactory, phoneNumberFactory, positionFactory, factoryCode, type);
                                staffManager.add(factoryStaff);
                                break;
                            case 3:
                                System.out.println("Enter id: ");
                                int idShipper = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter name: ");
                                String nameShipper = sc.nextLine();
                                System.out.println("Enter phone number: ");
                                String phoneNumberShipper = sc.nextLine();
                                System.out.println("Enter position: ");
                                String positionShipper = sc.nextLine();
                                System.out.println("Enter range Of Vehicle: ");
                                String rangeOfVehicle = sc.nextLine();
                                Staff shipper = new Shipper(idShipper, nameShipper, phoneNumberShipper, positionShipper, rangeOfVehicle);
                                staffManager.add(shipper);
                                break;
                            case 4:
                                System.out.println("Exit the staff addStaff program");
                                addStaff = false;
                                break;
                            default:
                                System.out.println("Invalid selection");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter id staff need edit: ");
                    int idEdit = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the name of the staff who needs editing");
                    String nameEdit = sc.nextLine();

                    System.out.println("Enter the phone number of the staff who needs editing");
                    String phoneNumberEdit = sc.nextLine();

                    System.out.println("Enter the position of the staff who needs editing");
                    String positionEdit = sc.nextLine();

                    System.out.println("Do you want to enter factory code and type? (yes/no)");
                    String factoryCodeTypeChoice = sc.nextLine();

                    if (factoryCodeTypeChoice.equalsIgnoreCase("yes")) {
                        System.out.println("Enter the staff factory code that needs to be corrected (if any)");
                        String factoryCodeEdit = sc.nextLine();

                        System.out.println("Enter the staff type that needs to be corrected (if any)");
                        String typeEdit = sc.nextLine();

                        staffManager.edit(idEdit, nameEdit, phoneNumberEdit, positionEdit, factoryCodeEdit, typeEdit);
                    } else {
                        System.out.println("Do you want to enter range of vehicle? (yes/no)");
                        String rangeOfVehicleChoice = sc.nextLine();

                        if (rangeOfVehicleChoice.equalsIgnoreCase("yes")) {
                            System.out.println("Enter the type of vehicle that needs repair");
                            String rangeOfVehicleEdit = sc.nextLine();

                            staffManager.edit(idEdit, nameEdit, phoneNumberEdit, positionEdit, rangeOfVehicleEdit);
                        } else {
                            staffManager.edit(idEdit, nameEdit, phoneNumberEdit, positionEdit);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter id staff need delete: ");
                    int idDelete = sc.nextInt();
                    sc.nextLine();
                    staffManager.delete(idDelete);
                    break;
                case 4:
                    staffManager.showStaff();
                    break;
                case 5:
                    int count = staffManager.getStaffcount();
                    System.out.println("The total number of employees on the list is: " + count);
                    break;
                case 6:
                    boolean check = false;
                    while (check) {
                        System.out.println("What type of employee do you want to see?");
                        System.out.println("1. list office staff.");
                        System.out.println("2. list factory staff.");
                        System.out.println("3. list shipper staff.");
                        System.out.println("4. Exit:");
                        System.out.println("Enter your choice: ");
                        int checkList = sc.nextInt();
                        sc.nextLine();
                        switch (checkList) {
                            case 1:
                                System.out.println("The number of types of office workers is: " + staffManager.getCountOfficeStaff());
                                break;
                            case 2:
                                System.out.println("The number of types of factory workers is: " + staffManager.getCountFactoryStaff());
                                break;
                            case 3:
                                System.out.println("The number of types of shipper workers is: " + staffManager.getCountShipper());
                                break;
                            case 4:
                                check = false;
                                break;
                            default:
                                System.out.println("Invalid selection");
                        }
                    }
                    break;
                case 7:
                    boolean show = true;
                    while (show) {
                        System.out.println("What type of employee do you want to see?");
                        System.out.println("1. list office staff.");
                        System.out.println("2. list factory staff.");
                        System.out.println("3. list shipper staff.");
                        System.out.println("4. Exit:");
                        System.out.println("Enter your choice: ");
                        int checkShow = sc.nextInt();
                        sc.nextLine();
                        switch (checkShow) {
                            case 1:
                                System.out.println("The number of types of offices is: ");
                                staffManager.showOfficeStaff();
                                break;
                            case 2:
                                System.out.println("The number of types of factory staff is: ");
                                staffManager.showFactoryStaff();
                                break;
                            case 3:
                                System.out.println("The number of types of shipper staff is: ");
                                staffManager.showShipperStaff();
                                break;
                            case 4:
                                show = false;
                                break;
                            default:
                                System.out.println("Invalid selection");
                        }
                    }
                    break;

                case 8:
                    System.out.println("Exit the staff addStaff program");
                    runStaff = false;
                    break;
                default:
                    System.out.println("Invalid selection");
            }
        }
    }
}

