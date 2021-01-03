import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        //scan.useDelimiter("\n");
        String s = scan.nextLine();
        
        // Write your code here.
        scan.close();
        if(s!=null || !(s.isEmpty()))
            s=s.trim();
        if( s==null || (s.isEmpty()) )
        {
            System.out.println("0");
        }
        else
        {
            String[] arrOfStr=s.split("[ !,?._'@]+");//Characers within[] are treated as elements which if encountered the word will be splited and + is optional if + is there then any combination of these charachters will also be considered or spliting the string 
            System.out.println(arrOfStr.length);
            for (String a: arrOfStr )
                System.out.println(a);
                
        }   
    }
}

