package Homework7.Test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Homework7.Flyweight.*;
import Homework7.Flyweight.Character;

public class FlyweightTest {
    
    @Test
    public void testCharacterFlyweight() {
        CharacterFactory characterFactory = new CharacterFactory();
        CharacterProperties characterProperties = characterFactory.getCharacterFlyweight("Arial", "Black", 12);
        assertEquals("Arial", characterProperties.getFont());
        assertEquals("Black", characterProperties.getColor());
        assertEquals(12, characterProperties.getSize());
    }
    
    @Test
    public void testCharacter() {
        CharacterFactory characterFactory = new CharacterFactory();
        CharacterProperties characterProperties = characterFactory.getCharacterFlyweight("Arial", "Black", 12);
        Character character = new Character('a', characterProperties);
        assertEquals('a', character.getCharacter());
        assertEquals("Arial", character.getProperties().getFont());
        assertEquals("Black", character.getProperties().getColor());
        assertEquals(12, character.getProperties().getSize());
    }

    @Test
    public void testDocument() {
        CharacterFactory characterFactory = new CharacterFactory();
        Document document = new Document("HelloWorldCS5800.txt");
        document.addCharacter(new Character('H', characterFactory.getCharacterFlyweight("Arial", "Black", 12)));
        document.addCharacter(new Character('E', characterFactory.getCharacterFlyweight("Calibri", "Blue", 14)));
        document.addCharacter(new Character('L', characterFactory.getCharacterFlyweight("Verdana", "Red", 15)));
        document.addCharacter(new Character('L', characterFactory.getCharacterFlyweight("Arial", "Black", 12)));
        document.addCharacter(new Character('O', characterFactory.getCharacterFlyweight("Verdana", "Red", 15)));
        document.addCharacter(new Character('W', characterFactory.getCharacterFlyweight("Arial", "Black", 12)));
        document.addCharacter(new Character('O', characterFactory.getCharacterFlyweight("Verdana", "Red", 15)));
        document.addCharacter(new Character('R', characterFactory.getCharacterFlyweight("Times New Roman", "Pink", 11)));
        document.addCharacter(new Character('L', characterFactory.getCharacterFlyweight("Verdana", "Red", 15)));
        document.addCharacter(new Character('D', characterFactory.getCharacterFlyweight("Times New Roman", "Pink", 11)));
        document.addCharacter(new Character('C', characterFactory.getCharacterFlyweight("Arial", "Black", 12)));
        document.addCharacter(new Character('S', characterFactory.getCharacterFlyweight("Calibri", "Blue", 14)));
        document.addCharacter(new Character('5', characterFactory.getCharacterFlyweight("Arial", "Black", 12)));
        document.addCharacter(new Character('8', characterFactory.getCharacterFlyweight("Times New Roman", "Pink", 11)));
        document.addCharacter(new Character('0', characterFactory.getCharacterFlyweight("Calibri", "Blue", 14)));
        document.addCharacter(new Character('0', characterFactory.getCharacterFlyweight("Arial", "Black", 12)));
        document.saveToFile();
        Document loadedDocument = Document.loadFromFile("HelloWorldCS5800.txt", characterFactory);
        for (Character character : loadedDocument.getCharacters()) {
            System.out.println(character.getCharacter() + " " + character.getProperties().getFont() + " " + character.getProperties().getColor() + " " + character.getProperties().getSize());
        }
    }
}
