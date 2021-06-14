package com.douzone.container.videosystem;

public class DVDPlayer {
	
	private DigitalVideoDisc dvd;
	
	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}

	public DVDPlayer() {
		
	}
	
	public void play() {
		dvd.play();
	}


	public void setDvd(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
	
}
