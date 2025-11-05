import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.",
            "---", ".--.", "--.-", ".-.", "...", "-", "..-",
            "...-", ".--", "-..-", "-.--", "--.."
        };
        
        HashMap<String, Character> morseMap = new HashMap<>();
        for (int i = 0; i < morse.length; i++) {
            morseMap.put(morse[i], (char)('a' + i));
        }
        
        String[] morseCode = letter.split(" ");
        StringBuilder answer = new StringBuilder();
        
        for (String code : morseCode) {
            answer.append(morseMap.get(code));
        }
        
        return answer.toString();
    }
}