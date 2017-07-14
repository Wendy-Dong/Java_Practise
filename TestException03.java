package demo;

public class TestException03 {

	/**
	 * @param args
	 */
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
