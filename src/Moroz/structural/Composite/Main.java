package Moroz.structural.Composite;

public class Main {
    public static void main(String[] args) {
        PopSong popSong = new PopSong();
        RapSong rapSong = new RapSong();
        RockSong rockSong = new RockSong();

        PlayList playList1 =new PlayList();
        PlayList playList2 = new PlayList();

        playList1.addMusic(new PopSong());
        playList1.addMusic(new PopSong());
        playList1.addMusic(new PopSong());
        playList1.addMusic(popSong);

        playList2.addMusic(new RockSong());
        playList2.addMusic(new RockSong());
        playList2.addMusic(new RockSong());
        playList2.addMusic(rapSong);

        PlayList playList3 = new PlayList();
        playList3.addMusic(rockSong);
        playList3.addMusic(playList1);
        playList3.addMusic(playList2);

        playList3.play();
    }
}
