package scanner.cn;

import java.util.Scanner;

/*
 * ���Ҫ����int float ���͵����ݣ���scanner ����Ҳ��֧�ֵģ�����������֮ǰ�����ʹ��hasnex���������ж�
 */
public class ScannerDemo3 {
	public static void main(String[] args) {
		//�Ӽ��̽�������
		Scanner s = new Scanner(System.in);
		int i = 0;
		float f = 0f;
		System.out.println("������������");
		if (s.hasNextInt()) {
			i = s.nextInt();
			System.out.println("���������λ��"+i);
		}
		else {
			System.out.println("����Ĳ�����������");
		}
	   System.out.println("������С����");
		if (s.hasNextFloat()) {
			f = s.nextFloat();
			System.out.println("�����Сλ��"+f);
		}
		else {
			System.out.println("����Ĳ���С������");
		}
	}

}
