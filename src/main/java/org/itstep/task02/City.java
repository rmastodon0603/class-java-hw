package org.itstep.task02;

/**
 * Задание 2
 * <p>
 * Создайте класс «Город» (City).
 * <p>
 * Необходимо хранить в полях класса:
 * - название города (name),
 * - название региона (region),
 * - название страны (country),
 * - количество жителей в городе (inhabitants),
 * - почтовый индекс города (index),
 * - телефонный код города (code).
 * <p>
 * Реализуйте методы класса для ввода данных, вывода данных,
 * реализуйте конструктор с параметром и по умолчанию, геттеры и сеттеры для полей.
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */
public class City {
    private String name;
    private String region;
    private String country;
    private int inhabitants;
    private String index;
    private String code;

    public City() {
    }

    public City(String name, String region, String country, int inhabitants, String index, String code) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.inhabitants = inhabitants;
        this.index = index;
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public int getInhabitants() {
        return inhabitants;
    }

    public String getIndex() {
        return index;
    }

    public String getCode() {
        return code;
    }
}
