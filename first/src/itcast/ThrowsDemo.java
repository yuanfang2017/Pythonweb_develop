package itcast;

import javax.sound.midi.SysexMessage;

/*
 * дһ��throws demo
 * throws ��д�ڷ�����ĺ��棬���������ô� ���
 */
//дһ���� ����װһ�������ķ���
class math{
	public int chufa(int i,int j) throws Exception{  //���쳣
		int temp = i/j;
		return temp;			
	}
}
public class ThrowsDemo {
	public static void main(String[] args) {
		//ʵ��������
		math m = new math();
		
		try{  System.out.println("�����쳣�ɹ���"+m.chufa(10, 2));} catch(Exception e){
			e.printStackTrace();
		}
		   
	}
}
