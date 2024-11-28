package ru.netology;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // помечает класс как конфигурацию spring
public class AppConfig {

    @Bean // бин для репозитория
    public PostRepository postRepository(){
        return new PostRepository();
    }
    @Bean // бин для сервиса
    public PostService postService(PostRepository postRepository) {
        return new PostService(postRepository);
    }

    @Bean // бин для контроллера
    public PostController postController(PostService postService){
        return new PostController(postService);
    }
}
