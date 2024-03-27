package Java_Algorithm_Questions._RealEstatePropertyMatch;

abstract class Property {

    private String name;

    @Override
    public String toString() {
        return this.name;
    }


    public Property(String name) {
        this.name = name;

    }

    public abstract double calculatearea();



}
