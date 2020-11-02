package org.itstep.task06;

import java.util.Arrays;

/**
 * Задание
 * Описать  базовый  класс  MainString  (Строка).
 * <p>
 * Обязательные поля класса:
 * - массив символов (chars);
 * - значение типа int хранит длину строки в символах (len).
 * <p>
 * Реализовать  обязательные  методы  следующего  назначения:
 * - конструктор без параметров;
 * - конструктор, принимающий в качестве параметра строковый литерал;
 * - конструктор, принимающий в качестве параметра символ и длину строки;
 * - метод получения длины строки (length());
 * - метод очистки строки (делает строку пустой) (clear());
 * - метод конкатенации (соединяет две строки типа MainString) (concat);
 * - метод поиска символа в строке (indexOf()).
 * - метод toString(), который возвращает строковое представление объекта
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */
public class MainString {
    private char[] chars;
    private int len;

    public MainString() {
    }

    public MainString(char ch, int len) {
        this.chars = new char[len];
        for(int i =0; i < len; i++){
            this.chars[i] = ch;
        }
        this.len = len;
    }


    public MainString(String string){
        this.len = string.length();
        this.chars = new char[len];
        for(int i = 0; i < len; i++){
            this.chars[i] = string.charAt(i);
        }
    }

    public int length(){
        return this.chars.length;
    }

    public void clean(){
        this.chars = new char[0];
    }

    public String toString() {
        return new String(this.chars);
    }

    public MainString concat(MainString two){
        MainString result = new MainString();
        result.len = this.chars.length + two.chars.length;
        result.chars = Arrays.copyOf(this.chars, result.len);
        for(int i = this.chars.length, k = 0; i < result.chars.length; i++, k++){
            result.chars[i] = two.chars[k];
        }
        return result;
    }

    public int indexOf(int asii){
        for(int i = 0; i < this.len; i++){
            if(this.chars[i] == (char)asii){
                return i;
            }
        }
        return -1;
    }

}
