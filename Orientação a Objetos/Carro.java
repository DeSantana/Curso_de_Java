package POO;

import java.util.Random;

public class Carro {
//atributos
  int ano; 
  String cor; 
  
//construtor
    public Carro () {
    //Gerador de Números aleatórios 	
    Random gerador = new Random ();	
    int chassi = gerador.nextInt(1000);
    System.out.println("Chassi: " + chassi);	
    	
    }
    
    public Carro (int ano, String cor) {
    this.ano = ano;
    this.cor = cor; 
    	
    }
    
 // metodos
    
    void ligar () {
    	System.out.println("engine ON ..........");
    }
    
    void desligar () {
    	System.out.println("engine OFF");
    	
    }
    
    void acelerar () {
    	System.out.println("Vruuuuummmmm");
    	
   }
}
