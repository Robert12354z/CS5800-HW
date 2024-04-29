package Homework7.Proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongProxy implements SongService{
    private SongController songController;
    private Map<Integer, Song> cache;

    public SongProxy(){
        this.songController = new SongController();
        this.cache = new HashMap<>();
    }

    @Override
    public Song searchById(Integer songID) {
        if(cache.containsKey(songID)){
            return cache.get(songID);
        }
        Song song = songController.searchById(songID);
        cache.put(songID, song);
        return song;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        return songController.searchByTitle(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        return songController.searchByAlbum(album);
    }
    
}
