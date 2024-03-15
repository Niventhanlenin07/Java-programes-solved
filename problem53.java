class problem53{
    public static void main(String[] args) {
        String input = "a1b10";
        String output = repeatCharacters(input);
        System.out.println(output);
    }

    public static String repeatCharacters(String input) {
        StringBuilder result = new StringBuilder();
        char currentChar = ' ';
        int count = 0;
        boolean readingNumber = false;
        StringBuilder numberBuilder = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                if (readingNumber) {
                    int repeatCount = Integer.parseInt(numberBuilder.toString());
                    for (int i = 0; i < repeatCount; i++) {
                        result.append(currentChar);
                    }
                    readingNumber = false;
                    numberBuilder.setLength(0);
                }
                currentChar = c;
            } else if (Character.isDigit(c)) {
                if (!readingNumber && c == '0' && numberBuilder.length() == 0) {
                    continue;
                }
                readingNumber = true;
                numberBuilder.append(c);
            }
        }

        if (readingNumber) {
            int repeatCount = Integer.parseInt(numberBuilder.toString());
            for (int i = 0; i < repeatCount; i++) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
