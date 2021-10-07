/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10
 */
public class Pertemuan3 {
    String x,y;
    int nilai1, nilai2, tambah, kurang, kali, bagi;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kondisi;
        kondisi = JOptionPane.showInputDialog(null, "Silahkan Pilih Kondisi (biodata,kalkulator)");
        Pertemuan3 per = new Pertemuan3();
        if(kondisi.equals("biodata")){
            per.biodata();
        }else if(kondisi.equals("kalkulator")){
            per.kalkulator();
        }
    }
void biodata(){
//Deklarasi variable
String nama_depan,
       nama_belakang,
       tempat,
       tgl_lahir,
       alamat,
       mata_kuliah;
int no_hp, nilai;
//input dengan JOptionPane
nama_depan = JOptionPane.showInputDialog(null, "Masukan Nama Depan Anda");
nama_belakang = JOptionPane.showInputDialog(null, "Masukan Nama Belakang Anda");
tempat = JOptionPane.showInputDialog(null, "Masukan Tempat Lahir Anda");
tgl_lahir = JOptionPane.showInputDialog(null, "Masukan Tanggal Lahir Anda");
no_hp = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Nomor HP Anda"));
mata_kuliah = JOptionPane.showInputDialog(null, "Masukan Mata Kuliah Anda");
nilai = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Nilai Anda"));
alamat = JOptionPane.showInputDialog(null, "Masukan Alamat Anda");
//Output Pop Up
JOptionPane.showMessageDialog(null, "=====BIODATA=====\n" + 
"Nama : " + nama_depan + " " + nama_belakang + "\n" +
"Tempat/Tanggal Lahir : " + tempat + " " + "\n" +
"No HP : " + no_hp + "\n" +
"Mata Kuliah : " + mata_kuliah + " " + "\n" +
"Nilai Angka : " + nilai + " " + "\n" +
"Nilai Huruf : ?" + "\n" +
"Alamat : " + alamat);
}
void kalkulator(){
   x = JOptionPane.showInputDialog(null, "Input Bilangan 1 : ");
   y = JOptionPane.showInputDialog(null, "Input Bilangan 2 : ");
   
   nilai1 = Integer.parseInt(x);
   nilai2 = Integer.parseInt(y);
   
   tambah = nilai1 + nilai2;
   kurang = nilai1 - nilai2;
   kali = nilai1 * nilai2;
   bagi = nilai1 / nilai2;
   
   JOptionPane.showConfirmDialog(null,
           "Bilangan 1 : " + nilai1 + "\n" +
           "Bilangan 2 : " + nilai2 + "\n" +
           "Tambah : " + nilai1 + "+" + nilai2 + "=" + tambah + "\n" +
           "Kurang : " + nilai1 + "-" + nilai2 + "=" + kurang + "\n" +
           "Kali : " + nilai1 + "*" + nilai2 + "=" + kali + "\n" +
           "bagi : " + nilai1 + "/" + nilai2 + "=" + bagi + "\n"
            );
}
}

