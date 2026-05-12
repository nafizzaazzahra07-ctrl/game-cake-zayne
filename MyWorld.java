import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World {
    private String pilihan;
    private Counter skor;
    private Counter2 hp;
    
    //constructor 1
    public MyWorld() {
        this("Kue");
    }
    
    //constructor 2
    public MyWorld(String pilihanPemain) {   
        super(300, 500, 1); 
        this.pilihan = pilihanPemain;
    
        //inisialisasi Counter
        skor = new Counter("Score: ");
        hp = new Counter2("HP:");

        //Tambah objek ke world
        addObject(new zayne(),146,373);
        addObject(skor, 60, 470);
        addObject(hp, 240, 470);

        //set hp awal (misal:5)
        hp.setValue(5);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void act() {  
        //memunculkan makanan dari atas secara acak
        if (Greenfoot.getRandomNumber(100)<3) {
            //cek apa yang dipilih pemain di homepage
            if (pilihan.equals("Kue")) {
            addObject(new Kue(), Greenfoot.getRandomNumber(getWidth()),0);
        } else if (pilihan.equals("Buah")) {
            addObject(new Buah(), Greenfoot.getRandomNumber(getWidth()),0);
        } 
    }
}
    //fungsi yang bisa dipanggil oleh kelas lain
    public void tambahSkor() {
        skor.add(1);
    }

    public void kurangHP() {
        hp.add(-1);
        if (hp.getValue() <= 0) {
            
            //skor akhir
            int skorTerakhir = skor.getValue();
            //jeda lihat skor
            Greenfoot.delay(10);
            //pindah ke endpage
            Greenfoot.setWorld(new Endpage(skorTerakhir));
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Kue kue = new Kue();
        addObject(kue,141,260);
        removeObject(kue);
        zayne zayne = new zayne();
        addObject(zayne,147,379);
        removeObject(zayne);
    }
}
