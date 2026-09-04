package com.electronik54.revision_3.corejava.ch11_records.solution;

/**
 * Point record - 2D coordinate.
 */
public record Point(int x, int y) {
    
    // Additional method
    public double distanceTo(Point other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}