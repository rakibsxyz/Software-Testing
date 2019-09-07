
import java.time.Year;
import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.awt.List;
import java.time.LocalDate;
import java.time.Month;

import org.hamcrest.CoreMatchers;


class BookshelfTest {

	@Test
	void Addtest() {
		BookShelf bookShelf = new BookShelf(3);
		LocalDate date = LocalDate.of(1900, Month.MAY, 7);
		Book newBook2 = new Book("Java Book", "rakib",date );
		Boolean check = bookShelf.add(newBook2);
		assertEquals(check, true);
		
	}
	@Test
	void Addtest2() {
		BookShelf bookShelf = new BookShelf(1);
		LocalDate date = LocalDate.of(1900, Month.MAY, 7);
		Book newBook2 = new Book("Java Book", "rakib",date );
		Book newBook3 = new Book("Java Book", "rakib",date );
		bookShelf.add(newBook2);
		Boolean check = bookShelf.add(newBook3);
		assertEquals(check, false);
		
	}
	@Test
	void Addtest3() {
		BookShelf bookShelf = new BookShelf(0);
		LocalDate date = LocalDate.of(1900, Month.MAY, 7);
		Book newBook3 = new Book("Java Book", "rakib",date );
		Boolean check = bookShelf.add(newBook3);
		assertEquals(check, false);
		
	}
	
	@Test
	void ArrangeTest1() {
		ArrayList<Book> bookTitle = new ArrayList<Book>();
		ArrayList<Book> bookTitle2 = new ArrayList<Book>();
	
		BookShelf bookShelf = new BookShelf(2);
		LocalDate date = LocalDate.of(1900, Month.MAY, 7);
		Book newBook3 = new Book("Java Book", "rakib",date );
		bookTitle2.add(newBook3);
		Book newBook4 = new Book("Java Book", "rakib",date );
		bookShelf.add(newBook4);
		bookTitle =  (ArrayList<Book>) bookShelf.arrange();
		
		assertEquals(bookTitle.size(),bookTitle2.size());
	}
	
	@Test
	void ArrangeTest2() {
		ArrayList<Book> bookTitle = new ArrayList<Book>();
		ArrayList<Book> bookTitle2 = new ArrayList<Book>();
	
		BookShelf bookShelf = new BookShelf(2);
		LocalDate date = LocalDate.of(1900, Month.MAY, 7);
		Book newBook3 = new Book("Java Book", "rakib",date );
		bookTitle2.add(newBook3);
		Book newBook4 = new Book("Java Book", "rakib",date );
		bookShelf.add(newBook4);
		bookTitle =  (ArrayList<Book>) bookShelf.arrange();
		System.out.println(bookTitle);
		assertEquals(bookTitle,bookTitle2);	
	}
	
	
	@Test
	void ArrangeTest3() {
		ArrayList<Book> bookTitle = new ArrayList<Book>();
		ArrayList<Book> bookTitle2 = new ArrayList<Book>();
	
		BookShelf bookShelf = new BookShelf(2);
		LocalDate date = LocalDate.of(1900, Month.MAY, 7);
		Book newBook3 = new Book("Java Book", "rakib",date );
		
		Book newBook5 = new Book("Java Book", "rakib",date );
	
		Book newBook6 = new Book("Java Book", "rakib",date );
		bookTitle2.add(newBook3);
		bookTitle2.add(newBook5);
		Book newBook4 = new Book("Java Book", "rakib",date );
		bookShelf.add(newBook4);
		bookShelf.add(newBook6);
		bookTitle =  (ArrayList<Book>) bookShelf.arrange();
		
		assertEquals(bookTitle,bookTitle2);
		
		
		
	}
	
	@Test
	void arrangeCompatorTest() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		ArrayList<Book> bookListReturn = new ArrayList<Book>();
		BookShelf bookShelf = new BookShelf(2);
		LocalDate date = LocalDate.of(1900, Month.MAY, 7);
		Book newBook3 = new Book("zava Book", "zakib",date );
		Book newBook5 = new Book("Java Book", "rakib",date );
		bookList.add(newBook3);
		bookList.add(newBook5);
		bookShelf.add(newBook3);
		bookShelf.add(newBook5);
		bookListReturn = (ArrayList<Book>) bookShelf.arrange(Comparator.naturalOrder());
		System.out.println(bookListReturn+" Yo");
		assertNotEquals(bookListReturn, bookList);	
	}
	
	@Test
	void arrangeCompatorTest2() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		ArrayList<Book> bookListReturn = new ArrayList<Book>();
		BookShelf bookShelf = new BookShelf(2);
		LocalDate date = LocalDate.of(1900, Month.MAY, 7);
		Book newBook3 = new Book("zava Book", "zakib",date );
		Book newBook5 = new Book("Java Book", "rakib",date );
		
		bookList.add(newBook5);
		bookList.add(newBook3);
		bookShelf.add(newBook3);
		bookShelf.add(newBook5);
		bookListReturn = (ArrayList<Book>) bookShelf.arrange(Comparator.naturalOrder());
		
		assertEquals(bookListReturn, bookList);
	}
	
	
	@Test
	void arrangeCompatorTest3() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		ArrayList<Book> bookListReturn = new ArrayList<Book>();
		BookShelf bookShelf = new BookShelf(2);
		LocalDate date = LocalDate.of(1900, Month.MAY, 7);
		Book newBook3 = new Book("zava Book", "zakib",date );
		Book newBook5 = new Book("Java Book", "rakib",date );
		
		bookList.add(newBook5);
		bookList.add(newBook3);
		bookShelf.add(newBook3);
		bookShelf.add(newBook5);
		bookListReturn = (ArrayList<Book>) bookShelf.arrange(Comparator.naturalOrder());
		
		assertEquals(bookListReturn.size(), bookList.size());
			
	}
	
	@Test
	void arrangeCompatorTest4() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		ArrayList<Book> bookListReturn = new ArrayList<Book>();
		BookShelf bookShelf = new BookShelf(2);
		LocalDate date = LocalDate.of(1900, Month.MAY, 7);
		Book newBook3 = new Book("zava Book", "zakib",date );
		Book newBook5 = new Book("Java Book", "rakib",date );
		
		bookList.add(newBook5);
		bookList.add(newBook3);
		bookShelf.add(newBook3);
		bookShelf.add(newBook5);
		bookListReturn = (ArrayList<Book>) bookShelf.arrange(Comparator.naturalOrder());
		Book b1 = bookList.remove(0);
		Book b2 = bookListReturn.remove(0);
		assertEquals(b1, b2);
			
	}
	@Test
	void arrangeCompatorTest5() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		ArrayList<Book> bookListReturn = new ArrayList<Book>();
		BookShelf bookShelf = new BookShelf(2);
		LocalDate date = LocalDate.of(1900, Month.MAY, 7);
		Book newBook3 = new Book("zava Book", "zakib",date );
		Book newBook5 = new Book("Java Book", "rakib",date );
		bookList.add(newBook3);
		bookList.add(newBook5);
		
		bookShelf.add(newBook3);
		bookShelf.add(newBook5);
		bookListReturn = (ArrayList<Book>) bookShelf.arrange(Comparator.naturalOrder());
		Book b1 = bookList.remove(0);
		Book b2 = bookListReturn.remove(0);
		assertNotEquals(b1, b2);
			
	}
	
	@Test
	void GroupByPublicationYearTest() {
		Map<Year, java.util.List<Book>> maps;
		Map<Year, java.util.List<Book>> actualMaps;
		ArrayList<Book> bookList = new ArrayList<Book>();
		ArrayList<Book> bookListReturn = new ArrayList<Book>();
		BookShelf bookShelf = new BookShelf(2);
		LocalDate date = LocalDate.of(1900, Month.MAY, 8);
		LocalDate date2 = LocalDate.of(1920, Month.MAY, 8);
		Book newBook3 = new Book("zava Book", "zakib",date );
		Book newBook5 = new Book("Java Book", "rakib",date2 );
		bookShelf.add(newBook3);
		bookShelf.add(newBook5);
		maps =  bookShelf.groupByPublicationYear();
		System.out.println(maps +"yo 2");
		assertEquals(maps.isEmpty(),false );		
	}
	
	@Test
	void GroupByPublicationYearTest2() {
		Map<Year, java.util.List<Book>> maps;
		Map<Year, java.util.List<Book>> actualMaps;
		ArrayList<Book> bookList = new ArrayList<Book>();
		ArrayList<Book> bookListReturn = new ArrayList<Book>();
		BookShelf bookShelf = new BookShelf(2);
		LocalDate date = LocalDate.of(1900, Month.MAY, 8);
		LocalDate date2 = LocalDate.of(1920, Month.MAY, 8);
		Book newBook3 = new Book("zava Book", "zakib",date );
		Book newBook5 = new Book("Java Book", "rakib",date2 );	
		bookShelf.add(newBook3);
		bookShelf.add(newBook5);
		maps =  bookShelf.groupByPublicationYear();
		
		assertEquals(maps.size(),2 );
			
	}
	
	@Test
	void GroupByPublicationYearTest3() {
		Map<Year, java.util.List<Book>> maps;
		Map<Year, java.util.List<Book>> actualMaps;
		ArrayList<Book> bookList = new ArrayList<Book>();
		ArrayList<Book> bookListReturn = new ArrayList<Book>();
		BookShelf bookShelf = new BookShelf(2);
		LocalDate date = LocalDate.of(1900, Month.MAY, 8);
		LocalDate date2 = LocalDate.of(1920, Month.MAY, 8);
		Book newBook3 = new Book("zava Book", "zakib",date );
		Book newBook5 = new Book("Java Book", "rakib",date2 );
		
		
		bookShelf.add(newBook3);
		bookShelf.add(newBook5);
		maps =  bookShelf.groupByPublicationYear();
		
		assertEquals(maps.size(),2 );
			
	}
	
	@Test
	void findBooksByTitleTest1() {
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		ArrayList<Book> bookListReturn = new ArrayList<Book>();
		BookShelf bookShelf = new BookShelf(2);
		LocalDate date = LocalDate.of(1900, Month.MAY, 8);
		LocalDate date2 = LocalDate.of(1920, Month.MAY, 8);
		Book newBook3 = new Book("zava", "zakib",date );
		Book newBook5 = new Book("java", "rakib",date2 );
		
		
		bookShelf.add(newBook3);
		bookShelf.add(newBook5);
		bookListReturn = (ArrayList<Book>) bookShelf.findBooksByTitle("java");
		
		assertEquals(bookListReturn.size(),1 );
			
	}
	
	@Test
	void findBooksByTitleTest2() {

		ArrayList<Book> bookList = new ArrayList<Book>();
		ArrayList<Book> bookListReturn = new ArrayList<Book>();
		BookShelf bookShelf = new BookShelf(2);
		LocalDate date = LocalDate.of(1900, Month.MAY, 8);
		LocalDate date2 = LocalDate.of(1920, Month.MAY, 8);
		Book newBook3 = new Book("zava", "zakib",date );
		Book newBook5 = new Book("java", "rakib",date2 );
		bookShelf.add(newBook3);
		bookShelf.add(newBook5);
		bookListReturn = (ArrayList<Book>) bookShelf.findBooksByTitle("java");
		assertNotEquals(bookListReturn.size(),0 );		
	}
	
	@Test
	void parcentageCompletedTest1() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		BookShelf bookShelf = new BookShelf(3);
		LocalDate date = LocalDate.of(1900, Month.MAY, 8);
		LocalDate date2 = LocalDate.of(1920, Month.MAY, 8);
		Book newBook3 = new Book("zava", "zakib",date );
		Book newBook4 = new Book("zava", "zakib",date );
		Book newBook5 = new Book("zava", "zakib",date );
		newBook3.startedReadingOn(LocalDate.of(1901, Month.MAY, 8));
		newBook3.finishedReadingOn(LocalDate.of(1901, Month.MAY, 10));
		bookShelf.add(newBook3);
		bookShelf.add(newBook4);
		bookShelf.add(newBook5);
		System.out.println(bookShelf.books);
		int parcentage = bookShelf.parcentageCompleted();
		System.out.println(parcentage);
		assertEquals(parcentage,33 );	
	}
	
	@Test
	void parcentageCompletedTest2() {

		ArrayList<Book> bookList = new ArrayList<Book>();
		
		BookShelf bookShelf = new BookShelf(3);
		LocalDate date = LocalDate.of(1900, Month.MAY, 8);
		LocalDate date2 = LocalDate.of(1920, Month.MAY, 8);
		Book newBook3 = new Book("zava", "zakib",date );
		Book newBook4 = new Book("zava", "zakib",date );
		Book newBook5 = new Book("zava", "zakib",date );
		newBook3.startedReadingOn(LocalDate.of(1901, Month.MAY, 8));
		newBook3.finishedReadingOn(LocalDate.of(1901, Month.MAY, 10));
		newBook4.startedReadingOn(LocalDate.of(1901, Month.MAY, 8));
		newBook4.finishedReadingOn(LocalDate.of(1901, Month.MAY, 10));
		
		
		bookShelf.add(newBook3);
		bookShelf.add(newBook4);
		bookShelf.add(newBook5);
		
		System.out.println(bookShelf.books);
		
		int parcentage = bookShelf.parcentageCompleted();
		System.out.println(parcentage);
		assertEquals(parcentage,66 );
			
	}
	@Test
	void parcentageCompletedTest3() {

		ArrayList<Book> bookList = new ArrayList<Book>();
		
		BookShelf bookShelf = new BookShelf(3);
		LocalDate date = LocalDate.of(1900, Month.MAY, 8);
		LocalDate date2 = LocalDate.of(1920, Month.MAY, 8);
		Book newBook3 = new Book("zava", "zakib",date );
		Book newBook4 = new Book("zava", "zakib",date );
		Book newBook5 = new Book("zava", "zakib",date );
		newBook3.startedReadingOn(LocalDate.of(1901, Month.MAY, 8));
		newBook3.finishedReadingOn(LocalDate.of(1901, Month.MAY, 10));
		newBook4.startedReadingOn(LocalDate.of(1901, Month.MAY, 8));
		newBook4.finishedReadingOn(LocalDate.of(1901, Month.MAY, 10));
		newBook5.startedReadingOn(LocalDate.of(1901, Month.MAY, 8));
		newBook5.finishedReadingOn(LocalDate.of(1901, Month.MAY, 10));
		
		
		
		
		bookShelf.add(newBook3);
		bookShelf.add(newBook4);
		bookShelf.add(newBook5);
		
		System.out.println(bookShelf.books);
		
		int parcentage = bookShelf.parcentageCompleted();
		System.out.println(parcentage);
		assertEquals(parcentage,100 );
			
	}
	
	@Test
	void parcentageCompletedTest4() {

		ArrayList<Book> bookList = new ArrayList<Book>();
		
		BookShelf bookShelf = new BookShelf(3);
		LocalDate date = LocalDate.of(1900, Month.MAY, 8);
		LocalDate date2 = LocalDate.of(1920, Month.MAY, 8);
		Book newBook3 = new Book("zava", "zakib",date );
		Book newBook4 = new Book("zava", "zakib",date );
		Book newBook5 = new Book("zava", "zakib",date );
	
		bookShelf.add(newBook3);
		bookShelf.add(newBook4);
		bookShelf.add(newBook5);
		
		System.out.println(bookShelf.books);
		
		int parcentage = bookShelf.parcentageCompleted();
		System.out.println(parcentage);
		assertEquals(parcentage,0);
			
	}

	
	@Test
	void parcentageToReadTest1() {

		ArrayList<Book> bookList = new ArrayList<Book>();
		
		BookShelf bookShelf = new BookShelf(3);
		LocalDate date = LocalDate.of(1900, Month.MAY, 8);
		LocalDate date2 = LocalDate.of(1920, Month.MAY, 8);
		Book newBook3 = new Book("zava", "zakib",date );
		Book newBook4 = new Book("zava", "zakib",date );
		Book newBook5 = new Book("zava", "zakib",date );
		newBook3.startedReadingOn(LocalDate.of(1901, Month.MAY, 8));
		newBook3.finishedReadingOn(LocalDate.of(1901, Month.MAY, 10));
		newBook4.startedReadingOn(LocalDate.of(1901, Month.MAY, 8));
		bookShelf.add(newBook3);
		bookShelf.add(newBook4);
		bookShelf.add(newBook5);
		System.out.println(bookShelf.books);
		int parcentage = bookShelf.parcentageCompleted();
		System.out.println(parcentage);
		assertEquals(parcentage,33 );
			
	}
	@Test
	void parcentageToReadTest2() {

		ArrayList<Book> bookList = new ArrayList<Book>();
		
		BookShelf bookShelf = new BookShelf(3);
		LocalDate date = LocalDate.of(1900, Month.MAY, 8);
		LocalDate date2 = LocalDate.of(1920, Month.MAY, 8);
		Book newBook3 = new Book("zava", "zakib",date );
		Book newBook4 = new Book("zava", "zakib",date );
		Book newBook5 = new Book("zava", "zakib",date );
		newBook3.startedReadingOn(LocalDate.of(1901, Month.MAY, 8));
		newBook3.finishedReadingOn(LocalDate.of(1901, Month.MAY, 10));
		newBook4.startedReadingOn(LocalDate.of(1901, Month.MAY, 8));
		newBook4.finishedReadingOn(LocalDate.of(1901, Month.MAY, 10));
		bookShelf.add(newBook3);
		bookShelf.add(newBook4);
		bookShelf.add(newBook5);
		System.out.println(bookShelf.books);
		int parcentage = bookShelf.parcentageToRead();
		System.out.println(parcentage);
		assertEquals(parcentage,33 );	
	}
	
	@Test
	void parcentageToReadTest3() {

		ArrayList<Book> bookList = new ArrayList<Book>();
		
		BookShelf bookShelf = new BookShelf(3);
		LocalDate date = LocalDate.of(1900, Month.MAY, 8);
		LocalDate date2 = LocalDate.of(1920, Month.MAY, 8);
		Book newBook3 = new Book("zava", "zakib",date );
		Book newBook4 = new Book("zava", "zakib",date );
		Book newBook5 = new Book("zava", "zakib",date );
	
		bookShelf.add(newBook3);
		bookShelf.add(newBook4);
		bookShelf.add(newBook5);
		
		System.out.println(bookShelf.books);
		
		int parcentage = bookShelf.parcentageToRead();
		System.out.println(parcentage);
		assertEquals(parcentage,100);
			
	}

	@Test
	void parcentageInProgress1() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		BookShelf bookShelf = new BookShelf(3);
		LocalDate date = LocalDate.of(1900, Month.MAY, 8);
		LocalDate date2 = LocalDate.of(1920, Month.MAY, 8);
		Book newBook3 = new Book("zava", "zakib",date );
		Book newBook4 = new Book("zava", "zakib",date );
		Book newBook5 = new Book("zava", "zakib",date );
		newBook3.startedReadingOn(LocalDate.of(1901, Month.MAY, 8));
		newBook4.startedReadingOn(LocalDate.of(1901, Month.MAY, 8));
		bookShelf.add(newBook3);
		bookShelf.add(newBook4);
		bookShelf.add(newBook5);
		System.out.println(bookShelf.books);
		int parcentage = bookShelf.parcentageInProgress();
		System.out.println(parcentage);
		assertEquals(parcentage,66 );	
	}
	@Test
	void parcentageInProgress2() {

		ArrayList<Book> bookList = new ArrayList<Book>();
		BookShelf bookShelf = new BookShelf(3);
		LocalDate date = LocalDate.of(1900, Month.MAY, 8);
		LocalDate date2 = LocalDate.of(1920, Month.MAY, 8);
		Book newBook3 = new Book("zava", "zakib",date );
		Book newBook4 = new Book("zava", "zakib",date );
		Book newBook5 = new Book("zava", "zakib",date );
		newBook3.startedReadingOn(LocalDate.of(1901, Month.MAY, 8));
		newBook3.finishedReadingOn(LocalDate.of(1901, Month.MAY, 10));
		newBook4.startedReadingOn(LocalDate.of(1901, Month.MAY, 8));
		newBook4.finishedReadingOn(LocalDate.of(1901, Month.MAY, 10));
		bookShelf.add(newBook3);
		bookShelf.add(newBook4);
		bookShelf.add(newBook5);
		System.out.println(bookShelf.books);
		int parcentage = bookShelf.parcentageInProgress();
		System.out.println(parcentage);
		assertEquals(parcentage,0 );
			
	}
	
	@Test
	void parcentageInProgress3() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		BookShelf bookShelf = new BookShelf(3);
		LocalDate date = LocalDate.of(1900, Month.MAY, 8);
		LocalDate date2 = LocalDate.of(1920, Month.MAY, 8);
		Book newBook3 = new Book("zava", "zakib",date );
		Book newBook4 = new Book("zava", "zakib",date );
		Book newBook5 = new Book("zava", "zakib",date );
		bookShelf.add(newBook3);
		bookShelf.add(newBook4);
		bookShelf.add(newBook5);
		newBook4.startedReadingOn(LocalDate.of(1901, Month.MAY, 8));
		newBook3.startedReadingOn(LocalDate.of(1901, Month.MAY, 8));
		newBook5.startedReadingOn(LocalDate.of(1901, Month.MAY, 8));
		System.out.println(bookShelf.books);
		int parcentage = bookShelf.parcentageInProgress();
		System.out.println(parcentage);
		assertEquals(parcentage,100);
			
	}

	@Test
	void capacityTesting1() {
		
		BookShelf bookShelf = new BookShelf(3);
		bookShelf.setCapacity(5);
		int capacity = bookShelf.getCapacity();
		assertEquals(capacity,5);
			
	}
	@Test
	void capacityTesting2() {
		BookShelf bookShelf = new BookShelf(3);
		bookShelf.setCapacity(5);
		int capacity = bookShelf.getCapacity();
		assertNotEquals(capacity,3);
			
	}

	






}
