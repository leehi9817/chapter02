package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		
		Song s1 = new Song("좋은날", "아이유", "Real", "이민수", 2010, 3);
		Song s2 = new Song();
		Song s3 = new Song();
		
		/*
		s1.setTitle("좋은날");
		s1.setArtist("아이유");
		s1.setAlbum("Real");
		s1.setComposer("이민수");
		s1.setYear(2010);
		s1.setTrack(3);
		s1.showInfo();
		*/
		
		s2.setTitle("거짓말");
		s2.setArtist("BIGBANG");
		s2.setAlbum("Always");
		s2.setComposer("G-DRAGON");
		s2.setYear(2007);
		s2.setTrack(2);
		//s2.showInfo();
		
		s3.setTitle("벚꽃엔딩");
		s3.setArtist("버스커버스커");
		s3.setAlbum("버스커버스커1집");
		s3.setComposer("장범준");
		s3.setYear(2012);
		s3.setTrack(4);
		//s3.showInfo();
		
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}

}
