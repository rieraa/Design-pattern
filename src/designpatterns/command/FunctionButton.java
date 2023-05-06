//designpatterns.command.FunctionButton.java
package designpatterns.command;

public class FunctionButton {
	private Command command;  //ά��һ������������������
	
	//Ϊ���ܼ�ע������
	public void setCommand(Command command) {
		this.command = command;
	}
	
	//��������ķ���
	public void click() {
		System.out.print("�������ܼ�: ");
		command.execute();
	}
}
