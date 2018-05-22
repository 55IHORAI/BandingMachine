

import java.util.Scanner;

public class HELL {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int a, b = 0;
      String won = "원";
      String s2 = "현재 잔액은";
      String s3 = "입니다. ";
      String s4 = "반환되었습니다.";
      System.out.print("돈을 투입하세요");
      a = sc.nextInt();
      
      
      while (a >= 500) {
		System.out.println("주스를 선택하세요 ");
		System.out.println("1. 사과주스 : 1000" + won);
		System.out.println("2. 꿀차 : 700" + won);
		System.out.println("3. 커피  : 500" + won);
		System.out.println("4. 잔돈 반환");
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
      
		System.out.println("잔액이 모자릅니다. 잔액" + a + "원을 반환합니다");
	}
   }

