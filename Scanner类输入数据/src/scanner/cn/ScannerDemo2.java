package scanner.cn;

import java.util.Scanner;
/*
 * �޸��������ݵķָ���
 * scanner ��ֻ��ȡ���ո�֮ǰ�����ݣ��ո�֮������ݾ�û���ˣ�������Ϊscanner���ո�����һ���ָ���������Ϊ�˱�֤�������ȷ��
 * ���Խ��ָ������޸�Ϊ/n�س�
 */
public class ScannerDemo2 {
	 public static void main(String[] args) {
			//new һ��scanner ���󣬴Ӽ��̽��ն���
			 Scanner s = new Scanner(System.in);
			 //�޸��������ݵķָ���
			 s.useDelimiter("\n");
			 System.out.println("���������ݣ�");
			 String str = s.next();
			 System.out.println("���������Ϊ��"+str);			 
		}

}
