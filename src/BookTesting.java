

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
class BookTesting {

	@Test
	void checkStartedREadingOnMethod1() {
		Book newBook = new Book("Java Book", "rakib", LocalDate.of(2019, Month.MAY, 8));
		String successMessage = newBook.startedReadingOn(LocalDate.of(2019, Month.MAY, 9));
		assertEquals(successMessage, "Start date added");
		
		
	}
	@Test
	void checkStartedREadingOnMethod2() {
		Book newBook = new Book("Java Book", "rakib", LocalDate.of(2019, Month.MAY, 8));
		String successMessage = newBook.startedReadingOn(LocalDate.of(2019, Month.MAY, 9));
		assertEquals(successMessage, "Start date added");
		
		
	}
	@Test
	void checkStartedREadingOnMethod3() {
		Book newBook = new Book("Java Book", "", LocalDate.of(2019, Month.MAY, 8));
		String successMessage = newBook.startedReadingOn(LocalDate.of(2019, Month.MAY, 9));
		assertEquals(successMessage, "Start date added");
		
		
	}
	
	@Test
	void checkfinishedREadingOnMethod1() {
		Book newBook = new Book("Java Book", "rakib", LocalDate.of(2019, Month.MAY, 8));
		String successMessage = newBook.finishedReadingOn(LocalDate.of(2019, Month.MAY, 9));
		assertEquals(successMessage, "Finished date added");	
	}
	@Test
	void checkfinishedREadingOnMethod2() {
		Book newBook = new Book("", "", LocalDate.of(2019, Month.MAY, 8));
		String successMessage = newBook.finishedReadingOn(LocalDate.of(2019, Month.MAY, 9));
		assertEquals(successMessage,"Finished date added");	
	}
	
	@Test
	void checkHashCodeMethod1() {
		Book newBook = new Book("Java Book", "rakib", LocalDate.of(2019, Month.MAY, 8));
		int  outputCode = newBook.hashCode();
		System.out.println(outputCode);
		assertEquals(outputCode, 701816346);	
	}
	
	
	
	@Test
	void checkToStringMethod1() {
		Book newBook = new Book("Java Book", "rakib", LocalDate.of(2019, Month.MAY, 8));
		String  outputCode = newBook.toString();
		System.out.println(outputCode);
		assertEquals(outputCode, "Book{title='Java Book', author='rakib', publishedOn=2019-05-08}");	
	}
	@Test
	void checkToStringMethod2() {
		Book newBook = new Book("Java Book", "", LocalDate.of(2019, Month.MAY, 8));
		String  outputCode = newBook.toString();
		System.out.println(outputCode);
		assertEquals(outputCode, "Book{title='Java Book', author='', publishedOn=2019-05-08}");	
	}
	@Test
	void checkCompareToMethod1() {
		Book newBook2 = new Book("HTML Book", "Sakib", LocalDate.of(2019, Month.MAY, 8));
		Book newBook = new Book("Java Book", "rakib", LocalDate.of(2019, Month.MAY, 8));
		int  outputCode = newBook.compareTo(newBook2);
		System.out.println(outputCode);
		assertEquals(outputCode, 2);	
	}
	@Test
	void checkCompareToMethod2() {
		Book newBook2 = new Book("zHTML Book", "Sakib", LocalDate.of(2019, Month.MAY, 8));
		Book newBook = new Book("Java Book", "rakib", LocalDate.of(2019, Month.MAY, 8));
		int  outputCode = newBook.compareTo(newBook2);
		System.out.println(outputCode);
		assertEquals(outputCode, -48);	
	}

}
