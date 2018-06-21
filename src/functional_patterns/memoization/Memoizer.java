package functional_patterns.memoization;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Memoizer<T> {

	private Map<T, T> funcCache = new HashMap<>();

	public Function<T, T> memoize(Function<T, T> func) {

		return x -> funcCache.computeIfAbsent(x, func);
	}
	
	public static void main(String[] args) {
		// lambda to double a number
		Function<Integer, Integer> doubleF = (a) -> 2*a;
		System.out.println(doubleF.apply(3));
		
		Memoizer<Integer> memoizer = new Memoizer<>();
		
		Function<Integer, Integer> doubleFMemoized = 
				memoizer.memoize(doubleF);
		
		System.out.println(doubleFMemoized.apply(3));
		System.out.println(doubleFMemoized.apply(3));		
		System.out.println(doubleFMemoized.apply(6));
		
	}

}
