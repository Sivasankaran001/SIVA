class Person{
	String name;
	int age;
	char gender;
	Person(String name,int age, char gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	void displayDetails(){
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("Gender:"+this.gender);

}
	}
public class Student extends Person{
	
	int studentId;
	String course;
	char grade;
	Student(int studentId, String course,char grade){
		super("Siva",22,'M');
		this.studentId=studentId;
		this.course=course;
		this.grade=grade;
		System.out.println("From the class Person:");
		super.displayDetails();
		System.out.println("From the class Student:");
		this.displayDetails();
	}
	void displayDetails(){
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("Student Id:"+this.studentId);
		System.out.println("Course:"+this.course);
		System.out.println("Grade:"+this.grade);
}
	public static void main(String args[]){
		Student s=new Student(1045,"Java",'O');
		
}}
		