package bridge.validate;

import bridge.exception.InvalidNumberFormatException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class validateNumberFormatTest {

    @DisplayName("숫자가 아닌 값이 들어오면 에러를 발생한다.")
    @Test
    void InputNumberByWrongFormat() {
        assertThatThrownBy(() -> validateNumberFormat.validate("123a45"))
                .isInstanceOf(InvalidNumberFormatException.class);
    }
}