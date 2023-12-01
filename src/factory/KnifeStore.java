package factory;


// Concrete product classes
class SteakKnife implements Knife {
    @Override
    public void sharpen() {
        System.out.println("Sharpening a steak knife.");
    }

    @Override
    public void polish() {
        System.out.println("Polishing a steak knife.");
    }

    @Override
    public void pack() {
        System.out.println("Packing a steak knife.");
    }
}

class ChefsKnife implements Knife {
    @Override
    public void sharpen() {
        System.out.println("Sharpening a chef's knife.");
    }

    @Override
    public void polish() {
        System.out.println("Polishing a chef's knife.");
    }

    @Override
    public void pack() {
        System.out.println("Packing a chef's knife.");
    }
}


// Creator interface (Factory)
interface KnifeFactory {
    Knife createKnife();
}


// Concrete creator classes
class SteakKnifeFactory implements KnifeFactory {
    @Override
    public Knife createKnife() {
        return new SteakKnife();
    }
}

class ChefsKnifeFactory implements KnifeFactory {
    @Override
    public Knife createKnife() {
        return new ChefsKnife();
    }
}


public class KnifeStore {
    public Knife orderKnife(String knifeType) {
        Knife knife = createKnife(knifeType);

        // Common operations for all knives
        knife.sharpen();
        knife.polish();
        knife.pack();

        return knife;
    }

    private Knife createKnife(String knifeType) {
        switch (knifeType.toLowerCase()) {
            case "steak":
                return new SteakKnife();
            case "chef":
                return new ChefsKnife();
            // Add more cases for additional knife types as needed
            default:
                throw new IllegalArgumentException("Invalid knife type: " + knifeType);
        }
    }
}