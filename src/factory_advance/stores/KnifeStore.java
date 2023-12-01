package factory_advance.stores;

import factory.Knife;
import factory_advance.factories.BudgetKnifeFactory;
import factory_advance.factories.KnifeFactory;
import factory_advance.factories.RegularKnifeFactory;

// Updated KnifeStore to handle both regular and budget knives
public class KnifeStore {

  Class knifeFactoryClass;

  public KnifeStore() {
    System.out.println("Here in KnifeStore");
    String extendingClassName = this.getClass().getSimpleName();

    if ("BudgetKnifeStore".equals(extendingClassName)) {
      knifeFactoryClass = BudgetKnifeFactory.class;
    } else if ("RegularKnifeStore".equals(extendingClassName)) {
      knifeFactoryClass = RegularKnifeFactory.class;
    } else {
      knifeFactoryClass = null;
      throw new IllegalArgumentException("Invalid class name: " + extendingClassName);
    }
  }

  // Overloaded method to allow specifying a custom factory (for regular knives)
  public Knife orderKnife(String knifeType) {
    // get the knife factory based on the price, it could be Regular, Budget,
    // Special, or Premium
    // we will then pass the type to that factory to create the knife
    KnifeFactory knifeFactory;

    try {
      knifeFactory = (KnifeFactory) knifeFactoryClass.getDeclaredConstructor().newInstance();
      Knife knife = knifeFactory.createKnife(knifeType);

      // Common operations for all knives
      knife.sharpen();
      knife.polish();
      knife.pack();

      return knife;
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return null;
    }
  }
}
