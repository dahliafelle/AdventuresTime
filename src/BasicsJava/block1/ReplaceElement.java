package BasicsJava.block1;

import java.util.*;

public class ReplaceElement {
    public static void main(String[] args) {
        //СОрянчик мусила повторити за тобою)) але я поняла шо ми берем останнє значення масиву і ставим наперед,
        // потім переходим до наступного елементу масиву, тоїсть індекс 1б і ставим те значееня шо в передостанньому елементі масиву,
        //АЛЕ я подумала шо тре тупо першу половину замінити на якісь інші значення єслі чєсна. І Зробила це як просто взяти половина масиву і list.set (i, "value")

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth"));

        System.out.println("Array now looks like: \n" + ReplaceElement.getReplacedArray(list));
    }

    private static List getReplacedArray(List list) {
        int j = 0;
        for (int i = list.size(); i >= list.size() / 2; i--) {
            list.set(j, list.get(i - 1));
            j++;
        }
        return list;
    }
}
