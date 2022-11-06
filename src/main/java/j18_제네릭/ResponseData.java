package j18_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class ResponseData <T>{ // <T> 제네릭
    private String massage;
    private T data;
}
