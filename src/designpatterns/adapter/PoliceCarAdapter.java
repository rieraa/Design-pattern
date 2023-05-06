//designpatterns.adapter.PoliceCarAdapter.java
package designpatterns.adapter;

//�������������䵱������
public class PoliceCarAdapter extends CarController {
	private PoliceSound sound;  //����������PoliceSound����
	private PoliceLamp lamp;   //����������PoliceLamp����
	
	public PoliceCarAdapter() {
		sound = new PoliceSound();
		lamp = new PoliceLamp();
	}
	
	//������������
	public void phonate() {
		sound.alarmSound();  //������������PoliceSound�ķ���
	}
	
	//���־�����˸
	public void twinkle() {
		lamp.alarmLamp();   //������������PoliceLamp�ķ���
	}
}