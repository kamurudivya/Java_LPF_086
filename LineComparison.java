package org.example;

public class LineComparison {
    static void distance(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {

        // Calculating distance
        float a,b;
        a = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
        b = (float) Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2) * 1.0);
        if (Float.compare(a, b) == 0)
        {
            System.out.println(("Both lines are equal"));
        }
        else if (Float.compare(a, b) < 0) {
            System.out.println(("Both lines are less"));
        }
        else if (Float.compare(a, b) > 0) {
            System.out.println(("Both lines are greater"));
        }
        else {
            System.out.println("Both are not equal");
        }
    }

    //Driver code
    public static void main(String[] args) {
        distance(2, 3, 4, 5, 7, 9, 5, 5);
    }
}
