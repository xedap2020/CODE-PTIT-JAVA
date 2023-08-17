/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codePtit.xaukitu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class tapTuRieng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int testCases = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < testCases; i++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            
            List<String> result = findUniqueWords(s1, s2);
            StringBuilder output = new StringBuilder();
            for (String word : result) {
                output.append(word).append(" ");
            }
            System.out.println(output.toString().trim());
        }
    }

    private static List<String> findUniqueWords(String s1, String s2) {
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        
        Set<String> set1 = new HashSet<>(Arrays.asList(words1));
        Set<String> set2 = new HashSet<>(Arrays.asList(words2));
        
        List<String> uniqueWords = new ArrayList<>();
        for (String word : set1) {
            if (!set2.contains(word)) {
                uniqueWords.add(word);
            }
        }
        Collections.sort(uniqueWords);
        
        return uniqueWords;
    }
}
