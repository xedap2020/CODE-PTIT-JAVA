/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codePtit.mang;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class xepHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Event> events = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int arrivalTime = scanner.nextInt();
            int checkInTime = scanner.nextInt();
            events.add(new Event(arrivalTime, 1)); // Sự kiện đến của vị khách
            events.add(new Event(arrivalTime + checkInTime, -1)); // Sự kiện check-in xong của vị khách
        }

        // Sắp xếp danh sách sự kiện theo thời điểm
        events.sort(Comparator.comparingInt(e -> e.time));

        int currentGuests = 0;
        int maxGuests = 0;
        int time = 0;

        for (Event event : events) {
            currentGuests += event.type;
            if (currentGuests > maxGuests) {
                maxGuests = currentGuests;
                time = event.time;
            }
        }

        System.out.println(time);
    }

    // Lớp đại diện cho sự kiện đến hoặc check-in xong của vị khách
    static class Event {
        int time; // Thời điểm đến hoặc thời điểm check-in xong
        int type; // 1 nếu là sự kiện đến, -1 nếu là sự kiện check-in xong

        public Event(int time, int type) {
            this.time = time;
            this.type = type;
        }
    }
}
