package litmus;

import litmus.classes.Duck;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LitmusJUnit5Test {
    @Test
    void junit_5_is_setup() {
        assertThat(true)
                .isTrue();
    }

    @Test
    void approvals_is_setup() {
        Approvals.verify("Hello, JUnit 5!");
    }

    @Test
    public void mockito_is_setup() {
        // given
        Duck mockedDuck = mock(Duck.class);
        when(mockedDuck.quack()).thenReturn("Squeak squeak!");

        // when & then
        assertThat(mockedDuck.quack())
                .isEqualTo("Squeak squeak!");
    }
}
