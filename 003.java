import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Insira os dias do evento");
        String eventDate = myObj.nextLine();
        
        System.out.println("Insira as horas do evento");
        float number = myObj.nextFloat();
        
        System.out.println("Insira o ano do evento");
        String eventYear = myObj.nextLine();
        
        System.out.println("Evento dia: " + eventDate);
        System.out.println("Hora: " + number);
        System.out.println("Ano: " + eventYear);
        
        if (number < 12 && number >= 00) {
            System.out.println("O horario eh AM ");
        }else{
            System.out.println("O horario eh PM: ");
        }
    }
}
