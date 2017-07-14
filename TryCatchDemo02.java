package demo;

public class TryCatchDemo02 {

	/**
	 * @param args
	 */
//	Compilation error demo
	public static void main(String[] args) {
		try{
			System.out.println(Double.valueOf("420.00"));
		}
		catch(Exception e){
			System.out.println("Some exception occured.");			
		}
//		catch(NumberFormatException ex){
//			System.out.println("Some exception occurred.");			
//		}
	}

}
