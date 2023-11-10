public class Book {
    private String title;
    private String author;
    private int noOfPages;

    Book(){
        this.title = "hello";
        this.author = "nO BODY";

    }


    public Book(String title,String author,int noOfPages){
        this.title = title;
        this.author = author;
        this.noOfPages = noOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getNoOfPages() {
        return noOfPages;
    }
}
