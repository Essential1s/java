package bookpackext;
import bookpack.Book;
class pr011 {
public static void main(String[] args) {
                Book[] books = new Book[4];
                books[0] = new Book("illiad", "gomer", 1941);
                books[1] = new Book("Naedine s soboi","mark aurelius", 1950);
                books[2] = new Book("Sobor paris godmother", "gugo", 1790);
                books[3] = new Book("Crime and punishment", "Dostaevsky", 1950);
                for(int i=0; i< books.length; i++)
                        books[i].show();
        }	
}
