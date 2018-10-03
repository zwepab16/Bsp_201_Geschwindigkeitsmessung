
import java.time.LocalDateTime;



public class Measurement {
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
}
