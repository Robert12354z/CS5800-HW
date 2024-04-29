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

    public Document(){
        this.characters = new ArrayList<>();
    }

    public void addCharacter(Character character){
        characters.add(character);
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

    public void load(String filename) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        FileReader file = new FileReader(filename);
        JSONObject obj = (JSONObject) parser.parse(file);
        JSONArray charArray = (JSONArray) obj.get("characters");
        for (Object o : charArray) {
            JSONObject charObj = (JSONObject) o;
            Character character = new Character(
                ((String) charObj.get("character")).charAt(0),
                (String) charObj.get("font"),
                (String) charObj.get("color"),
                ((Long) charObj.get("size")).intValue()
            );
            characters.add(character);
        }
    }
    
}
