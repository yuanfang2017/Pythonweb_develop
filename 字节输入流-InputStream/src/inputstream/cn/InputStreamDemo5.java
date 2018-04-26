package inputstream.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/*
 * �����ֶ�ȡ��ʽ���ļ�����ĩβ�ˣ��᷵��-1
 * �õ�len��ֵ������b���鸳ֵ
 * 	int temp;
		int len = 0;
		while ((temp = is.read())!=-1) {
			b[len] = (byte)temp;
			len++;
		}
 * 
 */
public class InputStreamDemo5 {
	public static void main(String[] args) throws Exception {
		//ʹ��file �ҵ�һ���ļ�
		File f = new File("d:"+File.separator+"test.txt");
		//ͨ������ʵ��������
		InputStream is =new FileInputStream(f);
		//����һ��1024���ֽ����飬�����е����ݶ�����������
		byte[] b = new byte[1024];
		int temp;
		int len = 0;
		while ((temp = is.read())!=-1) {
			b[len] = (byte)temp;
			len++;
		}
		//�ر�������
		is.close();
		//��ӡ��������,��byte����ת��Ϊstring�������
		System.out.println(new String(b,0,len));
		
	}
}
