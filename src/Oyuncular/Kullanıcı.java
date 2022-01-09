package Oyuncular;

import Sporcu.Sporcu;

public class Kullanıcı extends Oyuncu
{
	public Kullanıcı()
	{
		super(0, "Kullanıcı", 0);
	}

	public Kullanıcı(int oyuncuID, String oyuncuAdi, int Skor)
	{
		super(oyuncuID, oyuncuAdi, Skor);
	}

	@Override
	public Sporcu kartSec(Sporcu kart)
	{
//		this.kartKullan(kart);

		return kart;
	}

    public void kartListesi(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}