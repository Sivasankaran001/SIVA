public class MinMax{
	public static void main(String args[]){
		int min=Integer.parseInt(args[0]);
		int max=Integer.parseInt(args[0]);
		int length=args.length;
		for(int i=0;i<length;i++){
			if(Integer.parseInt(args[i])<=min){
				min=Integer.parseInt(args[i]);
			}
			if(Integer.parseInt(args[i])>max){
				max=Integer.parseInt(args[i]);
			}
		}
		System.out.println("The maximum value is "+max);
		System.out.println("The minimum value is "+min);
}}