package copyfile.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 
 * дһ��demo ʵ���ļ��ĸ���
 * ���Դ�ļ������ڣ�����ʾ�ļ�������
 * ��ʽ��copy Դ�ļ� ��Ŀ���ļ�
 */
public class CopyDemo {
	public static void main(String[] args) throws Exception {
		//�ж��Ƿ�����������
		if (args.length!=2) {
			System.out.println("����Ĳ�������ȷ");
			//ϵͳ�˳�
			System.exit(1);
		}
		//����file ����
		File f1 = new File(args[0]);
		File f2 = new File(args[1]);
		//�ж�Դ�ļ��Ƿ����
		if (!f1.exists()) {
			System.out.println("���ļ�������");
			System.exit(1);
			
		}
		//�������룬�����
		OutputStream os = new FileOutputStream(f1);  //���������д��Ŀ���ļ�
		InputStream  ip  = new FileInputStream(f2);  //���������󣬶�ȡԴ�ļ�
		//�ж���������Ƿ�׼����
		if (os!=null&&ip!=null) {
			int temp ;
		  //��ʼ����
			while ((temp = ip.read())!=-1) {
				//�߶���д
			     os.write(temp);
			     System.out.println("�������");
				
			}
		}
		//�ر����������
		os.close();
		ip.close();
		
	}

}
