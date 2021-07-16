package testngg;

import org.testng.annotations.Test;

public class Dependencies {

	@Test(enabled=true)
	public void first()
	{
		System.out.println("this is first testcase");
	}
	@Test(dependsOnMethods="first")
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
