package com.example.gembaf.sample1;

import static android.support.test.espresso.Espresso.onView;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void before() {
        onView(withId(R.id.lhs)).perform(typeText("12"));  // 左辺
        onView(withId(R.id.rhs)).perform(typeText("3"));   // 右辺
    }

    // 足し算
    @Test
    public void addTest() throws Exception {
        onView(withId(R.id.add)).perform(click());
        onView(withId(R.id.myButton)).perform(click());
        onView(withId(R.id.resultTextView)).check(matches(withText("15")));
    }

    // 引き算
    @Test
    public void subTest() throws Exception {
        onView(withId(R.id.sub)).perform(click());
        onView(withId(R.id.myButton)).perform(click());
        onView(withId(R.id.resultTextView)).check(matches(withText("9")));
    }

    // 掛け算
    @Test
    public void mltTest() throws Exception {
        onView(withId(R.id.mlt)).perform(click());
        onView(withId(R.id.myButton)).perform(click());
        onView(withId(R.id.resultTextView)).check(matches(withText("36")));
    }

    // 割り算
    @Test
    public void divTest() throws Exception {
        onView(withId(R.id.div)).perform(click());
        onView(withId(R.id.myButton)).perform(click());
        onView(withId(R.id.resultTextView)).check(matches(withText("4")));
    }
}
