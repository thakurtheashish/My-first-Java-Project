package assignment27april;

public class PrefixSuffixClass {
	
	public boolean isPrefix (String word, String prefix) {
		return word.startsWith(prefix);
	}
	
	public boolean isSuffix (String word, String suffix) {
		return word.endsWith(suffix);
	}

}
