
package andreangelo;


public class Vaga {
    private int id;
    private String status;
    private int andar;
    private int numero;
    private String latitude;
    private String longitude;
    
    public final int TAM_LATI_LONGI = 15;


    public Vaga(int id, String status, int andar, int numero, String latitude, String longitude) {
        this.id = id;
        this.status = status;
        this.andar = andar;
        this.numero = numero;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        if (andar >= 0)
            this.andar = andar;
        else
            throw new IllegalArgumentException("Andar inválido!");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        if (latitude.length() == TAM_LATI_LONGI)
            this.latitude = latitude;
        else
            throw new IllegalArgumentException("Latitude inválida!");
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        if (longitude.length() == TAM_LATI_LONGI)
            this.longitude = longitude;
        else
            throw new IllegalArgumentException("Longitude inválida!");
    }
    

}
