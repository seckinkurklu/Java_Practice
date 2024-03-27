package Java_Algorithm_Questions._RealEstatePropertyMatch;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {


        ArrayList<Property> properties = new ArrayList<>();

        properties.add(new CircleHouse("Circle House1", 5));
        properties.add(new CircleHouse("Circle House2", 6));
        properties.add(new CircleHouse("Circle House3", 7));


        properties.add(new SquareHouse("Square House1", 5));
        properties.add(new SquareHouse("Square House2", 6));
        properties.add(new SquareHouse("Square House3", 7));


        properties.add(new RectangleHouse("Rectangle House1", 5, 6));
        properties.add(new RectangleHouse("Rectangle House2", 7, 8));
        properties.add(new RectangleHouse("Rectangle House3", 9, 10));

    }
}
