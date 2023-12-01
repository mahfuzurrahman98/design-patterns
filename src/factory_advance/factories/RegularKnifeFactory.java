package factory_advance.factories;

import factory.Knife;
import factory_advance.knifes.RegularChefsKnife;
import factory_advance.knifes.RegularSteakKnife;

public class RegularKnifeFactory implements KnifeFactory {
  @Override
  public Knife createKnife(String knifeType) {
    System.out.println("Creating a regular knife of type: " + knifeType);
    switch (knifeType.toLowerCase()) {
      case "steak":
        return new RegularSteakKnife();
      case "chef":
        return new RegularChefsKnife();
      // Add more cases for additional budget knife types as needed
      default:
        throw new IllegalArgumentException("Invalid knife type: " + knifeType);
    }
  }
}
