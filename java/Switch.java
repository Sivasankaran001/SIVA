public class Switch{
	public static void main(String[] args){
		int num=4;
		String number="";
		switch(num){
			case 0:
				number="Zero";
				break;
			case 1:
				number="One";
				break;
			case 2:
				number="Two";
				break;
			case 3:
				number="Three";
				break;
			default:
				number="No cases found";
		}
	System.out.println(number);
}}