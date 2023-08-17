/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codePtit.xaukitu;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class chuanHoa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        for (int i = 0; i < n; i++) {
            String fullName = scanner.nextLine();

            String normalizedFullName = normalizeFullName(fullName);
            System.out.println(normalizedFullName);
        }
    }

    private static String normalizeFullName(String fullName) {
        String[] nameParts = fullName.trim().split("\\s+");
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 1; i < nameParts.length; i++) {
            String namePart = nameParts[i];
            if (!namePart.isEmpty()&& i!= nameParts.length - 1) {
                String normalizedPart = namePart.substring(0, 1).toUpperCase() + namePart.substring(1).toLowerCase();
                result.append(normalizedPart).append(" ");
            } else{
                String normalizedPart = namePart.substring(0, 1).toUpperCase() + namePart.substring(1).toLowerCase();
                result.append(normalizedPart);
            }
        }
        
        result.append(", ");
        result.append(nameParts[0].toUpperCase());
        return result.toString().trim();
    }
}
