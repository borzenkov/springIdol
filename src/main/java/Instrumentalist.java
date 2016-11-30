/**
 * Created by vic on 30.11.16.
 */
public class Instrumentalist implements Performer {
    private String song;

    public Instrumentalist() {
    }

    public void perform() throws PerformanceException {
        System.out.println("Playing " + song + " : ");
        instrument.play();
    }


    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }
    public String screamSong() {
        return song;
    }
    private Instrument instrument;
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
