package de.cg.cgge.sound;


import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sound {

    AudioInputStream audioStream; 

    public Sound(String path) {
        File file = new File(path);

        try {
            audioStream = AudioSystem.getAudioInputStream(file);
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
			audioStream = null; 
		}
    }

    public void play(){
        try {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream); 

        } catch (LineUnavailableException | IOException e) {
            e.printStackTrace();
		}
    }
}