package src.seminars.homeworks.hw_3.task_2;
import org.junit.jupiter.api.Test;
import src.seminars.main.hw_3.NumberInInterval;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumberInIntervalTest {

    @Test
    public void testNumberInIntervalPositiveBoundaryNumber() {
        NumberInInterval checker = new NumberInInterval();
        assertThat(checker.numberInInterval(26)).isTrue();
        assertThat(checker.numberInInterval(99)).isTrue();
    }

    @Test
    public void testNumberInIntervalNegativeBoundaryNumber() {
        NumberInInterval checker = new NumberInInterval();
        assertThat(checker.numberInInterval(25)).isFalse();
        assertThat(checker.numberInInterval(100)).isFalse();
    }
}
