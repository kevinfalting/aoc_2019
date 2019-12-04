import java.util.Arrays;

class Day2 {
    public static void main(String args[]) {
        int[] input = {1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,13,1,19,1,10,19,23,1,23,9,27,1,5,27,31,2,31,13,35,1,35,5,39,1,39,5,43,2,13,43,47,2,47,10,51,1,51,6,55,2,55,9,59,1,59,5,63,1,63,13,67,2,67,6,71,1,71,5,75,1,75,5,79,1,79,9,83,1,10,83,87,1,87,10,91,1,91,9,95,1,10,95,99,1,10,99,103,2,103,10,107,1,107,9,111,2,6,111,115,1,5,115,119,2,119,13,123,1,6,123,127,2,9,127,131,1,131,5,135,1,135,13,139,1,139,10,143,1,2,143,147,1,147,10,0,99,2,0,14,0};
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