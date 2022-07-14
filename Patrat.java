package com.itfactory.Patrat;

public class Patrat {
    private int Latura;

    public Patrat(int latura)
    {
        this.Latura = latura;
    }

    public int getLatura()
    {
        return Latura;
    }

    public void setLatura(int latura)
    {
        Latura = latura;
    }

    public int perimetruPatrat()
    {
        return Latura*4;
    }

    public int ariaPatrat()
    {
        return Latura*Latura;
    }
}
