package Test.Music;

public class RockMusic implements Music {
    private String title;
    private String song = "Playing Rock Music";


    @Override
    public String getSong() {
        return this.song;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
