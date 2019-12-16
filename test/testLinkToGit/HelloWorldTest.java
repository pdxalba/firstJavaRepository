package testLinkToGit;
/**
 * fist jUNit test. Testing HelloWorld
 */

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

/**
 * @author djshanks
 *
 */
public class HelloWorldTest extends TestCase {

	/**
	 * @param args
	 */
	@Test
	public static void testHelloWorld() {
		String actual = HelloWorld.getString();
		String expected = "Hello World";
		assertEquals(expected, actual);
	}

}
