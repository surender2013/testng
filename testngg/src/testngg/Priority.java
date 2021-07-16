package testngg;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=066)
	public void first()
	{
		System.out.println("this is first testcase");
	}
	@Test(priority=065)
	public void second()
	{
		System.out.println("this is second testcase");
	}
	@Test(priority=067)
	public void third()
	{
		System.out.println("this is third testcase");
	}
	
}
