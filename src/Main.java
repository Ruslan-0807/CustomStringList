public class Main {
    public static void main(String[] args) {
        String [] list = {"white","black","blue","red"};
        String test = ("red");
        CustomStringList customStringList = new CustomStringList(list);
        System.out.println("Строка" + " : " +test + " - " + customStringList.check(test));
        String[] arrayTest = {"white","black","blue"};
        System.out.println("Массив" + " : " + arrayTest + " - " + customStringList.check(arrayTest));
        System.out.println("Длинна " + customStringList.longestWorld());
        String [] string = {"yellow", "green"};
        System.out.println(customStringList);
        customStringList.add("brown");

    }
}
