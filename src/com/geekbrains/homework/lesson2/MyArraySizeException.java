package com.geekbrains.homework.lesson2;

public class MyArraySizeException extends RuntimeException{

    public MyArraySizeException() {
        super("Неверный размер массиваЮ,требуется 4x4");
    }
}
