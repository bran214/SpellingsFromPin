import java.util.ArrayList;

public class SpellingsFromPin {

    public static void main(String[] args) {
        System.out.println(allPossibleSpellings(5282));
        System.out.println(allPossibleSpellings(5282).size());
    }

    public static ArrayList<String> allPossibleSpellings(int number) {
        ArrayList<String> result = new ArrayList<>();
        if (number < 0) {
            result.add("Invalid.");
        } else if (number < 10) {
            switch (number) {
                case 1:
                    result.add(" ");
                    break;
                case 2:
                    result.add("a");
                    result.add("b");
                    result.add("c");
                    break;
                case 3:
                    result.add("d");
                    result.add("e");
                    result.add("f");
                    break;
                case 4:
                    result.add("g");
                    result.add("h");
                    result.add("i");
                    break;
                case 5:
                    result.add("j");
                    result.add("k");
                    result.add("l");
                    break;
                case 6:
                    result.add("m");
                    result.add("n");
                    result.add("o");
                    break;
                case 7:
                    result.add("p");
                    result.add("q");
                    result.add("r");
                    result.add("s");
                    break;
                case 8:
                    result.add("t");
                    result.add("u");
                    result.add("v");
                    break;
                case 9:
                    result.add("w");
                    result.add("x");
                    result.add("y");
                    result.add("z");
                    break;
                case 0:
                    result.add(" ");
                    break;
            }
        } else {
            for (String letter : allPossibleSpellings(number % 10)) {
                for (String shorter : allPossibleSpellings(number / 10)) {
                    result.add(shorter + letter);
                }
            }
        }
        return result;
    }
}
