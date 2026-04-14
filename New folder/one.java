import java.util.*;

public class one{
    public static void comp(String str){
        int count = 1;
        char s1 = str.charAt(0);
        String str2 = "";
        for(int i=1;i< str.length()-1;i++){
            if(str.charAt(i) ==s1){
                count++;      
            }else{
                str2 = str2 + s1;
                str2 = str2 + count;
                s1 = str.charAt(i);
                count=1;
            }
        }
    }
    public static void main(String arg[]){
        char arr[]={'a','b'};
        String str = "ab";
        String str2 = new String("ab");
        Scanner sc = new Scanner(System.in);
        String name;
        //name = sc.next(); // takes only word
        name = sc.nextLine();// takes complete line
        //name.charAt(idx) give char at inx in name str 
        //s1.equals(s2) to compare two string, returns bolleon value
    }
}