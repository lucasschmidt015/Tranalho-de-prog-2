import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        InfinitosInteiros num = new InfinitosInteiros();
        Scanner s = new Scanner(System.in);  
        System.out.println("Digite quantos numeros voce vai digitar: ");
        num.NumeroRegistros = s.nextInt();
        int i = 0;
        while(i<num.NumeroRegistros){
            System.out.println("Digite um numero: ");
            num.list.add(s.nextInt());
            
            i++;
        }
        
        num.buscarMaiorMenor();;
        num.calcMedia();
        
    }

}
