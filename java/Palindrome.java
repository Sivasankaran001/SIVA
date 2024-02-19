import java.io.*;
public class Palindrome{
	public static void main(String args[]){
		Console cons=System.console();
		System.out.println("Enter the number to check Palindrome");
		String input=cons.readLine();
		int length=input.length();
		String Result="";
		for (int i=length-1;i>-1;i--){
			Result=Result+input.charAt(i);
		}
System.out.println(Result);
		if(Long.parseLong(Result)==Long.parseLong(input)){
			System.out.println(input+ " is a palindrome");
		}
		else{
			System.out.println(input+" is not a palindrome");
		}
}}