package analyze;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Messaggio {

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
}
