
// import singleton.Singleton;
import factory.Knife;
import factory_advance.stores.KnifeStore;
import factory_advance.stores.RegularKnifeStore;

// import factory.KnifeStore;
// 
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

        // 1) Simple one
        // ---------------------------------
        // KnifeStore knifeStore = new KnifeStore();
        // // Client code ordering a steak knife
        // Knife knife = knifeStore.orderKnife("steak");
        // // Do something with the ordered knife, e.g., print a message
        // System.out.println("Ordered a steak knife: [" + knife + "]");

        // 2) Factory method
        // ---------------------------------
        try {
            KnifeStore knifeStore = new RegularKnifeStore();
            // Client code ordering a steak knife
            Knife knife = knifeStore.orderKnife("chef");
            // Do something with the ordered knife, e.g., print a message
            System.out.println("Ordered a steak knife: [" + knife + "]");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
