package inputstream.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/*
 * �Ľ��� 4
 * ʹ��read()ͨ��ѭ����ȡ
 * byte[] b = new byte[(int)f.length()];
			for (int i = 0; i < b.length; i++) {
				    b[i] = (byte)is.read();
			}
 */
public class InputStreamDemo4 {
		public static void main(String[] args) throws Exception {
			//ʹ��file �ҵ�һ���ļ�
			File f = new File("d:"+File.separator+"test.txt");
			//ͨ������ʵ��������
			InputStream is =new FileInputStream(f);
			//����һ��1024���ֽ����飬�����е����ݶ�����������
			byte[] b = new byte[(int)f.length()];
			for (int i = 0; i < b.length; i++) {
				    b[i] = (byte)is.read();
			}
			//�ر�������
			is.close();
			//��ӡ��������,��byte����ת��Ϊstring�������
			System.out.println(new String(b));
			
		}
	}


