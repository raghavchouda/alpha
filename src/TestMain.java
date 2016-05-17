
public class TestMain {


	@Override
	protected void finalize() throws Throwable {

		super.finalize();
	}
	
	public static void main(String[] args) throws Throwable {

		
		TestMain tm  =new TestMain();
		tm.finalize();
		System.gc();
		Runtime.getRuntime().gc();
		
	}

}
