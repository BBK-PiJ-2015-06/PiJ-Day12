import org.junit.*;
import static org.junit.Assert.*;

public class TestPersonName {
	
	@Test
	public void testsNormalName() {
		PersonName p = new PersonName();
		String input = "James Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "JRY";
		assertEquals(output, expected);
	}
	
	@Test
	public void testsSpaceAtBeginning() {
		PersonName p = new PersonName();
		String input = " James Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "JRY";
		assertEquals(output, expected);
	}
	
	@Test
	public void testsSpaceAtEnd() {
		PersonName p = new PersonName();
		String input = "James Robert Yssirt ";
		String output = p.getInitials(input);
		String expected = "JRY";
		assertEquals(output, expected);
	}
	
	@Test
	public void testsNoName() {
		PersonName p = new PersonName();
		String input = "";
		String output = p.getInitials(input);
		String expected = "";
		assertEquals(output, expected);
	}
	
	@Test
	public void testsDoubleSpace() {
		PersonName p = new PersonName();
		String input = "James Robert  Yssirt";
		String output = p.getInitials(input);
		String expected = "JRY";
		assertEquals(output, expected);
	}
	
}