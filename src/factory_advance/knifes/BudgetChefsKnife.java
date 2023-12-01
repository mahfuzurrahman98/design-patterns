package factory_advance.knifes;

import factory.Knife;

public class BudgetChefsKnife implements Knife {
  @Override
  public void sharpen() {
    System.out.println("Sharpening a budget chef's knife.");
  }

  @Override
  public void polish() {
    System.out.println("Polishing a budget chef's knife.");
  }

  @Override
  public void pack() {
    System.out.println("Packing a budget chef's knife.");
  }
}
