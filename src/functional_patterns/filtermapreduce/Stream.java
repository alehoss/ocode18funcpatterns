package functional_patterns.filtermapreduce;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public interface Stream<T> {

	public void forEach(Consumer<T> consumer);
	public Stream<T> filter(Predicate<T> filterCondition);	
	public Stream<T> map(Function<T,T> mappingFunction);	
	public Stream<T> reduce(BiFunction<T, T, T> reduceFunction);
}
