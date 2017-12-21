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
    Rapporto(){
        this(0, 0, 0, 0.0);
    }

    /**
     *
     * @param lunghezza
     * int param
     * @param stringheSospette
     * int param
     * @param punteggioTotale
     * int param
     * @param punteggioMedio
     * double param
     */
    private Rapporto(int lunghezza, int stringheSospette, int punteggioTotale, double punteggioMedio){
        this.lunghezza = lunghezza;
        this.stringheSospette = stringheSospette;
        this.punteggioTotale = punteggioTotale;
        this.punteggioMedio = punteggioMedio;
    }

    /**
     *
     * @return lunghezza
     * int param
     */
    private int getLunghezza() {
        return lunghezza;
    }

    /**
     *
     * @param lunghezza
     * int param
     */
    @SuppressWarnings("unused")
    private void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    /**
     *
     * @return stringheSospette
     * int param
     */
    private int getStringheSospette() {
        return stringheSospette;
    }

    /**
     *
     * @param stringheSospette
     * int param
     */
    @SuppressWarnings("unused")
    private void setStringheSospette(int stringheSospette) {
        this.stringheSospette = stringheSospette;
    }

    /**
     *
     * @return punteggioTotale
     * int param
     */
    private int getPunteggioTotale() {
        return punteggioTotale;
    }

    /**
     *
     * @param punteggioTotale
     * int param
     */
    @SuppressWarnings("unused")
    private void setPunteggioTotale(int punteggioTotale) {
        this.punteggioTotale = punteggioTotale;
    }

    /**
     *
     * @return punteggioMedio
     * double param
     */
    private double getPunteggioMedio() {
        return punteggioMedio;
    }

    /**
     *
     * @param punteggioMedio
     * double param
     */
    @SuppressWarnings("unused")
    private void setPunteggioMedio(double punteggioMedio) {
        this.punteggioMedio = punteggioMedio;
    }

    @Override
    public String toString() {
        return "Rapporto{" +
                "lunghezza=" + getLunghezza() +
                ", stringheSospette=" + getStringheSospette() +
                ", punteggioTotale=" + getPunteggioTotale() +
                ", punteggioMedio=" + getPunteggioMedio() +
                '}';
    }
}
