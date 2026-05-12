import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class zayne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class zayne extends Actor
{
    /**
     * Act - do whatever the zayne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        kontrolGerakan();
        makan();
    }
    
    public void kontrolGerakan() {
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+4,getY());
        }
        else if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-4, getY());
        }
        
        //loncat & gravitasi
        //if(Greenfoot.isKeyDown("up")) setLocation (getX(),getY()-6);
        //else setLocation(getX(), getY()+4);
    }
        public void makan() {
            //cek tabrakan dengan makanan
            Actor dapetMakanan = getOneIntersectingObject(Makanan.class);
            if (dapetMakanan != null) {
                MyWorld world = (MyWorld)getWorld();
                world.tambahSkor(); //panggil fungsi di MyWorld
                world.removeObject(dapetMakanan);
        }
    }
}