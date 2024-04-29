package Homework7.Proxy;

public class Main {
    public static void main(String[] args) {
        SongService songService = new SongProxy();
        System.out.println(songService.searchById(1));
        System.out.println(songService.searchById(2));
        System.out.println(songService.searchById(3));

        System.out.println(songService.searchByTitle("Song1"));
        System.out.println(songService.searchByTitle("Song2"));
        System.out.println(songService.searchByTitle("Song3"));

        System.out.println(songService.searchByAlbum("Album1"));
        System.out.println(songService.searchByAlbum("Album2"));
        System.out.println(songService.searchByAlbum("Album3"));

    }
}