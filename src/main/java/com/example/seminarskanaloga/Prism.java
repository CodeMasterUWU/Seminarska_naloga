package com.example.seminarskanaloga;

public class Prism extends Triangle{
    double visina;
    public void setVisina(double visina) {
        this.visina = visina;
    }
    public Prism(double x1, double y1, double x2, double y2, double x3, double y3, double v) {
        super(x1, y1, x2, y2, x3, y3);
        visina=v;
    }
    public double izracunajVolumen(){
        double volumen = izracunajPloscino() * visina;
        return volumen;
    }
    public double izracunajPovrsino(){
        double povrsina = super.izracunajPloscino()*2 + super.izracunajObseg() * visina;
        return povrsina;
    }
}
