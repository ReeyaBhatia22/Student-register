class student 
{
    int admission_no;
    String name;
    float percentage;
    student() {
       System.out.println("Student details");
       admission_no=6782;
       name="riya";
       percentage=92;
    }
    public void display_details() {
        System.out.println("Students admission number is:"+admission_no+" Students name is:"+name+" Students percentage is:"+percentage);
    }
}
class Main 
{
   public static void main(String[]args)
   {
    student S1 = new student();
    S1.display_details(); 
    
   }
}
    


