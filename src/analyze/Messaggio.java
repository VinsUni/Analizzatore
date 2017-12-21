package analyze;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Scanner;

/**
 * @author Vincenzo Plantone
 * @matricola 639371
 */
public class Messaggio implements Comparable<Object>, Serializable{

    private String messaggio;
    private int pericolosita;

    /**
     *
     * @param m
     * Messaggio param
     */
    @SuppressWarnings("all")
    public Messaggio(File m) {
        try (Scanner in = new Scanner(m)) {
            while (in.hasNext()) {
                messaggio += in.next();
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception " + e);
        } finally {
            pericolosita = 0;
        }
    }

    /**
     *
     * @return messaggio
     * Messaggio param
     */
    private String getMessaggio() {
        return messaggio;
    }

    /**
     *
     * @param messaggio
     * Messaggio param
     */
    @SuppressWarnings("unused")
    private void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    /**
     *
     * @return pericolosita
     * int param
     */
    private int getPericolosita() {
        return pericolosita;
    }

    /**
     *
     * @param pericolosita
     * int param
     */
    @SuppressWarnings("unused")
    private void setPericolosita(int pericolosita) {
        this.pericolosita = pericolosita;
    }

    /**
     *
     * @return String
     * toString() method override
     */
    @Override
    public String toString() {
        return "Messaggio{" +
                "messaggio='" + getMessaggio() + '\'' +
                ", pericolosità=" + getPericolosita() +
                '}';
    }

    /**
     *
     * @param o
     * o param
     * @return int
     * compareTo() method override
     */
    @Override
    public int compareTo(Object o) {
        if(o instanceof Messaggio){
            Messaggio m = (Messaggio) o;
            return -(this.getPericolosita()-m.getPericolosita());
        }
        return -1;
    }
}
