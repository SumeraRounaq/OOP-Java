/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasicTutorials;

/**
 *
 * @author DSU
 */
public class Person 
{
    int id = 56;
    String name = "Harry";
    String gender = "Male";
    int age = 43;
    
    public void walk()
    {
        System.out.println("Person is walking");
    }
    
    public static void main(String []args)
    {
        Person p = new Person();
        System.out.println(p.name);
        p.walk();
        
    }
}
