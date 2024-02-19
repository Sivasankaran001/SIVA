public class Student1{
	private int id;
	private String name;
	private int age;
	private char grade;
	private String address;
void setDetails(int id,String name,int age, char grade,String address){
	this.name=name;
	this.id=id;
	this.age=age;
	this.grade=grade;
	this.address=address;
}
public String getName(){
	return name;
}
public int getId(){
	return id;
}
public int getAge(){
	return age;
}
public char getGrade(){
	return grade;
}
public String getAddress(){
	return address;
}

public static void main(String args[]){
	Student1 s=new Student1();
	s.setDetails(104045,"Siva",22,'O',"42,Lakshmiyapuram 1st street,snkl");
	System.out.println(s.getName());
}}