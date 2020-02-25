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
public class Motor {
private String tamanio;
private int Potencia;
private String material;
    public Motor() {
    }

    public Motor(String tamanio, int Potencia, String material) {
        this.tamanio = tamanio;
        this.Potencia = Potencia;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getPotencia() {
        return Potencia;
    }

    public void setPotencia(int Potencia) {
        this.Potencia = Potencia;
    }
public void Arrancar (){
    System.out.println("Arrancando auto");
}
}
