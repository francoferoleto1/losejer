package clase12;

public class Library {
	// Add the missing implementation to this class
	String address;
	static int horaApertura = 9;
	static int horaCierre = 5;

	Book[] catalog = new Book[0];
	int numberOfBooks = 0;

	// Constructor de Library
	public Library(String address) {
		this.address = address;
	}// bien!

	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from " + horaApertura + "am to " + horaCierre + "pm.");
	}// bien!

	private void printAddress() {
		System.out.println(address);
	}// bien!

	private void addBook(Book book) {

		if (numberOfBooks >= 0) {
			Book[] newArray = new Book[(numberOfBooks + 1)];
			System.arraycopy(catalog, 0, newArray, 0, numberOfBooks);
			catalog = newArray;
		}
		catalog[numberOfBooks] = book;
		numberOfBooks++;
	}

	private void borrowBook(String title) {

		boolean flag = false;
		int indice = 0;

		// aca me fijo si esta el libro en el catalogo
		for (int i = 0; i < catalog.length; i++) {
			if (title.equalsIgnoreCase(catalog[i].getTitle())) {
				flag = true;
				indice = i;
			}
		} // termine de buscar

		if (flag) {
			if (catalog[indice].isBorrowed()) {
				System.out.println("Sorry, this book is already borrowed.");
			} else {
				catalog[indice].borrowed();
				System.out.println("You successfully borrowed " + catalog[indice].getTitle());
			}
		} else {
			System.out.println("Sorry, this book is not in our catalog.");
		}

	}

	// Return book to library
	public void returnBook(String title) {
		String string1 = title;
		for (int i = 0; i < catalog.length; i++) {
			if (string1.equalsIgnoreCase(catalog[i].getTitle()) && catalog[i].isBorrowed() == true) {
				catalog[i].returned();
				System.out.println("You successfully returned " + catalog[i].getTitle());
				break;
			}
		}
	}

	public void printAvailableBooks() {
		if (catalog.length > 0) {
			for (int i = 0; i < numberOfBooks; i++) {
				System.out.println(catalog[i].getTitle());
			}
		} else {
			System.out.println("No books in catalog currently.");
		}
	}

	public static void main(String[] args) {
		// Create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");

		// Add four books to the first library
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petit Prince"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));

		// Print opening hours and the addresses
		System.out.println("Library hours:");
		printOpeningHours();
		System.out.println();

		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();

		// Try to borrow The Lords of the Rings from both libraries
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of all available books from both libraries
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();

		// Return The Lords of the Rings to the first library
		System.out.println("Returning The Lord of the Rings:");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
	}
}