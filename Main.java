public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book(1, "American Gods", "Neil Gaiman", "KM-BYKC", 2020, 694, 500);
        books[1] = new Book(2, "The Complete Prose Works Volume 1", "Howard Phillips Lovecraft", "Jupsakogo", 2019, 445, 320);
        books[2] = new Book(3, "Norse Mythology", "Neil Gaiman", "KM-BYKC", 2022, 255, 325);
        books[3] = new Book(4, "The Complete Prose Works Volume 2", "Howard Phillips Lovecraft", "Jupsakogo", 2021, 450, 320);

        Main mainInstance = new Main();
        mainInstance.printBooksByAuthor(books, "Neil Gaiman");
        mainInstance.printBooksByPublisher(books, "KM-BYKC");
        mainInstance.printBooksPublishedAfterYear(books, 2020);
    }

    public void printBooksByAuthor(Book[] books, String author) {
        System.out.println("Books by author " + author + ":");
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book);
            }
        }
        System.out.println();
    }

    public void printBooksByPublisher(Book[] books, String publisher) {
        System.out.println("Books by publisher " + publisher + ":");
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                System.out.println(book);
            }
        }
        System.out.println();
    }

    public void printBooksPublishedAfterYear(Book[] books, int year) {
        System.out.println("Books published after year " + year + ":");
        for (Book book : books) {
            if (book.getYear() > year) {
                System.out.println(book);
            }
        }
    }
}
