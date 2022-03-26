package litmus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import org.telegram.messenger.R;
import org.telegram.messenger.TestableApplicationLoader;

import static com.google.common.truth.Truth.assertThat;

@RunWith(RobolectricTestRunner.class)
@Config(application = TestableApplicationLoader.class)
public class RobolectricJUnit4Test {
    @Test
    public void robolectric_is_setup() {
        // given
        TestableApplicationLoader application = (TestableApplicationLoader) RuntimeEnvironment.getApplication();

        // when
        String usernamePlaceholder = application.getString(R.string.UsernamePlaceholder);

        // then
        assertThat(usernamePlaceholder)
                .isEqualTo("Your Username");
    }
}
