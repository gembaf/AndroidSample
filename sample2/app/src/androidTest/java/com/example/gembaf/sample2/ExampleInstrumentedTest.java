package com.example.gembaf.sample2;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void nextPageTest() throws Exception {
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.subLabel)).check(matches(withText("SubPage")));
    }

    @Test
    public void returnPageTest() throws Exception {
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.returnButton)).perform(click());
        onView(withId(R.id.mainLabel)).check(matches(withText("MainPage")));
    }
}
