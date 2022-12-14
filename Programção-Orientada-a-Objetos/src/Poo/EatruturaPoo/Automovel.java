package Poo.EatruturaPoo;
/*=========================================================================== */
//Arquivo para a demosntração da estrutura da Ptogramação Orientada a Objetos 
/*=========================================================================== */

//Classe
public class Automovel {
   
    //Atributos
    String cor;
    String modelo;
    int capacidadeTanque;


    // Construtor
    Automovel(){

    }

    Automovel(String cor, String modelo,  int capacidadeTanque ){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }
    // GETS E SETS

    void setCor (String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo (String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque( int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

     int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    //MÉTODO

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
