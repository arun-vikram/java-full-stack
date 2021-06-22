 public class arraySum
 {
public static void main(String[] args){
    double num []= {10.1f,11,15,4.8f,6};

    double result = 0f;
    double average;
    int i;

    for(  i=0; i<5; i++)
    result = result + num[i];
    average= result/5f;


    System.out.println("average is " +average);

}

 }