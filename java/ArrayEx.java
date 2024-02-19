public class ArrayEx{
	public static void main(String[] args){
		System.out.println(" 1.Initialize Array:");
		System.out.println("-------------------");
		int[] numbers={1,2,3,4,5};
		list(numbers);
		System.out.println("2.Access element:");
		System.out.println("-------------------");
		System.out.println("The third element is "+numbers[2]);
		System.out.println("3.Modify Element:");
		System.out.println("-------------------");
		System.out.print("Before modification:");
		list(numbers);
		numbers[1]=10;
		System.out.print("After modification:");
		list(numbers);
		System.out.println("4.Array Length:");
		System.out.println("-------------------");
		list(numbers);
		System.out.println("The length of the array is "+numbers.length);
		System.out.println("5.Sum of Elements:");
		System.out.println("-------------------");
		list(numbers);
		int sum=0;
		int maximum=numbers[0];
		int minimum=numbers[0];
		for(int num:numbers){
			if(num>maximum){
				maximum=num;
			}
			else if(num<minimum){
				minimum=num;
			}
			sum+=num;
		}
		System.out.println(sum);
		System.out.println("6.Average of the Elements:");
		System.out.println("-------------------------");
		double average=sum/(double)numbers.length;
		System.out.println("The average is "+average);
		System.out.println("7.Find Maximum:");
		System.out.println("--------------");
		System.out.println("The maximum value is "+maximum);
		System.out.println("8.Find Minimum:");
		System.out.println("--------------");
		System.out.println("The minimum value is "+minimum);
		System.out.println("9.Copy Array:");
		System.out.println("------------");
		int[] copyNumbers=new int[numbers.length];
		System.arraycopy(numbers,0,copyNumbers,0,numbers.length);
		System.out.print("copyNumbers=");
		list(copyNumbers);
		System.out.println("10.Reverse an array:");
		System.out.println("-------------------");
		System.out.print("Original Array:");
		list(numbers);
		int left=0;
		int right=numbers.length-1;
		while(left<right){
			int temp=numbers[left];
			numbers[left]=numbers[right];
			numbers[right]=temp;
			left++;
			right--;
		}
		System.out.print("Reversed Array:");
		list(numbers);
	}
	public static void list(int[] array){
		System.out.print("[");
		for(int i=0;i<array.length;i++){
			System.out.print((i==array.length-1)? array[i] : array[i]+",");
		}
		System.out.print("]");
		System.out.println();
	}
}

		