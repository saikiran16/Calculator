/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author Saikiran
 */
public class Calculator {
    
    // Add 
    int add(int number1 , int number2)
    {
        return  number1 + number2;
    }
    double add(double number1 , double number2){
        return number1 + number2 ;
    }
    
    // Subtract
    int subtract(int number1 , int number2)
    {
        return  number1 - number2;
    }
    double subtract(double number1 , double number2){
        return number1 - number2 ;
    }
    
    // Multiply
    int multiply(int number1 , int number2)
    {
        return  number1 * number2;
    }
    double multiply(double number1 , double number2){
        return number1 * number2 ;
    }
    
    // Divide
    int divide(int number1 , int number2)
    {
        return  number1 / number2;
    }
    double divide(double number1 , double number2){
        return number1 / number2 ;
    }
    
    int modulus(int number1 , int number2){
        throw new NotImplementedException() ;
    }
    
}
