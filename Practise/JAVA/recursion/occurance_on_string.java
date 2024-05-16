package recursion;

import java.util.Scanner;

public class occurance_on_string {
    public static int first =-1;
    public static int last =-1;
    public static void findocc(String str, int ind,char eleme   ){
        if(ind==str.length()){
            System.out.println(first);
            System.err.println(last);
            return;
        }
        char currchar = str.charAt(ind);
        if(currchar==eleme){
            if(first==-1){
                first = ind;
            }else{
                last = ind;
            }
        }
        findocc(str,ind+1,eleme);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: \n");
        String str= sc.nextLine();
        if (str.length() > 0) {
            System.out.println("Enter which character to search: ");
            char m = sc.next().charAt(0);

            findocc(str, 0, m);
        } else {
            System.out.println("String is empty.");
        }


    }
}
