package Test.Music;

public class RockMusic implements Music {
    private String ganre = "rockMusic";
    private String song = "Playing Rock Music";

    @Override
    public String getSong() {
        return this.song;
    }

    @Override
    public String getGanre() {
        return ganre;
    }
}
