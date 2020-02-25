/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author bongo
 */
public class Chasis {
  private int Tamanio;
    private String Material;
    private String Resistencia;  
    
    public Chasis() {
    }

    public Chasis(int Tamanio, String Material, String Resistencia) {
        this.Tamanio = Tamanio;
        this.Material = Material;
        this.Resistencia = Resistencia;
    }

    public int getTamanio() {
        return Tamanio;
    }

    public void setTamanio(int Tamanio) {
        this.Tamanio = Tamanio;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getResistencia() {
        return Resistencia;
    }

    public void setResistencia(String Resistencia) {
        this.Resistencia = Resistencia;
    }
    public void Sostener(){
        System.out.println("Sosteniendo Auto");    
    }
}

