class parent {
    public void displayparent() {
        System.out.println("this is parent class");
    }
}
class child extends parent {
    public void displaychild() {
        System.out.println("this is child class");
    }
}
public class Practical17 {
    public static void main(String[] args) {
        parent p1=new parent();
        child c1= new child();
        System.out.println("calling parent class method");
        p1.displayparent();
        System.out.println("calling inherited method from child class");
        c1.displayparent();
        System.out.println("calling child class method");
        c1.displaychild();
    }
}
