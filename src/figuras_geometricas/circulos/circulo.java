/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras_geometricas.circulos;
import figuras_geometricas.Figuras;

/**
 *
 * @author UTN
 */

public class circulo extends Figuras {
  private double radio;
  
  private static final double PI=Math.PI ;

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return calcularDiametro();
    }

    public static double getPI() {
        return PI;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    } 

    public circulo(double radio) {
        this.radio = radio;
    }
    
    
    protected double calcularDiametro(){
        return radio*2;
    }
    @Override
    protected double calcularPerimetro() {       
      return  2*circulo.PI*radio ;
    }
    
     @Override
    protected double calcularArea(){
        return Math.pow(radio,2)*circulo.PI;
    }

    @Override
    public String toString() {
       return "circulo{Radio: " + radio +
         "diametro: " + getDiametro()+
          "Circurferencia: " + getPerimetro()+
                "area: " + getArea() + "\n}";
    }
        
        
    }


lado A
lado B
lado C
   
