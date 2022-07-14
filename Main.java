package com.itfactory;

import com.itfactory.Dreptunghi.Dreptunghi;
import com.itfactory.Patrat.Patrat;
import com.itfactory.Triunghi.Triunghi;

public class Main {

    public static void main(String[] args) {

        Triunghi triunghi = new Triunghi(5,8,9);
        Patrat patrat = new Patrat(9);
        Dreptunghi dreptunghi = new Dreptunghi(5,8);

        System.out.println("TRIUNGHI:");
        System.out.println("Perimetrul triunghiului este: " + triunghi.perimetrulTriunghi());
        System.out.println(" ");
        System.out.println("PATRAT:");
        System.out.println("Perimetrul patratului este: " + patrat.perimetruPatrat());
        System.out.println("Aria patratului este: " + patrat.ariaPatrat());
        System.out.println(" ");
        System.out.println("DREPTUNGHI:");
        System.out.println("Perimetrul dreptunghiului este: " + dreptunghi.perimetruDreptunghi());
        System.out.println("Aria dreptunghiului este: " + dreptunghi.ariaDreptunghi());
    }
}
