package Java_Algorithm_Questions._RealEstatePropertyMatch;

public class SquareHouse extends Property {


    private double side_kenar;

    public SquareHouse(String name, double side_kenar) {
        super(name);
        this.side_kenar = side_kenar;
    }

    @Override
    public double calculatearea() {
        return side_kenar * side_kenar;

    }


}
