
import java.util.Scanner;


public class Java44 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        double num = 0, maior = 0, menor = 999999, media = 0, soma = 0, primo = 0;
        int contMaior = 0, contMenor = 0, i = 0;
        
        System.out.println("Digite o numero de registros: ");
        int NumeroRegistros = ent.nextInt();
        double[] array = new double[NumeroRegistros];
        for(int g = 0; g < NumeroRegistros; g++)
        {
            System.out.println("Digite um número: ");
            num = ent.nextDouble();
            array[g] = num;
            
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
            
        
    } // fim for
        
        int k = 0;

        while(k<NumeroRegistros)
        {
            System.out.print(array[k]+ ",");
            k++;
        }

        System.out.println("\nO maior nº digitado foi " + maior);
        System.out.println("O menor nº digitado foi " + menor);
        System.out.println("A média foi " + (media = soma / NumeroRegistros));
        System.out.println("Quantidade de primos " + primo);
        
        
        
    }
} // fim class principal