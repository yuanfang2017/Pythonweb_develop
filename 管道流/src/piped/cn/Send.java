package piped.cn;

import java.io.IOException;
import java.io.PipedOutputStream;

//����һ��������Ϣ���߳�
class Send implements Runnable{
	//����ܵ�������
	PipedOutputStream pos = null;
	//ͨ�����캯��ʵ���� �ܵ����������
	public Send(){
		this.pos = new PipedOutputStream();
	}
  public void run(){
	  //����һ���ַ���
	  String str = "hello wangyuanfang,hahahha";
	  try {
		  //write()���յĲ���������byte������Ҫתһ��
		this.pos.write(str.getBytes());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  //�ر���
	  try {
		this.pos.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  //ͨ���߳���õ������
	 
  }
  public PipedOutputStream getPost(){
		return this.pos; 
  }
}