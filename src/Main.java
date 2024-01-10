public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(10);
        Box b2 = new Box(20);
        Box b3 = new Box(10, 5, 20);

        Box greater = b1.greaterVolume(b2);
        System.out.println(greater == b2);
        greater = b2.greaterVolume(b1);
        System.out.println(greater == b2);
        greater = b1.greaterVolume(b3);
        System.out.println(greater == null);
        greater = b3.greaterVolume(b1);
        System.out.println(greater == null);

        Box b11 = new Box(10);
        Box b21 = new Box(10, 5, 20);

        System.out.println(b11.boxInfo());
        System.out.println();
        System.out.println(b21.boxInfo());

        Box b111 = new Box(10);
        Shape shape = new Shape();
        b111.addToShape(shape);
        Box shapeBox = shape.getBox();
        System.out.println(b111 == shapeBox);
        System.out.println(shapeBox.boxInfo());
        System.out.println();
        Box b222 = new Box(20, 30, 40);
        b222.addToShape(shape);
        shapeBox = shape.getBox();
        System.out.println(b222 == shapeBox);
        System.out.println(shapeBox.boxInfo());

    }
}