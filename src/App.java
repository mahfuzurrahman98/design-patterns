
// import singleton.Singleton;

// import factory.KnifeStore;
// 

import adaptar.coffe_machine.Client;

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
        // try {
        // String type = "steak";
        // KnifeStore knifeStore = new RegularKnifeStore();
        // // Client code ordering a steak knife
        // Knife knife = knifeStore.orderKnife(type);
        // // Do something with the ordered knife, e.g., print a message
        // System.out.println("Ordered a reguar " + type + " knife: [" + knife + "]");
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // 3) Facade pattern
        // ---------------------------------
        // Customer.run();

        // 4) Adaptar pattern
        // ---------------------------------
        Client.run();
    }
}
