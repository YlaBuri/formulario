package seis;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if(i%3 !=0 && i%5 !=0){
                System.out.print(i);
            }else{
                if(i%3 ==0)
                    System.out.print("Foo");
                if(i%5 ==0)
                    System.out.print("Baa");
            }
            System.out.println();

        }
    }
}
