package Homework7.Proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongController implements SongService{
    private Map<Integer, Song> songMap;

    public SongController(){
        songMap = new HashMap<>();
        songMap.put(1, new Song("Follow", "Reed", "Test", 100));
        songMap.put(2, new Song("Hello World", "Flow", "Fame", 200));
        songMap.put(3, new Song("Test", "Ran", "Blue", 300));
        songMap.put(4, new Song("Fast", "zap", "Yellow", 400));
        songMap.put(5, new Song("Nlue", "Artist", "Brown", 500));
        songMap.put(6, new Song("SanFran", "Air", "White", 600));
        songMap.put(7, new Song("Cotton Eye Joe", "Water", "Pink", 700));
        songMap.put(8, new Song("Flash", "Dog", "Square", 800));
        songMap.put(9, new Song("Red", "Cat", "James", 900));
    }

    @Override
    public Song searchById(Integer songID) {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return songMap.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return songMap.values().stream().filter(song -> song.getSongName().equals(title)).toList();
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return songMap.values().stream().filter(song -> song.getAlbumName().equals(album)).toList();
    }

}
