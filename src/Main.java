import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Student Management App");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("PRESS 1 to ADD student");
            System.out.println("PRESS 2 to Delete student");
            System.out.println("Press 3 to display student");
            System.out.println("Press 4 to Update student");
            System.out.println("Press 5 to exit");
            int c = Integer.parseInt(br.readLine());
            if (c == 1) {
                //add student
                System.out.println("Enter name");
                String name = br.readLine();

                System.out.println("Enter phn");
                String phone = br.readLine();

                System.out.println("Enter city");
                String city = br.readLine();

                // create student obj
                Student st = new Student(name,phone,city);
                boolean ans=StudentDao.insertStudentIntoDb(st);
                if(ans){
                    System.out.println("student is added successfully");
                }
                else{
                    System.out.println("error occurred");
                }

            } else if (c == 2) {
                //delete student
                System.out.println("enter student id to delete");
                int userId=Integer.parseInt(br.readLine());
                boolean ans=StudentDao.deleteStudent(userId);
                if(ans){
                    System.out.println("student remove "+userId);
                }
                else{
                    System.out.println("error occurred");
                }


            } else if (c == 3) {
                //display students
                System.out.println("total students in the database\n");
                StudentDao.displayStudents();
            }
            else if (c == 4) {
                //update
                System.out.println("Enter student ID to update:");
                int id = Integer.parseInt(br.readLine());

                System.out.println("Enter new name:");
                String newName = br.readLine();

                System.out.println("Enter new phone:");
                String newPhone = br.readLine();

                System.out.println("Enter new city:");
                String newCity = br.readLine();
                boolean ans=StudentDao.updateStudent( id, newName, newPhone, newCity);
                if (ans) {
                    System.out.println("update successfull");
                }

            }
            else if(c==5){
                break;
            }


        }
        System.out.println("Thank You");
    }
}