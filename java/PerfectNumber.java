import java.io.*;
public class PerfectNumber{
	public static void main(String args[]){
		Console cons=System.console();
		System.out.println("Enter the number to check:");
		int num=Integer.parseInt(cons.readLine());
		int sum=0;
		for(int i=1;i<=num/2;i++){
			sum=(num%i==0)? sum+i:sum;
		}
		System.out.println(num+((sum==num)? " is a Perfect Number":" is not a Perfect Number"));
}}