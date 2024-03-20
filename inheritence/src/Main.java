class Amphibian {
    String noise;

    public void habitat() {
        System.out.println("Lives on land and in water.");
    }
}

class Frog extends Amphibian {
    public void factoid() {
        System.out.println("Absorbs water through its skin, so it doesn't need to drink water.");
    }
}

public class Main {
    public static void main(String[] args) {
        Amphibian toad = new Amphibian();
        toad.noise = "Croak!";
        toad.habitat();

        Frog poisonDartFrog = new Frog();
        poisonDartFrog.noise = "Ribbit!";
        poisonDartFrog.factoid();
        poisonDartFrog.habitat();
    }
}


