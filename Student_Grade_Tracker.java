
import java.util.Scanner;

public class Student_Grade_Tracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("WELCOME IN STUDENT GRADE TRACKER.");
        System.out.println();

//        Taking number of student
        System.out.print("Enter the number of student: ");
        int num=sc.nextInt();
        double grade[]=new double[num];
        String name[]=new String[num];

        for(int i=0;i<grade.length;i++){
            System.out.printf("Enter the name of student-%d: ",i+1);
            name[i]=sc.next();
        }
        System.out.println();
//        input grade of student into an array
        for(int i=0;i<grade.length;i++){
            System.out.print("Enter the grade of "+name[i]+": ");
            grade[i]=sc.nextDouble();
        }

//        Calculate avarage of grade
        double temp=0;
       for(double e:grade){
           temp=temp+e;
       }
       double average=temp/grade.length;

//       Find highest and lowest score
        double high=grade[0];
        String hname=name[0];
        for(int i=0;i<grade.length;i++){
            if(grade[i]>high){
                high=grade[i];
                hname=name[i];
            }
        }
        double low=grade[0];
        String lname=name[0];
        for(int i=0;i<grade.length;i++){
            if(grade[i]<low){
                low=grade[i];
                lname=name[i];
            }
        }

        //final answer
        System.out.println();
        System.out.println("The average of grade is: "+average);
        System.out.printf("%s get the highest grade with %.2f\n",hname,high);
        System.out.printf("%s get the lowest grade with %.2f",lname,low);


    }
}
