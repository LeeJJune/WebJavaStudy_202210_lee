package j22_람다;

@FunctionalInterface

public interface Operation {
    public int calc(int x, int y);
    // 메소드 2개를 정의 할 수 없다
//    public int calc2(int x, int y);

    // default 는 정의 할 수 있다
    public default String printResult(int result) {
        return "결과: "+ result;
    }
}
