public class BottlesSong {

    private static final String noBottles = "No more bottles of beer on the wall, no more bottles of beer. \n" +
            "Go to the store and buy some more, 99 bottles of beer on the wall.";
    private static final String oneBottle = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
            "Take one down and pass it around, no more bottles of beer on the wall.";
    private static final String twoBottles = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
            "Take one down and pass it around, 1 bottle of beer on the wall.";

    public BottlesSong() {
    }

    public String verse(int numberOfBottles) {
        switch (numberOfBottles) {
            case 0 : return noBottles;
            case 1 : return oneBottle;
            case 2 : return twoBottles;
            default: return numberOfBottles + " bottles of beer on the wall, "+ numberOfBottles +" bottles of beer.\n"
                    + "Take one down and pass it around, "+ (numberOfBottles -1) +" bottles of beer on the wall.";
        }

    }

    public String rangeVerses(int initial, int ending) {
        String rangeVerse="";
        for (int i = initial; i>ending; i--){
            rangeVerse = rangeVerse + verse(i) + "\n";
        }
        return rangeVerse + verse(ending);
    }

    public String displaySong() {
        return rangeVerses(99,0);
    }


}
