package Java_Algorithm_Questions._RealEstatePropertyMatch;

public class CircleHouse extends Property {


    private double radius_cap;

    public CircleHouse(String name, double radius_cap) {
        super(name);
        this.radius_cap = radius_cap;
    }

    @Override
    public double calculatearea() {
        return Math.PI * radius_cap * radius_cap;
    }
}
