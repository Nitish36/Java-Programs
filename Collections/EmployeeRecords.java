import java.util.*;

class Employees {
    int empid;
    String empname;
    int salary;

    public Employees(int empid, String empname, int salary) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }
}

public class hashmap {
    static HashMap<Integer, Employees> hm = new HashMap<Integer, Employees>();

    public static void add(Integer i, Employees e) {
        hm.put(i, e);
    }

    public static void remove(Integer i) {
        hm.remove(i);
    }

    public static void replace(Integer i, Employees e) {
        hm.replace(i, e);
    }

    public static void display() {
        System.out.println("Final Records Are");
        for (Map.Entry<Integer, Employees> entry : hm.entrySet()) {
            Employees e = entry.getValue();
            System.out.println(e.empid + " " + e.empid + "," + e.empname + "," + e.salary);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch;
        while (true) {
            System.out.println("Enter 1 to add a record");
            System.out.println("Enter 2 to remove a record");
            System.out.println("Enter 3 to replace a record");
            System.out.println("Enter 4 to display the records");
            System.out.println("Enter any key to exit");
            System.out.println("Enter ur choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    int id;
                    int salary;
                    String name;
                    System.out.println("Enter the id,name,salary of the employee");
                    id = sc.nextInt();
                    name = sc.next();
                    salary = sc.nextInt();

                    Employees obj = new Employees(id, name, salary);
                    add(id, obj);

                    break;

                case 2:
                    System.out.println("Enter the key whose record has to be removed");
                    id = sc.nextInt();
                    remove(id);

                    System.out.println("Record Successfully removed..");
                    break;
                case 3:
                    System.out.println("Enter the new record u want to replace with");
                    id = sc.nextInt();
                    name = sc.nextLine();
                    salary = sc.nextInt();

                    Employees obj1 = new Employees(id, name, salary);
                    replace(id, obj1);
                    break;
                case 4:
                    display();
                    break;

                default:
                    System.out.println("Wrong Choice");
                    sc.close();
            }

        }
    }
}
