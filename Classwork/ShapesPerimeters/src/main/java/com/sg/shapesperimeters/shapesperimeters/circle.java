/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.shapesperimeters.shapesperimeters;

/**
 *
 * @author jugklgl
 */
public class circle extends Shape{

    double rad = 4.0;
    
    @Override
    public double getArea() {
        return rad*rad * Math.PI;
    }

    @Override
    public double getPerimiter() {
        return 2 * Math.PI * rad;
    }
    
}
