package auspost.com.au.quake.functionaltest;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import auspost.com.au.quake.R;
import auspost.com.au.quake.activities.QuakeMapsActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static java.lang.Thread.sleep;

/**
 * Created by raghunandanangara on 6/10/2016.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MapActivityTest {

    @Rule
    public ActivityTestRule<QuakeMapsActivity> quakeMapsActivityTestRule = new ActivityTestRule<>(QuakeMapsActivity.class, true, false);

    @Test
    public void testMapUI() throws Exception
    {
        Context context = InstrumentationRegistry.getInstrumentation().getTargetContext();
        Intent i = new Intent(context, QuakeMapsActivity.class);

        i.putExtra("latitude", "7.6413");
        i.putExtra("longitude", "93.6871");
        i.putExtra("region", "Nicobar Islands");
        quakeMapsActivityTestRule.launchActivity(i);

        onView(withId(R.id.map)).check(matches(isDisplayed()));
        sleep(2000);
    }
}
