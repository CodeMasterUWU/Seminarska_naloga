package com.example.seminarskanaloga;

public class Triangle {
    protected double x1, x2, x3, y1, y2, y3;
    public Triangle(double x1,double y1,double x2,double y2,double x3,double y3){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
    }
    public double izracunajStranicoA(){
        double a = Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
        return a;
    }
    public double izracunajStranicoB(){
        double b = Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
        return b;
    }
    public double izracunajstranicoC(){
        double c = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return c;
    }
    public double izracunajPloscino(){
        double c = izracunajstranicoC();
        double a = izracunajStranicoA();
        double b = izracunajStranicoB();
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public double izracunajObseg(){
        double obseg = Main.abc.getLast().izracunajStranicoA() + Main.abc.getLast().izracunajStranicoB() + Main.abc.getLast().izracunajstranicoC();
        return obseg;
    }
}
