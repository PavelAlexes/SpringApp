package Test.Music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMusic {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer musicPlayer = classPathXmlApplicationContext.getBean("musicPlayer" , MusicPlayer.class);

        musicPlayer.playMusic();
        System.out.println(musicPlayer.getTitle());
        musicPlayer.playSong();








    }
}
//ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//
//
//        MusicPlayer musicPlayer = classPathXmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getTitle());