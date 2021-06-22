import javax.lang.model.util.ElementScanner6;

public class stringFunctions {
    public static void main(String[] args) {

        String ob1 = "first string";
        String ob2 = "second string";
        String ob3 = ob1 + " and " + ob2;
        System.out.println(ob3);
        // length
        System.out.println(ob1.length());
        // charAt
        System.out.println(ob2.charAt(5));

        // EQUALTO
        if (ob1.equals(ob2))
            System.out.println("ob1 == ob2");
        else
            System.out.println("ob1 != ob2");

    }

}
