package com.an.biometric.sample;

import android.content.Context;

import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

// I got some information and codes from this website.
// https://www.programcreek.com/java-api-examples/?class=android.support.test.InstrumentationRegistry&method=getTargetContext

/**
    Instrumented test, which will execute on an Android device.

   @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
*/
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.an.biometric.sample", appContext.getPackageName());
    }
}