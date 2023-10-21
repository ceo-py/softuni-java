package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 7; i <= 997; i++) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}



// public class _01_NumbersEndingIn7 {
//
//     public static void main(String[] args) {
//
//         // [1 - 1000]
//         // Начало: 7
//         // Край: 997
//         // Стъпка: +10
//
//         // 1ви
//         for (int number = 7; number <= 997; number += 10) {
//
//             System.out.println(number);
//         }
//
//         // 2ри
// //        for (int number = 7; number <= 997; number++) {
// //
// //            if (number % 10 == 7) {
// //                System.out.println(number);
// //            }
// //        }
//     }
// }