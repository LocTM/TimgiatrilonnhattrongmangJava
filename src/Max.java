import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
       int size;
       int [] array;
       Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào đây độ dài mảng");
            size = scanner.nextInt();
            if (size > 20);
            System.out.println("Độ dài mảng không vượt quá 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while(i < array.length){
            System.out.println("Nhập phần tử " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị lơn nhất trong danh sách là " + max + " ,tại vị trí " + index);
    }
}
