import java.util.Scanner;

public class GitProject {

	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int i=0;
		
		System.out.println("Hello I'm cal.");
		System.out.println("1=add");
		System.out.println("2=sub");
		System.out.println("3=multi");
		System.out.println("4=div");
		System.out.println("Enter the value: ");
		i=sc.nextInt();{
			if(i==1){
				int x,y;
				System.out.println("Enter the value for x:");
				x=sc.nextInt();
				System.out.println("Enter the value for y: ");
				y=sc.nextInt();
				System.out.println(x+y);
			}else if(i==2){
				int x,y;
				System.out.println("Enter the value for x:");
				x=sc.nextInt();
				System.out.println("Enter the value for y: ");
				y=sc.nextInt();
				System.out.println(x-y);
			}else if(i==3){
				int x,y;
				System.out.println("Enter the value for x:");
				x=sc.nextInt();
				System.out.println("Enter the value for y: ");
				y=sc.nextInt();
				System.out.println(x*y);
			}else if(i==4){
				int x,y;
				System.out.println("Enter the value for x:");
				x=sc.nextInt();
				System.out.println("Enter the value for y: ");
				y=sc.nextInt();
				System.out.println(x/y);
			}else if(i==5){
				System.out.println("Sorry you entered wrong key try again..");
			}
		}
		
		
	}
}
