package inputstream.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/*
 * �Ľ���3
 * //�������ж��ļ��Ĵ�С�����ٿռ䣬��������˷�
		byte[] b = new byte[(int)f.length()];
 */
public class InputStreamDemo3 {
	public static void main(String[] args) throws Exception {
		//ʹ��file �ҵ�һ���ļ�
		File f = new File("d:"+File.separator+"test.txt");
		//ͨ������ʵ��������
		InputStream is =new FileInputStream(f);
		//�������ж��ļ��Ĵ�С�����ٿռ䣬��������˷�
		byte[] b = new byte[(int)f.length()];
		//��ȡ����
		is.read(b);
		//�ر�������
		is.close();
		//��ӡ��������,��byte����ת��Ϊstring�������
		System.out.println(new String(b));
		
	}

}
