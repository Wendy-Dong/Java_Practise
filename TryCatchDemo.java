package demo;

public class TryCatchDemo {
	public static void main (String args[]){
//		System.out.print(divide(1,0));
		divide(1,0);
	}
	public static void divide(int x,int y){
	try{
		int z=x/y;
		System.out.println(z);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Index not found.");
	}
	catch(Exception e){
		System.out.println("The division should not be zero.");
	}
//	below part will be executed after exception is caught.
	System.out.println("Method execution ends.");
	}
}
