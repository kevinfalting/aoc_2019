import java.util.Arrays;

class Day2 {
    public static void main(String args[]) {
        int[] input = {1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,6,1,19,2,19,9,23,1,23,5,27,2,6,27,31,1,31,5,35,1,35,5,39,2,39,6,43,2,43,10,47,1,47,6,51,1,51,6,55,2,55,6,59,1,10,59,63,1,5,63,67,2,10,67,71,1,6,71,75,1,5,75,79,1,10,79,83,2,83,10,87,1,87,9,91,1,91,10,95,2,6,95,99,1,5,99,103,1,103,13,107,1,107,10,111,2,9,111,115,1,115,6,119,2,13,119,123,1,123,6,127,1,5,127,131,2,6,131,135,2,6,135,139,1,139,5,143,1,143,10,147,1,147,2,151,1,151,13,0,99,2,0,14,0};
        System.out.println("Problem 1\nPosition 0 Value: "  + prob1(input, 12, 2));
        System.out.println();
        System.out.println("Problem 2\nAnswer: "  + prob2(input));
    }

    public static int prob1(int[] input, int noun, int verb) {

        int[] inputCopy = new int[input.length];
        System.arraycopy(input, 0, inputCopy, 0, input.length);

        inputCopy[1] = noun;
        inputCopy[2] = verb;

        int i = 0;
        while (i+3 < inputCopy.length && inputCopy[i+3] < inputCopy.length && inputCopy[i] != 99) {

            inputCopy[inputCopy[i+3]] = inputCopy[i] == 1 ?
                inputCopy[inputCopy[i+1]] + inputCopy[inputCopy[i+2]] :
                inputCopy[inputCopy[i+1]] * inputCopy[inputCopy[i+2]];

            i += 4;
        }
        
        return inputCopy[0];
    }

    public static int prob2(int[] input) {
        int target = 19690720;

        for (int noun = 0; noun < 100; noun++) {
            for (int verb = 0; verb < 100; verb++) {

                int[] inputCopy = new int[input.length];
                System.arraycopy(input, 0, inputCopy, 0, input.length);

                if (prob1(inputCopy, noun, verb) == target) {
                    return 100 * noun + verb;
                }
            }
        }

        return -1;
    }
}