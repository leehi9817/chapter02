package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		//Song(0)
		Song s01 = new Song();
		s01.setTitle("좋은날");
		s01.setArtist("아이유");
		s01.setAlbum("Real");
		s01.setComposer("이민수");
		s01.setYear("2010");
		s01.setTrack(3);
		
		//Song(5)
		Song s02 = new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", "2007");
		s02.setTrack(2);
		
		//Song(6)
		Song s03 = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커1집", "장범준", "2021", 4);
		
		//아이유출력
		s01.showInfo();
		
		//빅뱅출력
		s02.showInfo();
		
		//버스커버스커출력
		s03.showInfo();
	}

}
