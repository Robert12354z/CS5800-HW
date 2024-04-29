package Homework7.Flyweight;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import java.util.ArrayList;
import java.util.List;

public class Document {

    private List<Character> characters = new ArrayList<>();
    private CharacterFactory characterFactory = null;


    public Document(CharacterFactory characterFactory){
        this.characters = new ArrayList<>();
        this.characterFactory = characterFactory;
    }

    public void addCharacter(char character, String font, String color, int size){
        characters.add(this.characterFactory.getCharacter(character, font, color, size));
    }

    public List<Character> getCharacters(){
        return characters;
    }

    public void save(String filename) throws IOException {
        FileWriter file = new FileWriter(filename);
        JSONObject obj = new JSONObject();
        JSONArray charArray = new JSONArray();
        for (Character character : characters) {
            JSONObject charObj = new JSONObject();
            charObj.put("character", character.getCharacter());
            charObj.put("font", character.getFont());
            charObj.put("color", character.getColor());
            charObj.put("size", character.getSize());
            charArray.add(charObj);
        }
        obj.put("characters", charArray);
        file.write(obj.toJSONString());
        file.close();
    }

    public static Document load(String filename , CharacterFactory factory) throws IOException, ParseException {
        Document doc = new Document(factory);
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(filename)) {
            // Read and print the contents of the file
            int data;
            StringBuilder fileContent = new StringBuilder();
            while ((data = reader.read()) != -1) {
                fileContent.append((char) data);
            }
            System.out.println("File Content: " + fileContent.toString());

        }

        FileReader file = new FileReader(filename);
        JSONObject obj = (JSONObject) parser.parse(file);
        JSONArray charArray = (JSONArray) obj.get("characters");

        for (Object o : charArray) {
            JSONObject charObj = (JSONObject) o;
            char ch = ((String) charObj.get("character")).charAt(0);
            String font = (String) charObj.get("font");
            String color = (String) charObj.get("color");
            int size = ((Long) charObj.get("size")).intValue();
            doc.addCharacter(ch, font, color, size);
        }
        return doc;
    }
    
}
