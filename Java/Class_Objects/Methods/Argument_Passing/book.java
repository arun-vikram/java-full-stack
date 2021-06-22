public class book
{
    //Properties
    // Attributes
    //Data member
    // Intance Variable
    int bookId;
    String BookName;
    String ISBN;



    //methods 
    //Behaviors
    //verb
    //return - what the verb has completed
    // return type tells whether it is completed
    book()
    {
        System.out.println("INSIDE CONSTRUCTOR book()");
    }
     boolean addBook( int Bookid)
    {
        System.out.println("ADD Book Called :: " + Bookid);
        return true;
    }
     boolean removeBook(int RemBookid)
    {
        System.out.println("Remove Book Called ::" + RemBookid);
        return true;
    }

    public static void main(String [] args) {
     
        System.out.println("CREATING An OBJECT NOW");
        book bObj1 = new book();
             bObj1.addBook(100);
             bObj1.removeBook(100);
        book bObj2 = new book();
             bObj2.addBook(200);
        book bObj3 = new book();

        
    }


}