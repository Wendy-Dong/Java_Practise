package demo;

public class UserDefineExceptionDemo {
	public static void main(String[] args){
		try{
			testCode();
		}
		catch(MyOwnException me){
			System.out.println("custom exception handling");
		}
	}
	public static void testCode() throws MyOwnException{
		try{
			throw new MyOwnException("Test exception");
		}
		catch(Exception ex){
			System.out.println("generic exception caught");
		}
	}
}

class MyOwnException extends Exception{
	public MyOwnException(String msg){
		super(msg);
	}
}
