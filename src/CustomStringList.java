public class CustomStringList {

    //Добавить класс CustomStringList со следующим набором методов.
//
//    0. Добавить начальный набор методов и свойств
//Добавить конструктор, который получает массив из строк и присваивает его в свойство list.
    private String[] list;

    public CustomStringList(String[] list) {
        this.list = list;
    }
    //    1. Метод check
//Данный метод получает в качестве аргумента строку и проверяет, находится ли эта строка в списке строк или нет.
// Если да, метод возвращает true, в ином случае false.

    public boolean check(String test) {
        for (String string : list) {
            if (string.equals(test)) {
                return true;
            }
        }
        return false;
    }

    //    2. Метод check
//Данный метод получает в качестве аргумента массив из строк и проверяет,
// находятся ли строки из полученного списка в списке строк list.
// Если все находятся, метод возвращает true, в ином случае false.
    public boolean check(String[] arrayTest) {
        for (String str : arrayTest) {
            boolean found = false;
            for (String string : list) {
                if (string.equals(str)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    //    3. Метод longestWord
//Данный метод не получает аргументов и возвращает самое длинное слово из массива list.
    public String longestWorld() {
        String longest = " ";
        for (String string : list) {
            if (string.length() > longest.length()) {
                longest = string;
            }
        }
        return longest;
    }


    //    4. Метод add
//Данный метод получает в качестве аргумента строку и создает новый массив в list,
// который содержит все старые элементы и новый.
    public void add (String strings) {
       String array[]= new String[this.list.length +1];
       this.list = array;
    }
 //5. Метод addIfNotExists
//Данный метод получает в качестве аргумента строку и если данной строки нет в list создает новый массив
// в list, который содержит все старые элементы и новый. В ином случае выводит в терминал сообщение
// "Строка <значение строки> в массиве уже есть"

    public void setNewList(String strings) {
        if (!check(strings)) {
            add(strings);
        } else {
            System.out.println("Строка" + strings + "есть");
        }
    }
}



//Результат необходимо загрузить на github и ссылку прислать в качестве результата.







