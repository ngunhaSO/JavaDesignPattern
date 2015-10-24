package com.pattern.Adapter;

public class MediaAdapter implements MediaPlayer {
	
	AdvancedMediaPlayer advanceMusicPlayer; //accept newly created interface
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advanceMusicPlayer = new VlcPlayer();
		}
		else if(audioType.equalsIgnoreCase("mp4"))
		{
			advanceMusicPlayer = new Mp4Player();
		}
	}
	
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advanceMusicPlayer.playVlc(fileName);
		}
		else if(audioType.equalsIgnoreCase("mp4"))
		{
			advanceMusicPlayer.playMp4(fileName);
		}
	}

}
