package basic_probs;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class print_freq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        LinkedHashMap <Character,Integer> map=new LinkedHashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
      for(char ch:map.keySet()){
        System.out.print(ch+""+map.get(ch)+" ");

      }
    }
    
}
