import java.util.Collection;

/**
 * Created by vic on 30.11.16.
 */
public class OneManBand implements Performer{
    private Collection<Instrument> instruments;

    public OneManBand() {
    }

    public void perform() throws PerformanceException {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}
