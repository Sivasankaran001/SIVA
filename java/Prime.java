import java.io.Console;
public class Prime{
	public static void main(String args[]){
		Console cons=System.console();
		int num=Integer.parseInt(cons.readLine());
		int i;
		for (i=2;i<num;i++){
			if(num%i==0){
				break;
			}	
		}
		if(i==num){
			System.out.println(num +" is a Prime Number");
		}else{
			System.out.println(num +" is not  a Prime Number");
		}
}}
			