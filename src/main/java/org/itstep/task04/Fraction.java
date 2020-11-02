package org.itstep.task04;
/**
 * Задание 4
 * Создайте класс Дробь (Fraction).
 * <p>
 * Необходимо хранить в полях класса: числитель и знаменатель.
 * <p>
 * Реализуйте геттеры/сеттеры для полей класса.
 * <p>
 * Также создайте методы класса для выполнения арифметических операций:
 * - сложение (addition).
 * - вычитание (subtraction),
 * - умножение (multiplication),
 * - деление (division).
 * <p>
 * Методы должны принимать в качестве аргумента вторую дробь (Fraction) и
 * возвращать результат в виде дроби (Fraction).
 * <p>
 * Создайте два конструктора: по умолчанию, и с параметрами
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction addition(Fraction two){
        Fraction result = new Fraction();
        result.setNumerator(this.getNumerator() + two.getNumerator());
        result.setDenominator(this.getDenominator());
        for(int i = result.getDenominator(); i > 0; i--){
            if(result.getNumerator()%i == 0 && result.getDenominator()%i == 0){
                result.setNumerator(result.getNumerator()/i);
                result.setDenominator(result.getDenominator()/i);
                break;
            }
        }
        return result;
    }

    public Fraction multiplication(Fraction two){
        Fraction result = new Fraction();
        result.setNumerator(this.getNumerator() * two.getNumerator());
        result.setDenominator(this.getDenominator() * two.getDenominator());
        for(int i = result.getDenominator(); i > 0; i--){
            if(result.getNumerator()%i == 0 && result.getDenominator()%i == 0){
                result.setNumerator(result.getNumerator()/i);
                result.setDenominator(result.getDenominator()/i);
                break;
            }
        }
        return result;
    }

    public Fraction division(Fraction two){
        Fraction result = new Fraction();
        result.setNumerator(this.getNumerator() * two.getDenominator());
        result.setDenominator(this.getDenominator() * two.getNumerator());
        for(int i = result.getDenominator(); i > 0; i--){
            if(result.getNumerator()%i == 0 && result.getDenominator()%i == 0){
                result.setNumerator(result.getNumerator()/i);
                result.setDenominator(result.getDenominator()/i);
                break;
            }
        }
        return result;
    }

    public Fraction subtraction(Fraction two){
        Fraction result = new Fraction();
        result.setNumerator(this.getNumerator() - two.getNumerator());
        result.setDenominator(this.getDenominator());
        for(int i = result.getDenominator(); i > 0; i--){
            if(result.getNumerator()%i == 0 && result.getDenominator()%i == 0){
                result.setNumerator(result.getNumerator()/i);
                result.setDenominator(result.getDenominator()/i);
                break;
            }
        }
        return result;
    }
}
