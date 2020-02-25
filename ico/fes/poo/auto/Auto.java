/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.auto;
import ico.fes.poo.Motor;
import ico.fes.poo.Llantas;
import ico.fes.poo.Chasis;
/**
 *
 * @author bongo
 */
public class Auto {
    private String Marca;
    private int Modelo;
    private String Color;
    private Llanta Tamanio;
    private Motor Potencia;
    private Chasis Material;
    public Auto() {
    }

    public Auto(String Marca, int Modelo, String Color, Llanta Tamanio, Motor Potencia, Chasis Material) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
        this.Tamanio = Tamanio;
        this.Potencia = Potencia;
        this.Material = Material;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    public void Avanzar (){
        System.out.println("Avanzando auto");
    }

    public Llanta getTamanio() {
        return Tamanio;
    }

    public void setTamanio(Llanta Tamanio) {
        this.Tamanio = Tamanio;
    }

    public Motor getPotencia() {
        return Potencia;
    }

    public void setPotencia(Motor Potencia) {
        this.Potencia = Potencia;
    }

    public Chasis getMaterial() {
        return Material;
    }

    public void setMaterial(Chasis Material) {
        this.Material = Material;
    }
    


