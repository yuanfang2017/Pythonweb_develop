package file.cn;

import java.io.File;

/*
 *    String[]	list() 
          ����һ���ַ������飬��Щ�ַ���ָ���˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��
     File[]	listFiles() 
          ����һ������·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼�е��ļ���
 */
public class FileDemo2 {
	public static void main(String[] args) {
		File f = new File("d:"+File.separator);
		//����ָ��·���µ�Ŀ¼
		String[] s = f.list();
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		//����ָ��·���µ�Ŀ¼+·��
        File[] fi = f.listFiles();
        for (int i = 0; i < fi.length; i++) {
			System.out.println(fi[i]);
		}
  
	}

}
