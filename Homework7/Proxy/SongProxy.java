package Homework7.Proxy;

import java.util.HashMap;
import java.util.Map;

public class SongProxy implements SongService{
    private SongController songController;
    private Map<Integer, Song> cache;

    public SongProxy(){
        this.songController = new SongController();
        this.cache = new HashMap<>();
    }

    @Override
    
}
