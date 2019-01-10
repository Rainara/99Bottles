public class BottlesSong {

    private int numberOfBottles;
    private String song = "";

    private static final String noBottles = "No more bottles of beer on the wall, no more bottles of beer. \n" +
            "Go to the store and buy some more, 99 bottles of beer on the wall.";
    private static final String oneBottle = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
            "Take one down and pass it around, no more bottles of beer on the wall.\n";

    public BottlesSong(int numberOfBottles) {
        this.numberOfBottles = numberOfBottles;
    }

    private String defineSingularOrPlural() {
        return ((numberOfBottles-1) > 1) ? "bottles" : "bottle";
    }

    public String displaySong() {
        if(numberOfBottles==0){
            return noBottles;
        }
        while (numberOfBottles>1){
            song = song + numberOfBottles + " bottles of beer on the wall, " + numberOfBottles + " bottles of beer.\n" +
                    "Take one down and pass it around, " + (numberOfBottles -1) + " " + defineSingularOrPlural()
                    + " of beer on the wall.\n";
            numberOfBottles--;
        }
        return song + oneBottle + noBottles;
    }

    public static void main(String[] args) {
        BottlesSong bottlesSong = new BottlesSong(99);
        System.out.println(bottlesSong.displaySong());
    }
}
