package Homework7.Proxy;

public class Song {

    private String songName; 
    private String artistName;
    private String albumName;
    private int songDuration;

    public Song(String songName, String artistName, String albumName, int songDuration) {
        this.songName = songName;
        this.artistName = artistName;
        this.albumName = albumName;
        this.songDuration = songDuration;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public int getSongDuration() {
        return songDuration;
    }

    public String toString() {
        return "Song Name: " + songName + ", Artist Name: " + artistName + ", Album Name: " + albumName + ", Song Duration: " + songDuration;
    }
    
}
