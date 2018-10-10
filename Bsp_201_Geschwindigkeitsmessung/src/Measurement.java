
import java.io.Serializable;
import java.time.LocalDateTime;



public class Measurement implements Serializable{
private LocalDateTime datum;
private String kennzeichen;
private int gemessen,erlaubt;

    public LocalDateTime getDatum() {
        return datum;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public int getGemessen() {
        return gemessen;
    }

    public int getErlaubt() {
        return erlaubt;
    }

    public Measurement(LocalDateTime datum, String kennzeichen, int gemessen, int erlaubt) {
        this.datum = datum;
        this.kennzeichen = kennzeichen;
        this.gemessen = gemessen;
        this.erlaubt = erlaubt;
    }
    public int getÜbertretung(){
      if(erlaubt>gemessen){
          return 0;
      }
      else{
          return gemessen-erlaubt;
      }
    }
}
