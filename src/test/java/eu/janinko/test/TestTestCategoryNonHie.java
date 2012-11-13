package eu.janinko.test;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.experimental.categories.Category;

import eu.janinko.test.category.ABTests;
import eu.janinko.test.category.ATests;
import eu.janinko.test.category.AaTests;
import eu.janinko.test.category.AbCTests;
import eu.janinko.test.category.AbTests;
import eu.janinko.test.category.AllTests;
import eu.janinko.test.category.BTests;
import eu.janinko.test.category.CTests;
import eu.janinko.test.category.StandaloneTests;
import eu.janinko.test.category.WholeClassTests;


@Category(WholeClassTests.class)
@Ignore
public class TestTestCategoryNonHie {
	
	@Test
	@Category(AllTests.class)
	public void onlnyInAllTest(){
		System.out.println("onlnyInAllTest nonHie");
	}
	
	@Test
	@Category({AllTests.class, 
        ATests.class, 
       ABTests.class})
	public void ATest(){
		System.out.println("ATest nonHie");
	}
	
	@Test
	@Category({AllTests.class, 
        BTests.class, 
       ABTests.class})
	public void BTest(){
		System.out.println("BTest nonHie");
	}
	
	@Test
	@Category({AllTests.class, 
        CTests.class,
       AbCTests.class})
	public void CTest(){
		System.out.println("CTest nonHie");
	}
	
	@Test
	@Category({AllTests.class, 
        ATests.class, 
          AaTests.class, 
       ABTests.class})
	public void AaTest(){
		System.out.println("AaTest nonHie");
	}
	
	@Test
	@Category({AllTests.class, 
        ATests.class, 
          AbTests.class, 
       AbCTests.class,
       ABTests.class})
	public void AbTest(){
		System.out.println("AbTest nonHie");
	}
	
	@Test
	@Category(StandaloneTests.class)
	public void standaloneTests(){
		System.out.println("standaloneTests nonHie");
	}
	
	@Test
	@Category({AllTests.class, 
        ATests.class, 
          AaTests.class, 
          AbTests.class, 
        BTests.class, 
        CTests.class,
       AbCTests.class,
       ABTests.class,
       StandaloneTests.class})
	public void everytimeTest(){
		System.out.println("everytimeTest nonHie");
	}

}
