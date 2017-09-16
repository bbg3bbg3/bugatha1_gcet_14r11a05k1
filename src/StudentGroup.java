import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

    private Student[] students;
    int index,age;
    Date date,firstDate,lastDate;
    int days;
    
    /**
     * DO NOT remove or change this constructor, it will be used during task check
     * @param length
     */
    public StudentGroup(int length) {
        this.students = new Student[length];
    }

    @Override
    public Student[] getStudents() {
        // Add your implementation here
        return students;
        //return null;
    }

    @Override
    public void setStudents(Student[] students) throws IllegalArgumentException{
        // Add your implementation here
        if(students!=null)
        {
            this.students=students;
        }
    }

    @Override
    public Student getStudent(int index) throws IllegalArgumentException{
        // Add your implementation here
        if(index>0||index<=students.length) {
            this.index=index;
        }
        return students[index];
    }

    @Override
    public void setStudent(Student student, int index) throws IllegalArgumentException {
        // Add your implementation here
        if(students!=null)
        {
            if(index>0||index<=students.length) {
                this.students[index]=students[index];
            }
        }
        
    }

    @Override
    public void addFirst(Student student) throws IllegalArgumentException{
        // Add your implementation here
        if(student==null) {
            //this.students=students;
        }
        
    }

    @Override
    public void addLast(Student student) throws IllegalArgumentException{
        // Add your implementation here
        if(student==null) {
            //this.students=students;
        }
    }

    @Override
    public void add(Student student, int index) throws IllegalArgumentException{
        // Add your implementation here
        if(student!=null) {
            
            if(index>0||index<=students.length) {
                students[index]=student;
            }
        }
    }

    @Override
    public void remove(int index) throws IllegalArgumentException{
        // Add your implementation here
        if(index>0||index<=students.length)
        {
            index=0;
        }
    }

    @Override
    public void remove(Student student) throws IllegalArgumentException{
        // Add your implementation here
        if(student!=null) {
            System.out.println("Student not exist");
            student=null;
        }
    }

    @Override
    public void removeFromIndex(int index) throws IllegalArgumentException{
        // Add your implementation here
        if(index>0||index<=students.length)
        {
            students[index]=null;
        }
    }

    @Override
    public void removeFromElement(Student student) throws IllegalArgumentException{
        // Add your implementation here
        if(student!=null)
        {
            student=null;
        }
    }

    @Override
    public void removeToIndex(int index) throws IllegalArgumentException{
        // Add your implementation here
        if(index>0||index<=students.length) {
            index=0;
        }
    }

    @Override
    public void removeToElement(Student student) throws IllegalArgumentException{
        // Add your implementation here
        if(student!=null)
        {
            student=null;
        }
    }

    @Override
    public void bubbleSort() {
        // Add your implementation here
        for(int i=0;i<students.length;i++)
        {
            for(int j=i;j<students.length;j++)
            {
                if(students[i].compareTo(students[i-1])<0)
                {
                    Student t=students[i-1];
                    students[i-1]=students[i];
                    students[i]=t;
                }
            }
        }
    }

    @Override
    public Student[] getByBirthDate(Date date) throws IllegalArgumentException{
        // Add your implementation here
        if(date!=null)
        {
            this.date=date;
        }
        //return null;
        return students;
    }

    @Override
    public Student[] getBetweenBirthDates(Date firstDate, Date lastDate)throws IllegalArgumentException {
        // Add your implementation here
        if(firstDate!=null||lastDate!=null)
        {
            this.firstDate=firstDate;
            this.lastDate=lastDate;
        
        }
        return students;
    }

    @Override
    public Student[] getNearBirthDate(Date date, int days) throws IllegalArgumentException{
        // Add your implementation here
        if(date!=null)
        {
            this.date=date;
            this.days=days;
        }
        
        return students;
    }

    @Override
    public int getCurrentAgeByDate(int indexOfStudent) {
        // Add your implementation here
        
        return age;
    }

    @Override
    public Student[] getStudentsByAge(int age) {
        // Add your implementation here
        this.age=age;
        
        return students;
    }

    @Override
    public Student[] getStudentsWithMaxAvgMark() {
        // Add your implementation here
        
        return students;
    }

    @Override
    public Student getNextStudent(Student student) {
        // Add your implementation here
        if(student!=null)
        {
            index=index+1;
        }
        return students[index];
    }
}

