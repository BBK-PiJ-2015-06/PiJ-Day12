public class PersonName {
	
	public String getInitials(String fullName) {
		String result = "";
		String[] words = fullName.split(" ");
		for (int i = 0; i < words.length; i++) {
			String trimmedWord = words[i].trim();
			if(trimmedWord.length() > 0) {
				String nextInitial = "" + trimmedWord.charAt(0);
				result = result + nextInitial.toUpperCase();
			}
		}
		return result;
	}
	
}