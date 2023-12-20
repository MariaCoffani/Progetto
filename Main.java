import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MultaTutor c1 = new MultaTutor("Clio", "bv657mn", 5);//tempo in minuti
        MultaTutor c2 = new MultaTutor("Mercedes", "NB586MN", 40);
        MultaTutor c3 = new MultaTutor("Ypsilon10", "MN878798", 50);
        MultaTutor c4 =new MultaTutor("Clio");

        Scanner s =new Scanner(System.in);

        System.out.println("Dimmi la targa ");
        String targa = s.nextLine();
        c4.setTarga(targa);



        while (true) {
            try { //tenta di
                System.out.println("Dimmi il tempo ");
                double tempo = Double.parseDouble(s.nextLine()); //metodo statico che viene chiamato sulla classe Double
                c4.setTempo(tempo);
                break;
            } catch (NumberFormatException n) {
                System.out.println("Guarda che non hai inserito i numeri");
            }
        }

        //Posso fare anche cosi:
        //System.out.println(c1.Multare());

//

        if (c4.Multare()) {
            System.out.println("C4: Hai preso la multa di euro " + c4.ImportoMulta());
        } else {
            System.out.println("C4: Bravo, rispetti i limiti.");
        }

        System.out.println("C2: La tua velocità è " + c2.CalcoloVelocita());

        if (c1.Multare()) {
            System.out.println("C1 Hai preso la multa di euro " + c1.ImportoMulta());
        } else {
            System.out.println("C3 Bravo, rispetti i limiti.");
        }

        //Posso fare anche cosi: c3.ImportoMulta();


    }
}

