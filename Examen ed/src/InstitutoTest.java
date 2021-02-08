import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InstitutoTest {
	Instituto i0;
	Instituto i1;
	
	@Before
	public void setUp() throws Exception {
		i0=new Instituto();
		String []x= {"Paco","Pepe","Maria"};
		i1=new Instituto("Madrid", 200, true, "Jose Maria", x);
	}

	@Test
	public void testInstituto() {
		Instituto ix0=new Instituto();
		assertNull(ix0.getLocalidad());
	}

	@Test
	public void testInstitutoStringIntBooleanStringStringArray() {
		String[]x= {"Raul","Fernando","Cristina"};
		Instituto ix1=new Instituto("Valladolid", 100, true, "Carmen", x);
		assertEquals(100,ix1.getNumClases());
	}

	@Test
	public void testGetLocalidad() {
		assertEquals("Madrid",i1.getLocalidad());
	}

	@Test
	public void testSetLocalidad() {
		i0.setLocalidad("Segovia");
		assertNotNull(i0.getLocalidad());
	}

	@Test
	public void testGetNumClases() {
		assertEquals(200,i1.getNumClases());
	}

	@Test
	public void testSetNumClases() {
		i0.setNumClases(120);
		assertEquals(120,i0.getNumClases());
	}

	@Test
	public void testGetPublico() {
		assertTrue(i1.getPublico());
	}

	@Test
	public void testSetPublico() {
		i1.setPublico(false);
		assertFalse(i1.getPublico());
	}

	@Test
	public void testGetNombreDirector() {
		assertEquals("Jose Maria",i1.getNombreDirector());
	}

	@Test
	public void testSetNombreDirector() {
		i0.setNombreDirector("Chema");
		assertEquals("Chema",i0.getNombreDirector());
	}

	@Test
	public void testGetJefesDeEstudios() {
		assertEquals("Paco Pepe Maria",i1.getJefesDeEstudios());
	}

	@Test
	public void testSetJefesDeEstudios() {
		String []x= {"Jose","Marta","Marian"};
		i0.setJefesDeEstudios(x);
		assertEquals("Jose Marta Marian", i0.getJefesDeEstudios());
	}

	@Test
	public void testToString() {
		i1.equals("El instituto de localidad Madrid con 200 clases con el director Jose Maria con los jefes de estudios Paco, Pepe y Maria; es publico: true");
	}

}
