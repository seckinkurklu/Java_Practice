package kafamagöre;

public class BirdSeed {

    private int numberBags;
    boolean call;

    public BirdSeed() {
        this(2);

        call = false;


    }

    public BirdSeed(int numberBags) {
        this.numberBags = numberBags;
    }

    public static void main(String[] args) {

        BirdSeed seed = new BirdSeed();
        System.out.println(seed.numberBags);

    }

}
