package dez;

import java.util.Scanner;

public class Main {
    static int count = 0;

    static String remove(String palavra, String letra){
        palavra = palavra.replaceFirst(letra,"");
        return palavra;
    }

    static boolean concatERemove(String in,String des, int k){
        for (int i = in.length()-1; i >= 0 ; i--) {
            if(des.contains(in.substring(i, i+1))){
                des = remove(des, in.substring(i, i+1));
            }else{
                count++;
            }

        }
        count += des.length();
        //System.out.println("total: "+count);
        return count<= k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        int c = sc.nextInt();

        if(concatERemove(a,b,c)){
            System.out.println("sim");
        }else {
            System.out.println("não");
        }
    }
}
