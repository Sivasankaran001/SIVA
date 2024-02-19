public class ControlStatements{
	public static void main(String args[]){
		System.out.println("Control Statements");
		System.out.println("------------------");
		System.out.println("1.Check number is a positive,negative or zero:");
		int num=10;
		if(num==0){
			System.out.println("Given number ("+num+") is zero");
		}else if(num>0){
			System.out.println("Given number ("+num+") is Positive");
		}else{
			System.out.println("Given number ("+num+") is Negative");
		}
		System.out.println("2.Determine Whether leap year or not:");
		int year=2100;
		if ((year%4==0 && year%100!=0)||year%400==0){
			System.out.println("Given year ("+year+") is a leap year");		
		}else{
			System.out.println("Given year ("+year+") is not a leap year");
		}
		System.out.println("3.Find the maximum numbers:");
		int a=20,b=35,c=3998;
		int greater;
		if(a>b && a>c){
			greater=a;
			System.out.println(a+" is greater than "+b+" and "+c);
		}else if(b>c){
			greater=b;
			System.out.println(b+" is greater than "+a+" and "+c);
		}else{
			greater=c;
			System.out.println(c+" is greater than "+a+" and "+b);
		}
		System.out.println("4.Given character is vowel or not:");
		char ch='z';
		char[] vowels={'a','e','i','o','u','A','E','I','O','U'};
		boolean vowel=true;
		for(char letters:vowels){
			if (ch==letters){
				vowel=false;
				break;
			}
		}
		if(vowel){
			System.out.println("Given letter "+ch+" is a vowel");
		}else{
			System.out.println("Given letter "+ch+" is not a vowel");
		}
		System.out.println("5.Given number is even or not:");
		if(num%2==0){
			System.out.println(num+" is a even");
		}else{
			System.out.println(num+" is a odd");
		}
		System.out.println("6.Determine the grade on their percentage:");
		double percentage=98.7;
		if(percentage>90){
			System.out.println("The student grade is O");
		}else if(percentage>80){
			System.out.println("The student grade is A+");
		}else if(percentage>70){
			System.out.println("The student grade is A");
		}else if(percentage>60){
			System.out.println("The student grade is B+");
		}else if(percentage>50){
			System.out.println("The student grade is B");
		}else{
			System.out.println("The student grade is U");
		}
		System.out.println("7.Largest among three("+a+","+b+","+c+"):"+greater);
		System.out.println("8.Number is divisible by 2 and 3:");
		int number=6;
		if(number%2==0 && number%3==0){
			System.out.println("Given number "+number+" is divisible by both 2 & 3");
		}else if(number%2==0 || number%3==0){
			System.out.println("Given number "+number+" is either divisible by   2 or 3");
		}else{
			System.out.println("Given number "+number+" is neither divisible by 2 nor 3");
		}
		System.out.println("9.Check whether the string is palindrome or not");
		String str="madam";
		String reversedStr="";
		for (int i=str.length()-1;i>=0;i--){
			reversedStr+=str.charAt(i);
		}
		if(str.equals(reversedStr)){
			System.out.println("Given string is a palindrome");
		}else{
			System.out.println("Given string is not a palindrome");
		}
		System.out.println("10.Determine the day using the number:");
		
		int dayNumber=4;
		switch(dayNumber){
			case 1:
				System.out.println("The "+dayNumber+"th day is Monday");
				break;
			case 2:
				System.out.println("The "+dayNumber+"th day is Tuesday");
				break;
			case 3:
				System.out.println("The "+dayNumber+"th day is Wednesday");
				break;
			case 4:
				System.out.println("The "+dayNumber+"th day is Thursday");
				break;
			case 5:
				System.out.println("The "+dayNumber+"th day is Friday");
				break;
			case 6:
				System.out.println("The "+dayNumber+"th day is Saturday");
				break;
			case 7:
				System.out.println("The "+dayNumber+"th day is Sunday");
				break;
		}
	}
}

		
	