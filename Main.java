import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);  

        Numero num = new Numero();
        int i = 0;
        while(i<19){
            System.out.println("Digite um numero: ");
            num.list.add(s.nextInt());
            
            i++;
        }
        
        num.calculaMenorEMaior();
        
    }

}
