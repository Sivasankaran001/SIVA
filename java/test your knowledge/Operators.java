public class Operators{
	public static void main(String args[]){
		int a=7,b=2;
		int remainder=a%b;
		float num1=22,num2=33;
		int number=245;
		int length=10,width=20;
		int year=2100;
		boolean leapyear=false;
		if ((year%4==0 && year%100!=0)||year%400==0){
			leapyear=true;
		}
		double lega=5,legb=9;
		System.out.println("Operators and Expressions");
		System.out.println("-------------------------");
		System.out.println("1.Add two integers("+a+"+"+b+")="+(a+b));
		System.out.println("2.Remainder="+remainder);
		System.out.println("Evaluate the Expression");
		System.out.println("3. 5*(10+3)="+(5*(10+3)));
		System.out.println("4. (8-3)*2/5="+((8-3)*2/5));
		System.out.println("5. 10%3="+(10%3));
		System.out.println("6.Average of "+num1+","+num2+"="+(num1+num2)/2);
		System.out.println("7.Number "+number+((number%2==0)?" is even":" is odd"));
		System.out.println("8.Area of a rectangle of length "+length+" and width "+width+" is "+(length*width));
		System.out.println("9.The year "+year+((leapyear)?" is a leap year":" is not a leap year"));
		System.out.println("10.Hypotenuse of right triangle given the lengths "+lega+" and "+ legb+" is "+(Math.sqrt((lega*lega)+(legb*legb))));
	}
}