package com.rkjavahub.operator_assignment;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		int x = 4;
		int y;

		y = ++x;
		System.out.println("case 1:y = ++x; value of x=" + x);// 5
		System.out.println("value of y=" + y);// 5

		x = 4;
		y = x++;
		System.out.println("case 2:y = x++; value of x=" + x);// 5
		System.out.println("value of y=" + y); // 4

		x = 4;
		y = --x;
		System.out.println("case 3:y = --x; value of x=" + x);// 3
		System.out.println("value of y=" + y);// 3

		x = 4;
		y = x--;
		System.out.println("case 4:y = x--; value of x=" + x);// 3
		System.out.println("value of y=" + y);// 4

		// y=++(++x);//We can't perform nesting of increment operator

		/* Difference between z++ and z+1 */
		byte z = 7;
		System.out.println(z++);
		
		
		// z=z+1;//Cannot convert from int to byte. it uses formula max(int,type
		// of a,type of b) which is max(int,byte,int)=int
		

	}

}
