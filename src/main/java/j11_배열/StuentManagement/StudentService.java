package j11_배열.StuentManagement;

import java.util.Scanner;

public class StudentService {

    private Scanner scanner;
    private StudentRepository studentRepository;

    public StudentService(Scanner scanner, StudentRepository studentRepository) {
        this.scanner = scanner;
        this.studentRepository = studentRepository;
    }

    public void registerStudent() {
        String name;
        int kor;
        int eng;
        int math;

        System.out.println("[학생 정보 등록]");
        System.out.println("이름: ");
        name = scanner.nextLine();
        System.out.println("국어: ");
        kor = scanner.nextInt();
        System.out.println("영어: ");
        eng = scanner.nextInt();
        System.out.println("수학: ");
        math = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(name, kor, eng, math);

        studentRepository.addStudent(student);
    }

    public void showStudents() {
        Student[] students = studentRepository.getStudents();

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student != null) {
                student.showStudentInfo();
            }
        }
    }

    private int indexOf() {
        String name;

        System.out.println("이름을 입력하세요:");
        name = scanner.nextLine();

        return studentRepository.findStudentName(name);
    }

    public void showStudent() {
        System.out.println("[학생 정보 이름으로 조회]");
        int index = indexOf();

        if (index == -1) {
            System.out.println("입력한 이름의 학생은 등록되어 있지 않습니다");
            return;
        }
        studentRepository.getStudent(index).showStudentInfo();
    }

    public void deleteStudent() {
        System.out.println("[학생 정보 이름으로 삭제]");
        int index = indexOf();

        if (index == -1) {
            System.out.println("입력한 이름의 학생은 등록되어 있지 않습니다");
            return;
        }
        studentRepository.removeStudent(index).showStudentInfo();
        System.out.println("삭제완료!");
        System.out.println();
    }

    public void modifyStudent() {
        System.out.println("[학생 정보 이름으로 수정]");
        int index = indexOf();
        int kor;
        int eng;
        int math;

        if (index == -1) {
            System.out.println("입력한 이름의 학생은 등록되어 있지 않습니다");
            return;
        }
        System.out.println("국어: ");
        kor = scanner.nextInt();
        System.out.println("영어: ");
        eng = scanner.nextInt();
        System.out.println("수학: ");
        math = scanner.nextInt();
        scanner.nextLine();

        Student updateStudent = new Student(null, kor, eng, math);
        studentRepository.updateStudent(index, updateStudent);
        System.out.println("수정 완료!");
    }
}