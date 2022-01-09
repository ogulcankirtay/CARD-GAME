package Oyuncular;

import Sporcu.*;

public abstract class Oyuncu
{
	private int oyuncuID;
	private String oyuncuAdi;
	private int Skor;
	public Sporcu[] kartListesi = new Sporcu[8];

	public Oyuncu()
	{
		this.setOyuncuID(-1);
		this.setOyuncuAdi("Bilinmeyen");
		this.setSkor(0);
	}

	public Oyuncu(int oyuncuID, String oyuncuAdi, int Skor)
	{
		this();
		this.setOyuncuID(oyuncuID);
		this.setOyuncuAdi(oyuncuAdi);
		this.setSkor(Skor);
	}

	public int kartSayisi()
	{
		int count = 0;
		for (Sporcu kart : this.kartListesi)
		{
			if (kart != null && !kart.kartKullanildiMi)
				count++;
		}
		return count;
	}

	public boolean kartVarMi(Sporcu hedef)
	{
		if (kartSayisi() == 0)
			return false;

		for (Sporcu kart : this.kartListesi)
		{
			if (kart == null)
				continue;

			if (kart.getSporcuİsmi() == null ? hedef.getSporcuİsmi() == null : kart.getSporcuİsmi().equals(hedef.getSporcuİsmi()))
			{
				return !kart.kartKullanildiMi;
			}
		}

		return false;
	}



	
	public void kartKullan(Sporcu hedef)
	{
		if (kartSayisi() == 0)
			return;
		if (!kartVarMi(hedef))
			return;
		for (Sporcu kart : this.kartListesi)
		{
			if (kart.getSporcuİsmi() == null ? hedef.getSporcuİsmi() == null : kart.getSporcuİsmi().equals(hedef.getSporcuİsmi()))
			{
				System.out.println(this.getOyuncuAdi() + " " + hedef.getSporcuİsmi()+ " kartini kullandi.");
				

				break;
			}
		}
	}

	public int skorGoster()
	{
		return this.Skor;
	}

	public abstract Sporcu kartSec(Sporcu kart);

	public int getOyuncuID()
	{
		return oyuncuID;
	}

	public void setOyuncuID(int oyuncuID)
	{
		this.oyuncuID = oyuncuID;
	}

	public String getOyuncuAdi()
	{
		return oyuncuAdi;
	}

	public void setOyuncuAdi(String oyuncuAdi)
	{
		this.oyuncuAdi = oyuncuAdi;
	}

	public int getSkor()
	{
		return Skor;
	}

	public void setSkor(int skor)
	{
		Skor = skor;
	}

	public void addSkor(int skor)
	{
		Skor += skor;
		System.out.println(this.getOyuncuAdi() + " " + skor + " skor kazandi!");
	}
}