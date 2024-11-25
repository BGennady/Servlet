package ru.netology;


import java.util.List;

public class PostService {
  private final PostRepository repository; // репозиторий для работы с данными.

  // конструктор для создания сервиса с репозиторием.
  public PostService(PostRepository repository) {
    this.repository = repository;
  }

  // метод для получения всех постов.
  public List<Post> all() {
    return repository.all(); // делаем запрос в репозиторий для получения всех постов.
  }

  // метод для получения поста по id. если пост не найден, выбрасываем исключение.
  public Post getById(long id) {
    return repository.getById(id).orElseThrow(NotFoundException::new); // если пост не найден, генерируем ошибку.
  }

  // метод для сохранения поста.
  public Post save(Post post) {
    return repository.save(post); // сохраняем пост через репозиторий.
  }

  // метод для удаления поста по id.
  public void removeById(long id) {
    repository.removeById(id); // удаляем пост через репозиторий.
  }
}
