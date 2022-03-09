public class WhileDemo {
    public static void main(String[] args) {
        char ch;

        //вывод букв английского алфавита, используя цикл while

        ch = 'a'; // задаём начальное условие
        while (ch <='z') { // условие
            System.out.print(ch);
            ch++;
        }
    }
}
