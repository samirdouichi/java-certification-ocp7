package com.aractron.java.visibility.access.acmeVideo;

public class Client {

	private Video video;

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public void methode() {

		video.name.length();
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

}
