package ua.gvv.Client;

import ua.gvv.Sound.SoundPlayer;

public class Start {

	public static void main(String[] args) {

		//GUI start = new GUI();
		System.out.println("it is start new thead");
		SoundPlayer player = new SoundPlayer();
		
		Thread t = new Thread(player);
		t.start();
		GUI startApp = new GUI();
		t.stop();
		
	}

}
