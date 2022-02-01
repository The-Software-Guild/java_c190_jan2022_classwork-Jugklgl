/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.shapesperimeters.shapesperimeters;

/**
 *
 * @author jugklgl
 */
public class rectangle extends Shape {

    double length = 4.0;
    double breadth = 3.0;
    @Override
    public double getArea() {
        return length*breadth;
    }

    @Override
    public double getPerimiter() {
        return 2 * (length+breadth);
    }
    
}
