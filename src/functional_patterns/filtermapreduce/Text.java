package functional_patterns.filtermapreduce;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class Text {

	private List<String> contentLines;

	public Text(List<String> contentLines) {
		super();
		this.contentLines = contentLines;
	}

	public List<String> getContent() {
		return contentLines;
	}

	public Stream<Text> stream() {
		return new ParagraphStream(this);
	}
	
	public Text capitalize() {
		Text newText = new Text(new ArrayList<>());
		newText.getContent().addAll(contentLines.stream().map((line)->{
			return line.toUpperCase();
		}).collect(Collectors.toList()));
		return newText;
	}
	
}
