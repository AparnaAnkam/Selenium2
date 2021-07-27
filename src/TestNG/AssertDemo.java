package TestNG;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	@Test
	public void tc() {
		String ac="Aparna";
		String ex="Aparna";
		Assert.assertEquals(ac, ex);
		System.out.println("Actual is matching with Expected");
		List<Object> lst1=new ArrayList<Object>();
		lst1.add("Alia");
		lst1.add(122);
		lst1.add(65.0);
		lst1.add(true);
		
		List<Object> lst2=new ArrayList<Object>();
		lst2.add("Alia");
		lst2.add(122);
		lst2.add(65.0);
		lst2.add(true);
		
		Assert.assertEquals(lst1, lst2);
		System.out.println("Both are matching");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("apa", "apc");
		System.out.println("Matched");
		sa.assertAll();//hard assert
	}

}
