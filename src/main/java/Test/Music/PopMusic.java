package Test.Music;

public class PopMusic implements Music {
    private String title;
    private String song = "Playing pop music";


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String getSong() {
        return this.song;
    }

}
