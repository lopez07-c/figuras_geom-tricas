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
  private double diametro;
  private static final double PI=Math.PI ;

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return diametro;
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
    
    
    public double calcularDiametro(){
        this.diametro=radio*2;
        return diametro;
    }
    @Override
    public double calcularPerimetro() {
      this.perimetro=2*circulo.PI*this.radio;
      return perimetro;
    }
    @Override
    public double calcularArea(){
        this.area=Math.pow(radio,2)*circulo.PI;
                return area;
    }


}
