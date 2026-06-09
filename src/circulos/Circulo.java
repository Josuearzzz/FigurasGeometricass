
package circulos;

import figurasgeometrica.FigGeo;

public class Circulo extends FigGeo {
    private double radio;
    private static final double PI=Math.PI;

    public double getRadio() {
        return radio;
    }

    public double getDiametro(){
       return radio*2; 
        
    }
    public static double getPI() {
        return PI;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public Circulo(double radio){
        this.radio=radio;
    }
    
    @Override
    public double calcularPerimetro(){
        this.perimetro=2*radio*PI;
        return perimetro;
    }
   
    
    @Override
     public double calcularArea(){
        this.area=Math.pow(radio, 2)*PI;
        return area;
    }
              
}
