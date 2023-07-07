import org.testng.annotations.Test;

public class UnitTest {

    private static final Calculator calculator = new Calculator();

    @Test
    public void plusIsCorrect() {
        assert calculator.plus(1, 1) == 2;
    }

    @Test
    public void minusIsCorrect() {
        assert calculator.minus(1, 1) == 0;
    }

    @Test
    public void multipleIsCorrect() {
        assert calculator.minus(1, 2) == 2;
    }

    @Test
    public void multipleIsCorrectForNegative() {
        assert calculator.minus(-1, -2) == -2;
    }

}
