package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		//Song(0)
		Song s01 = new Song();
		s01.setTitle("������");
		s01.setArtist("������");
		s01.setAlbum("Real");
		s01.setComposer("�̹μ�");
		s01.setYear("2010");
		s01.setTrack(3);
		
		//Song(5)
		Song s02 = new Song("������", "BIGBANG", "Always", "G-DRAGON", "2007");
		s02.setTrack(2);
		
		//Song(6)
		Song s03 = new Song("���ɿ���", "����Ŀ����Ŀ", "����Ŀ����Ŀ1��", "�����", "2021", 4);
		
		//���������
		s01.showInfo();
		
		//������
		s02.showInfo();
		
		//����Ŀ����Ŀ���
		s03.showInfo();
	}

}
