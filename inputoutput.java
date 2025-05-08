import java.util.Scanner;
public class inputoutput {
    public static void main(String[] args) {

        //Scanner 
        Scanner input = new Scanner(System.in);

        //deklarasi variabel
        int angka;

        //inputan user
        System.out.print("Masukan Angka : ");
        angka=input.nextInt();

        //output
        System.out.println("-----------------------------");
        System.out.print("Angka yang anda masukan adalah : " +angka);

        input.close();
    }
}
