import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      
        Scanner myObj = new Scanner(System.in);
        System.out.println("Insira os dias do evento");
        String eventDate = myObj.nextLine();
        System.out.println("Insira as horas do evento");
        String eventHour = myObj.nextLine();
        System.out.println("Insira o ano do evento");
        String eventYear = myObj.nextLine();
        
        System.out.println("Evento dia: " + eventDate);
        System.out.println("Hora: " + eventHour);
        System.out.println("Ano: " + eventYear);
    }
}
