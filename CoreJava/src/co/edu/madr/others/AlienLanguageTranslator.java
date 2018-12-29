package co.edu.madr.others;

public class AlienLanguageTranslator implements LanguageTranslator {

	@Override
	public String fromDefaultLanguage(String languageTokens) {
		char [] charArr = languageTokens.toCharArray();
		char [] resArr = new char[charArr.length];
		for (int i = 0; i < charArr.length; i++) {
			resArr[i] = (char)getAlienAscii(charArr[i], 3);
		}
		return String.valueOf(resArr);
	}
	
	@Override
	public String toDefaultLanguage(String languageTokens) {
		char [] charArr = languageTokens.toCharArray();
		char [] resArr = new char[charArr.length];
		for (int i = 0; i < charArr.length; i++) {
			resArr[i] = (char)getAlienAscii(charArr[i], -3);
		}
		return String.valueOf(resArr);
	}
	
	private static int getAlienAscii(char ch, int unit) {
		int res = ch + unit;
		if (Character.isLowerCase(ch)) {
			return res > 'z' ? (ch - 25  + unit) : res;	
		}
		return res > 'Z' ? (ch - 25  + unit) : res;
	}

}
