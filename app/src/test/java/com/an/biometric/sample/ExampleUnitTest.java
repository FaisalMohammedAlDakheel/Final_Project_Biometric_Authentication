package com.an.biometric.sample;

import org.junit.Test;

import static org.junit.Assert.*;

// I got some information and codes from this book.
// https://books.google.com.sa/books?id=10pODAAAQBAJ&pg=PA98&lpg=PA98&dq=public+void+addition_isCorrect()+%7B+++++++++assertEquals(4,+2+%2B+2);+++++%7D&source=bl&ots=qLL3kDzM8J&sig=ACfU3U1UPf8cQFb_VJHjVpLI132u2Ic7Iw&hl=en&sa=X&ved=2ahUKEwjH3NWe-c_oAhWTA2MBHXf2DhUQ6AEwAXoECAsQLw#v=onepage&q=public%20void%20addition_isCorrect()%20%7B%20%20%20%20%20%20%20%20%20assertEquals(4%2C%202%20%2B%202)%3B%20%20%20%20%20%7D&f=false

/**
   Example local unit test, which will execute on the development machine (host).

   @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
*/
public class ExampleUnitTest {
    // The assertEquals method is a static method in the Assert class.

    // Note(the static method in the Assert class, import of all static methods in that class).
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}