package inputstream.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/*
 * �Ľ���2
 * //��ȡ����,read()�������ص��� int ���ͣ�����ֵ�Ƕ�ȡ�����ݵĳ���
		int len = is.read(b);
	//��ӡ��������,��byte����ת��Ϊstring�������
		System.out.println("��������ݵĳ���:"+len);
		System.out.println(new String(b,0,len));
		
 * 
 */
public class InputStreamDemo2 {
	public static void main(String[] args) throws Exception {
		//ʹ��file �ҵ�һ���ļ�
		File f = new File("d:"+File.separator+"test.txt");
		//ͨ������ʵ��������
		InputStream is =new FileInputStream(f);
		//����һ��1024���ֽ����飬�����е����ݶ�����������
		byte[] b = new byte[1024];
		//��ȡ����,read()�������ص��� int ���ͣ�����ֵ�Ƕ�ȡ�����ݵĳ���
		int len = is.read(b);
		//�ر�������
		is.close();
		//��ӡ��������,��byte����ת��Ϊstring�������
		System.out.println("��������ݵĳ���:"+len);
		System.out.println(new String(b,0,len));

}
}
