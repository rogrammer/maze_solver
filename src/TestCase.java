/*
11050111022, FURKAN DEMİR
20050111011, İBRAHİM BAHÇA
20050111034, MERTER ÇOBAN
20050111008, SELÇUK GENÇAY
21050141038, YOUSIF HARITH SUHAIL SUHAIL
*/

import java.util.ArrayList;

public class TestCase {
    private final int[][] verticalWalls;
    private final int[][] horizontalWalls;
    static private ArrayList<TestCase> cases = null;

    public TestCase(int[][] verticalWalls, int[][] horizontalWalls) {
        this.verticalWalls = verticalWalls;
        this.horizontalWalls = horizontalWalls;
    }

    static ArrayList<TestCase> getTestCases() {
        if (cases == null) {
            cases = new ArrayList<>(2);
            cases.add(new TestCase(V0, H0));
            cases.add(new TestCase(V1, H1));
            cases.add(new TestCase(V2, H2));
            cases.add(new TestCase(V3, H3));
        }

        return cases;
    }

    public int[][] getVerticalWalls() {
        return verticalWalls;
    }

    public int[][] getHorizontalWalls() {
        return horizontalWalls;
    }

    public int getWidth() {
        return this.horizontalWalls[0].length;
    }

    public int getHeight() {
        return this.verticalWalls.length;
    }

    private static final int[][] H0 = {
            {1, 1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0, 0, 1},
            {0, 1, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 1, 0, 1},
            {1, 0, 1, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 1, 0},
            {1, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1}
    };

    private static final int[][] V0 = {
            {1, 1, 1, 0, 0, 0, 0, 1},
            {1, 1, 1, 0, 0, 0, 0, 1},
            {1, 0, 0, 1, 1, 0, 1, 1},
            {1, 0, 1, 0, 0, 1, 0, 1},
            {1, 1, 0, 1, 1, 0, 0, 1},
            {1, 1, 0, 0, 0, 1, 1, 1},
            {1, 0, 0, 0, 0, 1, 1, 1}
    };


    private static final int[][] H1 = {
            {1, 1, 1, 1, 1},
            {0, 1, 1, 0, 0},
            {1, 1, 1, 1, 0},
            {0, 1, 0, 0, 1},
            {1, 0, 0, 0, 0},
            {1, 1, 1, 1, 1}
    };

    private static final int[][] V1 = {
            {1, 1, 0, 0, 0, 1},
            {1, 0, 0, 0, 1, 1},
            {1, 0, 0, 1, 0, 1},
            {1, 0, 1, 1, 1, 1},
            {1, 0, 1, 0, 0, 1}
    };

    private static final int[][] H2 = {
            {1, 1, 1, 1, 1},
            {0, 1, 1, 0, 0},
            {1, 1, 1, 1, 0},
            {0, 1, 0, 0, 1},
            {1, 0, 0, 0, 0},
            {1, 1, 1, 1, 1}
    };

    private static final int[][] V2 = {
            {1, 1, 0, 0, 0, 1},
            {1, 0, 0, 0, 1, 1},
            {1, 0, 0, 1, 0, 1},
            {1, 0, 1, 1, 1, 1},
            {1, 0, 1, 0, 1, 1}
    };

    private static final int[][] H3 = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
            {0, 0, 0, 0, 1, 0, 1, 1, 0, 0},
            {1, 0, 1, 1, 0, 1, 1, 0, 1, 0},
            {0, 1, 0, 0, 1, 1, 1, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    };

    private static final int[][] V3 = {
            {1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1},
            {1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1},
            {1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1},
            {1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1}
    };
}
