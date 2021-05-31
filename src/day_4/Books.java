package day_4;

public class Books extends AbstractBook {

	public static void main(String[] args) {
		 AbstractBook book = new Books();
		 book.bookAuthor();
		 book.bookName();
		 book.bookPrize();
	}

	@Override
	protected void bookName() {
		 String bookName="geeta";
		 System.out.println(bookName);
		
	}

	@Override
	protected void bookAuthor() {
		 String bookAuth="krishna";
		 System.out.println(bookAuth);
		
		
	}

	@Override
	protected void bookPrize() {
		 int bookp=700;
		 System.out.println( bookp);
		
		
	}

}
