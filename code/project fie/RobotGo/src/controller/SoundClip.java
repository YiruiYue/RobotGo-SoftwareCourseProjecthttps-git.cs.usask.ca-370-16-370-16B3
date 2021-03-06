package controller;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class SoundClip {
	
	public  File soundFile;
	public File attackFile;
	public Clip clip1;
	public Clip clip2;
	public AudioInputStream audioIn1;
	public AudioInputStream audioIn2;
	public SoundClip(String file1,String file2) {
		try{
	        soundFile = new File(file1);
            attackFile = new File(file2);
		    // Get a sound clip resource.
	        clip1 = AudioSystem.getClip();
	        clip2 =AudioSystem.getClip();
            // Open an audio input stream.
     		audioIn1 = AudioSystem.getAudioInputStream(this.soundFile);
             // Open an audio input stream.
      		audioIn2 = AudioSystem.getAudioInputStream(this.attackFile);
            clip1.open(audioIn1);
            clip2.open(audioIn2);
		}catch (UnsupportedAudioFileException e) {
	         e.printStackTrace();
	    }catch (IOException e) {
		         e.printStackTrace();
		}catch (LineUnavailableException e) {
			         e.printStackTrace();
	    }
	}


	/**
	 * @pre nothing
	 * @post contimuously play the main game sound
     * @return nothing
     **/		  
	public void soundPlay(){

		clip1.loop(Clip.LOOP_CONTINUOUSLY);
    }
	  

	/**
	 * @pre nothing
	 * @post play the shoot sound while attacking another robot
     * @return nothing
     **/
	public void attackPlay(){
		 clip2.setMicrosecondPosition(0);
		 clip2.start();
	}


	/**
	 * @pre nothing
	 * @post stop the shoot sound while attack is finished
     * @return nothing
     **/
	 public void stopAttackSound(){
		if (clip2.isRunning())
		clip2.stop();
		  
	}


	/**
	 * @pre nothing
	 * @post stop the main game sound when the game is over
     * @return nothing
     **/
	public  void stopPlay(){
		clip1.stop();
		clip1.setMicrosecondPosition(0);
	  }
}