package Quiz2;

import java.util.Map; 

import java.util.HashMap; 

 

// Flyweight factory that creates and manages CharacterProperties objects 

//Reuse CharacterProperties that have the same properties as other characters 

public class CharacterPropertiesFactory { 

    private final Map<String, CharacterProperties> flyweights = new HashMap<>(); 

 

//Add characterProperty to Map if not inside. If it is inside retrieve it without creating duplicate. 

    public CharacterProperties setAndRetrieveFlyweightCharacterProperties(String font, String color, int size) { 

        String key = font + size + color; 

        if (!flyweights.containsKey(key)) { 

            CharacterProperties properties = new CharacterProperties(font, color, size); 

            flyweights.put(key, properties); 

        }

        return flyweights.get(key); 
    } 



    public int sizeOfMap(){ 

        return flyweights.size(); 

    } 


} 
