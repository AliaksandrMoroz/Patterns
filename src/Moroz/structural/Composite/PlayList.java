package Moroz.structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class PlayList implements Music {
    private List<Music> musicList = new ArrayList<>();

    void addMusic(Music playList){
        musicList.add(playList);
    }

    void deleteMusic(Music playList){
        musicList.remove(playList);
    }
    @Override
    public void play() {
        for (Music el:
                musicList) {
            el.play();
        }
    }
}
