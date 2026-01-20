public class Book2 {
    int bid;
    double price;
    String title,author;
    public Book2(int bid,double price,String title,String author){
        super();
        this.bid=bid;
        this.price=price;
        this.title=title;
        this.author=author;
    }
    public boolean equals(Object object){
        if(object instanceof Book2){
            Book2 book2=(Book2) object;
            return this.bid==book2.bid && this.price==book2.price && this.author.equals(book2.author) && this.title.equals(book2.title);
        }
        return false;
    }
    public static void main(String[] args) {
        Book2 book2=new Book2(102, 250, "Maths", "Deepak");
        Book2 book22=new Book2(102, 250, "Maths", "Deepak");
        System.out.println(book2.equals(book22));
        System.out.println("*********************************************************");
        Book2 book23=new Book2(102, 250, "science", "Deepak");
        Book2 book24=new Book2(103, 250, "science", "Deepak");
        System.out.println(book23.equals(book24));
    }
}
