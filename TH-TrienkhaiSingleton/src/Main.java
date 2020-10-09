public class Main {
    public static void main(String[] args) {
        System.out.println("BEGIN TESTING SINGLETON PATTERN");

        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println("khách 1 hỏi mượn sách");
        System.out.println("BookBorrower1 Author and Title: ");
        System.out.println(bookBorrower1.getTacGiaAndTieuDe());


        bookBorrower2.borrowBook();
        System.out.println("BookBorrower2 asked to borrow the book");
        System.out.println("BookBorrower2 Author and Title: ");
        System.out.println(bookBorrower2.getTacGiaAndTieuDe());

        bookBorrower1.returnBook();
        System.out.println("BookBorrower1 returned the book");

        bookBorrower2.borrowBook();
        System.out.println("BookBorrower2 Author and Title: ");
        System.out.println(bookBorrower1.getTacGiaAndTieuDe());

        System.out.println("END TESTING SINGLETON PATTERN");
    }
}

