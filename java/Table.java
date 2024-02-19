import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the table you want (Using doWhile loop): ");
        int number =scan.nextInt();

        int i=1;
        do{
            System.out.println(i + " x" + " " + number + " =" + " " + (number * i));
            i++;
        }while(i<=10);


        System.out.print("Enter the table you want (Using While loop):");

        int number1 =scan.nextInt();
        int j = 1;

        while (j<=10) { 
            System.out.println(j + " x" + " " + number1 + " =" +" " +(number1 * j));
            j++;
        }
	 System.out.print("Enter the table you want (Using For loop):");

        int input =scan.nextInt();

        for (int k =1; k<=10; k++){
            System.out.println( k+ " x" + " " + input + " =" + " " +(input * k));
        }


        scan.close();



    }
}