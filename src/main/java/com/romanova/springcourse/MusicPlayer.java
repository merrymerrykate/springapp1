package com.romanova.springcourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



import java.util.*;
@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;





    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicGenre musicGenre){

        Random random = new Random();

        int randomNumber = random.nextInt(3);

        if(musicGenre == MusicGenre.ROCK){
            System.out.println(rockMusic.getSong().get(randomNumber));
        }
        else{
            System.out.println(classicalMusic.getSong().get(randomNumber));
        }

    }

}
