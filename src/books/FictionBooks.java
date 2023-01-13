package books;

public class FictionBooks extends Books {
    private String category;
    public FictionBooks(){
        this.category = "";
    }
    public FictionBooks(String category, String bookCore, String name, double price, String author){
        super(bookCore,name,price,author);
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public String toString(){
        return "bookCategory is: "
                + getCategory()
                + super.toString();
    }


}
