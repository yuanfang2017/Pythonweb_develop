package piped.cn;

import java.io.IOException;
import java.io.PipedInputStream;

class Receive implements Runnable {
	//ͨ�����캯��ʵ���� �ܵ����������
	PipedInputStream pis = null;
	//ͨ�����췽�� ʵ��������
	public Receive(){
	  pis = new PipedInputStream();
	}
	public void run(){
		//����һ���洢�ռ�
		byte[] by = new byte[1024];
		int len = 0 ;
	  try {
		len =  pis.read(by);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		try {
			pis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���������Ϊ��"+new String(by,0,len));
		
	}
	//��������߳̽�����
	public PipedInputStream gitPis(){
		return this.pis;
	}

}
