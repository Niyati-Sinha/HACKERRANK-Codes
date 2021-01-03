import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder endBuild=new StringBuilder();
        //System.out.println(a.length());
        String ini= a.substring(0,(a.length())/2);
        //System.out.println(ini);
        String end=a.substring(a.length()-a.length()/2);
        endBuild.append(end);
        //System.out.println(endBuild.reverse());
        end=(endBuild.reverse()).toString();
        // System.out.println(end);
         if(ini.equals(end))
         {
             System.out.println("Yes");
         }
         else 
            System.out.println("No");
    }
}
