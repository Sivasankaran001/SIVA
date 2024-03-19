public class Pattern{
	public static void main(String args[]){
		int height=4;
		for (int i=1;i<=height;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
		System.out.println("");
		}
		for (int i=height;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
		System.out.println("");
		}
		System.out.println("");	
		for (int i=1;i<=height;i++){
			if(i==height){
				for(int j=1;j<=i;j++){
					System.out.print("*");
				}
			}else{
				System.out.println("*");
			}
		}
		System.out.println(" ");
		System.out.println(" ");
		for (int i=1;i<=5;i++){
			if(i==Math.ceil(5/2.0)){
				for(int j=1;j<=5;j++){
					System.out.print("*");
				}
			}else{
				System.out.print("*");
				for (int k=1;k<(5-1);k++){
					System.out.print(" ");
				}
				System.out.print("*");
			}
		System.out.println("");
		}
		System.out.println(" ");
			for (int i=5;i>=1;i--){
			if(i==5){
				for(int j=1;j<=i;j++){
					System.out.print("*");
				}
			}else{
				for (int k=1;k<=(5/2);k++){
					System.out.print(" ");
				}
				System.out.print("*");
			}
		System.out.println("");
		}
		System.out.println("");
		int d=3;
		for (int i=1;i<=5;i++){
			if((i==1) || (i==5)){
				for(int j=1;j<=5;j++){
					System.out.print("#");
				}
			}else{
				
				for(int k=d;k>=1;k--){
					System.out.print(" ");
				}
					d=d-1;
				System.out.print("#");
			}
		System.out.println("");
		}
}}