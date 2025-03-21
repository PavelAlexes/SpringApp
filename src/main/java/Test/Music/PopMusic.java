package Test.Music;

public class PopMusic implements Music {
    private String ganre = "popMusic";
    private String song = "Playing pop music";

    @Override
    public String getSong() {
        return song;
    }

    @Override
    public String getGanre() {
        return ganre;
    }
}
