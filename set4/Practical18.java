import java.util.*;

class Member {
    Scanner sc = new Scanner(System.in);

    int age;
    int phone;
    String name;
    String address;
    int salary;

    public void printSalary() {
        System.out.println("The salary of the member is" + this.salary);
    }

    public void getdata() {
        System.out.println("enter the age of member");
        this.age=sc.nextInt();

        System.out.println("enter the Name of member");
        this.name=sc.next();

        System.out.println("enter the phone number of member");
        this.phone=sc.nextInt();

        System.out.println("enter the address of member");
        this.address=sc.next();

        System.out.println("enter the salary of member");
        this.salary=sc.nextInt();
    }
    public void printdata() {
        System.out.println("The name of the member is " + this.name);
        System.out.println("The age of the member is " + this.age);
        System.out.println("The phone number of the member is " + this.phone);
        System.out.println("The address of the member is " + this.address);
        System.out.println("The salary of the member is "+this.salary);
    }
}
class employee extends Member {
    String specialization;
}
class manager extends Member {
    // String specialization;
    String department;
}
public class Practical18 {
    public static void main(String[] args) {
        employee e1 = new employee();
        manager m1 = new manager();
        e1.getdata();
        e1.printdata();
        m1.getdata();
        m1.printdata();
    }
}
