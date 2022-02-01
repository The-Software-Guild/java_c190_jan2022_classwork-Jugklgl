/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.shapesperimeters.shapesperimeters;

/**
 *
 * @author jugklgl
 */
public class triangle extends Shape{

    double base = 70;
    double a = 90;
    double c = 40;
    double height = 25;
    
    @Override
    public double getArea() {
        return (base*height) / 2;
    }

    @Override
    public double getPerimiter() {
        return base+a+c;
    }
    
}
