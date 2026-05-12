import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Endpage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Endpage extends World
{

    /**
     * Constructor for objects of class Endpage.
     * 
     */
    public Endpage(int skor)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        //Tampilkan tulisan game over
        showText("GAME OVER", 150,200);
        //Tampilkan skor
        showText("Final Score: " + skor, 150, 250);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    //Tambahkan tombol play lagi
    addObject(new play(), 150, 350);
    }
}
