package datatypes;
import static  org.hamcrest.CoreMatchers.equalTo;
import static  org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

public class WhenWorkingWithFloatingPointNumbers {

    @Test
    public void covertingCelciusToFarenheit(){
        final  double x = 1.8;
        final  int y = 32;
        double celciusValue =34.56;
        double farenheitValue = (celciusValue* x) + y;

        assertThat(farenheitValue,equalTo(94.208));

    }

    @Test
    public void covertingKilosToPounds(){
        final double factorVal = 2.2;
        double kiloValue =12.78;
        double poundValue = kiloValue * factorVal;

        assertThat(poundValue,equalTo(28.116));

    }
}
