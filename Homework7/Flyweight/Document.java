package Homework7.Flyweight;

import java.io.*;
import java.util.*;

public class Document {

    private String fileName;
    private List<Character> characters = new ArrayList<>();

    public Document(String fileName) {
        this.fileName = fileName;
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public List<Character> getCharacters() {
        return characters;
    }


    public void saveToFile() {
        System.out.println("Saving document to file: " + fileName);
        try (PrintWriter writer = new PrintWriter(fileName)) {
            for (Character character : characters) {
                writer.println(character.getCharacter() + "," + character.getProperties().getColor() + "," + character.getProperties().getFont() + "," + character.getProperties().getSize());
            }
        } catch (IOException e) {
            e.printStackTrace();
    }
}

    public static Document loadFromFile(String fileName, CharacterFactory factory) {
        System.out.println("Loading document from file: " + fileName);
            Document document = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            document = new Document(fileName);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                CharacterProperties properties = factory.getCharacterFlyweight(parts[2], parts[1], Integer.parseInt(parts[3]));
                document.addCharacter(new Character(parts[0].charAt(0), properties));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return document;
    }

    
}
