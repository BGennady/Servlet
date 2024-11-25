package ru.netology;

// класс для описания объекта "post" (поста).
public class Post {
  private long id; // идентификатор поста.
  private String content; // содержимое поста.

  // конструкторы для создания поста.
  public Post() {
  }

  public Post(long id, String content) {
    this.id = id; // инициализируем id и содержимое.
    this.content = content;
  }

  // геттеры и сеттеры для id и content.
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
