package Pack20DesignPatterns.OthersDesignPatterns.datamapper;

import java.io.Serializable;

/**
 * Class defining Student.
 */
public final class Student implements Serializable {

  private static final long serialVersionUID = 1L;

  private int studentId;
  private String name;
  private char grade;


  /**
   * Use this constructor to create a Student with all details.
   *
   * @param studentId as unique student id
   * @param name      as student name
   * @param grade     as respective grade of student
   */
  public Student(final int studentId, final String name, final char grade) {
    this.studentId = studentId;
    this.name = name;
    this.grade = grade;
  }

  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(final int studentId) {
    this.studentId = studentId;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public char getGrade() {
    return grade;
  }

  public void setGrade(final char grade) {
    this.grade = grade;
  }

  @Override
  public boolean equals(final Object inputObject) {

    boolean isEqual = false;

    /* Check if both objects are same */
    if (this == inputObject) {

      isEqual = true;
    } else if (inputObject != null && getClass() == inputObject.getClass()) {

      final Student inputStudent = (Student) inputObject;

      /* If student id matched */
      if (this.getStudentId() == inputStudent.getStudentId()) {

        isEqual = true;
      }
    }

    return isEqual;
  }

  @Override
  public int hashCode() {

    /* Student id is assumed to be unique */
    return this.getStudentId();
  }

  @Override
  public String toString() {
    return "Student [studentId=" + studentId + ", name=" + name + ", grade=" + grade + "]";
  }
}
