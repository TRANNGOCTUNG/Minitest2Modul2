package books;

public class ProgrammingBooks extends Books{
    private String language;
    private String framework;

    public ProgrammingBooks(){
        this.language ="";
        this.framework ="";
    }
    public ProgrammingBooks(String language, String framework, String bookCore, String name, double price, String author){
        super(bookCore,name,price,author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
    @Override
    public  String toString(){
        return "bookLanguage is: "
                + getLanguage()
                +" bookFramework is: "
                + getFramework()
                + "BookCode is: "
                + getBookCode()
                + " bookName is: "
                + getName()
                +" bookPrice is: "
                + getPrice()
                +" bookAuthor is: "
                + getAuthor();
    }

}
