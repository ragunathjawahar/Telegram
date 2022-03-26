import litmus.classes.Greeter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static com.google.common.truth.Truth.assertThat;
import static org.powermock.api.mockito.PowerMockito.doReturn;
import static org.powermock.api.mockito.PowerMockito.spy;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Greeter.class)
public class PowerMockJUnit4Test {
    @Test
    public void power_mock_is_setup() throws Exception {
        // given
        spy(Greeter.class);
        doReturn("Jane")
                .when(Greeter.class, "name");

        // when
        String greeting = Greeter.greet();

        // then
        assertThat(greeting)
                .isEqualTo("Hello, Jane!");
    }
}
