import java.io.*;
public class Amstrong{
	public static void main(String args[]){
		Console cons=System.console();
		String num=cons.readLine();
		int sum=0;
		for (int i=0;i<num.length();i++){
			sum+=Math.pow(Character.getNumericValue(num.charAt(i)),num.length());
		}
		System.out.println(num+((Integer.parseInt(num)==sum )? " is an Amstrong Number":" is not an Amstrong Number"));
}}
