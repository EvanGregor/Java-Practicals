class Degree {
    public void getDegree() {
        System.out.println("i got a degree");
    }
}

class Undergraduate extends Degree {
    public void getDegree() {
        System.out.println("i am undergraduate");
    }
}

class Postgraduate extends Degree {
    public void getDegree() {
        System.out.println("i am postgraduate");
    }
}

public class Practical21 {
    public static void main(String[] args) {
        Degree d1 = new Degree();
        Undergraduate u1 = new Undergraduate();
        Postgraduate p1 = new Postgraduate();

        d1.getDegree();

        u1.getDegree();
        p1.getDegree();
        
    }
}
