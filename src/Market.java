import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<Person> queue; // Очередь людей в магазине

    public Market() {
        this.queue = new LinkedList<>();
    }

    // Реализация метода из MarketBehaviour - вход человека в магазин
    @Override
    public void enterMarket(Person person) {
        System.out.println(person.getName() + " вошел в магазин.");
        addToQueue(person); // Добавляем человека в очередь
    }

    // Реализация метода из MarketBehaviour - выход человека из магазина
    @Override
    public void leaveMarket(Person person) {
        System.out.println(person.getName() + " вышел из магазина.");
        removeFromQueue(); // Удаляем человека из очереди
    }

    // Реализация метода из QueueBehaviour - добавление человека в очередь
    @Override
    public void addToQueue(Person person) {
        queue.add(person);
        System.out.println(person.getName() + " добавлен в очередь.");
    }

    // Реализация метода из QueueBehaviour - удаление человека из очереди
    @Override
    public void removeFromQueue() {
        Person person = queue.poll();
        if (person != null) {
            System.out.println(person.getName() + " удален из очереди.");
        }
    }

    // Получение следующего человека в очереди
    @Override
    public Person nextInQueue() {
        return queue.peek();
    }

    // Получение текущей очереди
    @Override
    public List<Person> getQueue() {
        return (List<Person>) queue;
    }

    // Метод обновления состояния магазина
    public void update() {
        if (!queue.isEmpty()) {
            Person person = nextInQueue();
            System.out.println("Обработка заказа для: " + person.getName());
            leaveMarket(person);  // После обработки заказа человек покидает магазин
        } else {
            System.out.println("Очередь пуста, нет заказов для обработки.");
        }
    }
}
