/*
        Студент: Чепёлкин Иван
        Дополнительно ДЗ №6.2 по курсу Java. Уровень 1
        Преподователь: Артём Евдокимов
*/


package Change_string;

public class SringB {

    public static void main(String[] args) {

        int cnt = 1;

        String str = " Новое предложение Новое предложение И опять новое предложение Да и снова новое предложение";


        StringBuilder string = new StringBuilder(str);

        changeStr(str, string, cnt);

    }

    public static void changeStr(String str, StringBuilder string, int cnt) {

        char[] arr = str.toCharArray();//переводим строку в массив эл-ов char

        for (int i = 0; i <= arr.length-1; i++)
        {
            if (Character.isUpperCase(arr[i])) { //если встречаем большую букву
                for (int j = i; j > 0; j--) {//идем назад от нее
                    if (Character.isLowerCase(arr[j])) { //и если встречаем маленькую букву
                        string.insert(j+cnt, ".");//ставим перед ней точку
                        cnt++;//счетчиком меняеем  индекс , куда ставить точку, так как
                        // размер string увеличивается на 1, каждый раз когда ставим точку
                        break;
                    }
                }
            }
            else if (i ==arr.length-1 )//как только доходим до конца массива
            {
                for (int j = arr.length-1; j >0 ; j--) { //идем назад
                    if (Character.isLowerCase(arr[j])) { //и если встречаем маленькую букву
                        string.insert(j+cnt, ".");//ставим перед ней точку
                        break;
                    }
                }
            }
        }

        System.out.println(string);
    }


}
