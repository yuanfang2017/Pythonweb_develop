package random.cn;

import java.util.Random;

/*
 * random ����һ�������������
 * ���õķ�����
 *  boolean	nextBoolean() 
          ������һ��α�����������ȡ�Դ���������������еľ��ȷֲ��� boolean ֵ��
           double	nextDouble() 
          ������һ��α�����������ȡ�Դ���������������еġ��� 0.0 �� 1.0 ֮����ȷֲ��� double ֵ��
           float	nextFloat() 
          ������һ��α�����������ȡ�Դ���������������еġ��� 0.0 �� 1.0 ֮����ȷֲ��� float ֵ
           int	nextInt() 
          ������һ��α����������Ǵ�������������������о��ȷֲ��� int ֵ��
          int	nextInt(int n) 
          ����һ��α�����������ȡ�Դ���������������еġ��� 0����������ָ��ֵ����������֮����ȷֲ��� int ֵ��
 */
//ʵ��������10��������������ֲ�����100
public class RandomDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		//ѭ��10�Σ�����10�������
		for (int i = 0; i < 10; i++) {
			System.out.print(rd.nextInt(100)+"\t");
		}
		
	}

}
