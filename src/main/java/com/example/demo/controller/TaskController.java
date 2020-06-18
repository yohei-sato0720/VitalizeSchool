package com.example.demo.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;


@Component
public class TaskController {
    @Transactional
    @Scheduled(cron = "${scheduler.cron}", zone = "Asia/Tokyo")
    public void taskCronTimeZone() {
        System.out.println("頑張ろうww");
    }

    public static void main(String[] args) {
        System.out.println("タスクを3秒後に実行されるようセットしました。");
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("タスクが実行されました。");
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, 3000);

    }
}