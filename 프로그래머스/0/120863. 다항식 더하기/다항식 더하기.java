class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ ");
        
        int xCount = 0;      
        int constant = 0;    
        
        for (String term : terms) {
            if (term.contains("x")) {
                String coefficient = term.replace("x", "");
                if (coefficient.isEmpty()) {
                    xCount += 1;  
                } else {
                    xCount += Integer.parseInt(coefficient);
                }
            } else {
                constant += Integer.parseInt(term);
            }
        }
        
        StringBuilder result = new StringBuilder();
        
        if (xCount > 0) {
            if (xCount == 1) {
                result.append("x");
            } else {
                result.append(xCount).append("x");
            }
        }
        
        if (constant > 0) {
            if (result.length() > 0) {
                result.append(" + ");
            }
            result.append(constant);
        }
        
        return result.toString();
    }
}