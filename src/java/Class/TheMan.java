/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import javax.swing.JLabel;

/**
 *
 * @author c0660455
 */


/**
 *  Using the Jlabel Library to display the images used for hangman
 * @author c0660455
 */
public class TheMan extends JLabel
{
    /**
     * The images width
     */
    private int WIDTH;
   
    
    /**
     * The images Height
     */
    private int HEIGHT;
   
    
    /**
     * The name of the image that will be used (man_0-5)
     */
    private String Image_Name;
    
    
    /**
     * The folder that images are in
     */
    private String Image_Directory;
    
    
    /**
     * jpg, png, mpeg 
     */
    private String Image_Type;
    
    
    /**
     * the path of the current image
     */
    private String path;
    
    
    /**
     * image that is being displayed
     */
    private BufferedImage Buffer;
    
    
    
    private BufferedImage loadImage(String path) 
    {   
        return null;
    }
    
   private Dimension newDimension(int WIDTH, int HEIGHT) 
   {
       return null;
   }

    
    
    /**
     * default constructor
     */
    public TheMan(){
        
        this ("man", "design/", ".png");
        
    }
    /**
     * Creates the hangman using given information
     * @param img the name of the image
     * @param imgPlace where it is stored
     * @param imgType What kind of image it is
     */
    public TheMan(String img, String imgPlace, String imgType)
    {
        WIDTH = 440;
        HEIGHT = 260;
        
        Image_Name = img;
        Image_Directory = imgPlace;
        Image_Type = imgType;
        
        /**
         *  the "_0" needs to be there so the the man_1-5 can be selected
         */
        setPreferredSize(newDimension(WIDTH,HEIGHT));
        path = Image_Directory + Image_Name + "_0" +  Image_Type;
        Buffer = loadImage(path);
        
    }
    
    
    
}
