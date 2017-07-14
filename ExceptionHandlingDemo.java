package demo;

public class ExceptionHandlingDemo {

	/**
	 * @param args
	 */
//	Since finally block will first execute system.exit(-1), the next line won't be executed
//	And the lines below finally block won't be executed as well
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray={1,2,3,4,5};
		int intVar=0;
		try{
			intVar=intArray[5];
			System.out.println(intVar);
		}
		catch(ArrayIndexOutOfBoundsException ec){
			System.out.println("An exception has occurred here:="+ec.getMessage());
			System.out.println("An exception has occurred here:="+ec.getStackTrace());
		}
		finally{
			System.exit(-1);
			System.out.println("This is from with in finally block.");
		}
		System.out.println("This will be a part of response.");
	}

}
