/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.shapesperimeters.shapesperimeters;

/**
 *
 * @author jugklgl
 */
public class square extends Shape{
    
    double length = 4.0;

    @Override
    public double getArea() {
        return length*length;
    }

    @Override
    public double getPerimiter() {
        return 4*length;
    }
    
}
