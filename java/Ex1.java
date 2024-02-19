import java.util.*;
public class Ex1{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		boolean flow=true;
		ArrayList <String> names=new ArrayList<>();
		ArrayList <Float> ages=new ArrayList<>();
		ArrayList <Boolean> marriage= new ArrayList<>();
		while(flow){
			System.out.print("Enter name (type 'exit' to finish) :");
			String name=s.next();
			if(name.equals("exit")){
				break;
			}
			System.out.print("Enter age:");
			float age=s.nextFloat();
			System.out.print("Is married (true/false) :");
			boolean married=s.nextBoolean();
			names.add(name);
			ages.add(age);
			marriage.add(married);
		}
		System.out.println();
		System.out.println("Entered details:");
		for (int i=0; i<names.size();i++){
			System.out.println("Name: "+names.get(i)+", Age: "+ages.get(i)+", Is Married: "+marriage.get(i));
		}
			
	}
}		
			