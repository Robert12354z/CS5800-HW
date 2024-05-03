package Homework7.Flyweight;
public class Main {
    public static void main (String[] args) {
        CharacterFactory factory = new CharacterFactory();
        Document document = new Document("HelloWorldCS5800.txt");
        document.addCharacter(new Character('H', factory.getCharacterFlyweight("Arial", "Black", 12)));
        document.addCharacter(new Character('E', factory.getCharacterFlyweight("Calibri", "Blue", 14)));
        document.addCharacter(new Character('L', factory.getCharacterFlyweight("Verdana", "Red", 15)));
        document.addCharacter(new Character('L', factory.getCharacterFlyweight("Arial", "Black", 12)));
        document.addCharacter(new Character('O', factory.getCharacterFlyweight("Verdana", "Red", 15)));
        document.addCharacter(new Character('W', factory.getCharacterFlyweight("Arial", "Black", 12)));
        document.addCharacter(new Character('O', factory.getCharacterFlyweight("Verdana", "Red", 15)));
        document.addCharacter(new Character('R', factory.getCharacterFlyweight("Times New Roman", "Pink", 11)));
        document.addCharacter(new Character('L', factory.getCharacterFlyweight("Verdana", "Red", 15)));
        document.addCharacter(new Character('D', factory.getCharacterFlyweight("Times New Roman", "Pink", 11)));
        document.addCharacter(new Character('C', factory.getCharacterFlyweight("Arial", "Black", 12)));
        document.addCharacter(new Character('S', factory.getCharacterFlyweight("Calibri", "Blue", 14)));
        document.addCharacter(new Character('5', factory.getCharacterFlyweight("Arial", "Black", 12)));
        document.addCharacter(new Character('8', factory.getCharacterFlyweight("Times New Roman", "Pink", 11)));
        document.addCharacter(new Character('0', factory.getCharacterFlyweight("Calibri", "Blue", 14)));
        document.addCharacter(new Character('0', factory.getCharacterFlyweight("Arial", "Black", 12)));
        document.saveToFile();
        Document loadedDocument = Document.loadFromFile("HelloWorldCS5800.txt", factory);
        for (Character character : loadedDocument.getCharacters()) {
            System.out.println(character.getCharacter() + " " + character.getProperties().getFont() + " " + character.getProperties().getColor() + " " + character.getProperties().getSize());
        }
    }

}
