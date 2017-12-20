package analyze; /**
 * @author Vincenzo Plantone
 * @matricola 639371
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Classe che permette l'analisi dei messaggi.
 */
public class AnalyzeFile{

    private Map<String, Integer> stringheSospette;
    private Rapporto rapporto;

    /**
     *
     * @param dizionario
     */
    public AnalyzeFile(File dizionario){
        rapporto = new Rapporto();
        stringheSospette = new HashMap<>();
        Scanner in = null;
        try{
            in = new Scanner(dizionario);
            while(in.hasNext()) {
                String parola = in.next();
                int punteggio = Integer.parseInt(in.next());
                stringheSospette.put(parola, punteggio);
            }
        }catch (FileNotFoundException e){
            System.out.println("Exception " + e);
        } finally {
            in.close();
        }
    }

    /**
     *
     * @param m
     */
    public void analisi(Messaggio m){
        int lunghezza = 0;
        int stringheSospette = 0;
        int punteggioTotale = 0;
        double punteggioMedio = 0;

    }


}
