package demo;

public class TestException02 {

	/**
	 * @param args
	 */
//	badMethod() throws an exception of Error type
//	main() didn't handle the Error, execute finally blocks and then system throws the exception and stopped.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			badMethod();
			System.out.print("A");
		} 
		catch (Exception ex) {
			System.out.print("C");
		} 
		finally {
			System.out.print("B");
		}
		System.out.print("D");
	}
	public static void badMethod() {
		throw new Error();
	}
}
