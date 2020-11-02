package org.itstep.task07;
/**
 * Задание 7
 * <p>
 * Разработать  программу  для  представления  комплексных  чисел с возможностью задания
 * вещественной и мнимой частей числами типа double.
 * <p>
 * Вещественная часть должна быть представлена приватным полем real, а мнимая - imaginary
 * <p>
 * Реализовать конструктор с параметрами и по умолчанию
 * <p>
 * Обеспечить выполнение операций:
 * - сравнения чисел (equals) - возвращает boolean
 * - сложения (plus);
 * - вычитания (minus);
 * - умножения (times).
 *
 * Методы plus, minus, times должны возвращать экземпляр класса Complex
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */
public class Complex {
    private double real;
    private double imaginary;

    public Complex() {
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public String toString(){
        if(imaginary == 0){
            return String.valueOf(this.real);
        }
        if(real == 0){
            return String.valueOf(this.imaginary) + "i";
        }
        if(imaginary < 0){
            return String.valueOf(this.real) + " - " + String.valueOf(-(this.imaginary)) + "i";
        }
        return String.valueOf(this.real) + " + " + String.valueOf(this.imaginary) + "i";
    }

    public Complex plus(Complex that){
        Complex result = new Complex();
        result.real = this.real + that.real;
        result.imaginary = this.imaginary + that.imaginary;
        return result;
    }

    public Complex minus(Complex that){
        Complex result = new Complex();
        result.real = this.real - that.real;
        result.imaginary = this.imaginary - that.imaginary;
        return result;
    }

    public Complex times(Complex that){
        Complex result = new Complex();
        result.real = this.real * that.real - this.imaginary * that.imaginary;
        result.imaginary = this.real * that.imaginary + this.imaginary * that.real;
        return result;
    }
}
