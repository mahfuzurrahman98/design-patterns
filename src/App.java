
// import singleton.Singleton;
import factory.Knife;
import factory.KnifeStore;

public class App {
    public static void main(String[] args) throws Exception {
        // Singleton design pattern example
        // ---------------------------------
        // Singleton s = Singleton.getInstance();
        // System.out.println(s);

        // Singleton s2 = Singleton.getInstance();
        // System.out.println(s2);
        // -----------------------------------|

        // Factory design pattern example
        // ---------------------------------
        KnifeStore knifeStore = new KnifeStore();

        // Client code ordering a steak knife
        Knife knife = knifeStore.orderKnife("steak");

        // Do something with the ordered knife, e.g., print a message
        System.out.println("Ordered a steak knife: [" + knife + "]");
    }
}
