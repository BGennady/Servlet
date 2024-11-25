package ru.netology;

// класс для генерации исключений, если ресурс не найден.
public class NotFoundException extends RuntimeException {

  // конструкторы для создания исключений с разными параметрами.
  public NotFoundException() {
  }

  public NotFoundException(String message) {
    super(message); // создаем исключение с сообщением.
  }

  public NotFoundException(String message, Throwable cause) {
    super(message, cause); // создаем исключение с сообщением и причиной.
  }

  public NotFoundException(Throwable cause) {
    super(cause); // создаем исключение с причиной.
  }

  public NotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace); // полный конструктор для кастомизации.
  }
}
