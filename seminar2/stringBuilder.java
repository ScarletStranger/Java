package seminar2;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello1!");
        s = builder.toString();
        builder.append(.235f);// добавляет элемент
        builder.charAt(0);//
        builder.setCharAt(builder.length() / 2, 0);// устанавливает букву по указанному индексу
        builder.deleteCharAt(builder.length() / 2 - 1);// удаляет букву по индексу
        builder.compareTo(new StringBuilder());// сравнивает с другим билдером
        builder.delete(0, 0);// удаляет буквы в указанном диапазоне
        builder.insert(builder.length() / 2 - 1, true);// вставляет строку
        // builder.indexOf(null, 0) и builder.lastIndexOf(null, 0)// работает так же как
        // и в обычной string
        builder.replace(0, builder.length() / 2, "new char");// заменяет символы
        builder.reverse();//разворачивает строку
        // builder  МЕНЯЕТ исходную строку
    }
}
