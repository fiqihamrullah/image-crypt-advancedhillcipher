/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imagesecurityadvancedhillcipher;

import entity.BitmapImage;
import java.text.DecimalFormat;
import java.util.Random;


/**
 *
 * @author Fiqih Amrullah
 */
public class SecurityAnalysis {
      
    private BitmapImage bmpOri,bmpCipher;
    
    private int[][] CountEL;
    private double frequency;
    private double entropy;   
    private double npcr;
    private double uaci;
    private double coefCor;
    private int width;
    private int height;
    
    public SecurityAnalysis(BitmapImage bmpOri,BitmapImage bmpCipher)
    {
        this.bmpOri = bmpOri;
        this.bmpCipher = bmpCipher;
        width = bmpOri.getWidth();
        height = bmpOri.getHeight();
        
        
    }
    
    private int[][] countFrequency()
    {
        int freqs[][] = new int[1][256];
        for (int i = 0; i < bmpCipher.getHeight() ; i++) {
            for (int j = 0; j <  bmpCipher.getWidth(); j++) {                
               
                int gray = bmpCipher.getPixel(i, j);
                freqs[0][gray]++;
                
            }
        }
        return freqs;
    }
    
    public double InformationEntropy()
    {
     CountEL = countFrequency();
        
     for(int i=0; i<256;i++){
      frequency = (double)CountEL[0][i]/ (height*width);
     
      if(frequency == 0)
      {
        entropy = 0;   
      }
      else{
            entropy -= frequency * (Math.log(frequency)/Math.log(2));
          }
      }
     
     return entropy;    
    }
    
    public double NPCR()
    {
        
        int D[][] = new int[width][height];
        int totalC = 0;
        npcr =0.0;
        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                
                if(bmpOri.getPixel(j, i) == bmpCipher.getPixel(j, i)){
                   totalC+= 0;
                }else{
                   totalC+= 1; 
                }
            }
        }
        
        npcr = ((double)totalC / (double)(width*height)) *100;
        return npcr;
    }
    
    public double UACI(){
        uaci = 0.0;
        double totalC = 0.0;
        
        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
            
                totalC += (double)(Math.abs((bmpOri.getPixel(j, i) - bmpCipher.getPixel(j, i)))) / (double)255;
        
            }
        }
        
        uaci = ((double)totalC /  (double)(width*height)) *100;
        
        return uaci;
    }
    
    public double CorrelationCoef(int[][] pxl, int range, String sample){   
        
        double meanX;
        double totalX = 0;
        double meanY;
        double totalY = 0;
        double cov;
        double Dx;
        double Dy;
        double t1,t2,t3;
        
        DecimalFormat dec = new DecimalFormat("###.#####");
        
        int x[] = new int[range];        
        int y[] = new int[range];
        
        Random rand = new Random();

        for(int i=0;i<range;i++){            
          
            if(sample.equals("horizontal"))
            {
                int w1 = rand.nextInt(width-1) ;
                int h1 = rand.nextInt(height);

                x[i] = pxl[h1][w1];
                y[i] = pxl[h1][w1+1];            

            }
            else if(sample.equals("vertical"))
            {
                int w1 = rand.nextInt(width);
                int h1 = rand.nextInt(height - 1);

                x[i] = pxl[h1][w1];
                y[i] = pxl[h1+1][w1];    
            
            }
            else{
                int w1 = rand.nextInt(width-1);
                int h1 = rand.nextInt(height-1);

                x[i] = pxl[h1][w1];
                y[i] = pxl[h1+1][w1+1];                       
            }
            totalX += x[i];
            totalY += y[i];
        }
        
        meanX = totalX / range; 
        meanY = totalY / range;
        
        t1 = 0;
        t2 = 0; 
        t3 = 0;
        
        for(int i=0;i<range;i++){            
           t1  += (x[i] - meanX) * (y[i] - meanY);            
           t2  += Math.pow(x[i] - meanX, 2);            
           t3  += Math.pow(y[i] - meanY, 2);            
        }
        cov = t1 / range;
        Dx = t2 /range;
        Dy = t3 /range;
        
        coefCor = Double.valueOf(cov / ( Math.sqrt(Dx) * Math.sqrt(Dy)));        
             
        return coefCor;
 
   }
    
}
