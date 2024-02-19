import java.io.*;
public class Loop{
	public static void main(String args[]){
		Console con=System.console();
		System.out.println("1.Print numbers from 1 to 10:");
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
		System.out.println("2.Print even numbers between 1 and 20:");
		for(int i=1;i<=20;i++){
			if(i%2==0){
			System.out.println(i);
		}}
		System.out.println("3.Calculate the factorial:");
		System.out.print("Enter the number to calculate factorial:");
		int factorial=1;
		int input=Integer.parseInt(con.readLine());
		for (int i=1;i<=input;i++){
			factorial*=i;
		}
		System.out.println(factorial);
		System.out.println("4.Print Fibanocci series");
		System.out.print("Enter the limit:");
		int limit=Integer.parseInt(con.readLine());
		int n1=0;
		int n2=1;
		int n3;
		if(limit>=1){
			System.out.println(n1);
		}
		if(limit>=2){
			System.out.println(n2);
		}if(limit>2){
			for (int i=0;i<limit-2;i++){
				n3=n1+n2;
				if (n3>limit){
				    break;
				}
				System.out.println(n3);
				n1=n2;
				n2=n3;
			}
		}
		System.out.println("5.Multiplication Table:");
		System.out.print("Enter the table you want (Using For loop):");
       	 	int input1 =Integer.parseInt(con.readLine());
        	for (int k =1; k<=10; k++){
            		System.out.println( k+ " x" + " " + input1 + " =" + " " +(input1 * k));
       		}	
		System.out.println("6.Sum of all numbers:");
		int sum=0;
		for (int i=1;i<=100;i++){
			sum+=i;
		}
		System.out.println("Sum of all numbers between 1 to 100 is "+sum);
		System.out.println("7.Check given number is prime or not:");
		System.out.print("Enter the number to check:");
		int num=Integer.parseInt(con.readLine());
		boolean prime=true;
		if(num>1){
			for(int i=2;i<num;i++){
				if(num%i==0){
					prime=false;	
					break;
				}
			}
			if(prime){
				System.out.println(num+" is  a Prime number");
			}else{
				System.out.println(num+" is not a Prime number");
			}
		}
		System.out.println("8.GCD of two numbers:");
		System.out.print("Enter the first number:");
		int a=Integer.parseInt(con.readLine());
		System.out.print("Enter the second number:");
		int b=Integer.parseInt(con.readLine());
		int max=(a>b)?a:b;
		int gcd=1;
		for (int i=1;i<=max;i++){
			if(a%i==0 && b%i==0){
				if(gcd<i){
					gcd=i;
				}
			}
		}
		System.out.println("The GCD of "+a+" and "+b+" is "+gcd);
	}
}