package demo;

public class ExceptionHandlingDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray={1,2,3,4,5};
		int intVar=0;
		try{
			intVar=intArray[3];
			System.out.println(intVar);
			String str=args[0];
			System.out.println(str);
		}
		catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("An ArrayIndexOutOfBounds exception has occurred here:="+e1.getMessage());
			System.out.println("An exception has occurred here:="+e1.getStackTrace());
		}
		catch(ArithmeticException e2){
			System.out.println("An Arithmetic exception has occurred here:="+e2.getMessage());
			System.out.println("An exception has occurred here:="+e2.getStackTrace());
		}
		catch(NullPointerException e3){
			System.out.println("An NullPointer exception has occurred here:="+e3.getMessage());
			System.out.println("An exception has occurred here:="+e3.getStackTrace());
		}
		finally{
			System.out.println("This is from with in finally block.");
		}
		System.out.println("This will be a part of response.");
	}

}
