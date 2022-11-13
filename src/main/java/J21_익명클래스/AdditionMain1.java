package J21_익명클래스;

public class AdditionMain1 {
    public static void main(String[] args) {

        Addition<String> stringAddition = new AdditionImpl<String>();

        String str = stringAddition.add("문자열");
        System.out.println(str);

        // 임시 클래스 생성 (해당 클래스를 1번정도만 쓸때) -- 클래스의 이름이 없다
        Addition<Integer> intAddition = new AdditionImpl<Integer>() {

            @Override
            public Integer add(Integer values) {
                return null;
            }
        };
    }
}
