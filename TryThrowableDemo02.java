package demo;

public class TryThrowableDemo02 {

	/**
	 * @param args
	 * @throws Exception 
	 */
//	Exception declared using the throws clause
//	Exception is declared in the method and handled in method main().
	public static void main(String[] args){
		// TODO Auto-generated method stub
		try{
			divide(10,0);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
	public static void divide (int x,int y) throws Exception{
		if(y==0){
			throw new Exception("The division should no be zero.");
		}
		int z=x/y;
		System.out.println(z);
	}
}
