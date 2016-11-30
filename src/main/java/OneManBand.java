import java.util.Collection;
import java.util.Map;

/**
 * Created by vic on 30.11.16.
 */
public class OneManBand implements Performer{
    private Map<String, Instrument> instruments;

    public OneManBand() {
    }

    public void perform() throws PerformanceException {
        for (String key : instruments.keySet()) {
            System.out.println(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
    
}
