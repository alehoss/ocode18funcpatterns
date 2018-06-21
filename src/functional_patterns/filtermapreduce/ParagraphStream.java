package functional_patterns.filtermapreduce;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ParagraphStream implements Stream<Text> {

	private Text text;
		
	ParagraphStream(Text text) {
		this.text = text;
	}

	
	@Override
	public void forEach(Consumer<Text> consumer) {
		int currentLine = 0;
		currentLine = findStartOfParagraph(currentLine);
		int startLine = currentLine;
		while (startLine<text.getContent().size()) {
			currentLine = findEndOfParagraph(currentLine);
			int endLine = currentLine;
			consumer.accept(new Text(text.getContent().subList(startLine, endLine)));	
			currentLine = findStartOfParagraph(currentLine);
			startLine = currentLine;
		}
		
	}

	private boolean isEmptyLine(String line) {
		if (line==null || line.length()==0 || !line.matches(".*[a-zA-Z]+.*")) {
			return true;
		}
		return false;
	}

	private int findStartOfParagraph(int currentLine) {
		while (currentLine<text.getContent().size() && isEmptyLine(text.getContent().get(currentLine))) {
			currentLine++;
		}
		return currentLine;
	}

	private int findEndOfParagraph(int currentLine) {
		while (!isEmptyLine(text.getContent().get(currentLine)) && currentLine<text.getContent().size()) {
			currentLine++;
		}
		return currentLine;
	}


	@Override
	public Stream<Text> filter(Predicate<Text> filterCondition) {
		Text filteredText = new Text(new ArrayList<>());
		forEach(paragraph -> {
			if (filterCondition.test(paragraph)) {
				filteredText.getContent().addAll(paragraph.getContent());
				filteredText.getContent().add(" ");
			}
		});
		return filteredText.stream();
	}


	@Override
	public Stream<Text> map(Function<Text, Text> mappingFunction) {
		Text resultText = new Text(new ArrayList<>());
		forEach(paragraph -> {
			resultText.getContent().addAll(mappingFunction.apply(paragraph).getContent());
			resultText.getContent().add(" ");
		});
		return resultText.stream();
	}


	@Override
	public Stream<Text> reduce(BiFunction<Text, Text, Text> reduceFunction) {
		Text aggregateText = new Text(new ArrayList<>());
		forEach(paragraph -> {
			aggregateText.getContent().addAll
			(reduceFunction.apply(aggregateText,paragraph)
					.getContent());
			aggregateText.getContent().add(" ");			
		});
		
		return aggregateText.stream();
	}

	
	
	
}
