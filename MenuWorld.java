import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;

/**
 * Write a description of class MenuWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuWorld extends World
{

  
    public MenuWorld()
    {    
        // Create a new world with 300x500 cells with a cell size of 1x1 pixels.
        super(300, 500, 1);
        
        tampilkanTeks();
        prepare();
    }

    private void tampilkanTeks()
    {
        GreenfootImage bg = getBackground();
        
        String pesan = "Pilih Makanan";
        int ukuranFont = 26;
        bg.setFont(new Font("Times New Roman", true, false, ukuranFont));
        bg.setColor(Color.BLUE);
        
        //Atur posisi teks di tengah
        int x = 110 - (pesan.length() * 4);
        bg.drawString(pesan, x, 100);
    }
    private void prepare()
    {
    // Menambahkan objek tombol & Menentukan posisi tombol
    addObject(new Tombol("kue"), 150, 200);
    addObject(new Tombol("buah"), 150, 300);
    addObject(new Tombol("exit"), 150, 420);
    }
}
