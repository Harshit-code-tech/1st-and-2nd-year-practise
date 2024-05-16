package recursion;

import java.util.Scanner;

public class sort_checking {
    public static boolean issorted(int arr[], int ar){
        if(ar==arr.length-1){
            return true;
        }
        if(arr[ar]<arr[ar+1]){//if >= then array is unsorted
            //arrayis sorted till now
           return  issorted(arr,ar+1);//for unsorted return false
        }else{//for unsorted remove else  whole and  return issorted(arr,ar+1);
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total array numbers: ");
        int n = sc.nextInt();
        int arr[]= new int[n];

        for(int i = 1;i<=n;i++){
            System.out.println("Enter the number at "+i+" position: ");
            arr[i-1] = sc.nextInt();
        }

        System.out.println(issorted(arr,0));

    }
}
