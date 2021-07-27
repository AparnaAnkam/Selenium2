package ParallelAndCrossBrowser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	@Test
	public void tc() {
		String ac="Aparna";
		String ex="Aparna";
		Assert.assertEquals(ac, ex);
		System.out.println("Actual is matching with Expected");
	}

}
