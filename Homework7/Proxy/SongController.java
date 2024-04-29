package Homework7.Proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongController implements SongService{
    private Map<Integer, Song> songMap;

    public SongController(){
        songMap = new HashMap<>();
        songMap.put(1, new Song("Song1", "Artist1", "Album1", 100));
        songMap.put(2, new Song("Song2", "Artist2", "Album2", 200));
        songMap.put(3, new Song("Song3", "Artist3", "Album3", 300));
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
