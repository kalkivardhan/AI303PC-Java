public class assignment_p1 {

    public static String normalizeAndValidate(String input) {
    
        if (input == null) {
            return "EMPTY_STRING";
        }
        input = input.trim();

        if (input.isEmpty()) {
            return "EMPTY_STRING";
        }

        if (input.equalsIgnoreCase("admin")) {
            return "RESERVED_WORD";
        }

        input = input.replace("_", " ");

        String lowerCaseInput = input.toLowerCase();
        if (lowerCaseInput.startsWith("temp") && lowerCaseInput.endsWith("user")) {
            input += "_FLAGGED";
        }

        return input;
    }

    public static void main(String[] args) {
        
        System.out.println(normalizeAndValidate("  assignment ")); 
        System.out.println(normalizeAndValidate("  java assignment "));         
        System.out.println(normalizeAndValidate("   "));
        System.out.println(normalizeAndValidate("  java lab"));                
    }
}