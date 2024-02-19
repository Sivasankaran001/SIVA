import java.io.Console;
public class Factorial{
	public static void main(String args[]){
		Console cons=System.console();
		int num=Integer.parseInt(cons.readLine());
		int Result=1;
		for (int i=num;i>1;i--){
			Result=Result*i;
		}
		System.out.println("The factorial of "+num+" is "+Result);
}}