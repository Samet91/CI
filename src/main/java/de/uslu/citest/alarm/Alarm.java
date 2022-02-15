package de.uslu.citest.alarm;

    public class Alarm {

        public static String checkNumberOfCustomers(int numberOfCustomers, AlarmLevel alarmLevel) {
            return alarmLevel.getMessage(numberOfCustomers);
        }

    }


