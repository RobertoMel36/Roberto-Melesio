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
public class LLantas {
    private String Color;
        private int Tamanio;
        private String Material;
 public LLantas () {
    }
    public LLantas (String col, int tam, String mat){
        this.Color= col;
        this.Tamanio= tam;
        this.Material= mat;      
    }
    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
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

    
public void Rodar (){
    System.out.println("Rodando llantas");
}
}  

    
