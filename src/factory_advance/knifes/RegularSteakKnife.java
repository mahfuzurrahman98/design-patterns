package factory_advance.knifes;

import factory.Knife;

public class RegularSteakKnife implements Knife {
  @Override
  public void sharpen() {
    System.out.println("Sharpening a regular steak knife.");
  }

  @Override
  public void polish() {
    System.out.println("Polishing a regular steak knife.");
  }

  @Override
  public void pack() {
    System.out.println("Packing a regular steak knife.");
  }
}
