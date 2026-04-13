package basic_probs;
import java.util.Scanner;

public class mergetwoarrays {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int[] a=new int[n1];
for(int i=0;i<n1;i++) {a[i]=sc.nextInt();}
int n2=sc.nextInt();
int[] b=new int[n2];
for(int i=0;i<n2;i++){
    b[i]=sc.nextInt();
}


int[] merged=new int[n1+n2];
for(int i=0;i<n1;i++){
    merged[i]=a[i];
}
for(int i=0;i<n2;i++){
    merged[i+n1]=b[i];
}
for(int m=0;m<merged.length;m++){
    System.out.print(merged[m] +" ");
}
}

    
}
