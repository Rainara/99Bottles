import org.junit.Test;

import static org.junit.Assert.*;

public class SongTest {

    @Test
    public void shouldReturnTheFinalLyricWhenNumberOfBottlesIsZero(){
        BottlesSong bottlesSong = new BottlesSong(0);

        assertEquals(bottlesSong.displaySong(), "No more bottles of beer on the wall, no more bottles of beer. \n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.");
    }

    @Test
    public void shouldReturnThePenultAndFinalLyricsWhenNumberOfBottlesIsOne(){
        BottlesSong bottlesSong = new BottlesSong(1);

        assertEquals(bottlesSong.displaySong(), "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass it around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer. \n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.");
    }

    @Test
    public void shouldReturnTheThirdLastAndPenultAndFinalLyricsWhenNumberOfBottlesIsTwo(){
        BottlesSong bottlesSong = new BottlesSong(2);

        assertEquals(bottlesSong.displaySong(), "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 bottle of beer on the wall.\n" +
                "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass it around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer. \n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.");
    }

    @Test
    public void shouldReturnTheSongInDecrescentLevelAndTheFixedLyricsWhenNumberOfBottlesIsMoreThanTwo(){
        BottlesSong bottlesSong = new BottlesSong(3);

        assertEquals(bottlesSong.displaySong(), "3 bottles of beer on the wall, 3 bottles of beer.\n" +
                "Take one down and pass it around, 2 bottles of beer on the wall.\n" +
                "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 bottle of beer on the wall.\n" +
                "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass it around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer. \n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.");
    }



}