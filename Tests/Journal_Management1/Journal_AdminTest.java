package Journal_Management1;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class Journal_AdminTest {

	@Test
	public void testAddPublication() {
		Journal_Admin test = new Journal_Admin();
		String heading = null;
		
		Scanner in = new Scanner(System.in);
		heading = in.next("software");
		String output = in.next("software");
		assersame(output, "advanced software");
	}}


	//@Test
	//public void testList_books() {
	//	fail("Not yet implemented");
	//}

	//@Test
	//public void testSave() {
	//	fail("Not yet implemented");
	//}

	//@Test
	//public void testLoad() {
	//	fail("Not yet implemented");
	//}

//}
