package com.caglacakir.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledExample {

    // 6 parçadan oluşur, sn., dk., h., ayın günü, ay, haftanın günü
    @Scheduled(cron = "0 05 16 * * *")
    //@Scheduled(cron = "*/5 * * * * *") // */5 -> her 5 sn de bir çalış demek
    public void write1to10() {
        for(int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

    }
}
