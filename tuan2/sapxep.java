import java.util.Arrays;
import java.util.Scanner;
public class sapxep {
    
    public static void main(String[] args){
        System.out.println("nhap so di ban:");
        Scanner bai1 = new Scanner(System.in);
        int n[] = new int[10];
        for(int i=0; i <= 9;i++){
            n[i]= bai1.nextInt();
        }
        
        
        
        
        
        System.out.println("sap xep tang dan:");
        Arrays.sort(n);
        for (int x : n){
            System.out.println(x);
        }
        sortDESC(n);
        System.out.println("sap xep giam dan :");
        show(n);
    }
    public static void sortDESC(int  n[]) {
        int min = n[0];
        for(int i=0 ; i<=9; i++){
            for(int j=0 ;j<10; j++){
                if(n[i]> n[j]){
                    min= n[j];
                    n[j]=n[i];
                    n[i]=min;
                }
            }
        }
    }
    public static void show(int n[]) {
        for (int i = 0; i <10; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
