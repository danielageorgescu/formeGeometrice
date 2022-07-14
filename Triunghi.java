package com.itfactory.Triunghi;

public class Triunghi {
    private int latura1;
    private int latura2;
    private int latura3;

    public Triunghi (int latura1, int latura2, int latura3)
    {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
    }

    public int getLatura1()
    {
        return latura1;
    }

    public void setLatura1(int latura1)
    {
        this.latura1 = latura1;
    }

    public int getLatura2()
    {
        return latura2;
    }

    public void setLatura2(int latura2)
    {
        this.latura2 = latura2;
    }

    public int getLatura3()
    {
        return latura3;
    }

    public void setLatura3(int latura3)
    {
        this.latura3 = latura3;
    }

    public int perimetrulTriunghi (){
       return latura1+latura2+latura3;
    }

}
