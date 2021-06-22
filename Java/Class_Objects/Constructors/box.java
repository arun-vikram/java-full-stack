public class box{
   int length ;
   int breadth ;

box(int l,int b){
    System.out.println("constructing boxes");
    length=l;
    breadth=b;

}
int area(){
    return length*breadth;
}
public static void main(String[] args){
    box obj1= new  box(10,5);
    box obj2= new box(8,4);
    int area;
    //area of first box
    area=obj1.area();
    System.out.println("area is" + area);

    //area of second box
    area=obj2.area();
    System.out.println("area is" + area);
}
}