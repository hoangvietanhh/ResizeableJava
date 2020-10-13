public class Test  {
    public static void main(String[] args) {
        double per = Math.floor(Math.random() * 100 +1);
//        Circle circle = new Circle(2);
//        System.out.println("Befor: " + circle.getRadius());
//        circle.resize(per);
//        System.out.println("After: " + circle.getRadius());

//        Rectangle rectangle = new Rectangle(4,5);
//        System.out.println("Befor: " + rectangle.getLength() + "\t" + rectangle.getWidth());
//        rectangle.resize(per);
//        System.out.println("After: " + rectangle.getLength() + "\t" + rectangle.getWidth());

        Square square = new Square(5);
        System.out.println("Befor: " + square.getSide());
        square.resize(per);
        System.out.println("After: " + square.getSide());
    }
}
