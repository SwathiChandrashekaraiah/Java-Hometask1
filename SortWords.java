public class SortWords {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        String[] words = extractWords(text);
        bubbleSort(words);
        displaySortedWords(words);
    }

    // Extract words from the text using regular expression
    public static String[] extractWords(String text) {
        String[] words = text.split("\\s+|\\p{Punct}");
        return words;
    }

    // Bubble sort to sort words in alphabetical order
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    // Swap elements arr[i-1] and arr[i]
                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    // Display sorted words
    public static void displaySortedWords(String[] arr) {
        System.out.println("Words sorted in alphabetical order:");
        for (String word : arr) {
            System.out.println(word);
        }
    }
}
