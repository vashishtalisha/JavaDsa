package Arrays;

public class pattern1 {


        public static void main(String[] args) throws InterruptedException {
            int[] arr = {5, 3, 1, 4, 2};

            System.out.println("Initial Array:");
            displayArray(arr);
            Thread.sleep(1000);

            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                boolean swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    clearScreen();
                    System.out.println("Comparing: " + arr[j] + " and " + arr[j + 1]);

                    if (arr[j] > arr[j + 1]) {
                        // swap
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }

                    displayArray(arr);
                    Thread.sleep(700);
                }
                if (!swapped) break;
            }

            System.out.println("Sorted Array:");
            displayArray(arr);
        }

        public static void displayArray(int[] arr) {
            for (int val : arr) {
                for (int i = 0; i < val; i++) {
                    System.out.print("*");
                }
                System.out.println(" (" + val + ")");
            }
        }

        public static void clearScreen() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }







