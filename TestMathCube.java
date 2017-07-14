package demo;

public class TestMathCube {

	/**
	 * @param args
	 */
//	args[0] is an argument need to be set in Run As -> Run Configurations -> (x)=Arguments.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		TestMathCube tc = new TestMathCube();
		int num = Integer.parseInt(args[0]);
		System.out.println(tc.cube(num));
		}
		catch(NumberFormatException e){
			System.out.println("Input argument format is wrong");
		}
	}
	public int cube(int a){
		return a*a*a;
	}
}
