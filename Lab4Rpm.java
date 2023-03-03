import java.util.Scanner;
public class Lab4Rpm {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            
            int min = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            
            
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            double average = sum / n;
            
            
            double result = min + average;
            
            System.out.println("Сумма минимального элемента и среднего арифметического равна " + result);
        }
     }
    

