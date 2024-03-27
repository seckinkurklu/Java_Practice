package Java_Algorithm_Questions._RealEstatePropertyMatch;

public class RectangleHouse extends Property {


    private double lenght;
    private double width;

    public RectangleHouse(String name, double lenght, double width) {
        super(name);
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double calculatearea() {
        return lenght * width;
    }
}
