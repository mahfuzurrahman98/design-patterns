package adaptar.coffe_machine;

// Client Code
public class Client {
  public static void run() {
    // Create an instance of the old coffee machine
    OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();

    // Create the adapter and pass the old coffee machine to it
    CoffeeMachineInterface adapter = new CoffeeTouchScreenAdapter(oldCoffeeMachine);

    // Use the adapter (modern interface) to interact with the old coffee machine
    adapter.chooseCapuccino();
    adapter.chooseEspresso();
  }
}
