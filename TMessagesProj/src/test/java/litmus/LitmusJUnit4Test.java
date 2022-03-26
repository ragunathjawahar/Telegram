package litmus;

import litmus.classes.Duck;
import org.approvaltests.Approvals;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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

    @Test
    public void mockito_is_setup() {
        // given
        Duck mockedDuck = mock(Duck.class);
        when(mockedDuck.quack()).thenReturn("Quack quack!");

        // when & then
        assertThat(mockedDuck.quack())
                .isEqualTo("Quack quack!");
    }
}
