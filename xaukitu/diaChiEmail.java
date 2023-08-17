/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codePtit.xaukitu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class diaChiEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc kí tự xuống dòng sau số lượng xâu họ tên

        List<String> emails = new ArrayList<>();
        Map<String, Integer> emailCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String fullName = scanner.nextLine();

            String email = generateEmail(fullName, emailCount);
            emails.add(email);
        }

        for (String email : emails) {
            System.out.println(email);
        }
    }

    private static String generateEmail(String fullName, Map<String, Integer> emailCount) {
        String[] nameParts = fullName.trim().split("\\s+");

        String firstName = nameParts[0].toLowerCase();
        String lastName = nameParts[nameParts.length - 1].toLowerCase();

        StringBuilder email = new StringBuilder();
        email.append(lastName).append(firstName.charAt(0));

        String generatedEmail = email.toString();
        int counter = emailCount.getOrDefault(generatedEmail, 1);
        emailCount.put(generatedEmail, counter + 1);

        if (counter > 1) {
            generatedEmail += counter;
        }

        return generatedEmail + "@ptit.edu.vn";
    }

    
}
