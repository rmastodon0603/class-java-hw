package org.itstep.task03;


import org.itstep.task02.City;

import java.util.Arrays;

/**
 * Задание 3
 * <p>
 * Создайте класс «Страна» (Country).
 * <p>
 * Необходимо хранить в полях класса:
 * - название страны (name),
 * - название континента (continent),
 * - телефонный код страны (code),
 * - название столицы (capital - класс City),
 * - города страны (cities - массив City).
 * <p>
 * Реализуйте методы класса для ввода данных, вывода
 * данных, реализуйте доступ к отдельным полям через
 * методы класса.
 * <p>
 * Добавить метод addCity для добавления нового города (города хранятся в массиве cities)
 * <p>
 * Метод getInhabitants должен возвращать количество жителей во всех городах страны (перебрать все города
 * в массиве cities и получить сумму жителей всех городов)
 * <p>
 * Реализовать два конструктора: один по умолчанию, второй с параметрами:
 * - название страны (name),
 * - название континента (continent),
 * - телефонный код страны (code),
 * - название столицы (capital).
 * <p>
 * В этом классе должен быть агрегирован класс Города (City) из предыдущей задачи.
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */
public class Country {
    private String name;
    private String continent;
    private String code;
    private City capital;
    private City[] cities;

    public Country() {
    }

    public Country(String name, String continent, String code, City capital) {
        this.name = name;
        this.continent = continent;
        this.code = code;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public City[] getCities() {
        return cities;
    }

    public void addCity(City city){
        if(this.cities == null){
           this.cities = new City[1];
        }
        else {
            this.cities = Arrays.copyOf(this.cities, (this.cities.length + 1));
        }
        this.cities[cities.length-1] = city;
    }

    public int getInhabitants(){
        int inhabitants = 0;
        for (City city : this.cities) {
            inhabitants += city.getInhabitants();
        }
        return inhabitants;
    }
}
