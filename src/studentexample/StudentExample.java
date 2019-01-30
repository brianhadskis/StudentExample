/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentexample;

/**
 *
 * @author Brian
 */
public class StudentExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student one = new Student();
        
        one.setName("Bob");
        System.out.println("Student 1 name: " + one.getName());
    }
    
}
