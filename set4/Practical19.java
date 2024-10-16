class Rectangle {
    int length, breadth;

    public Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public void area() {
        int area = this.length * this.breadth;
        System.out.println("the area is " + area);
    }

    public void perimeter() {
        int perimeter = 2 * (this.length + this.breadth);
        System.out.println("the perimeter is " + perimeter);
    }

}

class Square extends Rectangle {
    public Square(int x) {
        super(x, x);
    }
}


public class Practical19 {
    public static void main(String[] args) {
        Square[] s1 = new Square[2];

        s1[0] = new Square(10);
        
        s1[1] = new Square(5);

        s1[0].area();
        s1[0].perimeter();

        s1[1].area();
        s1[1].perimeter();

    }
    
}

