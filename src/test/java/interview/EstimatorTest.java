package interview;

import org.junit.jupiter.api.Test;

public class EstimatorTest {

    @Test
    public void testRounding() {
        // Should remain zero.
        assert Estimator.round(0.0) == 0;
        assert Estimator.round(0.2) == 0;

        // Should round up.
        assert Estimator.round(0.5) == 1;
        assert Estimator.round(0.7) == 1;
        assert Estimator.round(1.6) == 2;

        // Should round down.
        assert Estimator.round(0.1) == 0;
        assert Estimator.round(1.2) == 1;
        assert Estimator.round(2.3) == 2;

        // Test negatives.
        assert Estimator.round(-1.5) == -2;
        assert Estimator.round(-3.2) == -3;
        assert Estimator.round(-3.5) == -4;
    }
}
