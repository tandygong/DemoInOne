package com.ymbank.demoinone;


import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.swipeDown;
import static androidx.test.espresso.action.ViewActions.swipeUp;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withChild;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.startsWith;

import androidx.test.espresso.Espresso;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class ScrollingActivityTest {

    @Rule
    public ActivityTestRule<ScrollingActivity> mActivityTestRule = new ActivityTestRule<>(ScrollingActivity.class);

    @Test
    public void scrollingActivityTest() {
        //  onView(withChild(withId(R.id.tv_content))).perform(swipeUp());
        onView(withId(R.id.tv_content)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_content)).check(matches(withText(startsWith("Material is the metaphor"))));
    }
}
