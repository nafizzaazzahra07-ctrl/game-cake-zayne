import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Makanan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Makanan extends Actor
{
    /**
     * Act - do whatever the Makanan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //jika sudah dihapus berhenti melakukan aksi
        if (getWorld() == null) { 
            return;
        }
        setLocation(getX(), getY() +3); // Kecepatan jatuh
        
        //cek apakah kue masih ada di dunia
        if (getWorld() == null) return;
        
        //Jika menyentuh batas bawah layar
        if (getY() >= getWorld().getHeight() - 1) {
            MyWorld world = (MyWorld)getWorld();
            world.kurangHP(); //panggil fungsi kurang hp di MyWorld
            world.removeObject(this);
        }
    }
}
