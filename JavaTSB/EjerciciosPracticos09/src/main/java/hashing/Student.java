/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing;

import java.util.Objects;

/**
 *
 * @author anastrub
 */
public class Student 
{
    private int legajo;
    private String nombre;

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 79 * hash + this.legajo;
        //hash = 79 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
}
