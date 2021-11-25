package com.javaex.ex07;

public class TV {

	//�ʵ�
	private int channel;
	private int volume;
	private boolean power;
	
	//������
	public TV() {
		
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	//�޼ҵ� - getter
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}
	
	public boolean getPower() {
		return power;
	}
	
	//�޼ҵ� - �Ϲ�
	public void power(boolean on) {
		if (on == true) {
			this.power = true;
		} else {
			this.power = false;
		}
	}
	
	public void channel(int channel) {
		if (this.power == true) {
			if (channel > 255) {
				this.channel = 255;
			} else  if (channel < 1) {
				this.channel = 1;
			} else {
				this.channel = channel;
			}
		} else {
			System.out.println("������ �����־� ä���� ������� �ʽ��ϴ�.");
		}
	}
	
	public void channel (boolean up) {
		if (up == true) {
			if (this.channel < 255) {
				this.channel++;
			} else {
				this.channel = 255;
			}
		} else {
			if (this.channel > 1) {
				this.channel--;
			} else {
				this.channel = 1;
			}
		}
	}
	
	public void volume (int volume) {
		if (this.power == true) {
			if (volume > 100) {
				this.volume = 100;
			} else if (volume < 1) {
				this.volume = 1;
			} else {
				this.volume = volume;
			}
		}
	}
	
	public void volume (boolean up) {
		if (up == true) {
			if (this.volume < 100) {
				this.volume++;
			} else {
				this.volume = 100;
			}
		} else {
			if (this.volume > 1) {
				this.volume--;
			} else {
				this.volume = 1;
			}
		}
	}
	
	public void status() {
		
		String powerOnOff;
		
		if (this.power == true) {
			powerOnOff = "on";
		} else {
			powerOnOff = "off";
		}
		
		System.out.println("[Power]:" + powerOnOff + "\t[Channel]:" + this.channel + "\t[Volume]:" + this.volume);
	}
	
}
