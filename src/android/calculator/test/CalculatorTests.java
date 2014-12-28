package android.calculator.test;

import com.robotium.solo.Solo;

import android.calculator.CalculatorActivity;
import android.calculator.R;
import android.test.ActivityInstrumentationTestCase2;

public class CalculatorTests extends
		ActivityInstrumentationTestCase2<CalculatorActivity> {
	private Solo solo;
	
	public CalculatorTests() {
		super(CalculatorActivity.class);
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}
	//teset phep cong +
	//dau tien nhan so 10, nhan nut +, nhan 90
	//ket qua dung fai la 100.0
	//cai ham` 		assertEquals("Result must be: 100.0", expected, actual);
    // no tra ve true/false
	//do cung chjnh la ket qua cua test case la co Pass hay ko
	//vidu toi thay doi 1 chut, no se bao faile
	public void testActionAdd()throws Exception{
		solo.clickOnView(solo.getView(R.id.button1));
		assertTrue(solo.waitForText("1")); // Assertion
		solo.clickOnView(solo.getView(R.id.button0));
		assertTrue(solo.waitForText("10")); // Assertion
		
		solo.clickOnView(solo.getView(R.id.buttonAdd));
		
		solo.clickOnView(solo.getView(R.id.button9));
		assertTrue(solo.waitForText("9")); // Assertion
		solo.clickOnView(solo.getView(R.id.button0));
		assertTrue(solo.waitForText("90")); // Assertion
		
		solo.clickOnView(solo.getView(R.id.buttonExe));

		boolean expected = true;
		boolean actual = solo.searchText("100.0");
		assertEquals("Result must be: 100.0", expected, actual);
	}
	
	public void testActionSub()throws Exception{
		solo.clickOnView(solo.getView(R.id.button1));
		assertTrue(solo.waitForText("1")); // Assertion
		solo.clickOnView(solo.getView(R.id.button0));
		assertTrue(solo.waitForText("10")); // Assertion
		solo.clickOnView(solo.getView(R.id.button0));
		assertTrue(solo.waitForText("100")); // Assertion

		solo.clickOnView(solo.getView(R.id.buttonSub));
		
		solo.clickOnView(solo.getView(R.id.button9));
		assertTrue(solo.waitForText("9")); // Assertion
		solo.clickOnView(solo.getView(R.id.button0));
		assertTrue(solo.waitForText("90")); // Assertion

		solo.clickOnView(solo.getView(R.id.buttonExe));

		boolean expected = true;
		boolean actual = solo.searchText("10.0");
		assertEquals("Result must be: 10.0", expected, actual);
	}
	public void testActionMulti()throws Exception{
		solo.clickOnView(solo.getView(R.id.button8));
		assertTrue(solo.waitForText("8")); // Assertion

		solo.clickOnView(solo.getView(R.id.buttonMulti));
		
		solo.clickOnView(solo.getView(R.id.button9));
		assertTrue(solo.waitForText("9")); // Assertion
		
		solo.clickOnView(solo.getView(R.id.buttonExe));

		boolean expected = true;
		boolean actual = solo.searchText("72.0");
		assertEquals("Result must be: 72.0", expected, actual);
	}
	
	public void testActionDiv()throws Exception{
		solo.clickOnView(solo.getView(R.id.button1));
		assertTrue(solo.waitForText("1")); // Assertion
		solo.clickOnView(solo.getView(R.id.button0));
		assertTrue(solo.waitForText("10")); // Assertion
		solo.clickOnView(solo.getView(R.id.button0));
		assertTrue(solo.waitForText("100")); // Assertion
		
		solo.clickOnView(solo.getView(R.id.buttonDiv));
		
		solo.clickOnView(solo.getView(R.id.button2));
		assertTrue(solo.waitForText("2")); // Assertion
		
		solo.clickOnView(solo.getView(R.id.buttonExe));

		boolean expected = true;
		boolean actual = solo.searchText("50.0");
		assertEquals("Result must be: 50.0", expected, actual);
	}

}
