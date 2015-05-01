/**
 * Created by pooja on 4/30/15.
 */
public class ClarinetPlayer extends Musician {
    Clarinet myClarinet;

    public ClarinetPlayer(Clarinet myClar) {
        myClarinet = myClar;
    }

    public void toggle_reed() {
        myClarinet.reed = !myClarinet.has_reed();
    }

    @Override
    public String play_instrument() {
        return "la";
    }
}
