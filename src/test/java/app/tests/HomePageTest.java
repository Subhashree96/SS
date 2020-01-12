package app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import app.pages.BasePage;
import app.pages.HomePage;

public class HomePageTest {
	
	BasePage bp;
	HomePage hp;
	
	public HomePageTest() {
		bp=new BasePage();
		hp=new HomePage();
		
	}
	@Test
	public void verifyWomenTags12() {
		Assert.assertTrue(bp.elementFound(hp.getWomenTag()),"Failed to display");
		
	}
	
	@Test
	public void DressesTag() {
		Assert.assertTrue(bp.elementFound(hp.getDressesTag()),"Failed to display");
		
	}
	
	@Test
	public void shirtsTags() {
		Assert.assertTrue(bp.elementFound(hp.getshirtsTag()),"Failed to display");
		
	}
	
	@Test
	public void verifyWomenpage() {
		hp.getWomenTag().click();
		String title=bp.getTitlte();
		System.out.println(title);
		Assert.assertTrue(title.contains("Women"),"Failed to display");
		
		
	}
  @Test
     public void verifyDressespage() {
	  hp.getDressesTag().click();
		String title=bp.getTitlte();
		System.out.println(title);
		Assert.assertTrue(title.contains("Dresses"),"Failed to display");
		
	 
  }  
  
  @Test
  public void verifyshirtspage() {
	  hp.getshirtsTag().click();
		String title=bp.getTitlte();
		System.out.println(title);
		Assert.assertTrue(title.contains("T-shirts"),"Failed to display");
  }
}
