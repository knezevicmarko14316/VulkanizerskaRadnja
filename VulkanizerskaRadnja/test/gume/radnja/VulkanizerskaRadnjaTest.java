package gume.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {
	private VulkanizerskaRadnja a;

	private AutoGuma g;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a=new VulkanizerskaRadnja();
		g= new AutoGuma();
		g.setMarkaModel("Goodride RP28");
		g.setPrecnik(15);
		g.setSirina(155);
		g.setVisina(55);
		
	}

	@After
	public void tearDown() throws Exception {
		a=null;
		g=null;
	}

	@Test
	public void testDodajGumu() {
		a.dodajGumu(g);
		assertEquals(1, a.vratiListu().size());
		assertEquals(g, a.vratiListu().get(0));
		
	}

	@Test
	public void testDodajGumu2() {
		a.dodajGumu(g);
		AutoGuma g2=new  AutoGuma();
		g2.setMarkaModel("Star Performer UHP 1");
		g2.setPrecnik(17);
		g2.setSirina(150);
		g2.setVisina(53);
		a.dodajGumu(g2);
		assertEquals(2, a.vratiListu().size());
		assertEquals(g2, a.vratiListu().get(0));
		
	}
	@Test (expected=java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		a.dodajGumu(null);
		
		
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testDodajGumuDuplikat() {
		a.dodajGumu(g);
		AutoGuma g2;
		g2= new AutoGuma();
		g2.setMarkaModel("Goodride RP28");
		g2.setPrecnik(15);
		g2.setSirina(155);
		g2.setVisina(55);
		a.dodajGumu(g2);
		
		
	}
	
	@Test
	public void testPronadjiGumuNull() {
		a.dodajGumu(g);
		assertEquals(null, a.pronadjiGumu(null));
	}
	@Test
	public void testPronadjiGumu() {
		a.dodajGumu(g);
		
		assertEquals(0, a.pronadjiGumu("Star Performer UHP 1").size());
	}
	@Test
	public void testPronadjiGumu2() {
		AutoGuma g2;
		g2= new AutoGuma();
		g2.setMarkaModel("Goodride RP28");
		g2.setPrecnik(16);
		g2.setSirina(150);
		g2.setVisina(56);
		a.dodajGumu(g);
		a.dodajGumu(g2);
		assertEquals(g2, a.pronadjiGumu("Goodride RP28").get(0));
		assertEquals(g, a.pronadjiGumu("Goodride RP28").get(1));


	}

}
