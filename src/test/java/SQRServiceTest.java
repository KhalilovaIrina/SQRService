import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/value.csv")
    public void test(int expected, int from, int before) {
        SQRService service = new SQRService();

        int actual = service.calcNumberOfSquare(from, before);

        Assertions.assertEquals(expected, actual);
    }

}
