import java.util.Scanner;
public class selection {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //deklarasi variabel
        int nilai;

        //tampilkan output ke user
        System.out.print("MASUKAN NILAI UAS YANG ANDA PEROLEH : ");
        nilai = input.nextInt();

        //selection
        if(nilai>=75){
            System.out.println("SELAMAT! ANDA LULUS UJIAN");
        } else{
            System.out.println("MOHON MAAF! ANDA HARUS MENGULANG");
        }

        input.close();
    }
}


