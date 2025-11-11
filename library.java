class Book{
    String name;
    String author;
    double price;
    int quantity;
    public Book(String name,String author,double price, int quantity){
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getAuthor(){
        return author;
    }
    public void setnewprice(double price){
        this.price = price;
    }
    public void setnewquantity(int quantity){
        this.quantity = quantity;
    }


}

class Author{
    String name;
    String gender;
    String email;
    public Author(String name, String gender,String email){
        this.name = name;
        this.gender = gender;
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public String getEmail(){
        return email;
    }
}

class library {
    Book[] books;
    int size;
    int count;

    public library(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        books[count] = book;
        count++;
    }

    public void showBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i].name + " - " + books[i].author);
        }
    }
}

public class lab{
    public static void main(String[] arg){
        library l = new library(5);
        Author a1 = new Author("Толстой", "M", "tolstoy@mail.ru");
        Book b1 = new Book("Война и мир", a1.name, 500, 5);

        Author a2 = new Author("Пушкин", "M", "pushkin@mail.ru");
        Book b2 = new Book("Евгений Онегин", a2.name, 300, 3);
        l.addBook(b1);
        l.addBook(b2);
        l.showBooks();
}





}



