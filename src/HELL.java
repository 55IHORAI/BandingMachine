

import java.util.Scanner;

public class HELL {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int a, b = 0;
      String won = "��";
      String s2 = "���� �ܾ���";
      String s3 = "�Դϴ�. ";
      String s4 = "��ȯ�Ǿ����ϴ�.";
      System.out.print("���� �����ϼ���");
      a = sc.nextInt();
      
      
      while (a >= 500) {
		System.out.println("�ֽ��� �����ϼ��� ");
		System.out.println("1. ����ֽ� : 1000" + won);
		System.out.println("2. ���� : 700" + won);
		System.out.println("3. Ŀ��  : 500" + won);
		System.out.println("4. �ܵ� ��ȯ");
		b = sc.nextInt();
		
		
		if (b == 1)
			a -= 1000; 
		else if (b == 2)
			a -= 700;
		else if (b == 3)
			a -= 500;
		else {
			System.out.println(a + won +s4);
			break;}
			
		System.out.println(s2 + a + won + s3);
		}
      
		System.out.println("�ܾ��� ���ڸ��ϴ�. �ܾ�" + a + "���� ��ȯ�մϴ�");
	}
   }

