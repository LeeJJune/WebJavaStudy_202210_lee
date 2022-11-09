package j19_컬렉션;

import java.util.HashSet;
import java.util.Set;

public class StudentSet {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<Student>();

        students.add(new Student(2022001, "김준일"));
        students.add(new Student(2022002, "정빈"));
        students.add(new Student(2022003, "김규민"));
        students.add(new Student(2022004, "박경효"));
        students.add(new Student(2022005, "김혜진"));
        students.add(new Student(2022006, "김지향"));

        System.out.println(students);

        /*
        * 1. 김혜진 학생의 학번을 출력하세요
        * 2. 2022004 학번을 가진 학생의 이름을 설민수로 변경하세요.
        * 3. 2022001 학번이 존재하면 해당 학생을 삭제하세요.
        *
        * ===============문제 다 푼 후 ======================
        *
        * set -> list 변환
        * 해당 list를 학번 순서에 맞게 정렬하시오.
        * */


    }
}
