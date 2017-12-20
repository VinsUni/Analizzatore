package analyze;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Scanner;

public class Messaggio implements Comparable<Object>, Serializable{

    private String messaggio;
    private int pericolosità;

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

    public String getMessaggio() {
        return messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    public int getPericolosità() {
        return pericolosità;
    }

    public void setPericolosità(int pericolosità) {
        this.pericolosità = pericolosità;
    }

    @Override
    public String toString() {
        return "Messaggio{" +
                "messaggio='" + messaggio + '\'' +
                ", pericolosità=" + pericolosità +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        if(o != null || o instanceof Messaggio){
            Messaggio m = (Messaggio) o;
            return -(this.getPericolosità()-m.getPericolosità());
        }
        return -1;
    }
}
