package datatypes;

import static  org.hamcrest.CoreMatchers.equalTo;
import static  org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;


public class WhenWorkingWithWholeNumbers {

    @Test
    public void addingNumbersTogether(){
        int intialValue =1985;
        int targetyear =0 ;
        int timeJump =30;
        targetyear = intialValue + timeJump ;
        assertThat(targetyear, equalTo(2015));

    }


}
