package j09_클래스;

public class StudentMain {


    public static void main(String[] args) {

        Student total = new Student();
        Student total2 = new Student();


        total.schoolName = "부산대학교";
        total.studentYear = 20221010;
        total.school = 1;
        total.name = "김준일 \n";

        total2.schoolName = "경북대학교";
        total2.studentYear = 20220110;
        total2.school = 2;
        total2.name = "김준이 \n";



        for (int i = 0; i < 10; i++) {
            if (total.school <  5 && total2.school < 5) {
                total.increaseStudentYear();
                total2.increaseStudentYear();
            }
        }
//             else {
//                System.out.println("더이상 학년을 증가 할 수 없습니다");
//                break;
//            }
//            total.showStudentInfo();
        }
    }







