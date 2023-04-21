
package entidad;

public class Cadena {
    private String frase;
    private int longfrase;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longfrase = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongfrase() {
        return longfrase;
    }

    public void setLongfrase(int longfrase) {
        this.longfrase = longfrase;
    }
    
    
}
