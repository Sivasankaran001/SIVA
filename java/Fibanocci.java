import java.io.Console;
public class Fibanocci{
	public static void main(String args[]){
		Console cons = System.console();
		int limit= Integer.parseInt(cons.readLine());
		int num1=0;
		int num2=1;
		int start=1;
		if(start==1 && limit>0){
			System.out.println(num1);
		}
		if(limit>1 && start==1){
			System.out.println(num2);
		}
		do{	
			if(limit>2){
			int num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
			}
			start++;
		}while(start<(limit-1));
}}
		