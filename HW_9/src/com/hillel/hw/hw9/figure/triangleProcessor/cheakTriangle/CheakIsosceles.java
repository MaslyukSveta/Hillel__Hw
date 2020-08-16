package com.hillel.hw.hw9.figure.triangleProcessor.cheakTriangle;

import com.hillel.hw.hw9.figure.triangle.Triangle;
import com.hillel.hw.hw9.figure.utils.CheckFunction;

public class CheakIsosceles implements CheckFunction {

    @Override
    public boolean function(Triangle triangle) {
        return triangle.isIsosceles();
    }
}