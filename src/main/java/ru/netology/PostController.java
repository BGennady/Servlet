package ru.netology;

import com.google.gson.Gson; // библиотека для работы с json.

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Reader;

public class PostController {
  public static final String APPLICATION_JSON = "application/json"; // тип контента, который будет использоваться.
  private final PostService service; // сервис для работы с бизнес-логикой.

  // конструктор контроллера, который принимает сервис.
  public PostController(PostService service) {
    this.service = service;
  }

  // метод для обработки запроса на получение всех постов.
  public void all(HttpServletResponse response) throws IOException {
    response.setContentType(APPLICATION_JSON); // устанавливаем тип контента как json.
    final var data = service.all(); // получаем все посты от сервиса.
    final var gson = new Gson(); // инициализируем gson для конвертации в json.
    response.getWriter().print(gson.toJson(data)); // отправляем данные в ответ.
  }

  // метод для обработки запроса на получение поста по id.
  public void getById(long id, HttpServletResponse response) {
    // todo: десериализовать запрос и сериализовать ответ.
  }

  // метод для обработки запроса на сохранение/обновление поста.
  public void save(Reader body, HttpServletResponse response) throws IOException {
    response.setContentType(APPLICATION_JSON); // устанавливаем тип контента.
    final var gson = new Gson(); // инициализируем gson.
    final var post = gson.fromJson(body, Post.class); // преобразуем тело запроса в объект post.
    final var data = service.save(post); // сохраняем пост через сервис.
    response.getWriter().print(gson.toJson(data)); // отправляем ответ в формате json.
  }

  // метод для обработки запроса на удаление поста по id.
  public void removeById(long id, HttpServletResponse response) {
    // todo: десериализовать запрос и сериализовать ответ.
  }
}
