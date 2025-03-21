package Test.Music;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicPlayer {

    private List<String> songs = new ArrayList<>();
    private String title;
    private Music music;



    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println(music.getSong());
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void playSong() {
        boolean flag = false;
        while (!flag) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter song number(111 = end): ");

            int songID = scanner.nextInt();

            if (songID == 111) {
                flag = true;
            }

            try {
                System.out.println("Now playing: " + (songs.get(songID - 1)));
                System.out.println(songs.toString());
            }catch (Exception e) {
                System.out.println("Error: " + e.getMessage());;
            }


        }

    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
