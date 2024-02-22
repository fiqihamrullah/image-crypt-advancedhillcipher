/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedhillcipher;

/**
 *
 * @author Fiqih Amrullah
 */
public class Permutation 
{
    
     private static String zeroPadding(String biner,int n)
    {
        String temp="";
        for(int i=0;i<n-biner.length();i++)
        {
            temp += "0";  
        }
        temp = temp + biner;
        return temp;
    }
     
     public static void runPermutate(int vec[])
     {
         int byk = vec.length / 8;
         for(int i=0;i<byk;i++)
         {
             int p[] = new int[8];
             int idx=0;
             for(int j=i*8;j<(i+1)*8;j++)
             {
                   p[idx]=vec[j];
                   idx++;
             }
             permute(p);
             idx=0;
             for(int j=i*8;j<(i+1)*8;j++)
             {
                   vec[j]=p[idx];
                   idx++;
             }
         }
     }
     
      public static void runIPermutate(int vec[])
     {
         int byk = vec.length / 8;
         for(int i=0;i<byk;i++)
         {
             int p[] = new int[8];
             int idx=0;
             for(int j=i*8;j<(i+1)*8;j++)
             {
                   p[idx]=vec[j];
                   idx++;
             }
             ipermute(p);
             idx=0;
             for(int j=i*8;j<(i+1)*8;j++)
             {
                   vec[j]=p[idx];
                   idx++;
             }
         }
     }
     
     
     private static void permute(int p[])
    {
        int matrixp[][] = new int[8][8];
        for(int ip=0;ip<p.length;ip++)
        {
            String biner = zeroPadding(Integer.toBinaryString(p[ip]),8);
            for(int c=0;c<biner.length();c++)
            {
                matrixp[ip][c] = Integer.parseInt(biner.substring(c, c+1)) ;
            }
            //System.out.println(biner);
        }
        
       // printMatrix("TES", matrixp);
        
        //Upper Half
        int matrixpermute[][] = new int[8][8];
        for(int r=0;r<4;r++)
        {
            for(int c=0;c<8;c++) 
            {
                matrixpermute[c][r] = matrixp[3-r][7-c];
            }
        }
        
         //Lower Half
  
        for(int r=4;r<8;r++)
        {
            for(int c=0;c<8;c++) 
            {
                matrixpermute[c][r] = matrixp[r][c];
            }
        }
        
      //  printMatrix("Mutasi", matrixpermute);
        for(int ip=0;ip<p.length;ip++)
        {
            String biner = "";
            for(int c=0;c<8;c++)
            {
                biner += String.valueOf(matrixpermute[ip][c]);
            }
            p[ip]=Integer.parseInt(biner, 2);
        } 
    }
     
    private static void ipermute(int p[])
    {
        int matrixp[][] = new int[8][8];
        for(int ip=0;ip<p.length;ip++)
        {
            String biner = zeroPadding(Integer.toBinaryString(p[ip]),8);
            for(int c=0;c<biner.length();c++)
            {
                matrixp[ip][c] = Integer.parseInt(biner.substring(c, c+1)) ;
            }
            //System.out.println(biner);
        }
        
       // printMatrix("TES", matrixp);
        
        //Upper Half
        int matrixipermute[][] = new int[8][8];
        for(int r=0;r<4;r++)
        {
            for(int c=0;c<8;c++) 
            {
                matrixipermute[3-r][7-c] = matrixp[c][r];
            }
        }
        
         //Lower Half
  
        for(int r=4;r<8;r++)
        {
            for(int c=0;c<8;c++) 
            {
                matrixipermute[r][c] = matrixp[c][r];
            }
        }
        
       // printMatrix("Inverse Mutasi", matrixipermute);
        for(int ip=0;ip<p.length;ip++)
        {
            String biner = "";
            for(int c=0;c<8;c++)
            {
                biner += String.valueOf(matrixipermute[ip][c]);
            }
            p[ip]=Integer.parseInt(biner, 2);
        }
        
        
    } 
     
     
}
