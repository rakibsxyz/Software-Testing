import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProgressTesting {

	@Test
	void completetedTest() {
		Progress  progress = new Progress(1, 1, 1);
		progress.setCompleted(2);
		int comReturn = progress.completed();
		assertEquals(comReturn,2);
	}
	
	@Test
	void completetedTest2() {
		Progress  progress = new Progress(1, 1, 1);
		progress.setCompleted(2);
		int comReturn = progress.completed();
		assertNotEquals(comReturn,1);
	}
	
	@Test
	void toReadTest1() {
		Progress  progress = new Progress(1, 1, 1);
		progress.setToRead(2);
		int comReturn = progress.toRead();
		assertEquals(comReturn,2);
	}
	
	@Test
	void toReadTest2() {
		Progress  progress = new Progress(1, 1, 1);
		progress.setToRead(2);
		int comReturn = progress.toRead();
		assertNotEquals(comReturn,1);
	}
	
	@Test
	void inProgress1() {
		Progress  progress = new Progress(1, 1, 1);
		progress.setInProgress(2);
		int comReturn = progress.inProgress();
		assertEquals(comReturn,2);
	}
	
	@Test
	void inProgress2() {
		Progress  progress = new Progress(1, 1, 1);
		progress.setInProgress(2);
		int comReturn = progress.inProgress();
		assertNotEquals(comReturn,1);
	}

}