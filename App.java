import com.JadwalKuliah;
import com.Kelas;
import com.Mahasiswa;
import com.MataKuliah;

import java.util.Scanner;

import com.Dosen;

public class App {
    public static void main(String[] args) throws Exception {
        char ans = 'n';
        Scanner masukan = new Scanner(System.in);
       do{
           System.out.println("Pilih");
           System.out.println("1. Data Mahasiswa");
           System.out.println("2. Data Dosen");
           System.out.println("3. Data Mata Kuliah");
           System.out.println("4. Data Kelas");
           System.out.println("5. Data Jadwal Mata Kuliah");
           System.out.println("0. Keluar");
           System.out.print("Input : ");
           int pilih = masukan.nextInt() ;
           if(pilih == 1){
                System.out.println("        Data Mahasiswa      ");    
                Mahasiswa m1 = new Mahasiswa("Taeyong" , "01071995" , false);
                Mahasiswa m2 = new Mahasiswa("Taehung" , "01071996" , false);
                Mahasiswa m3 = new Mahasiswa("Soobin" , "01071997" , false);
        
                System.out.println(m1.toString());
                System.out.println(m2.toString());
                System.out.println(m3.toString());
                
                System.out.println("---------------------------------------");
                System.out.println("");
           }

           else if(pilih ==2 ){
            System.out.println("        Data Dosen          ");
          
            Dosen d1 = new Dosen("Yuna" , "02081985" , true);
            System.out.println(d1.toString());
    
            System.out.println("---------------------------------------");
            System.out.println(" ");
           }

           else if(pilih == 3){
            System.out.println("        Mata Kuliah           ");

            MataKuliah mt1 = new MataKuliah("PBO" , "PBO127") ;
            System.out.println(mt1.toString());
            System.out.println("---------------------------------------");
            System.out.println(" ");
           }

           else if(pilih==4){
            Kelas k1 = new Kelas("\n" + "Teknik Informatika \n" ,  "20TI2");
            System.out.println(k1.toString());
            System.out.println("---------------------------------------");
            System.out.println(" ");
           }
           else if(pilih ==5){
            System.out.println("        Jadwal Kuliah           ");

            JadwalKuliah jadwalKuliah = new JadwalKuliah();
            Mahasiswa m1 = new Mahasiswa("Taeyong" , "01071995" , false);
            Mahasiswa m2 = new Mahasiswa("Taehung" , "01071996" , false);
            Mahasiswa m3 = new Mahasiswa("Soobin" , "01071997" , false);
            jadwalKuliah.tambahmahasiswa(m1);
            jadwalKuliah.tambahmahasiswa(m2);
            jadwalKuliah.tambahmahasiswa(m3);
    
            jadwalKuliah.tampilkanjadwalkuliah();
            System.out.println();
           }
           else if(pilih == 0){
               System.out.println("Terima Kasih...");
                System.exit(0);
           }
           else{
               System.out.println("Bye...");
               System.exit(0);
           }
           System.out.print("Ulangi [y/n] ? ");
           masukan.nextLine();
           String yn = masukan.nextLine();
           ans = yn.charAt(0);

       }while(ans == 'y' || ans == 'Y');
        
       masukan.close();
    }
}
