public class Book {
    private String title;
    private String author;
    private double price;

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public static void main(String[] args) {
        Book book=new Book();
        book.setAuthor("Ashwin");
        book.setTitle("Ashwin Untold Story");
        book.setPrice(450);
        System.out.println("Book Title:"+book.getTitle());
        System.out.println("Book Author Name:"+book.getAuthor());
        System.out.println("Book Price:"+book.getPrice());
        System.out.println("**************************");
        Book book2=new Book();
        book2.setAuthor("Ms Dhoni");
        book2.setTitle("Ms Dhoni Untold Story");
        book2.setPrice(550);
        System.out.println("Book Title:"+book2.getTitle());
        System.out.println("Book Author Name:"+book2.getAuthor());
        System.out.println("Book Price:"+book2.getPrice());
        System.out.println("**************************");
    }
    
}
