package ru.netology.service;

public class Main {
    public static void main(String[] args) {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1100);
        System.out.println(result);
    }

}
