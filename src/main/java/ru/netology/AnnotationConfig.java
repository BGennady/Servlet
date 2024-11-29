package ru.netology;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
// конфигурационный класс
@ComponentScan // автоматически сканирует пакеты для поиска аннотированных компонентов
public class AnnotationConfig {
    public static void main(String[] args) {
        final var context = new AnnotationConfigApplicationContext("ru.netology");

        // получение бина по имени
        final var controller = context.getBean("postController");

        // получение бина по классу
        final var service = context.getBean(PostService.class);

        // получаем бин репозитория
        final var repository = context.getBean(PostRepository.class);
    }
}

