package factory_advance.factories;

import factory.Knife;

/**
 * KnifeFactory
 */
public interface KnifeFactory {
  Knife createKnife(String knifeType);
}