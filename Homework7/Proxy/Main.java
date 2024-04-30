package Homework7.Proxy;

public class Main {
    public static void main(String[] args) {
        SongService songService = new SongProxy();
        System.out.println(songService.searchById(1));
        System.out.println(songService.searchById(2));
        System.out.println(songService.searchById(3));

        System.out.println(songService.searchByTitle("Follow"));
        System.out.println(songService.searchByTitle("Hello World"));
        System.out.println(songService.searchByTitle("Test"));

        System.out.println(songService.searchByAlbum("Test"));
        System.out.println(songService.searchByAlbum("Fame"));
        System.out.println(songService.searchByAlbum("Blue"));

    }
}