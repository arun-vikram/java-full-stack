public class Grocery {
//properties
int groceryid;
String groceryItemName;
float fprice;
float minqty;

String groceryItemURL;

public void setGroceryId(int gid)
{
    this.groceryid=gid;
}
public int getGroceryID()
{
    return this.groceryid;
}

public void setGroceryName(String gname)
{
    this.groceryItemName = gname;
}
public String getGroceryName()
{
    return this.groceryItemName;
}
    
 public static void main(String[] args) {

    Grocery m= new Grocery();
    Grocery m1= new Grocery();
    Grocery m2= new Grocery();

    m.setGroceryId(100);
    m.setGroceryName("aachi");

    m1.setGroceryId(101);
    m1.setGroceryName("Sakthi");

    m2.setGroceryId(102);
    m2.setGroceryName("lala");

    System.out.println(m.getGroceryID()+" "+m.getGroceryName());
    System.out.println(m1.getGroceryID()+" "+m1.getGroceryName());
    System.out.println(m2.getGroceryID()+" "+m2.getGroceryName());


    
}
}


 