package com.electronik54.revision_3.corejava.ch11_records.solution;

/**
 * Rectangle record - width and height.
 */
public record Rectangle(int width, int height) {
    
    // Additional methods
    public int area() {
        return width * height;
    }
    
    public int perimeter() {
        return 2 * (width + height);
    }
}