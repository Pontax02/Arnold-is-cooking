package edu.estatuas;

public enum Planeta {

    MERCURY(3.303e+23,2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27,   7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7)
    ;

    private final double gravity =  6.67400e-11;

    private double masa;
    private double radio;
    private double gravedadSuperficie;
    private  Planeta (double masa , double radio){
        this.masa = masa;
        this.radio = radio;
    }

    public double getMasa(){
        return this.masa;
    }
    public double getRadio(){
        return this.radio;
    }

    public double pesoSuperficie(double peso){
        calcularGravedad(MERCURY);
        return this.gravedadSuperficie * masaHumano(peso);


    }
    public double calcularGravedad(Planeta planeta){
        gravedadSuperficie = gravity * (planeta.getMasa()/(planeta.getRadio()*planeta.getRadio()));
        return gravedadSuperficie;
    }

    public double masaHumano(double peso){
        return peso / calcularGravedad(EARTH);
    }

}
