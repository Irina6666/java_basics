public class Book {
    private final String title;
    private final String author;
    private final int pagesNumber;
    private final int numberISBN;

    public Book(String title, String author, int pagesNumber, int numberISBN){
        this.title = title;
        this.author = author;
        this.pagesNumber = pagesNumber;
        this.numberISBN = numberISBN;

    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPagesNumber(){
        return pagesNumber;
    }

    public int getNumberISBN(){
        return numberISBN;
    }
}
