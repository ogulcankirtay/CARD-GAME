package Sporcu;

public class Basketbolcu extends Sporcu{

   
    private int ikilik, ucluk, serbestAtis;
    private String Sporcuİsim;

    public Basketbolcu() {
        this.ikilik = 0;
        this.ucluk = 0;
        this.serbestAtis = 0;
    }

    public Basketbolcu(int ikilik, int ucluk, int serbestAtis, String BasketbolcuAdi, String BasketbolcuTakim) {
        super(BasketbolcuAdi, BasketbolcuTakim);
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbestAtis = serbestAtis;
    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

   

    @Override
    public int sporcuPuaniGoster() {
        return super.sporcuPuaniGoster(); 
    }

    

}
