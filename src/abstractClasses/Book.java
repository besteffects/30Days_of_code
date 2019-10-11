package abstractClasses;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
// Declare the price instance variable

class MyBook extends Book {
    int price;
    /**
     * Class Constructor
     *
     * @param title  The book's title.
     * @param author The book's author.
     * @param price  The book's price.
     **/
// Write your constructor here
    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    /**
     * Method Name: display
     * <p>
     * Print the title, author, and price in the specified format.
     **/
// Write your method here
    void display() {
        System.out.println("Title: " + title + "\n" + "Author: " + author + "\n"+ "Price: " +price);
    }
// End class
}
