/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pengajuan_desain_cominfo;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String[]> daftarPengajuan = new ArrayList<>();

        // Tambahkan 3 data default
        daftarPengajuan.add(new String[]{"Banner KC", "inirefrensibanermas", "Yardan", "08123456789", "14 September 2025"});
        daftarPengajuan.add(new String[]{"Plakat GTA", "inirefrensiplakatmas", "Faris", "08987654321", "17 September 2025"});
        daftarPengajuan.add(new String[]{"Poster Produk", "inirefrensipostermas", "Danial", "082233445566", "30 September 2025"});

        int pilihan = 0;
        while (pilihan != 5) {
            System.out.println("\n===== PENGAJUAN DESAIN COMINFO =====");
            System.out.println("1. Ajukan Desain");
            System.out.println("2. Lihat Daftar Desain");
            System.out.println("3. Ubah/Perbaiki Pengajuan");
            System.out.println("4. Hapus Pengajuan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu = ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.println("\n===== MENGAJUKAN DESAIN =====");
                System.out.print("Jenis Desain: ");
                String jenis = input.nextLine();
                System.out.print("Link Referensi: ");
                String link = input.nextLine();
                System.out.print("Nama: ");
                String nama = input.nextLine();
                System.out.print("Kontak: ");
                String kontak = input.nextLine();
                System.out.print("Deadline (contoh: 9 Desember 2025): ");
                String deadline = input.nextLine();

                daftarPengajuan.add(new String[]{jenis, link, nama, kontak, deadline});
                System.out.println("Desain berhasil diajukan!");

            } else if (pilihan == 2) {
                if (daftarPengajuan.isEmpty()) {
                    System.out.println("Belum ada desain yang diajukan.");
                } else {
                    System.out.println("\n===== DAFTAR PENGAJUAN DESAIN =====");
                    for (int i = 0; i < daftarPengajuan.size(); i++) {
                        String[] d = daftarPengajuan.get(i);
                        System.out.println("Desain " + (i + 1));
                        System.out.println("Jenis Desain   : " + d[0]);
                        System.out.println("Link Referensi : " + d[1]);
                        System.out.println("Nama           : " + d[2]);
                        System.out.println("Kontak         : " + d[3]);
                        System.out.println("Deadline       : " + d[4]);
                        System.out.println("--------------------------------");
                    }
                }

            } else if (pilihan == 3) {
                if (daftarPengajuan.isEmpty()) {
                    System.out.println("Belum ada desain yang diajukan.");
                } else {
                    System.out.println("\n===== MENGUBAH PENGAJUAN DESAIN =====");
                    System.out.print("Masukkan nomor pengajuan yang ingin diubah: ");
                    int idx = input.nextInt() - 1;
                    input.nextLine();
                    if (idx >= 0 && idx < daftarPengajuan.size()) {
                        System.out.print("Jenis Desain: ");
                        String jenis = input.nextLine();
                        System.out.print("Link Referensi: ");
                        String link = input.nextLine();
                        System.out.print("Nama: ");
                        String nama = input.nextLine();
                        System.out.print("Kontak: ");
                        String kontak = input.nextLine();
                        System.out.print("Deadline (contoh: 9 Desember 2025): ");
                        String deadline = input.nextLine();

                        daftarPengajuan.set(idx, new String[]{jenis, link, nama, kontak, deadline});
                        System.out.println("Data pengajuan desain berhasil diubah!");
                    } else {
                        System.out.println("Nomor yang anda pilih tidak ada.");
                    }
                }

            } else if (pilihan == 4) {
                if (daftarPengajuan.isEmpty()) {
                    System.out.println("Belum ada desain yang diajukan.");
                } else {
                    System.out.println("\n===== MENGHAPUS PENGAJUAN DESAIN =====");
                    System.out.print("Masukkan nomor pengajuan yang ingin dihapus: ");
                    int idx = input.nextInt() - 1;
                    input.nextLine();
                    if (idx >= 0 && idx < daftarPengajuan.size()) {
                        daftarPengajuan.remove(idx);
                        System.out.println("Pengajuan berhasil dihapus!");
                    } else {
                        System.out.println("Nomor yang anda pilih tidak ada.");
                    }
                }

            } else if (pilihan == 5) {
                System.out.println("Terima kasih sudah berkunjung!");

            } else {
                System.out.println("Pilihan tidak tersedia, coba lagi.");
            }
        }

        input.close();
    }
}
