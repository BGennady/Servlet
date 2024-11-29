package ru.netology;


import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
// класс для хранения данных
public class PostRepository {
  // метод для получения всех постов (пока возвращаем пустой список).
  public List<Post> all() {
    return Collections.emptyList();
  }

  // метод для получения поста по id.
  public Optional<Post> getById(long id) {
    return Optional.empty(); // заглушка, возвращает пустое значение.
  }

  // метод для сохранения поста. если id = 0, создаем новый пост, если id != 0, обновляем существующий.
  public Post save(Post post) {
    return post; // пока просто возвращаем переданный объект.
  }

  // метод для удаления поста по id.
  public void removeById(long id) {
    // заглушка, не делает ничего.
  }
}
