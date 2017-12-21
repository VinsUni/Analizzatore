package main;

/**
 * @author Vincenzo Plantone
 * @matricola 639371
 */

import analyze.AnalyzeFile;
import analyze.Messaggio;

import java.io.File;
import java.util.Arrays;

/**
 * Main class
 */
public class TestMain {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

         // l’uso della linea di comando per indicare i messaggi da analizzare (main())
        final int MEX = 7;
        Messaggio[] messages = new Messaggio[MEX];
        AnalyzeFile a = new AnalyzeFile(new File(args[0]));


        // il calcolo della pericolosità dei messaggi analizzati

        for(int i = 0; i < MEX; i++){
            messages[i] = new Messaggio(new File(args[i+1]));
            a.analisi(messages[i]);
        }

        // l’ordinamento dei messaggi in base alla pericolosità (non crescente)
        Arrays.sort(messages);
        for(Messaggio m: messages){
            System.out.println(m);
        }

        // oltre alla stampa a video, la scrittura su 1le rapporto.txt di un rapporto generale sull’intera lista di
        // messaggi (mantenendo l’ordine di cui al punto precedente)


    }
}
