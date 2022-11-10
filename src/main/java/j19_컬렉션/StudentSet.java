package j19_컬렉션;

import java.util.*;

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

        // 1. 김혜진 학생의 학번을 출력하세요

        String searchName = "김혜진";

        for(Student student : students){
            if(student.getName().equals(searchName)){
                System.out.println("김혜진 학생의 학번: "+student.getId());
                break;
            }
        }
        // 2. 2022004 학번을 가진 학생의 이름을 설민수로 변경하세요.
        int searchId = 2022004;

        for(Student student : students){
            if(student.getId() == searchId){
                student.setName("설민수");
                break;
            }
        }

        // 3. 2022001 학번이 존재하면 해당 학생을 삭제하세요.
        searchId = 2022001;

        for(Student student : students){
            if(student.getId() == searchId){
                students.remove(student);
                break;
            }
        }
        System.out.println(students);

        // 4. 해당 list를 학번 순서에 맞게 정렬하시오

        int cmpID = 2022000;
        int j = 0;

        List<Student> sortedStudentList = new ArrayList<Student>();

        for(int i = 0; i < students.size()+1; i++){
                cmpID++;
            for(Student student : students){
                if(student.getId() == cmpID){
                    sortedStudentList.add(student);
                }
            }
        }
        // 2022001 보려면 위에 삭제 주석 처리 할 것
        System.out.println("---------------------정렬-----------------------");
        System.out.println(sortedStudentList);
    }
}
