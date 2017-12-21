package analyze;

/**
 * @author Vincenzo Plantone
 * @matricola 639371
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Scanner;

/**
 * Class Messaggio
 */
public class Messaggio implements Comparable<Object>, Serializable{

    private String messaggio;
    private int pericolosità;

    /**
     *
     * @param m
     */
    public Messaggio(File m) {
        Scanner in = null;
        try {
            in = new Scanner(m);
            while(in.hasNext()){
                String parola = in.next();
                messaggio += in.next();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception " + e);
        } finally{
            in.close();
        }
    }

    /**
     *
     * @return messaggio
     */
    public String getMessaggio() {
        return messaggio;
    }

    /**
     *
     * @param messaggio
     */
    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    /**
     *
     * @return pericolosità
     */
    public int getPericolosità() {
        return pericolosità;
    }

    /**
     *
     * @param pericolosità
     */
    public void setPericolosità(int pericolosità) {
        this.pericolosità = pericolosità;
    }

    /**
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Messaggio{" +
                "messaggio='" + messaggio + '\'' +
                ", pericolosità=" + pericolosità +
                '}';
    }

    /**
     *
     * @param o
     * @return int
     */
    @Override
    public int compareTo(Object o) {
        if(o != null || o instanceof Messaggio){
            Messaggio m = (Messaggio) o;
            return -(this.getPericolosità()-m.getPericolosità());
        }
        return -1;
    }
}
