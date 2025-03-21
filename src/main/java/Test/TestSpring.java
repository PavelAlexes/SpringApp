package Test;

import Test.Music.Music;
import Test.Music.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
        musicPlayer.playMusic();
        context.close();
    }


}
