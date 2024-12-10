package bookpackext;
class pr012 {
public static void main(String[] args) {
                ExtBook[] books = new ExtBook[4];
                books[0] = new ExtBook("illiad", "gomer", 1941, "prosveshenie");
                books[1] = new ExtBook("Naedine s soboi","mark aurelius", 1950, "exmo");
                books[2] = new ExtBook("Sobor paris godmother", "gugo", 1790, "peter");
                books[3] = new ExtBook("Crime and punishment", "Dostaevsky", 1950, "labirint");
                for(int i=0; i< books.length; i++)
                        books[i].show();
        }


}
