import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class BirdSanctuaryTest {

    @Test
    public void addTestBird() throws BirdSanctuaryAddException {
        BirdsSanctuary birdsSanctuary= BirdsSanctuary.getInstance();

        //boolean result = birdsSanctuary.add(null);
        Penguine penguine = new Penguine();
        birdsSanctuary.add(penguine);
        int count = penguine.getCount();
        Assertions.assertEquals(1, count);
    }

    @Test
    public void addTestBirdfalse() throws BirdSanctuaryAddException {
        ExpectedException exceptionRule = ExpectedException.none();
        exceptionRule.expect(BirdSanctuaryAddException.class);
        BirdsSanctuary birdsSanctuary= BirdsSanctuary.getInstance();
        birdsSanctuary.add(null);
    }


}
