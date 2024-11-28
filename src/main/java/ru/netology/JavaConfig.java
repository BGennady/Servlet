package ru.netology;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration // помечает класс как конфигурацию Spring
@ComponentScan(basePackages = "ru.netology") // автоматически сканирует пакеты для поиска аннотированных компонентов
public class JavaConfig {

    @Bean // метод для создания PostRepository
    public PostRepository postRepository() {
        return new PostRepository(); // возвращаем экземпляр PostRepository
    }

    @Bean // метод для создания PostService
    public PostService postService(PostRepository postRepository) {
        return new PostService(postRepository); // возвращаем экземпляр PostService с зависимостью от PostRepository
    }

    @Bean // метод для создания PostController
    public PostController postController(PostService postService) {
        return new PostController(postService); // возвращаем экземпляр PostController с зависимостью от PostService
    }
}
