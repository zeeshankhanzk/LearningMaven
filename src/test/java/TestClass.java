import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void TC_01() {
		System.out.println("TC_01()");
	}

	@Test
	public void TC_02() {
		System.out.println("TC_02()");
		Assert.fail("Zeeshan is failing this TC-02");
	}

	@Test
	public void TC_03() {
		System.out.println("TC_03()");
		throw new SkipException("Zeeshan is skipping this TC-03");
	}

}
