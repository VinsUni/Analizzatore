package analyze;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Vincenzo Plantone
 * @matricola 639371
 */
public class AnalyzeFile{

    private Map<String, Integer> stringheSospette;
    private Rapporto rapporto;

    /**
     *
     * @param dizionario
     * read dizionario file
     */
    public AnalyzeFile(File dizionario){
        rapporto = new Rapporto();
        stringheSospette = new HashMap<>();
        try (Scanner in = new Scanner(dizionario)) {
            while (in.hasNext()) {
                String parola = in.next();
                int punteggio = Integer.parseInt(in.next());
                stringheSospette.put(parola, punteggio);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception " + e);
        }
    }

    /**
     *
     * @param m
     * m param
     */
    public void analisi(Messaggio m){
        int lunghezza = 0;
        int stringheSospette = 0;
        int punteggioTotale = 0;
        double punteggioMedio = 0;

    }


}
