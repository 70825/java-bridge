package bridge.view;

import bridge.validate.validateNumberFormat;
import bridge.validate.validateStringFormat;
import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {
    public static final String READ_BRIDGE_SIZE_MESSAGE = "다리의 길이를 입력해주세요.";
    public static final String READ_MOVING_MESSAGE = "이동할 칸을 선택해주세요. (위: U, 아래: D)";
    public static final String READ_GAME_COMMAND_MESSAGE = "게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)";

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        System.out.println(READ_BRIDGE_SIZE_MESSAGE);
        String inputValue = Console.readLine();
        validateNumberFormat.validate(inputValue);
        return Integer.parseInt(inputValue);
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        System.out.println(READ_MOVING_MESSAGE);
        String inputValue = Console.readLine();
        validateStringFormat.validate(inputValue);
        return inputValue;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        System.out.println(READ_GAME_COMMAND_MESSAGE);
        String inputValue = Console.readLine();
        validateStringFormat.validate(inputValue);
        return inputValue;
    }
}
