package org.itstep.task05;
/**
 * Создать  класс  Money  (Деньги)  для  работы  с  денежными  суммами.
 * <p>
 * Число должно быть представлено двумя полями:
 * - типа long (hryvnia)  – для гривен;
 * - типа byte (kopecks) – для копеек.
 * <p>
 * Добавить сеттеры и геттеры для полей
 * <p>
 * Добавить три конструктора: по умолчанию и два с параметрами (первый принимает только гривны, второй - гривны и копейки)
 * <p>
 * Реализовать вывод значения на экран, при этом дробная часть должна быть отделена от целой части запятой.
 * <p>
 * Реализовать:
 * - сложение (addition).
 * - вычитание (subtraction),
 * - умножение (multiplication),
 * - деление на дробное число (division),
 * - умножение на дробное (метод multiply) число
 * - операции сравнения (метод equals) возвращает boolean.
 * <p>
 * Методы сложения, вычитания, умножения должны принимать другой объект Money
 * <p>
 * Все методы, кроме equals, возвращают результат типа Money
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 *
 * Примечание: не учитывать номиналы купюр и монет
 */
public class Money {
    private long hryvnia;
    private byte kopecks;

    public Money() {
    }

    public Money(long hryvnia) {
        this.hryvnia = hryvnia;
    }

    public Money(long hryvnia, byte kopecks) {
        this.hryvnia = hryvnia;
        this.kopecks = kopecks;
    }

    public long getHryvnia() {
        return hryvnia;
    }

    public void setHryvnia(long hryvnia) {
        this.hryvnia = hryvnia;
    }

    public byte getKopecks() {
        return kopecks;
    }

    public void setKopecks(byte kopecks) {
        this.kopecks = kopecks;
    }

    public Money addition(Money two){
        return new Money((this.hryvnia + two.hryvnia), (byte)(this.kopecks + two.getKopecks()));
    }

    public Money subtraction(Money two){
        return new Money((this.hryvnia - two.hryvnia), (byte)(this.kopecks - two.getKopecks()));
    }

    public Money multiply(double num){
        return new Money((long)(this.hryvnia * num), (byte)(this.kopecks * num));
    }

    public Money division(double num){
        return new Money((long)(this.hryvnia / num), (byte)(this.kopecks / num));
    }

    public boolean equals(Money two){
        return this.hryvnia == two.getHryvnia() && this.kopecks == two.getKopecks();
    }
}
