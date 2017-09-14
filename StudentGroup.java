import java.util.Date;
import java.util.*;

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
		return this.students.length;
	}

	@Override
	public void setStudents(Student[] students) throws IllegalArgumentException{
		// Add your implementation here
		if(students ==null)
		      throw new IllegalArgumentException();
		else{
		      this.StudentGroup(students.length);
		      this.students=students;
		      
		}
	}

	@Override
	public Student getStudent(int index) throws IllegalArgumentException {
		// Add your implementation here
		if(index<0 || index>=this.students.length)
		      throw new IllegalArgumentException();
		else
		      return this.students[index];
		return null;
	}

	@Override
	public void setStudent(Student student, int index) throws IllegalArgumentException{
		// Add your implementation here
		if(index<0 || index>=this.students.length)
		      throw new IllegalArgumentException();
		else
		      this.students[index]=student;
	}

	@Override
	public void addFirst(Student student) throws IllegalArgumentException{
		// Add your implementation here
		if(index<0 || index>=this.students.length)
		      throw new IllegalArgumentException();
		else
		      this.students[0]=student;
	}

	@Override
	public void addLast(Student student) throws IllegalArgumentException{
		// Add your implementation here
		if(index<0 || index>=this.students.length)
		      throw new IllegalArgumentException();
		else
		      this.students[this.students-1]=student;
	}

	@Override
	public void add(Student student, int index) throws IllegalArgumentException{
		// Add your implementation here
		if(index<0 || index>=this.students.length)
		      throw new IllegalArgumentException();
		else
		{
		      Student[] s;
		      s=this.students;
		      this.StudentGroup(this.students.length+1);
		      for(int i=0;i<index;i++)
		      {
		            this.students[i]=s[i];
		      }
		      this.students[index]=student;
		      for(int i=index+1;i<this.length;i++)
		      {
		            this.students[i]=s[i-1];
		      }
		}
		
	}

	@Override
	public void remove(int index)  throws IllegalArgumentException{
		// Add your implementation here
		if(index<0 || index>=this.students.length)
		      throw new IllegalArgumentException();
		else
		{
		      Student[] s;
		      s=this.students;
		      this.StudentGroup(this.students.length-1);
		      for(int i=0;i<index;i++)
		      {
		            this.students[i]=s[i];
		      }
		      for(int i=index;i<this.students.length;i++)
		      {
		            this.students[i]=s[i+1];
		      }
		}
	}

	@Override
	public void remove(Student student) throws IllegalArgumentException{
		// Add your implementation here
		int l=-1;
		for(int i=0;i<this.students.length;i++)
		{
		      if(this.students[i].getId().equals(student.getId()) && this.students[i].getFullName().equals(student.getFullName()) && this.students[i].getBirthDate().compareTO(student.getBirthDate())==0 && this.students[i].getAvgMark().equals(student.getAvgMark()))
		      {
		           l=i;
		      }
		}
		if(l==-1)
		      throw new IllegalArgumentException("Student not exist");
		else
		      this.remove(l);
	}

	@Override
	public void removeFromIndex(int index)throws IllegalArgumentException {
		// Add your implementation here
		if(index<0 || index>=this.students.length)
		      throw new IllegalArgumentException();
		else
		{
		      Student[] s;
		      s=this.students;
		      this.StudentGroup(index+1);
		      for(i=0;i<index+1;i++)
		      {
		            this.students[i]=s[i];
		      }
	      } 
	}

	@Override
	public void removeFromElement(Student student) throws IllegalArgumentException{
		// Add your implementation here
		int l=-1;
		for(int i=0;i<this.students.length;i++)
		{
		      if(this.students[i].getId().equals(student.getId()) && this.students[i].getFullName().equals(student.getFullName()) && this.students[i].getBirthDate().compareTO(student.getBirthDate())==0 && this.students[i].getAvgMark().equals(student.getAvgMark()))
		      {
		           l=i;
		      }
		}
		if(l==-1)
		      throw new IllegalArgumentException();
		else
		      this.removeFromIndex(l);
		
	}

	@Override
	public void removeToIndex(int index)  throws IllegalArgumentException{
		// Add your implementation here
		if(index<0 || index>=this.students.length)
		      throw new IllegalArgumentException();
		else
		{
		      int l=this.students.length-index+1;
		      Student[] s;
		      s=this.students;
		      this.StudentGroup(index+1);
		      for(int i=0;i<l;i++)
		      {
		            this.students[i]=s[index+i];
		      }
		}
	}

	@Override
	public void removeToElement(Student student)throws IllegalArgumentException {
		// Add your implementation here
		int l=-1;
		for(int i=0;i<this.students.length;i++)
		{
		       if(this.students[i].getId().equals(student.getId()) && this.students[i].getFullName().equals(student.getFullName()) && this.students[i].getBirthDate().compareTO(student.getBirthDate())==0 && this.students[i].getAvgMark().equals(student.getAvgMark()))
		      {
		           l=i;
		      }
		  }
		 if(l==-1)
		      throw new IllegalArgumentException();
		 else
		      this.removeToIndex(l);
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		for(int i=0;i<this.students.length;i++)
		{
		      for(int j=0;j<this.students.length-1;j++)
		      {
		            if(this.students[j].getId()<this.students[j].getId())
		            {
		                  Student s=students[j];
		                  students[j]=students[j-1];
		                  students[j-1]=s;
		            }
		      }
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) throws IllegalArgumentException{
		// Add your implementation here
		if(date.equals(null))
		      throw new IllegalArgumentException();
		else{
		      Student l[]=new Student[this.students.length];
		      int j=0;
		      for(int i=0;i<this.students.length;i++)
		      {
		            if(this.students[i].getBirthDate().equals(date))
		            {
		                  l[j]=student[i];
		                  j=j+1;
		            }
		      }
		      if(j>0)
		      {
		            Student m[]=new Student[j];
		            for(int i=0;i<j;i++)
		            {
		                  m[i]=l[i];
		            }
		            return m
		      }
		 }
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) throws IllegalArgumentException{
		// Add your implementation here
		if(firstDate.equals(null)||lastDate.equals(null))
		      throw new IllegalArgumentException();
		else{
		      Student l[]=new Student[this.students.length];
		      int j=0;
		      for(int i=0;i<this.students.length;i++)
		      {
		            if(this.students[i].getBirthDate().compareTo(firstDate)>=0 &&this.students[i].getBirthDate().compareTo(lastDate)<=0)
		            {
		                  l[j]=students[i];
		                  j=j+1;
		            }
		      }
		      if(j>0)
		      {
		            Student m[]=new Student[j];
		            for(int i=0;i<j;i++)
		            {
		                  m[i]=l[i];
		            }
		            return m
		      }
		}
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days)throws IllegalArgumentException {
		// Add your implementation here
		if(date.equals(null))
		      throw new IllegalArgumentException();
		else{
		      Student l[]=new Student[this.students.length];
		      int j=0;
		      for(int i=0;i<n;i++)
		      {
		            if(daysBetween(firstDate,this.students[i].getBirthDate())<=days)
		            {
		                  l[j]=students[i];
		                  j=j+1;
		            }
		      }
		      if(j>0)
		      {
		            Student m[]=new Student[j];
		            for(int i=0;i<j;i++)
		            {
		                  m[i]=l[i];
		            }
		            return m
		      }
		}
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent)throws IllegalArgumentException  {
		// Add your implementation here
		if(indexOfStudent<0 || indexOfStudent>=this.students.length)
		      throw new IllegalArgumentException();
		else
		{
		      Student s=this.students[indexOfStudent)];
		      return getAge(s.getBirthDate());
		}
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
	public static int daysBetween(Date d1, Date d2){
             return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
     }
     public int getAge(String date) {
      int age = 0;
      try {
      Date date1 = dateFormat.parse(date);
      Calendar now = Calendar.getInstance();
      Calendar dob = Calendar.getInstance();
      dob.setTime(date1);
      if (dob.after(now)) {
              throw new IllegalArgumentException("Can't be born in the future");
      }
          int year1 = now.get(Calendar.YEAR);
          int year2 = dob.get(Calendar.YEAR);
          age = year1 - year2;
          int month1 = now.get(Calendar.MONTH);
          int month2 = dob.get(Calendar.MONTH);
          if (month2 > month1) {
              age--;
          } else if (month1 == month2) {
              int day1 = now.get(Calendar.DAY_OF_MONTH);
              int day2 = dob.get(Calendar.DAY_OF_MONTH);
              if (day2 > day1) {
                  age--;
              }
          }
      } catch (ParseException e) {
          e.printStackTrace();
      }
      return age ;
      }
}
