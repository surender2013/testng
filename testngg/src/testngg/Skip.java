package testngg;

import org.testng.annotations.Test;

public class Skip {

	@Test(enabled=true)
	public void first()
	{
		System.out.println("this is first testcase");
	}
	@Test(enabled=false)
	public void second()
	{
		System.out.println("this is second testcase");
	}
	@Test(enabled=true)
	public void third()
	{
		System.out.println("this is third testcase");
	}
}
