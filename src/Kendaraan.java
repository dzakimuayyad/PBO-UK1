public class Kendaraan {
    private String jenis;
    public Kendaraan(String jenis){
        this.jenis = jenis;
    }

    public String getJenis(){
        return jenis;
    }

    public void suara(){
        System.out.println("Kendaraan besuara");
    }
}
