package org.itstep.task01;

/**
 * Задание 1
 * <p>
 * Создайте класс «Человек» (Human).
 * <p>
 * Необходимо хранить в полях класса:
 * - ФИО (fullName),
 * - дату рождения (dateOfBirth),
 * - контактный телефон (phone),
 * - город (city),
 * - страну (country),
 * - домашний адрес (address).
 * <p>
 * Реализуйте методы класса для ввода данных, вывода данных, реализуйте
 * доступ к отдельным полям через методы аксессоры.
 * <p>
 * Создайте два конструктора: один по умолчанию, другой - со 6 параметрами
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */
public class Human {
    private String fullName;
    private String dateOfBirth;
    private String phone;
    private String city;
    private String country;
    private String address;

    Human() {
    }

    Human(String fullName, String dateOfBirth, String phone, String city, String country, String address) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }
}
