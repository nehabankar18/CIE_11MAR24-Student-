public class StudentCourse extends student{
    static String course[]={"devops","c#","Machine Learning"};
    static int marks[]={20,18,16};
    public static void display_marks(){
        for(int i=0;i<course.length;i++)
        for(int j=0;j<marks.length;j++){
            System.out.println(course[i]+"="+marks[j]);
          }
        
    }
    public static void main(String[] args) {
        display();
        display_marks();
    }
}

