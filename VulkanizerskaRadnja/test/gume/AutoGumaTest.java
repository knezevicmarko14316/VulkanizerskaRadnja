package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AutoGumaTest {

		private AutoGuma a;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a=new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		a=null;
	}

	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Goodride RP28");
		assertEquals("Goodride RP28", a.getMarkaModel());
	}
	@Test(expected=java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
		
	}
	@Test(expected=java.lang.RuntimeException.class)
	public void testSetMarkaModelPrekratakString() {
		a.setMarkaModel("ab");
		
	}
	
	@Test 
	public void testSetPrecnik() {
		a.setPrecnik(15);
		assertEquals(15, a.getPrecnik());
	}


	@Test (expected=java.lang.RuntimeException.class)
	public void testSetPrecnikPremali() {
		a.setPrecnik(10);
	}
	
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetPrecnikPreveliki() {
		a.setPrecnik(25);
	}
	
	@Test
	public void testSetSirina() {
		a.setSirina(155);
		assertEquals(155, a.getSirina());
	}

	@Test (expected=java.lang.RuntimeException.class)
	public void testSetSirinaPrevelika() {
		a.setSirina(400);
	}
	
	@Test(expected=java.lang.RuntimeException.class)
	public void testSetSirinaPremala() {
		a.setSirina(55);
	}
	@Test
	public void testSetVisina() {
		a.setVisina(55);
		assertEquals(55, a.getVisina());
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetVisinaPremala() {
		a.setVisina(11);
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetVisinaPrevelika() {
		a.setVisina(105);
	}

	@Test
	public void testToString() {
		a.setMarkaModel("Goodride RP28");
		a.setPrecnik(15);
		a.setSirina(155);
		a.setVisina(55);
		assertEquals("AutoGuma [markaModel=Goodride RP28, precnik=15, sirina=155, visina=55]", a.toString());
	}

	@Test
	public void testEqualsObject() {
		a.setMarkaModel("Goodride RP28");
		a.setPrecnik(15);
		a.setSirina(155);
		a.setVisina(55);
		
		AutoGuma a2=new AutoGuma();
		a2.setMarkaModel("Goodride RP28");
		a2.setPrecnik(15);
		a2.setSirina(155);
		a2.setVisina(55);
		assertTrue(a.equals(a2));
	}

	@Test
	public void testEqualsObjectFalse() {
		a.setMarkaModel("Goodride RP28");
		a.setPrecnik(15);
		a.setSirina(155);
		a.setVisina(55);
		
		AutoGuma a2=new AutoGuma();
		a2.setMarkaModel("Star Performer UHP 1");
		a2.setPrecnik(17);
		a2.setSirina(159);
		a2.setVisina(53);
		assertFalse(a.equals(a2));
	}
}
