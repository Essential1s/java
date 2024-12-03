package bookpackext;
class pr011 {
public static void main(String[] args) {
                bookpack.Book[] books = new bookpack.Book[4];
                books[0] = new bookpack.Book("illiad", "gomer", 1941);
                books[1] = new bookpack.Book("Naedine s soboi","mark aurelius", 1950);
                books[2] = new bookpack.Book("Sobor paris godmother", "gugo", 1790);
                books[3] = new bookpack.Book("Crime and punishment", "Dostaevsky", 1950);
                for(int i=0; i< books.length; i++)
                        books[i].show();
        }	
}
