package file.cn;

import java.io.File;

/*
 * File �������Դ����ļ��������Դ����ļ���
 * ʹ�÷�����
 *  boolean	mkdir() 
          �����˳���·����ָ����Ŀ¼��
  
 */
public class FileDemo {
	public static void main(String[] args) {
		//����·��
		File f = new File("d:"+File.separator+"ceshi");
		//�����ļ���Ŀ¼
		f.mkdir();
	}
	

}
