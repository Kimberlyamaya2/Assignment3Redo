public class Main {
    public static void main(String[] args) {

        //  Book book1 = new Book("wireless networks", "Anke Berr", 14.99);
        // Book book2 = new Book("crème waffles for dummies", "Piro Lane", 24.79);
        //
        //        SLList booksList = new SLList();
        //
        //        booksList.listAdd(book1);
        //        booksList.listAdd(book1);
        //        booksList.listAdd(book2);
        //        booksList.listAdd(book1);
        //
        //        System.out.println(booksList);
        //
        //        booksList.listRemove(1);
        //
        //        System.out.println(booksList);

    SLList<Book> SLlist = new SLList<>();


    SLlist.listAdd(new Book("Reckless", "Elise Silver", 15.99));
    SLlist.listAdd(new Book("Sable Peak", "Devney Perry", 35.49));
    SLlist.listAdd(new Book("Jasper Vale", "Devney Perry", 25.99));

    System.out.println("Initial List:");
    System.out.println(SLlist.toString());

    SLlist.listRemove(1);

    System.out.println("List after removing:");
    System.out.println(SLlist.toString());
}
}