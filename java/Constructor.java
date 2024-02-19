class parameter{
parameter(){
System.out.println("Siva");}
parameter(int a){
	System.out.println(a);
}
parameter(int a,int b){
	System.out.println(a+b);
}}
public class Constructor{
	public static void main(String args[]){
		parameter m=new parameter(2,3);
		parameter n=new parameter();
		parameter s=new parameter(3);
		
}}