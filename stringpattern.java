import java.util.*;

public class stringpattern {

    public static void main(String[] args){

        Scanner sc = Scanner(System.in);
        String s = "viratkohli";
            for(int i=0;i<s.length();i+=2){
                System.out.print(s.charAt(i)+" ");
            }
            for(int i=1;i<s.length();i+=2){
                System.out.print(s.chatAt(i)+" ");
            }
        
    }
}
