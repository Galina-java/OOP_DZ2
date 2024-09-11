public class Main {
    public static void main(String[] args) {
        Market market = new Market();  // Создаем объект класса Market

        // Создаем несколько людей
        Person person1 = new Person("Иван");
        Person person2 = new Person("Мария");
        Person person3 = new Person("Александр");

        // Люди входят в магазин и становятся в очередь
        market.enterMarket(person1);
        market.enterMarket(person2);
        market.enterMarket(person3);

        // Обновляем состояние магазина
        market.update();  // Иван обработан и выходит из магазина
        market.update();  // Мария обработана и выходит из магазина
        market.update();  // Александр обработан и выходит из магазина

        // Попробуем обновить магазин, когда очередь пуста
        market.update();  // Сообщение о пустой очереди
    }
}