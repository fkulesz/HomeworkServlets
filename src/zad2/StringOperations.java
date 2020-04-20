package zad2;

public class StringOperations {
  private int numberOfAllCharacters;
  private   int numbersOfAllCharactersWithoutSpaces;
  private   int numbersOfWords;
  private   boolean isPalindrom;

    public String StringOperations(String inputString) {
        this.numberOfAllCharacters = countNumberOfAllCharacters(inputString);
        this.numbersOfAllCharactersWithoutSpaces = countNumberOfAllCharactersWithoutSpaces(inputString);
        this.numbersOfWords = countNumberOfWords(inputString);
        this.isPalindrom = checkPalindrome(inputString);
        String result = "<p>" + inputString + "</p><br>" +
                "<h2>ilosc słów: " + this.numbersOfWords + "</h2><br>" +
                "<h2>ilosc znakow: " + this.numberOfAllCharacters + "</h2><br>" +
                "<h2>ilosc znakow(bez spacji): " + this.numbersOfAllCharactersWithoutSpaces + "</h2><br>" +
                "<h2>Palindrom:  " + this.isPalindrom + "</h2><br>";
        return result;
    }

    private int countNumberOfAllCharacters(String inputString){
        int result = 0;
        result = inputString.length();
        return result;
    }
    private int countNumberOfAllCharactersWithoutSpaces(String inputString){
        int result = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if(inputString.charAt(i) != ' '){
                result ++;
            }
        }
        return result;
    }

    private int countNumberOfWords(String inputString){
        int result = 0;
        if(inputString.isEmpty()){
            return result;
        }
        String[] words = inputString.split("\\s+");
        result = words.length;
        return result;
    }
    private boolean checkPalindrome(String inputString){
        int n = inputString.length();
        for (int i = 0; i < n/2; i++) {
            if(inputString.charAt(i) != inputString.charAt(n-i-1))
                return false;
        }
        return true;
    }
}
