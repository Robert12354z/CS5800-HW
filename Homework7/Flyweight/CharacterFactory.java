package Homework7.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<String, Character> characters = new HashMap<>();
    
    public Character getCharacter(char character, String font, String color, int size) {
        String key = String.valueOf(character) + font + color + size;
        if (!characters.containsKey(key)) {
            characters.put(key, new Character(character, font, color, size));
        }
        return characters.get(key);
    
    }
}
