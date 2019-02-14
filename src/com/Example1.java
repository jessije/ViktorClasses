package com;

 class Robot {

        int age;
        String name;

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
        public void speak(String text) {
            System.out.println(text);
        }
    }

    public class Example1 {
        public static void main(String[] args) {

Robot robot = new Robot();

            robot.speak("wtf");

        }

    }

