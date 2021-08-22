package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void HashCodeCheck(){
        Employee emp = new Employee(1, "Kazuya");
        Employee empSame = new Employee(1, "Kazuya");
        Employee empDiffNo = new Employee(2, "Kazuya");
        Employee empDiffName = new Employee(1, "Diff");

        // empSame は HashCode が一致する。
        assertEquals(emp.hashCode(), empSame.hashCode());
        assertNotEquals(emp.hashCode(), empDiffName.hashCode());
        assertNotEquals(emp.hashCode(), empDiffNo.hashCode());
    }

    @Test
    public void HashTableTest(){

        Employee emp = new Employee(1, "Kazuya");
        Employee empSame = new Employee(1, "Kazuya");
        Employee empDiffNo = new Employee(2, "Kazuya");
        Employee empDiffName = new Employee(1, "Diff");

        Set<Employee> employees = new HashSet<>();
        
        employees.add(emp);
        employees.add(empSame);
        employees.add(empDiffNo);
        employees.add(empDiffName);

        // empSame は Hash値が一緒のため、重複と判断され、除外される。
        assertEquals(3, employees.size());
    }
}
