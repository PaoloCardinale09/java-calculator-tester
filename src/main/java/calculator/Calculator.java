package calculator;

public class Calculator {


    // Methods
    // Addizione
    public float add(float num1, float num2) {
        return num1 + num2;
    }

    // Sottrazione
    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    // Divisione
    public float divide(float num1, float num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("ERRORE: non si può dividere un numero per 0");
        } else {
            return num1 / num2;
        }
    }

    // Moltiplicazione
    public float multiply(float num1, float num2) {
        return num1 * num2;
    }
}
