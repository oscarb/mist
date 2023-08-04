package se.oscarb.uritomovie

import org.junit.Assert.assertTrue
import org.junit.Test
import se.oscarb.uritomovie.Greeting

class AndroidGreetingTest {

    @Test
    fun testExample() {
        assertTrue("Check Android is mentioned", Greeting().greet().contains("Android"))
    }
}