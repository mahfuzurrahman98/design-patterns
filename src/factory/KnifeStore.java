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
class KnifeFactory {
    public Knife createKnife(String knifeType) {
        String className = knifeType.substring(0, 1).toUpperCase() + knifeType.substring(1) + "Knife";
        try {
            Class<?> clazz = Class.forName("factory." + className);
            return (Knife) clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid knife type: " + knifeType);
        }
    }
}

public class KnifeStore {
    public Knife orderKnife(String knifeType) {
        KnifeFactory knifeFactory = new KnifeFactory();
        Knife knife = knifeFactory.createKnife(knifeType);

        // Common operations for all knives
        knife.sharpen();
        knife.polish();
        knife.pack();

        return knife;
    }
}