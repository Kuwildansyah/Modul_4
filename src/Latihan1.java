import java.util.HashMap;
import java.util.Scanner;

public class Latihan1 {

        String nama,kelas, matkulPerkuliahan;
        int nim;
            public Latihan1(String nm, String kl, String mat, int ni){
            nama=nm;
            kelas = kl;
            matkulPerkuliahan = mat;
            }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Latihan1> mhs = new HashMap<>();
        String input;
        Latihan1 data;

        mhs.put("1", new Latihan1("putri","3H","Struktur Data", 2020000));
        mhs.put("2", new Latihan1("agus","3A","Struktur Data", 2020001));
        mhs.put("3", new Latihan1("Arro","3D","Struktur Data", 2020002));

        System.out.println("Masukkan ID :");
        input= in.nextLine();
        data = mhs.get(input);
        if(data != null ){
            System.out.println("data Mahasiswa : " + data.nama + " kelas : " + data.kelas + " Nama Matkul praktikum: " + data.matkulPerkuliahan + " nim : " + data.nim);

        }

    }
}