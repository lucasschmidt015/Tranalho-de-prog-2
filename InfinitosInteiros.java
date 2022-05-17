import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class InfinitosInteiros {
    public ArrayList<Integer> list = new ArrayList<Integer>();
    public int Minimo, Maximo, NumeroRegistros,Media;


    public void buscarMaiorMenor()
    {

        Integer min = Collections.min(list);
        Integer max = Collections.max(list);
        this.Maximo = max;
        this.Minimo = min;

        System.out.printf("Menor: %d\nMaior: %d/n", this.Minimo, this.Maximo);
    }

    public void calcMedia()
    {
        int cont = 0;
        int soma = 0;
        while (cont < list.size())
        {
            soma += list.get(cont);
            cont ++;
        }
        int media = soma /NumeroRegistros;

        System.out.println("Media: " + media);
    }

}