/**
 * @author Rich Smith at ZenOfProgramming.com
 */
class Student
{
   public Student ()
   {

   }

   public Student (String name)
   {
      this.name = name;

   }
   public String name;
   public int StudentID;



   public String getName ()
   {
      return name;
   }

   public void setName (String name)
   {
      this.name = name;
   }

   public int getStudentID ()
   {
      return StudentID;
   }

   public void setStudentID (int StudentID)
   {
      this.StudentID = StudentID;
   }



}
