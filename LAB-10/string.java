import java.util.*;
public class string {
    public static void main(String[] args) {
        int count=0;
            Scanner scan= new Scanner(System.in);
        String string;
        System.out.println("enter the string");
        string= scan.nextLine();
        StringTokenizer st = new StringTokenizer(string," ",false) ;
          while(st.hasMoreTokens())
          {                                   count++;
           System.out.println(st.nextToken());
          }
        System.out.println("word count:"+count);
    }
}
