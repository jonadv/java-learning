/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgA;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Jonathan
 */
public class clsA {

    public static Function<String,String> swap = s -> {
	if(s.equals("Australia"))
		return "New Zealand";
	else
		return s;
	};
    public static void main(String[] args) {
        clsA a = new clsA();

        Set<String> islandNations = Set.of("Australia", "Japan", "Taiwan", "Cyprus", "Cuba");
        islandNations = islandNations.stream()
//                .peek(System.out::println)
                .map(swap)
//                .peek(System.out::println)
                .map(n -> n.substring(0, 1))
                .peek(System.out::println)
                .collect(Collectors.toSet());
        System.out.println("");
        for (String s : islandNations) {
            System.out.print(s);
        }
        

        DoubleFunction<Double> area = r -> Math.PI*r*r;
        BiFunction<Integer, Integer, Integer> divide = (x, y) -> x/y;
        DoublePredicate<Integer, Integer> test = (x, y) -> x == y;
        IntPredicate test = x -> x == 10;
    }

}
