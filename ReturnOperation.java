import java.util.LinkedList;
import java.util.Scanner;

public class ReturnOperation {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<Integer> data = new LinkedList<>();
        boolean flag = true;
        while(flag){
            data = addNumbers(data);
            int operation = addOperation();
            flag = doOperation(data, operation, flag);
        }
    }

    private static LinkedList<Integer> addNumbers(LinkedList<Integer> data){
        System.out.println("Введите два числа:");
        data.add(sc.nextInt());
        data.add(sc.nextInt());
        return data;
    }

    private static int addOperation(){
        System.out.println("Введите номер желаемой операции:\n"+
        "1 - умножение чисел\n"+
        "2 - деление чисел\n"+
        "3 - сложение чисел\n"+
        "4 - вычитание чисел\n"+
        "5 - отмена последней операции");
        int operation = sc.nextInt();
        return operation;
    }

    private static boolean doOperation(LinkedList<Integer> data, int operation, boolean flag){
        double result = 0;
        switch (operation) {
            case 1:
                result = data.get(0) * data.get(1);
                System.out.println("Результат выбранной операции: " + result);
                break;
            case 2:
                result = data.get(0) / data.get(1);
                System.out.println("Результат выбранной операции: " + result);
                break;
            case 3:
                result = data.get(0) + data.get(1);
                System.out.println("Результат выбранной операции: " + result);
                break;
            case 4:
                result = data.get(0) - data.get(1);
                System.out.println("Результат выбранной операции: " + result);
                break;
            case 5:
                System.out.println("Происходит смена операции!");
                doOperation(data, deleteLastOperation(),flag);
            default:
                break;
        }
        System.out.println("Если хотите продолжить работу с калькулятором, введите - 2."+
        " Если вы хотите отменить последнюю операцию - 1. Выход из программы -0");
        int choice = sc.nextInt();
        if (choice == 2) return flag;
        else if (choice == 1){
            doOperation(data, deleteLastOperation(),flag);
            return flag;
        }
        else return !flag;
    }

    private static int deleteLastOperation(){
        int operation = addOperation();
        System.out.println("Изменена предыдущая операция на оперцию под номером " + operation);
        return operation;
    }


}