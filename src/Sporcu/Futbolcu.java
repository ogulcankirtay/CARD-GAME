package Sporcu;

public class Futbolcu extends Sporcu {

   
    private int penaltı, serbestVurus, kaleciKarsiKarsiya;
    

    public Futbolcu() {

        this.penaltı = 0;
        this.serbestVurus = 0;
        this.kaleciKarsiKarsiya = 0;
    }

    public Futbolcu(int penaltı, int serbestVurus, int kaleciKarsiKarsiya, String FutbolcuAdi, String FutbolcuTakim) {
        super(FutbolcuAdi, FutbolcuTakim);
        this.penaltı = penaltı;
        this.serbestVurus = serbestVurus;
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

    public int getPenaltı() {
        return penaltı;
    }

    public void setPenaltı(int penaltı) {
        this.penaltı = penaltı;
    }

    public int getSerbestVurus() {
        return serbestVurus;
    }

    public void setSerbestVurus(int serbestVurus) {
        this.serbestVurus = serbestVurus;
    }

    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

   

    @Override
    public int sporcuPuaniGoster() {
        return super.sporcuPuaniGoster();
    }

    

}
