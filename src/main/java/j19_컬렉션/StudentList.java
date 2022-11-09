package j19_컬렉션;

import java.util.*;

public class StudentList {
    public static void main(String[] args) {


        List<Student> students = new ArrayList<Student>();


        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경효"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));


        String searchName = "김규민";

//        for(Student student : students){
//            if(student.getName().equals(searchName)){
//                System.out.println(searchName+"학생의 학번: "+student.getId());
//                break;
//            }
//        }
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getName().equals(searchName)) {
                System.out.println(searchName + "학생의 학번: " + students.get(i).getId());
                break;
            }
        }

        int searchId = 20220002;

        for (Student student : students) {
            if (student.getId() == searchId) {
                students.remove(students.indexOf(student));
                System.out.println("삭제된 학번: " + student);
                break;
            }
        }
        /*
         * ID = 20220003 학생을 찾아서 그 학생의 이름이 김규민이면 김경민으로 바꿔라
         * */
        int searchId2 = 20220003;
        for (Student student : students) {
            if (student.getId() == searchId2 && student.getName().equals("김규민")) {
                student.setName("김경민");
                break;
            }
        }
        System.out.println(students);

        /*
         * ID = 20220004 학생을 찾아서 그 학생의 이름이 박경효면 박창우으로 바꿔라
         * 단 Iterator 를 사용하여 변경하기
         * */
        int searchId3 = 20220004;

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == searchId3) {
                student.setName("박창우");
                break;
            }
        }
        System.out.println(students);


        /* 리스트 역순으로 정렬하기 */
        List<Student> reverse = new ArrayList<Student>();

        // for 문으로 순서 뒤집기 1
//        for(int i = 0; i < students.size(); i++) {
//            reverse.add(students.get(students.size() -1 - i));
//        }

        // for 문으로 순서 뒤집기 2
//        for(Student student : students){
//            reverse.add(0, student);
//        }
//
//        System.out.println(reverse);

        Collections.reverse(students);

        System.out.println(students);

        Collections.reverse(students);

        /* List 만들기
         * idList
         * nameList
         */

        List<Integer> idList = new ArrayList<Integer>();
        List<String> nameList = new ArrayList<String>();

        for (Student student : students) {
            idList.add(student.getId());
            nameList.add(student.getName());
        }

        System.out.println(idList);
        System.out.println(nameList);


        /* 분리된 ID, NAME 합치기 */
        students.clear();

        System.out.println(students);

            for (int i = 0; i < idList.size(); i++) {
                Student student= new Student(idList.get(i), nameList.get(i));
                students.add(student);
            }

            System.out.println(students);


        }

    }


