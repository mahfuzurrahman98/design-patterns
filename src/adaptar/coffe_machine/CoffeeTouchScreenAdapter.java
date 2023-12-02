package adaptar.coffe_machine;

// CoffeeTouchScreenAdapter
public class CoffeeTouchScreenAdapter implements CoffeeMachineInterface {
  private OldCoffeeMachine oldCoffeeMachine;

  public CoffeeTouchScreenAdapter(OldCoffeeMachine oldCoffeeMachine) {
    this.oldCoffeeMachine = oldCoffeeMachine;
  }

  @Override
  public void chooseCapuccino() {
    // Adapter delegates the call to the old coffee machine
    oldCoffeeMachine.selectCapuccino();
  }

  @Override
  public void chooseEspresso() {
    // Adapter delegates the call to the old coffee machine
    oldCoffeeMachine.selectEspresso();
  }
}
