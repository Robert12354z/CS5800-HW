package Homework7.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
  private Map<String, CharacterProperties> characterFlyweight = new HashMap<>();

  public CharacterProperties getCharacterFlyweight(String font, String color, int size) {
    String key = font + color + size;
    if (!characterFlyweight.containsKey(key)) {
      characterFlyweight.put(key, new CharacterProperties(font, color, size));
    }
    return characterFlyweight.get(key);
  }
    
}
