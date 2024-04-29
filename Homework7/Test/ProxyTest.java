package Homework7.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import Homework7.Proxy.*;

public class ProxyTest {

    @Test
    public void testSearchById() {
        SongService songService = new SongProxy();
        Song song = songService.searchById(1);
        assertEquals("Song1",song.getSongName());
    }

    @Test
    public void testSearchByTitle() {
        SongService songService = new SongProxy();
        List<Song> song = songService.searchByTitle("Song1");
        assertEquals("Song1",song.get(0).getSongName());
    }

    @Test
    public void testSearchByAlbum() {
        SongService songService = new SongProxy();
        List<Song> song = songService.searchByAlbum("Album1");
        assertEquals("Song1",song.get(0).getSongName());
       
    }
}
