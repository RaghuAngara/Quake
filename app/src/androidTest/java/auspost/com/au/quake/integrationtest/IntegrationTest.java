package auspost.com.au.quake.integrationtest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import auspost.com.au.quake.R;
import auspost.com.au.quake.activities.QuakeMainActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static java.lang.Thread.sleep;

/**
 * Created by raghunandanangara on 6/10/2016.
 */

@RunWith(AndroidJUnit4.class)
public class IntegrationTest {

    @Rule
    public ActivityTestRule<QuakeMainActivity> quakeMainActivityTestRule = new ActivityTestRule<>(QuakeMainActivity.class);

    @Test
    public void TestMultipleActivities() throws Throwable
    {
        sleep(2000);
        onView(withId(R.id.recycler_view)).check(matches(isDisplayed()));
        sleep(2000);

        onView(withText("-25.3260")).perform(click());

        sleep(2000);
        onView(withId(R.id.map)).check(matches(isDisplayed()));
        sleep(2000);
    }
}
