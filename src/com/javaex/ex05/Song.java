package com.javaex.ex05;

public class Song {

	//�ʵ�
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	//������
	public Song() {
		//�޸𸮿� �ø��� ��
		System.out.println("Song(0)");
	}
	
	public Song(String title, String artist, String album, String composer, String year) {
		//�޸𸮿� �ø��� ��
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("Song(5)");
	}
	
	public Song(String title, String artist, String album, String composer, String year, int track) {
		//�޸𸮿� �ø��� ��
		//Song(5) ȣ��
		this(title, artist, album, composer, year);

		this.track = track;
		System.out.println("Song(6)");
	}

	//�޼ҵ� - g/s
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}


	public String getAlbum() {
		return album;
	}


	public void setAlbum(String album) {
		this.album = album;
	}


	public String getComposer() {
		return composer;
	}


	public void setComposer(String composer) {
		this.composer = composer;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public int getTrack() {
		return track;
	}


	public void setTrack(int track) {
		this.track = track;
	}
	
	//�޼ҵ� - �Ϲ�
	public void showInfo() {
		System.out.println(artist + ", " + title + "(" + album + ", " + track + "�� track, " + composer + " �۰�)");
	}
	
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
}