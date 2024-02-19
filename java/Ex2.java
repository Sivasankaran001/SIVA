import java.util.*;
public class Ex2{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String[] names=new String[1];
		int[] ages=new int[1];
		int index=0;
		boolean[] marriage= new boolean[1];
		while(true){
			System.out.print("Enter name (type 'exit' to finish) :");
			String name=s.next();
			if(name.equals("exit")){
				break;
			}
			if(index==names.length){
				names=expandArray(names);
				ages=expandArray(ages);
				marriage=expandArray(marriage);
			}
			System.out.print("Enter age:");
			int age=s.nextInt();
			System.out.print("Is married (true/false) :");
			boolean married=s.nextBoolean();
			names[index]=name;
			ages[index]=age;
			marriage[index]=married;
			index++;
		}
		System.out.println();
		System.out.println("Entered details:");
		for (int i=0; i<names.length;i++){
			System.out.println("Name: "+names[i]+", Age: "+ages[i]+", Is Married: "+marriage[i]);
		}
			
	}
	public static String[] expandArray(String[] array){
		String[] newArray=new String[array.length+2];
		for(int i=0;i<array.length;i++){
			newArray[i]=array[i];
		}
		return newArray;
	}
	public static int[] expandArray(int[] array){
		int[] newArray=new int[array.length+2];
		for(int i=0;i<array.length;i++){
			newArray[i]=array[i];
		}
		return newArray;
	}
	public static boolean[] expandArray(boolean[] array){
		boolean[] newArray=new boolean[array.length+2];
		for(int i=0;i<array.length;i++){
			newArray[i]=array[i];
		}
		return newArray;
	}
}		
			