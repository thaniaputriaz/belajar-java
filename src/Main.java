import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nama, pesanlagi = "Lagi";
        int i = 0;
        String menu[] = new String[10];
        int harga[] = new int[10];
        int no, jumlah, total;

        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();

        while (pesanlagi.equalsIgnoreCase("Lagi")) {
            System.out.println("Pilihan :");
            System.out.println("1. Nasi Goreng Rp.15.000.00");
            System.out.println("2. Mie Ayam Rp.10.000.00");
            System.out.println("3. Bakso Rp.13.000.00");

            System.out.print("Masukkan Pilihan : ");
            no = input.nextInt();

            if (no >= 1 && no <= 3) {
                switch (no) {
                    case 1:
                        menu[i] = "Nasi Goreng";
                        harga[i] = 15000;
                        break;
                    case 2:
                        menu[i] = "Mie Ayam";
                        harga[i] = 10000;
                        break;
                    case 3:
                        menu[i] = "Bakso";
                        harga[i] = 13000;
                        break;

                }

                System.out.print("Jumlah Pesan : ");
                jumlah = input.nextInt();

                total = jumlah * harga[i];

                System.out.println("==================");
                System.out.println("Nama Pemesan : " + nama);
                System.out.println("Pesanan : " + menu[i]);
                System.out.println("Harga : " + harga[i]);
                System.out.println("Jumlah Pesan : " + jumlah);
                System.out.println("Total Bayar: " + total);
                System.out.println("==================");

                i++;

                System.out.println();
                System.out.print("Ketik 'Lagi' jika ingin memesan lagi (Lagi/Selesai): ");
                input.nextLine();
                pesanlagi = input.nextLine();
            } else {
                System.out.println("===================================");
                System.out.println("Salah Pilih ! Coba lagi");
                System.out.println("===================================");
            }
        }

        System.out.println("Terima kasih! Program berakhir.");

        // Menutup scanner
        input.close();
    }
}
