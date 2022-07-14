package com.itfactory.Dreptunghi;

public class Dreptunghi {
    public int Lungime;
    public int Latime;

    public Dreptunghi (int Lungime, int Latime)
    {
        this.Lungime = Lungime;
        this.Latime = Latime;
    }

    public int getLungime()
    {
        return Lungime;
    }

    public void setLungime(int lungime)
    {
        this.Lungime = lungime;
    }

    public int getLatime()
    {
        return Latime;
    }

    public void setLatime(int latime)
    {
        this.Latime = latime;
    }

    public int perimetruDreptunghi ()
    {
        return 2*(Lungime+Latime);
    }

    public int ariaDreptunghi ()
    {
        return Lungime*Latime;
    }
}


