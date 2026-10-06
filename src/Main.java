public class Main {

    /**
     * Обчислює суму елементів масиву з непарними індексами (1, 3, 5, ...).
     *
     * @param array одновимірний масив цілих чисел
     * @return сума елементів з непарними індексами
     * @throws IllegalArgumentException якщо масив null або порожній
     */
    public int sumOddIndices(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не повинен бути порожнім або null");
        }

        int sum = 0;
        // Починаємо з індексу 1 і крокуємо через 2
        for (int i = 1; i < array.length; i += 2) {
            sum += array[i];
        }

        return sum;
    }

    public void printResults() {
        int[] numbers = {10, 20, 30, 40, 50, 60}; // Індекси: [0]=10, [1]=20, [2]=30, [3]=40, [4]=50, [5]=60
        try {
            int sum = sumOddIndices(numbers);
            System.out.println("Сума елементів з непарними індексами: " + sum);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Main program = new Main();
        program.printResults();
    }
}
