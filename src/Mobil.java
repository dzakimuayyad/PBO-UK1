public class Mobil extends Kendaraan{
    public Mobil(String jenis){
        super(jenis);
    }

    @Override
    public void suara(){
        System.out.println("Mobil "+getJenis()+" bersuara broom!");
    }
}
