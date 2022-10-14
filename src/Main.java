public class Main {
    public static void main(String[] args) {
        // Variables
        System.out.println("Type in a sentence or more: ");
        Scanner keyboard = new Scanner(System.in);
        String words = keyboard.nextLine();

        boolean charCountDoSomething = false;

        int char_count = 0;
        int word_count = 1;
        int sentence_count = 0;
        int syllable_count = 0;

        double wordsPerSentence = 0.0;
        double syllablesPerSentence = 0.0;
        double readability_level = 0.0;

        // Reading level maybe

        // Characters
        for (int i = 0; i < words.length();i++)
        {
            if (words.charAt(i) != ' ')
            {
                char_count += 1;
            }
        }

        // Words

        for (int i = 0; i < words.length();i++)
        {
            if (words.charAt(i) == ' ')
            {
                word_count += 1;
            }
        }

        // Sentences

        for (int i = 0; i < words.length();i++)
        {
            if (words.charAt(i) == '!' || words.charAt(i) == '?' || words.charAt(i) == '.')
            {
                sentence_count += 1;
            }
        }

        // Readability level calculator

        // Average syllables
        for (int i = 0; i < words.length();i++)
        {
            if (words.charAt(i) == 'a' || words.charAt(i) == 'e' || words.charAt(i) == 'i' || words.charAt(i) == 'o'  || words.charAt(i) == 'u')
            {
                syllable_count += 1;
            }
        }

        wordsPerSentence = word_count / (sentence_count + 0f);
        syllablesPerSentence = syllable_count / (word_count + 0f);

        readability_level = ((0.39 * wordsPerSentence) + (11.8 * syllablesPerSentence) - 15.59);


        // Boolean Expressions
        if (char_count >= 50)
        {
            charCountDoSomething = true;
        }

        if (charCountDoSomething == true)
        {
            System.out.println("You have a lot of characters.");
        }
        else
        {
            System.out.println("You should really try to type more characters.");
        }

        // IndexOf
        System.out.println("Type in a character that you want the index of");
        keyboard
        words.indexOf("z");




        // Getting the substring of a word from the user
        System.out.println("Please type in the index of the first char.");
        int c1IND = keyboard.nextInt();
        System.out.println("Please type in the index of the second char.");
        int c2IND = keyboard.nextInt();
        String subWord = words.substring(c1IND, c2IND);



        // Print Statements
        System.out.println("Char count is " + char_count);
        System.out.println("Word count is " + word_count);
        System.out.println("Sentence count is " + sentence_count);
        System.out.println("The subword of the sentence is, " + subWord + ".");
        System.out.println("The readability level of our paragraph is: " + readability_level);

        double avgs = (char_count + word_count + sentence_count) / 3.0;
        System.out.println("Average of char count, word count, and sentence count is: " + avgs);
    }
}