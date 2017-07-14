package demo;

public class TryThrowableDemo01 {

	/**
	 * @param args
	 */
//	Add try catch blocks for method, use throw new Exception("Exception description") to throw the specific exception.
//	Exception is thrown and handled in the method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryThrowableDemo01.divide(10,0);
	}
	public static void divide(int x, int y){
		try{
			if (y==0){
				throw new Exception("The division should not be zero.");
			}
			int z=x/y;
			System.out.println(z);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
