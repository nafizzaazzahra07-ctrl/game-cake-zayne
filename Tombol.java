import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tombol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tombol extends Actor
{
    private String jenis;

    // CONSTRUCTOR: Menentukan identitas tombol saat dibuat
    public Tombol(String namaTombol) {
        this.jenis = namaTombol;
        
        // Atur gambar 
        if (jenis.equals("kue")) {
            setImage("kue1.png"); 
        } else if (jenis.equals("buah")) {
            setImage("pear.png");
        } else if (jenis.equals("exit")) {
            setImage("EXIT.png");
        }
    }

    public void act() 
    {
        // Logika klik tombol
        if (Greenfoot.mouseClicked(this)) {
            if (jenis.equals("kue")) {
                Greenfoot.setWorld(new MyWorld("Kue")); 
            } 
            else if (jenis.equals("buah")) {
                Greenfoot.setWorld(new MyWorld("Buah")); 
            }
            else if (jenis.equals("exit")) {
                Greenfoot.setWorld(new Homepage());
            }
        }
    }
}