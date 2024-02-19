import java.util.*;
import java.io.*;
public class GlobalArray{
	int[] result=new int[4];
	void add(int a, int b){
		result[0]=a+b;
	}
	void sub(int a, int b){
		result[1]=a-b;
	}
	void mul(int a, int b){
		result[2]=a*b;
	}
	void div(int a, int b){
		result[3]=a/b;
	}
	public static void main(String args[]){
		Console cons=System.console();
		int a=Integer.parseInt(cons.readLine());
		int b=Integer.parseInt(cons.readLine());
		GlobalArray m=new GlobalArray();
		m.add(a,b);
		m.sub(a,b);
		m.mul(a,b);
		m.div(a,b);
		System.out.println(Arrays.toString(m.result));
}}