public class CopyConstructor{
	String Name;
	CopyConstructor(){
		Name="Siva";
	}
	CopyConstructor(CopyConstructor full){
		String FullName=full.Name;
		System.out.println(full.Name);
}
	public static void main(String args[]){
		CopyConstructor m=new CopyConstructor();
		System.out.println(m.FullName);
		}}