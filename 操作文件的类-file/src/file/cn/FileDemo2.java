package file.cn;

import java.io.File;

/*
 * file ��ɾ������
 *  boolean	delete() 
          ɾ���˳���·������ʾ���ļ���Ŀ¼��
 */
public class FileDemo2 {
	public static void main(String[] args) {
		//����ɾ��·������������ָ�ʽ
		File f = new File("d:"+File.separator+"test.txt");
		//�ж��ļ��Ƿ���ڣ����������ɾ��
	   if (f.exists()) {
		   boolean flag = f.exists();
		   System.out.println(flag);
		 f.delete();
	}
	}

}
