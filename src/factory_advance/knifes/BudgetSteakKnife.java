package factory_advance.knifes;

import factory.Knife;

public class BudgetSteakKnife implements Knife {
  @Override
  public void sharpen() {
    System.out.println("Sharpening a budget steak knife.");
  }

  @Override
  public void polish() {
    System.out.println("Polishing a budget steak knife.");
  }

  @Override
  public void pack() {
    System.out.println("Packing a budget steak knife.");
  }
}
