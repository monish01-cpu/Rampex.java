import java.util.*;

public class even {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count =0;
        String s2="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' ' ){
                count++;
                s2+= s.charAt(i);
            }
            else{
                  count=0;
               if(s2.length()%2==0){
                System.out.print(s2+" ");
               } 
             
               s2="";   
            }
        }
            if(s2.length()%2==0){
             System.out.print(s2+" ");
            }

        }

        
    }

