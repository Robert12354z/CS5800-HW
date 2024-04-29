package Homework7.Flyweight;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public class Main {
    public static void main (String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        Document document = new Document(characterFactory);
        document.addCharacter('H', "Arial", "Red", 12);
        document.addCharacter('e', "Arial", "Red", 12);
        document.addCharacter('l', "Arial", "Red", 12);
        document.addCharacter('l', "Arial", "Red", 12);
        document.addCharacter('o', "Arial", "Red", 12);
        document.addCharacter(' ', "Arial", "Red", 12);
        document.addCharacter('W', "Arial", "Red", 12);
        document.addCharacter('o', "Arial", "Red", 12);
        document.addCharacter('r', "Arial", "Red", 12);
        document.addCharacter('l', "Arial", "Red", 12);
        document.addCharacter('d', "Arial", "Red", 12);
        
       

        try {
            document.save("document.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            Document loadedDoc = Document.load("document.json", characterFactory);
            for (Character character : loadedDoc.getCharacters()) {
                System.out.println(character.getCharacter() + " " + character.getFont() + " " + character.getColor() + " " + character.getSize());
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
