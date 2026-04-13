package basic_probs;
import java.util.Scanner;

public class countvandc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        int vowels=0;
        int consonants=0;
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                if("aeiou".indexOf(c) !=-1){
                    vowels++;
                   
                    }
                     else{
                        consonants++;
                }
               
            }
             
        }
        System.out.println("The consonants:"+consonants);
        System.out.println("The vowels are:"+vowels);
        /* priya@iu
        first: p -- c++
        c=1;v=0;

        second: r -- c++
        c=2;v=0;

        third: i -- v++
        c=2;v=1;
        
        fourth : y - c++
        c=3;v=1;

        fifth : a - v++
        c=3;v=2

        sixth : @ - not a letter so loop cancel

        seventh : i -v++
        c=3;v=3;

        eigth : u - v++
        c=3;v=4

        loop ends here.

         */

    }
    
}

