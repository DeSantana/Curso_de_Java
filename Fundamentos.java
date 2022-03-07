package fundamentos;

public class Fundamentos {

	public static void main(String[] args) {
		
     String nome = "João Victor de Santana"; 
     int  idade = 23;
     char sexo = 'M';
     double temperatura = 26.7;
     boolean arCondicionado = false;
     System.out.println("Uso de variáveis na linguagem Java");
     System.out.println("Exemplos");
     System.out.println("Nome: " + nome);
     System.out.println("Sexo: " + sexo);
     System.out.println("Temperatura " + temperatura);
     System.out.println("Ar condicionado " + arCondicionado);
     System.out.println("----------------------------------");
     System.out.println("");
     double i = 10; 
     System.out.println("Operadores Aritmétricos e Atribuições");
     System.out.println("Exemplos");
     System.out.println("i = " + i );
     System.out.println("i = " + i + " + 5 | i = " + (i + 5));
     System.out.println("i = " + i + " - 5 | i = " + (i - 5));
     System.out.println("i = " + i + " * 5 | i = " + (i * 5));
     System.out.println("i = " + i + " / 5 | i = " + (i / 5));
     System.out.println("i = " + i + " % 5 | i = " + (i % 5));
     System.out.println("i +=5        | i = " + (i +=5) );
     System.out.println("i -=5        | i = " + (i -=5) );
     System.out.println("i *=5        | i = " + (i *=5) );
     System.out.println("i /=5        | i = " + (i /=5) );
     i++;
     System.out.println("i++          | i = " + i  );
     i--;
     System.out.println("i--          | i = " + i  );
     System.out.println("----------------------------------");
     System.out.println("");
     System.out.println("ESTRUTURA DE CONTROLE");
     System.out.println("");
     System.out.println("Estruturas de controles condicional"); 
     System.out.println("");
     System.out.println("Exemplo 1 - Uso do 'If' ");
     if (sexo =='M') {
        System.out.println("Alistamento militar obrigatório");
	    }
        System.out.println("");
        System.out.println("Exemplo 2 - Uso do 'If - else' ");
        if (idade <18) {
           System.out.println("Menor de idade");  
        } else {
          System.out.println("Maior de idade");    
        }
        System.out.println("");
        System.out.println("Exemplo 3 - Uso do 'else- if -' ");
        if (idade <16) {
        	System.out.println("PROIBIDO VOTAR");	
        } else if (idade >= 18 && idade <=70) {
         System.out.println("VOTO OBRIGATÓRIO");	
        } else {
        	System.out.println("VOTO FACULTATIVO");
        	
        }
        System.out.println("");
        System.out.println("Exemplo 4 - Uso do 'switch case' ");
        System.out.println("1. Cadastro de clientes");
        System.out.println("2. Cadastro de usuários");
        System.out.println("3. Relatórios");
        int opcao = 1;
        switch (opcao) {
        case 1: 
        	System.out.println("Clientes");
        	break;
        case 2:
        	System.out.println("Usuários");
        	break;
        case 3:
        	System.out.println("Relatório");
        	break;
        default:
        	System.out.println("Opção Inválida");
        	break;
        }
      
        System.out.println("");
        System.out.println("Estruturas de Repetições"); 
        System.out.println("");
        System.out.println("Exemplo 5 - Uso do 'for' ");
        for (int j = 10; j > 0; j--) {
        	 System.out.println(j);
        }
        System.out.println("");
        System.out.println("Exemplo 6 - Uso do 'tabuada' ");
        for (int tabuada = 0; tabuada <= 10; tabuada++) {
        	System.out.println("");
         for (int valor = 0; valor <=10; valor++){
           System.out.println(tabuada + " x " + valor + " = " + 
         (tabuada * valor));
           
         }   
	   } 
        System.out.println("");
        System.out.println("Exemplo 7 - Uso da estrutura while");
        int contador = 1; 
        while (contador <=10) {
        	System.out.println(contador);
        	contador ++; 
        }
        System.out.println("");
        System.out.println("Exemplo 8 - Uso da estrutura 'do while' ");
        char novoJogo; 
        do {
        	System.out.println("Deseja jogar novamente (s/n)/?");
        	novoJogo = 'n';
        	
        } while (novoJogo == 's');
          System.out.println("GAME ME OVER ");
       
    }
  }
