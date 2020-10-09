public class BookSingleton {
    private String tacGia;
    private String tieuDe;
    private static BookSingleton book;
    private static boolean daThue;
//get để lấy thông tin về sách
    public String getTacGia() {
        return tacGia;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public String getTacGiaAndTieuDe() {
        return getTieuDe() + getTacGia();
    }

    private BookSingleton() {
        tacGia = "Huynh, quang";
        tieuDe = "dc cua lo ";
        book = null;
        daThue = false;
    }
//hực hiện mượn sách
    public static BookSingleton borrowBook() {
        if (!daThue) {
            if (book == null) {
                book = new BookSingleton();
            }
            daThue = true;
            return book;
        }
        return null;
    }

    public void returnBook(BookSingleton bookSingleton) {
        daThue = false;
    }

}
