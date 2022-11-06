package j09_클래스;

public class Student {

        int school;
        int studentYear;
        String schoolName;
        String name;

    void increaseStudentYear(){
//        if (school == 5 && school == 5) {
//            for (int i = 5; i != 0; i--){
//                school--;
//            }
//            System.out.println(studentYear+"\n"+schoolName+"\n"+school+"\n"+name);
//        }
        school++;
        System.out.println(studentYear+"\n"+schoolName+"\n"+school+"\n"+name);
        }
    void showStudentInfo(){
        System.out.println(studentYear+"\n"+schoolName+"\n"+school+"\n"+name);
    }

    }


