package com.javaex.ex03;

public class Song {
	// �ʵ�
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	// ������
	public Song() {
		
	}
	
	public Song(String title, String artist, String album, String composer, int year, int track) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	
	// �޼ҵ� g/s
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getAlbum() {
		return album;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getComposer() {
		return composer;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public int getTrack() {
		return track;
	}

	public void showInfo() {
		System.out.println(artist + ", " + title + " (" + album + ", " + track + "�� track, " + composer + " �۰�)");
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

	
}
