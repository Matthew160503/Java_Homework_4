import java.util.LinkedList;

/**
 Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list = addElements(list);
        System.out.println("Изначальный список: " + list);
        reverseList(list);
    }

    private static LinkedList<Integer> addElements(LinkedList<Integer> list){
        list.add(23);
        list.add(215);
        list.add(-5);
        list.add(0);
        list.add(99);
        list.add(13);
        list.add(666);
        return list;
    }

    private static void reverseList(LinkedList<Integer> list){
        int temp = 0;
        for (int i = 0; i < list.size()/2; i++){
            temp = list.get(i);
            list.set(i, list.get(list.size() - i-1));
            list.set(list.size() - i-1, temp);
        }
        System.out.println("Перевернутый список: " + list);
    }
}
