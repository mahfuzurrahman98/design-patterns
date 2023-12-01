package factory_advance.factories;

import factory.Knife;
import factory_advance.knifes.BudgetChefsKnife;
import factory_advance.knifes.BudgetSteakKnife;

public class BudgetKnifeFactory implements KnifeFactory {
  @Override
  public Knife createKnife(String knifeType) {
    System.out.println("Creating a budget knife of type: " + knifeType);
    switch (knifeType.toLowerCase()) {
      case "steak":
        return new BudgetSteakKnife();
      case "chef":
        return new BudgetChefsKnife();
      // Add more cases for additional budget knife types as needed
      default:
        throw new IllegalArgumentException("Invalid knife type: " + knifeType);
    }
  }
}
