package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 5;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            int seconds_passed = 0;
            while (!isInterrupted()){
                try {
                    Thread.sleep(1000);
                    System.out.print(numSeconds + " ");
                    numSeconds -= 1;
                    seconds_passed +=1;
                    if (seconds_passed > 3){
                        System.out.print("Прервано!");
                        break;
                    }

                    if (numSeconds < 1) {
                        System.out.print("Марш!");
                        break;
                    }
                }catch (InterruptedException e){}
            }
        }
    }
}
