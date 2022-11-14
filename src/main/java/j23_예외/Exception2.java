package j23_예외;

//            e.printStackTrace();  //  어떤 예외 문제가 있는지 확인 하기 위한 명령어

public class Exception2 {

    public static void printArray(int[] numbers) throws Exception {

            for (int i = 0; i < numbers.length + 1; i++) {
                System.out.println("/" + numbers[i]);
            }
    }


    public static void main(String[] args) {

//        try {
//            printArray(new int[]{1, 2, 3, 4, 5, 6, 7});
//        } catch (Exception e) {
//            System.out.println(e.getMessage()); // 예외처리 경고 메세지 출력
//            e.printStackTrace();              // 어떤 예외 문제가 있는지 확인 하기 위한 명령어
//    }


        if(1 ==1) {
            try {
                throw new RuntimeException("예외 강제 생성");     // 예외를 강제로 생성하는 명령어
                } catch (ArrayIndexOutOfBoundsException e1){
                    System.out.println("런타임 예외 처리");
                } catch (Exception e2) {
                    e2.printStackTrace();
                } finally {
                    System.out.println("예외가 발생 하든 하지 않든 실행");
                }
            }
            System.out.println("프로그램 정상 종료");
        }
    }

