public class MultaTutor {
    private String Automobile;
    private String Targa;
    private double Tempo=0;
    //private double VelocitaAuto;

    public static final double VelocitaLimite = 110;
    //km/h
    public static final double Spazio = 20;
    //km
    public static final double ImportoKm = 10;


    public MultaTutor(String automobile, String targa, double tempo) {
        this.Automobile = automobile;
        this.Targa = targa;
        this.Tempo = tempo;
    }

    public MultaTutor(String automobile) {
        this.Automobile =automobile;


    }

    public String getAutomobile() {
        return Automobile;
    }

    public void setAutomobile(String automobile) {
        Automobile = automobile;
    }

    public String getTarga() {
        return Targa;
    }

    public void setTarga(String targa) {
        Targa = targa;
    }

    public double getTempo() {
        return Tempo;
    }

    public void setTempo(double tempo) {
        Tempo = tempo;
    }


    public String toString() {
        return ("La targa= è " + Targa + " il tempo è " + Tempo);
    }

    public boolean Multare() {
        if (CalcoloVelocita() > VelocitaLimite) {
            return true;
        } else {
            return false;
        }
    }
//eventualmente try catch o controllare che il tempo non sia 0
    public double CalcoloVelocita() {
       // double v = 0;
        return (Spazio * 60 / Tempo) ;
    }
    //in ore
//importoMulta    – ritorna il valore della multa da sanzionare


    public double ImportoMulta() {

        return (CalcoloVelocita()-VelocitaLimite) * ImportoKm;

    }

}








