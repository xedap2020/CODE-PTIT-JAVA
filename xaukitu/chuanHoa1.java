/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codePtit.xaukitu;

import java.util.Scanner;

public class chuanHoa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int testCases = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < testCases; i++) {
            String fullName = scanner.nextLine();

            String normalizedFullName = normalizeFullName(fullName);
            System.out.println(normalizedFullName);
        }
    }

    private static String normalizeFullName(String fullName) {
        String[] nameParts = fullName.trim().split("\\s+");
        
        StringBuilder result = new StringBuilder();
        for (String namePart : nameParts) {
            if (!namePart.isEmpty()) {
                String normalizedPart = namePart.substring(0, 1).toUpperCase() + namePart.substring(1).toLowerCase();
                result.append(normalizedPart).append(" ");
            }
        }
        
        return result.toString().trim();
    }
}
