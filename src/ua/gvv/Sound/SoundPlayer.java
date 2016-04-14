package ua.gvv.Sound;

import java.io.*;

public class SoundPlayer implements Runnable {

	
	File folder = new File("Soundtrack");
    File[] listOfFiles = folder.listFiles();
	@Override
	public void run() {
		
		int i = (int)(Math.random()*listOfFiles.length + 1);
		
		while (true) 
		Sound.playSound(listOfFiles[0]).join(); 
				
		
		
	}
	
	
        
         

}
