public class BookBorrower {
    private BookSingleton borrowBook;
    private boolean haveBook = false;
// mượn sách borrowBook()
    public void borrowBook() {
        borrowBook = BookSingleton.borrowBook();
        if (borrowBook == null) {
            haveBook = false;
        } else {
            haveBook = true;
        }
    }
    // lấy về thông tin sách mượn
    public String getTacGiaAndTieuDe(){
        if(haveBook){
            return borrowBook.getTacGiaAndTieuDe();
        }
        return "I don't have the book";
    }
    //trả về sách
    public void returnBook(){
        borrowBook.returnBook(borrowBook);
    }
}
