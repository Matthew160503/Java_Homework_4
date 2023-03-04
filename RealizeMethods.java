import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
  Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент 
из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
 */
public class RealizeMethods {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        int num = 0;
        boolean flag = true;
        System.out.println("Для использования метода введи его номер\n"+
                            "1: Метод enqueue - добавляет элемент\n"+
                            "2: Метод dequeue - возвращает 1 элемент и удаляет его\n"+
                            "3: Метод first - возвращает первый элемент из очереди, не удаляя\n"+
                            "4: Метод exit - останавливает программный код\n"+
                            "Примечание: Работа производится с элементами целочисленного типа и, чтобы использовать\n"+
                            "методы 2 и 3, сначала заполните список!");
        while(flag){
            System.out.println("Введите номер желаемого метода: ");
            num = sc.nextInt();
            if (num == 1) enqueue(list);
            else if (num == 2) dequeue(list);
            else if (num == 3) first(list);
            else if (num == 4) flag = false;

        }
    }

    private static void enqueue(Queue<Integer> list){
        System.out.println("Введите желаемое значение: ");
        int element = sc.nextInt();
        list.add(element);
        System.out.println(list);
    }

    private static void dequeue(Queue<Integer> list){
        int el = list.poll();
        System.err.println("Значение: " + el + "\n" + list);
    }

    private static void first(Queue<Integer> list){
        int el = list.peek();
        System.out.println("Значение: " + el + "\n" + list);
    }
}
