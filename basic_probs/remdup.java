package basic_probs;
import java.util.Scanner;

public class remdup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        for(char c:s.toCharArray()){
            if(res.indexOf(c) == -1){
                res +=c;
            }
        }
        System.out.println(res);
    }

    
}
