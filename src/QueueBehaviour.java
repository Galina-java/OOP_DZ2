import java.util.List;

public interface QueueBehaviour {
    void addToQueue(Person person);  // Добавление человека в очередь
    void removeFromQueue();          // Удаление человека из очереди
    Person nextInQueue();            // Получение следующего человека в очереди
    List<Person> getQueue();         // Получение текущей очереди
}