package org.example;

import java.util.Scanner;

public class HW2210 {
    void getcoffee(int button){

        switch (button){
        case 1-> System.out.println("Приготовление эспрессо");
        case 2 -> System.out.println("Приготовление американо - эспрессо + добавление воды");
        case 3 -> System.out.println("Приготовление капучино - эспрессо + добавление вспененного молока");
        case 4 -> System.out.println("Приготовление чая - выбор чайного пакетика + добавление воды");
            default -> System.out.println("no such coffee available");
        }
    }

    public static void main(String[] args) {
        System.out.println("Выберите напиток: ");
        HW2210 hw2210 = new HW2210();
        Scanner scanner=new Scanner(System.in);
        hw2210.getcoffee(scanner.nextInt());
    }
}

