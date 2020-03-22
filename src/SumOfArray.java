public class SumOfArray {
    public static int sumOfNumbersInArray(int[] array) {
        int index = 0;
        int sum = 0;
        while (index < array.length) {
            sum = sum + array[index];
            index++;

        }
        System.out.println(sum);
        return sum;
    }

    public static void printNeatly(int[] array) {
        int index = 0;

        while(index < array.length) {
            System.out.print(array[index] + ", ");
            index++;
        }
    }

    public static void printArrayInStars(int[] arrayStar){
        System.out.println(" ");
        int index = 0;
        while(index < arrayStar.length) {
            for(int i = 0; i < arrayStar[index]; i++){
                System.out.print("*");
            }
            System.out.println(" ");
            index++;
        }
    }


    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(numbers);

        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);

        int[] arrayStar = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
}
