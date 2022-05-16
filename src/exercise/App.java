package exercise;

public class App {
    public static String getHiddenCard(String cardNumber, int starsCount) {//method takes two parameters: string(card number) and int(quantity of stars) метод задаёт параметры метода: стороку cardNumber т.е. номер карты и число, количество звёздочек
        var visibleDigitsLine = cardNumber.substring(12);//creating a variable that hidden 12 numbers of cardNumber  создаём переменную в которой к номеру карты применяется метод который скрывает первые 12 символов номера(номер состоит из 16 символов)
        return "*".repeat(starsCount) + visibleDigitsLine;//to the symbol star apply the method repeat with int starsCount and add the variable result visibleDigitsLine к символу звёздочке применяется метод повторения repeat с числом из параметра основного метода starsCount и плюсуется cardNumber уже со скрытыми числами в виде переменной visibleDigitsLine
    }

    public static String getHiddenCard(String cardNumber) {
        return App.getHiddenCard(cardNumber, 4);//create method where will be starsCount by default создам такой же метод, только с одним параметром стринг и возвращаем метод уже с настроеными пераметрами
    }

    public static void main(String[] args) {
        var cadrTwo  = "9876543219876777";// input cardNumber
        var card =  App.getHiddenCard(cadrTwo,5);//создаём переменную с методом и вноси данные в пераметры метода
        System.out.println(card);//output result выводим метод через переменную
    }

}