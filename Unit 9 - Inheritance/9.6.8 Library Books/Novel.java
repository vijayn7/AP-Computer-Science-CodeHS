public class Novel extends Book
{
    private String genre;
    private int pages;
    
    public Novel(String title, String author, String genre, int pages) {
        super(title, author);
        this.genre = genre;
        this.pages = pages;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public void setPages(int pages) {
        this.pages = pages;
    }
    
    public int getPages() {
        return pages;
    }
}