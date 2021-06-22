import org.graalvm.compiler.hotspot.stubs.NewArrayStub;

//overloading constructors same constructor used with different dimensions

class boxOver{
    double length;
    double breadth;

//constructor with no dimensions
boxOver(){
    length = -1;    //use  -1 to indicate uninitialised values
    breadth = -1;
}
//constructor with all dimesions specified
boxOver(double l, double b){
    length= l;
    breadth = b;
}
//constructor for cube with same dimensions
boxOver(double len){
    length = breadth = len;
}
//method.to find volume
double volume(){
    return length * breadth;    
}

public static void main (String[] args){
    boxOver box1 = new boxOver();
    boxOver box2 = new boxOver(12f,10f);
    boxOver box3 = new boxOver(9f);

    double vol;
    //box1 volume
    vol = box1.volume();
    System.out.println( " vol of box1 is " + vol );
//box2 volume 
    vol = box2.volume();
    System.out.println( " vol of box2 is " + vol ); 
//box3 volume
    vol = box3.volume();
    System.out.println( " vol of box1 is " + vol );
}
}