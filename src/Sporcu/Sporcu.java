package Sporcu;

public class Sporcu {

    private String SporcuTakim;
    public boolean kartKullanildiMi;
    private String Sporcuİsmi;

    public Sporcu() {
        this.setSporcuİsmi("Adsiz sporcu");
        this.setSporcuTakim("takımsız sporcu"); 
        kartKullanildiMi = false;
    }

    public Sporcu(String Sporcuİsmi, String SporcuTakim) {
        this.setSporcuİsmi(Sporcuİsmi);
        this.setSporcuTakim(SporcuTakim);
        kartKullanildiMi = false;
    }

    // sporcu sınıflarında override edileceğinden
    // burada ne olduğunun önemi yok
    public int sporcuPuaniGoster() {
        return 0;
    }

    public String getSporcuİsmi() {

        return Sporcuİsmi;
    }

    public void setSporcuİsmi(String Sporcuİsmi) {
        this.Sporcuİsmi = Sporcuİsmi;
    }

    public String getSporcuTakim() {
        return SporcuTakim;
    }

    public void setSporcuTakim(String SporcuTakim) {
        this.SporcuTakim = SporcuTakim;
    }

    
}
