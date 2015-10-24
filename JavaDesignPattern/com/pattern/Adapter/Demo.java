package com.pattern.Adapter;

public class Demo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp4", "Season in the sun");
		audioPlayer.play("vlc", "The Avenger");
	}
}
