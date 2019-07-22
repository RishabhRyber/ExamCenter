/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Student;
import java.util.ArrayList;

/**
 *
 * @author Rishabh
 */
public interface StudentDeclaration {
    public long  insertStudent(Student student);
    public long upDate(long id, Student student);
    public boolean delete(long id);
    public Student selectStudent(long id);
    public ArrayList selectAllStudents();
    public ArrayList searchByName(String name);
}
