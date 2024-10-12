public class Sapi extends Hewan{
    public Sapi(String nama){
        super(nama);
    }

    @Override
    public void suara(){
        System.out.println(getNama()+"Mooo!");
    }
}
