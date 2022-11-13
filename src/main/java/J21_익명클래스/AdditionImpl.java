package J21_익명클래스;

import java.util.Collection;

public class AdditionImpl<T> implements Addition<T> {

    @Override
    public T add(T value) {
        System.out.println(value + "데이터들을 합칩니다");
        return null;
    }

}
