package analyze;

/**
 * @author Vincenzo Plantone
 * @matricola 639371
 */
public class Rapporto {

    private int lunghezza;
    private int stringheSospette;
    private int punteggioTotale;
    private double punteggioMedio;

    /**
     * Default constructor
     */
    public Rapporto(){
        this(0, 0, 0, 0.0);
    }

    /**
     *
     * @param lunghezza
     * @param stringheSospette
     * @param punteggioTotale
     * @param punteggioMedio
     */
    public Rapporto(int lunghezza, int stringheSospette, int punteggioTotale, double punteggioMedio){
        this.lunghezza = lunghezza;
        this.stringheSospette = stringheSospette;
        this.punteggioTotale = punteggioTotale;
        this.punteggioMedio = punteggioMedio;
    }

    /**
     *
     * @return lunghezza
     */
    public int getLunghezza() {
        return lunghezza;
    }

    /**
     *
     * @param lunghezza
     */
    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    /**
     *
     * @return stringheSospette
     */
    public int getStringheSospette() {
        return stringheSospette;
    }

    /**
     *
     * @param stringheSospette
     */
    public void setStringheSospette(int stringheSospette) {
        this.stringheSospette = stringheSospette;
    }

    /**
     *
     * @return punteggioTotale
     */
    public int getPunteggioTotale() {
        return punteggioTotale;
    }

    /**
     *
     * @param punteggioTotale
     */
    public void setPunteggioTotale(int punteggioTotale) {
        this.punteggioTotale = punteggioTotale;
    }

    /**
     *
     * @return punteggioMedio
     */
    public double getPunteggioMedio() {
        return punteggioMedio;
    }

    /**
     *
     * @param punteggioMedio
     */
    public void setPunteggioMedio(double punteggioMedio) {
        this.punteggioMedio = punteggioMedio;
    }

    @Override
    public String toString() {
        return "Rapporto{" +
                "lunghezza=" + lunghezza +
                ", stringheSospette=" + stringheSospette +
                ", punteggioTotale=" + punteggioTotale +
                ", punteggioMedio=" + punteggioMedio +
                '}';
    }
}
