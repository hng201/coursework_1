package Tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Shirley
 */
public class TestInput {
    
    public TestInput() {
    }
    
   @Test
   public void testInputEmpty(){
      System.out.println("Dec2Hex JUnit Test: test method 1 - testInputEmpty()");
      Boolean empty, test;
      empty = true;
      String [] value = {};
      if(value.length == 0){
          test = true;
      }
      else{
          test = false;
      }
      assertEquals(empty,test);
   }
   
   @Test
   public void testInputPresent(){
       System.out.println("Dec2Hex JUnit Test: test method 2 - testInputPresent()");
       Boolean present, test;
       present = true;
       String [] value = {"11"};
       if(value.length != 0){
          test = true;
      }
      else{
          test = false;
      }
       assertEquals(present,test);
   }
}
