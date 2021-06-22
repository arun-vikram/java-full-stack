package library.sublib;

public class BookLedger
{
    public BookLedger()
    {
        System.out.println("INSIDE BookLedger");
        userofLibraryCls useclsObj = new userofLibraryCls();
        System.out.println("INSIDE BookLedger aftr calling package class userofLibraryCls");
        useclsObj.useSubLedger();
        System.out.println("INSIDE BookLedger aftr calling package class userofLibraryCls useclsObj.useSubLedger()");

    }
    public static void main(String [] args) {
        
        System.out.println("INSIDE BookLedger");
        userofLibraryCls useclsObj = new userofLibraryCls();
        System.out.println("INSIDE BookLedger aftr calling package class userofLibraryCls");
        useclsObj.useSubLedger();
        System.out.println("INSIDE BookLedger aftr calling package class userofLibraryCls useclsObj.useSubLedger()");
    }
}

