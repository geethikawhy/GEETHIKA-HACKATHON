class Studentroll
{
public static void main (String [] args )
{
int student [] = {100, 101,102, 103 ,104, 105 };
student[0] = 100;
student[1] = 101;
student[2] = 102;
student[3] = 103;
student[4] = 104;

System.out.println("3rd student roll number : " +student[2]);
System.out.println("the size of the array is : " + student.length);

for (int i=0; i<student.length; i++ )
{
    System.out.println( i+"student roll number : " +student[i]);
}



}
}