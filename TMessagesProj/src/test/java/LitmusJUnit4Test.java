import org.approvaltests.Approvals;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class LitmusJUnit4Test {
    @Test
    public void junit_4_vintage_engine_is_setup() {
        assertThat(true)
                .isTrue();
    }

    @Test
    public void approvals_is_setup() {
        Approvals.verify("Hello, JUnit 4!");
    }
}
