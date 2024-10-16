class Shape {
    public void displayshape(){
        System.out.println("This is Shape");
    }

}

class Rectangle extends Shape {
    public void displayRectangle() {
        System.out.println("this is Rectangular shape");
    }
    
}

class Circle extends Shape {
    public void displaycircle() {
        System.out.println("this is circular shape");
    }

}

class Square extends Rectangle {
    public void displaysquare() {
        System.out.println("Square is rectangle");
    }

}



public class Practical20 {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.displayRectangle();
        s1.displayshape();
    }
}
