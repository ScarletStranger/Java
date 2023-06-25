package seminar3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class arrayList {
    public static void main(String[] args) {
        //Размерность ArrayList увеличивается по формуле (длина массива+длина массива/2+1)
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i< 10; i++)
        {
            list.add(new Random().nextInt(15));
            list1.add(new Random().nextInt(15));
        }
        list.add(list.size()/2, 1);// добавляет элемент справа по указанному индексу слева
        list.addAll(list1);// добавляет все элементы из другого списка
        list.addAll(list.size()/2, list1);//добавляет список справа по указанному индексу слева
        list.isEmpty();//Выводит true если список пустой
        list.clear();//Всем элементам вместо ссылок на объекты ставит null
        list.set(1, 1561);//меняет элемент слева на элемент справа
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.remove(0);//удаляет элемент с указанным индексом
        list2.remove("Hello");//удаляет элемент по содержимому
        list.get(0);//получает элемент по указанному индексу
        list2.contains("Hello");//возвращает true если указанный объект найден
        list.trimToSize();//обрезает указанный список до количества содержащихся элементов
        list.ensureCapacity(100);//увеличивает список до указанного массива
        System.out.println(list.size()); // выводит размерность списка
        for(int i: list){
            System.out.println(i);
        }
        ListIterator<Integer> iterator = list.listIterator(list.size()-1);
                ListIterator<Integer> iterator = ready.listIterator(ready.size()); 
        iterator.hasNext();//возвращает истину если в списке есть непросмотренные элементы
        while(iterator.hasPrevious()){
            int i = iterator.previous();
            iterator.nextIndex();
            System.out.println(i);
            iterator.remove();//итератор может удалять объекты из списка
        }
        list.forEach(n -> System.out.println(n));
        System.out.println(list);
        System.out.println(list1);
        System.out.println("-".repeat(15));
        list.subList(0, list.size()/2);//возвращает список объектов
        list.retainAll(list1);//удаляет повторяющиеся элементы из списка слева, которые также находятся в списке справа
        list.removeAll(list1);// то же, что и метод выше, но наоборот(удаляет несовпадающие элементы)
        System.out.println(list);
        list.sort(Comparator.naturalOrder());//сортирует элементы по увелечению
        list.sort(Comparator.reverseOrder());//сортирует элементы по уменьшению
        list.forEach(n -> list1.add(0, n));//разворот массива
    }
}
