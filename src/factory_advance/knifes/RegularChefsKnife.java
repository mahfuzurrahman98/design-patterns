package factory_advance.knifes;

import factory.Knife;

public class RegularChefsKnife implements Knife {
  @Override
  public void sharpen() {
    System.out.println("Sharpening a regular chef's knife.");
  }

  @Override
  public void polish() {
    System.out.println("Polishing a regular chef's knife.");
  }

  @Override
  public void pack() {
    System.out.println("Packing a regular chef's knife.");
  }
}
