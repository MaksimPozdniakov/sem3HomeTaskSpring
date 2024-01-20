package com.example.sem3HomeTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1) (готово!) В класс RegistrationService добавить поля UserService, NotificationService(добавить
 * 	  в IOC контейнер аннотацией @Autowired или через конструктор класса)
 * 2) (готово!) Разработать метод processRegistration в котором:
 * - создается пользователь из параметров метода
 * - созданный пользователь добавляется в репозиторий
 * - через notificationService выводится сообщение в консоль
 * 3) (готово!) В TaskController добавить обработчики filterUsersByAge()(Подсказка @GetMapping("/filter/{age}"))
 *    и calculateAverageAge (Подсказка @GetMapping("/calc"))
 * 4) (готово!) В методе filterUsersByAge параметр age получать через аннотацию @PathVariable

 * Задание со звездочкой
 * 1) В классе UserController добавить обработчик userAddFromParam извлекающий данные для создания пользователя
 *    из параметров HTTP запроса
 * 2) Перенести репозиторий проекта с List<User> на базу данных H2
 */

@SpringBootApplication
public class Sem3HomeTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sem3HomeTaskApplication.class, args);
	}

}
