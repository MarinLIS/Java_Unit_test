package src.seminars.homeworks.hw_3.task_1;
import org.junit.jupiter.api.Test;
import src.seminars.main.hw_3.EvenOddNumber;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class EvenOddNumberTest {

    @Test
    public void testIsEvenPositiveEvenNumber() {
        EvenOddNumber checker = new EvenOddNumber();
        assertThat(checker.evenOddNumber(4)).isTrue();
    }

    @Test
    public void testIsEvenPositiveOddNumber() {
        EvenOddNumber checker = new EvenOddNumber();
        assertThat(checker.evenOddNumber(7)).isFalse();
    }

    @Test
    public void testIsEvenZero() {
        EvenOddNumber checker = new EvenOddNumber();
        assertThat(checker.evenOddNumber(0)).isTrue();
    }

    @Test
    public void testIsEvenNegativeEvenNumber() {
        EvenOddNumber checker = new EvenOddNumber();
        assertThat(checker.evenOddNumber(-2)).isTrue();
    }

    @Test
    public void testIsEvenNegativeOddNumber() {
        EvenOddNumber checker = new EvenOddNumber();
        assertThat(checker.evenOddNumber(-3)).isFalse();
    }
}