package Test.Music;

public class HipHopMusic implements Music{
    private String song = "Playing Hip Hop";
    private String title;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getSong() {
        return this.song;
    }
}
