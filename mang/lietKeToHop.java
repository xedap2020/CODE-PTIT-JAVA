/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codePtit.mang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lietKeToHop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] combination = new int[K];
        List<int[]> result = new ArrayList<>();

        generateCombinations(1, N, K, combination, result);

        System.out.println(N + " " + K);
        for (int[] c : result) {
            for (int num : c) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("Tong cong co " + result.size() + " to hop");
    }

    static void generateCombinations(int start, int N, int K, int[] combination, List<int[]> result) {
        if (K == 0) {
            int[] newCombination = Arrays.copyOf(combination, combination.length);
            result.add(newCombination);
            return;
        }

        for (int i = start; i <= N; i++) {
            combination[combination.length - K] = i;
            generateCombinations(i + 1, N, K - 1, combination, result);
        }
    }
}
