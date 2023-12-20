package com.romanova.springcourse;

import org.springframework.context.support.*;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(MusicGenre.CLASSICAL);
        musicPlayer.playMusic(MusicGenre.ROCK);




        context.close();
    }
}
