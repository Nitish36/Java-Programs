import java.util.*;

class Employees {
    int empid;
    String empname, occupation;
    int salary, age;

    public Employees(int empid, String empname, String occupation, int salary, int age) {
        this.empid = empid;
        this.empname = empname;
        this.occupation = occupation;
        this.salary = salary;
        this.age = age;
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
            System.out.println(
                    e.empid + " " + e.empid + "," + e.empname + "," + e.occupation + "," + e.salary + "," + e.age);
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
                    int salary, age;
                    String name, occupation;
                    System.out.println("Enter the id,name,occupation,salary,age of the employee");
                    id = sc.nextInt();
                    name = sc.next();
                    occupation = sc.next();
                    salary = sc.nextInt();
                    age = sc.nextInt();

                    Employees obj = new Employees(id, name, occupation, salary, age);
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
                    occupation = sc.nextLine();
                    salary = sc.nextInt();
                    age = sc.nextInt();

                    Employees obj1 = new Employees(id, name, occupation, salary, age);
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
