/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.unboxingandauto;

import java.util.*;

/**
 *
 * @author kamau
 */
public class UnboxingAndAUTO {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            // autoboxing by passing as an argument
            // int value is converted to Integer
            // by compiler during compilation

            list.add(i);

        }
        System.out.println(list);

        char c = 'a';
        //autoboxing by assigning a char to Character object
        Character ch = c;
        System.out.println(c);

    }
}
