import java.util.ArrayList;

public class Runer {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(8);
        showlist(list);
        System.out.println();
        insertionSort(list);
        showlist(list);

    }
    public static void insertionSort(ArrayList<Integer> list){
        for (int i = 0; i< list.size();i++){
            int position = i;
            int curentElement = list.get(position);
            while (position>0 && list.get(position -1)> curentElement){
                list.set(position,list.get(position-1));
                position --;
            }
            list.set(position,curentElement);
        }
    }
    public static void showlist(ArrayList<Integer>list){
        for (Integer i:list
             ) {
            System.out.print(i+",");
        }
    }
}
