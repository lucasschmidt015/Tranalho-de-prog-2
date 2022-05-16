import java.util.ArrayList;
import java.util.Collections;

public class Numero{
    public ArrayList<Integer> list = new ArrayList<Integer>();
    public int maior, menor;
    
    
    
    public void calculaMenorEMaior(){
        
        

        Integer min = Collections.min(list);
        Integer max = Collections.max(list);
        this.maior = max;
        this.menor = min;

        System.out.printf("Menor: %d\nMaior: %d/n", this.menor, this.maior);
    }

}