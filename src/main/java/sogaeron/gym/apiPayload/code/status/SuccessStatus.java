package sogaeron.gym.apiPayload.code.status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import sogaeron.gym.apiPayload.code.BaseCode;
import sogaeron.gym.apiPayload.code.ReasonDTO;

@Getter
@AllArgsConstructor
/**
 * API 응답 통일 관련 클래스
 */
public enum SuccessStatus implements BaseCode {

    //일반적인 응답
    _OK(HttpStatus.OK,"COMMON200","성공입니다.");


    //~~~관련응답


    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    @Override
    public ReasonDTO getReason() {
        return ReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(true)
                .build();
    }

    @Override
    public ReasonDTO getReasonHttpStatus() {
        return ReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(true)
                .httpStatus(httpStatus)
                .build();
    }
}