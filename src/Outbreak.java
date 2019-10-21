public class Outbreak {

    public static boolean isOutbreak() {

        return true;
    }

    public static int[][] convertArrayFromObjectToInt(Room[][] array) {

        int[][] newArray = new int[array.length][array[0].length];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column].toString().contains("true")) {
                    newArray[row][column] = 1;
                } else if (array[row][column].toString().contains("false")) {
                    newArray[row][column] = 0;
                } else {
                    System.out.println("Fatal error");
                }
            }
        }
        return newArray;
    }

    public static void printArray(int[][] array) {
        System.out.println("Printing array: ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++)
                System.out.print(array[row][column] + "  ");
            System.out.println();
        }
    }

    public static void isThereAnOutbreak(int[][] array) {
        int countRow = 0;
        int countColumn = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if ((array[i][j] == 1) && (array[i + 1][j] == 1)
                        && (array[i + 2][j] == 1) && (array[i + 3][j] == 1)
                        && (array[i + 4][j] == 1)
                ) countColumn++;

                if ((array[i][j] == 1) && (array[i][j + 1] == 1)
                        && (array[i][j + 2] == 1) && (array[i][j + 3] == 1)
                        && (array[i][j + 4] == 1))
                    countRow++;

            }

            if (countRow >= 1) {
                System.out.println("Potential outbreak on the floor. Rows: " + countRow);
                return;
            }

            if (countColumn >= 1) {
                System.out.println("Potential outbreak by vertical. Columns: " + countColumn);
                return;
            }
            countRow = 0;
            countColumn = 0;
        }

        System.out.println("There are no outbreaks");
    }


    public static int[][] findPotentialSpot(int[][] verticalTrue, int[][] horizontalTrue) {

        int[][] result = new int[verticalTrue.length][verticalTrue[0].length];

        for (int row = 0; row < verticalTrue.length; row++) {
            for (int column = 0; column < verticalTrue[row].length; column++) {
                result[row][column] =  verticalTrue[row][column] + horizontalTrue[row][column];
            }
        }
        return result;
    }

    public static int[][] verifyIsPotentialSpotInfected(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];

        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                result[row][column] =  a[row][column] * b[row][column];
            }
        }
        return result;
    }

    public static void findOutbreak(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] == 2) {
                    System.out.println("Outbreak located on " + (row+1) + " floor. Line " + (column+1));
                }
            }
        }
    }
}
