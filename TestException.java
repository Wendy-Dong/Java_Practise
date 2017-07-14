package demo;

public class TestException {

	/**
	 * null can't be transformed to int.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer totalValue=calculate(45);
//		System.out.println(totalValue.intValue());
		System.out.println(totalValue);
	}
	private static Integer calculate(int i){
		return null;
	}
}
