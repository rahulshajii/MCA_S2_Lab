import java.util.Scanner;

class Person {
    String name, gender, address;
    int age;

    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    int empid;
    String companyname, qualification;
    float salary;

    Employee(int empid, String companyname, String qualification, float salary,
             String name, String gender, String address, int age) {
        super(name, gender, address, age);
        this.empid = empid;
        this.companyname = companyname;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String subject, department;
    int teacherid;

    Teacher(int empid, String companyname, String qualification, float salary,
            String name, String gender, String address, int age,
            String subject, String department, int teacherid) {
        super(empid, companyname, qualification, salary, name, gender, address, age);
        this.subject = subject;
        this.department = department;
        this.teacherid = teacherid;
    }

    void display() {
        System.out.println("***** Person ******");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);

        System.out.println("***** Employee ******");
        System.out.println("Empid: " + empid);
        System.out.println("Company: " + companyname);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);

        System.out.println("***** Teacher ******");
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacherid);
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit:");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        Teacher[] t = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("*** Enter the details ***");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("EmpID: ");
            int empid = sc.nextInt();
            sc.nextLine();

            System.out.print("Company Name: ");
            String companyname = sc.nextLine();

            System.out.print("Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("Salary: ");
            float salary = sc.nextFloat();
            sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Teacher ID: ");
            int teacherid = sc.nextInt();
            sc.nextLine();

            t[i] = new Teacher(empid, companyname, qualification, salary,
                    name, gender, address, age,
                    subject, department, teacherid);
        }

        for (int i = 0; i < n; i++) {
            t[i].display();
        }
    }
}