package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		
		Song s1 = new Song("������", "������", "Real", "�̹μ�", 2010, 3);
		Song s2 = new Song();
		Song s3 = new Song();
		
		/*
		s1.setTitle("������");
		s1.setArtist("������");
		s1.setAlbum("Real");
		s1.setComposer("�̹μ�");
		s1.setYear(2010);
		s1.setTrack(3);
		s1.showInfo();
		*/
		
		s2.setTitle("������");
		s2.setArtist("BIGBANG");
		s2.setAlbum("Always");
		s2.setComposer("G-DRAGON");
		s2.setYear(2007);
		s2.setTrack(2);
		//s2.showInfo();
		
		s3.setTitle("���ɿ���");
		s3.setArtist("����Ŀ����Ŀ");
		s3.setAlbum("����Ŀ����Ŀ1��");
		s3.setComposer("�����");
		s3.setYear(2012);
		s3.setTrack(4);
		//s3.showInfo();
		
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}

}
