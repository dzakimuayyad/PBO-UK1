public class Main {
    public static void main(String[] args){
        Hewan kucing = new Kucing("Louis");
        Hewan sapi = new Sapi("Seapy");
        Kendaraan mobil = new Mobil("Kijang Inovva");

        kucing.suara();
        sapi.suara();
        mobil.suara();

        Hewan hewanTanpaNama = new Hewan("No Name");
        System.out.println("Nama Hewan: "+hewanTanpaNama.getNama());
        System.out.println("Program end...");
    }
}