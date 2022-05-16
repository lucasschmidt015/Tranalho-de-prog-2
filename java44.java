
import java.util.Scanner;


public class Exercicio {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int num = 0, maior = 0, menor = 999999, media = 0, soma = 0, primo = 0;
        int contMaior = 0, contMenor = 0, i = 0;
    
        System.out.println("Digite um número ou -1 para sair");
        num = ent.nextInt();
        
        while(num != -1){
            // armazena os nº digitados
            soma = soma + num;

            // armazena o maior nº
            if(num > maior){
                maior = num;
                contMaior++;
            }

    
            for (int j = 2; j < num; j++) {
                if (num % j == 0)
                    primo++;   
            }    
                
            // armazena o menor nº
            if(num < menor){
                menor = num;
                contMenor++;
            }   
            System.out.println("Digite um número ou -1 para sair");
            num = ent.nextInt();
            i += 1;
        } // fim for
        
        System.out.println("O maior nº digitado foi " + maior);
        System.out.println("O menor nº digitado foi " + menor);
        System.out.println("A média foi " + (media = soma / i));
        System.out.println("Quantidade de primos " + primo);
        
        
        
    }
} // fim class principal
