
package library.sublib;

class innerLedger
{
    innerLedger()
    {
        System.out.println("INSIDE innerLedger");
    } 
    
}

class userofLibraryCls
{
    public void useSubLedger()
    {
        System.out.println("INSIDE userofLibraryCls");
        innerLedger  sl = new innerLedger();
    }

}
public class subLedger
{
    public static void main(String [] args) {
        
        System.out.println("INSIDE main");
        userofLibraryCls useclsObj = new userofLibraryCls();
        useclsObj.useSubLedger();
    }
}