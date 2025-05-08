import java.util.Scanner;
public class pendataanmhs {
    public static void main(String[] args) {
        
        //deklarasi variabel
        String nama, jurusan;
        int umur, semester;
        Double ipk;

        //membuat scanner baru
        Scanner input = new Scanner(System.in);

        //tampilkan output ke user
        System.out.println("Pendataan Mahasiswa Unsika");
        System.out.print("Nama Mahasiswa :");

        //menggunakan scanner dan menyimpan apa yang diketik kedalam variabel
        nama = input.nextLine();

        //tampilkan output
        System.out.print("Jurusan : ");
        jurusan = input.nextLine();

        System.out.print("Semester : ");
        semester = input.nextInt();

        System.out.print("Umur : ");
        umur = input.nextInt();

        System.out.print("IPK : ");
        ipk = input.nextDouble();

        //output terakhir
        System.out.println("-------------------------------------------------");
        System.out.println("MAHASISWA TERVERIFIKASI! SELAMAT DATANG DI UNSIKA");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Semester : " + semester);
        System.out.println("Umur : " + umur);
        System.out.println("IPK : " + ipk);

        input.close();
    }
}
