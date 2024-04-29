package Homework7.Flyweight;

public class Main {
    public static void main (String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        Document document = new Document(characterFactory);
        document.addCharacter('H', "Arial", "Red", 12);
        document.addCharacter('e', "Arial", "Red", 12);
        document.addCharacter('l', "Arial", "Red", 12);
        document.addCharacter('l', "Calibri", "Blue", 14);
        document.addCharacter('o', "Calibri", "Blue", 14);
        document.addCharacter(' ', "Verdana", "Black", 16);
        document.addCharacter('W', "Verdana", "Black", 16);
        document.addCharacter('o', "Verdana", "Black", 16);


        document.save("document.json");

        Document loadedDoc = Document.load("document.json", characterFactory);
        for (Character character : loadedDoc.getCharacters()) {
            System.out.println(character.getCharacter() + " " + character.getFont() + " " + character.getColor() + " " + character.getSize());
        }
    }
}
