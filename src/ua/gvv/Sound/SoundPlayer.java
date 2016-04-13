package ua.gvv.Sound;

import java.io.*;

public class SoundPlayer implements Runnable {

	
	File folder = new File("Songs");
    File[] listOfFiles = folder.listFiles();
	@Override
	public void run() {
		
		int i = (int)(Math.random()*listOfFiles.length + 1);
		Sound.playSound(listOfFiles[i]).join();
		
	}
        
         

}
