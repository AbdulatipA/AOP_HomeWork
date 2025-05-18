# AOP_HomeWorks :green_book:
**Темы:**
- [Собственные аннотации](https://github.com/AbdulatipA/AOP_HomeWork/tree/master/src/main/java/org/example/startapplication/annotation)
- [Где были вызваны аннотации: метод create(), getAll()](https://github.com/AbdulatipA/AOP_HomeWork/blob/master/src/main/java/org/example/startapplication/service/UserServiceImpl.java)
- [Аспект](https://github.com/AbdulatipA/AOP_HomeWork/blob/master/src/main/java/org/example/startapplication/aspect/AspectExample.java)
- [xml-файл для логов](https://github.com/AbdulatipA/AOP_HomeWork/blob/master/src/main/resources/logback-spring.xml)
- [Логи](https://github.com/AbdulatipA/AOP_HomeWork/blob/master/logs/app.log)


>Требования: cоздать REST контроллер с несколькими методами.

>1. Реализовать собственную аннотацию, например @TrackMethod, которую можно использовать над методами.

>2. Разработать AOP аспект , который перехватывает вызовы методов, помеченных этой аннотацией, и выводит:
>cообщение о начале выполнения метода, cообщение об окончании выполнения метода.

>3. Все методы должны быть доступны через HTTP-запросы (GET/POST).

>4. Использовать стандартные средства Spring Boot: Spring Web, Spring AOP
