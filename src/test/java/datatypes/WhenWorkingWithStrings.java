package datatypes;

import org.junit.Test;
import static  org.hamcrest.CoreMatchers.equalTo;
import static  org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithStrings {

    @Test
    public void convertingStringToUppercase(){
        String myString ="This is line one";
        String uppercaseMyString = myString.toUpperCase();

        assertThat(uppercaseMyString ,equalTo("THIS IS LINE ONE"));

    }

    @Test
    public void convertingStringToLowercase(){
        String myString ="This is line one";
        String lowercaseMyString = myString.toLowerCase();

        assertThat(lowercaseMyString ,equalTo("this is line one"));

    }


    @Test
    public void removeExtaSpaces(){

        String myString ="    This is Line One    ";
        String myStringwithoutSpaces = myString.trim();
        assertThat(myStringwithoutSpaces ,equalTo("This is Line One"));

    }


    @Test
    public void findLengthOfString(){
        String myString ="My Name";
        int lengthStr = myString.length();

        assertThat(lengthStr ,equalTo(7));

    }

    @Test
    public void replacingValuesInString(){
        String myString ="This is:Line:One";
        String newStr = myString.replace(":" ," ");

        assertThat(newStr ,equalTo("This is Line One"));

    }



}
