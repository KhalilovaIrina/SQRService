package ru.netology.ru.netology.sqr;

public class SQRService {
    public int calcNumberOfSquare(int from, int before) {

        int count = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= from && i * i <= before) {
                count++;
            }
        }
        return (count);
    }

}
