package week1.day1;

public class Fibonacci {
public static void main(String[] args) {
	int x = -1;
	int y = 1;
	int sum = 0;
	//0  1  1  2  3  5  8  13  21  34  55
	//
	for (int i = 1; i <=11; i++)
	{ 
		sum=x+y;
		x=y;
		y=sum;
		System.out.println(sum);
		}
	
	}
}
