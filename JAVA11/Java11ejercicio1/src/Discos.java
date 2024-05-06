public class Discos {
    
    private String artista;
    private String titulo;
    private int año;
    private double duración;

    public Discos(){

    }

    public Discos(String artista, String titulo, int año, double duración) {
        this.artista = artista;
        this.titulo = titulo;
        this.año = año;
        this.duración = duración;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getDuración() {
        return this.duración;
    }

    public void setDuración(double duración) {
        this.duración = duración;
    }

    @Override
    public String toString() {
        return
            "Artista: " + getArtista() + ", " +
            "Titulo: " + getTitulo() + ", " +
            "Año: " + getAño() + ", " +
            "Duración: " + getDuración() + ", ";
    }

}

