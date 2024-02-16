public class Textbook {
    
    private String bookName;
    private String authorFirstName;
    private String authorLastName;
    private String publisher;


    public Textbook(String bookName, String authorFirstName, String authorLastName, String publisher) {
        this.bookName = bookName;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.publisher = publisher;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthorFirstName() {
        return authorFirstName;
    }
    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }
    public String getAuthorLastName() {
        return authorLastName;
    }
    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Textbook [bookName=" + bookName + ", authorFirstName=" + authorFirstName + ", authorLastName="
                + authorLastName + ", publisher=" + publisher + "]";
    }


}
