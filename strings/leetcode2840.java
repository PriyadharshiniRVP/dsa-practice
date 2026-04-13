package strings;
class leetcode2840{
    public static void main(String[] args) {
         String str1="abcdba";
         String str2="cabdab";
         for(int i=0;i<str1.length();i++){
            for(int j=str1.length();j>=0;j--){
                if((j-i)%2==0){
                    swap(str1,i,j);

            }
         }

    }
    if(str1.equals(str2)){
       System.out.println("true");
    }
    else{
        System.out.println("false");
    }
}
    public static void swap(String str1,int i,int j){
       char [] array= str1.toCharArray();
        for(int c=0;c<array.length;c++){
            for(int d=array.length;d>=0;d--){

                 char temp=array[i];
                 array[i]=array[j];
                 array[j]=temp;

            }
        }
       

    }

}
