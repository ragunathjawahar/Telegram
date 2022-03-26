import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

public class LitmusJUnit5Test {
    @Test
    void junit_5_is_setup() {
        assertThat(true)
                .isTrue();
    }
}
