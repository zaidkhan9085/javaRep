package SampleJunit.JunitDemo1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestCaseCalci {
	Calculator c1 = new Calculator();
//addition test
	@Test
	void test() {
		int exp= 8;
		int act = c1.add(4, 4);
		assertEquals(exp,act);
	}
	//subtraction test	
	@Test
	void test2() {
		int exp= 7;
		int act = c1.sub(10, 3);
		assertEquals(exp,act);
	}
	//multiplication test
	@Test
	void test3() {
		int exp= 6;
		int act = c1.mul(3, 2);
		assertEquals(exp,act);
	}
	//division test
	@Test
	void test4() {
		int exp= 7;
		int act = c1.div(35, 5);
		assertEquals(exp,act);
	}
	
}
