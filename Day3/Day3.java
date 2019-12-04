import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

class Day3 {
    public static void main(String args[]) {

        String filepath = "/Users/kevinfalting/Development/java/adventOfCode/Day3/input.txt";
        try {
            String input[] = getInputFromFile(filepath);
            // System.out.println(input[1]);
            System.out.println("Problem 1\nManhattan Distance: " + prob1(input));
            // System.out.println("Problem 2\nManhattan Distance: " + prob2(input));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    public static String[] getInputFromFile(String filepath) throws Exception{
        File file = new File(filepath);
        Scanner scan = new Scanner(file);

        String arr[] = new String[2];

        arr[0] = scan.nextLine();
        arr[1] = scan.nextLine();

        scan.close();

        return arr;
    }

    public static int prob1(String input[]) {
        
        String wire1[] = input[0].split(",");
        String wire2[] = input[1].split(",");

        int wire1_XYPath[][] = getXYPath(wire1);
        int wire2_XYPath[][] = getXYPath(wire2);

        int wire1_ExactPath[][] = getExactPath(wire1_XYPath);
        int wire2_ExactPath[][] = getExactPath(wire2_XYPath);

        // for (int i = 0; i < wire1_ExactPath.length; i++) {
        //     System.out.println(wire1_ExactPath[i][0] + ", " + wire1_ExactPath[i][1]);
        // }

        return getClosestIntersection(wire1_ExactPath, wire2_ExactPath);
        // return -1;
    }

    public static int getClosestIntersection(int wire1[][], int wire2[][]) {

        int low = 999999999;
        for (int i = 0; i < wire1.length; i++) {
            int x1 = wire1[i][0];
            int y1 = wire1[i][1];
            System.out.printf("(%5d, %5d) low: %d | length1: %d | length2: %d | el: %d\n", x1, y1, low, wire1.length, wire2.length, i);
            for (int j = 0; j < wire2.length; j++) {
                int x2 = wire2[j][0];
                int y2 = wire2[j][1];

                if (x1 == x2 && y1 == y2 && x1 != 0 && y1 != 0) {
                    if (Math.abs(x1) + Math.abs(y1) < low) {
                        low = Math.abs(x1) + Math.abs(y1);
                    }
                }
            }
        }

        return low;
    }

    public static int[][] getExactPath(int wire[][]) {
        ArrayList<Integer> wirePath_X = new ArrayList<>();
        ArrayList<Integer> wirePath_Y = new ArrayList<>();
        wirePath_X.add(0);
        wirePath_Y.add(0);
        
        for (int i = 0; i < wire.length; i++) {
            int x = wire[i][0];
            int y = wire[i][1];
            int prev_x = wirePath_X.get(wirePath_X.size() - 1);
            int prev_y = wirePath_Y.get(wirePath_Y.size() - 1);

            while (x != prev_x) {
                if (x < prev_x) {
                    prev_x--;
                    wirePath_X.add(prev_x);
                } else if (x > prev_x) {
                    prev_x++;
                    wirePath_X.add(prev_x);
                }
                wirePath_Y.add(y);
            }

            while (y != prev_y) {
                if (y < prev_y) {
                    prev_y--;
                    wirePath_Y.add(prev_y);
                } else if (y > prev_y) {
                    prev_y++;
                    wirePath_Y.add(prev_y);
                }
                wirePath_X.add(x);
            }
            
        }

        if (wirePath_X.size() != wirePath_Y.size()) System.out.println("Path's are not the same size.");

        int result[][] = new int[wirePath_X.size()][2];
        for (int i = 0; i < wirePath_X.size(); i++) {
            result[i][0] = wirePath_X.get(i);
            result[i][1] = wirePath_Y.get(i);
        }

        return result;

    }

    public static int[][] getXYPath(String wire[]) {
        int x = 0;
        int y = 0;
        int wireCoords[][] = new int[wire.length][2];
        for (int i = 0; i < wire.length; i++) {
            String instr = wire[i].trim();
            int val = Integer.parseInt(instr.substring(1));
            switch(instr.charAt(0)) {
                case 'U':
                    y += val;
                    break;
                case 'D':
                    y -= val;
                    break;
                case 'L':
                    x -= val;
                    break;
                case 'R':
                    x += val;
            }

            wireCoords[i][0] = x;
            wireCoords[i][1] = y;
        }

        return wireCoords;
    }
}