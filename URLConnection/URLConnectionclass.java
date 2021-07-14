package  URLConnection;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class URLConnectionclass {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com/");

            URLConnection urlcon = url.openConnection();

            // Allow User Interaction field.
            System.out.println(urlcon.getAllowUserInteraction());

            // Get the value of Content Type field.
            System.out.println(urlcon.getContentType());

            //Get the Value of URL of the given connection.
            System.out.println(urlcon.getURL());

            // print the value of Do Input field.
            System.out.println(urlcon.getDoInput());

            // print the value of Do Output field.
            System.out.println(urlcon.getDoOutput());

            // print the value of Last Modified field.
            System.out.println(new Date(urlcon.getLastModified()));

            // print the value of Content Encoding field.
            System.out.println(urlcon.getContentEncoding());

            // To get a map of all the fields of http header
            Map<String, List<String>> header = urlcon.getHeaderFields();

            // print all the fields along with their value.
            for (Map.Entry<String, List<String>> mp : header.entrySet()) {
                System.out.print(mp.getKey() + " : ");
                System.out.println(mp.getValue().toString());
            }
            System.out.println();
            System.out.println("Complete source code of the URL is-");
            System.out.println("---------------------------------");

            // get the inputstream of the open connection.
            BufferedReader br = new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
            String i;

            // print the source code line by line.
            while ((i = br.readLine()) != null) {
                System.out.println(i);
            }
        }
        catch (MalformedURLException   a) {
            System.out.println(a);
        }
       


        catch (UnknownHostException   a) {
            System.out.println(a);
        }
       

        catch (Exception e) {
            System.out.println(e);
        }
    }
}