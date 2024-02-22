/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedhillcipher;

/**
 *
 * @author Fiqih Amrullah
 */
public class TesAdvancedHillCipher 
{
    public static void main(String args[])
    {
      HillCipher hc = new HillCipher(5, 3, 7,8);  
      int data[] = {4,6,12,9,0,1,6,9};           
      int cipher[] = hc.encrypt(data);          
      int plain[] = hc.decrypt(cipher);     
      printVector("Cipher", cipher);
      printVector("Plain Hasil Dekripsi :", plain);
      printVector("Dekripsi ", data); 
    }
    
        public static void printVector(String label,int vec[])
    {
        System.out.println(label);
        System.out.println("==========================");
        for(int i=0;i<vec.length;i++)
        {            
           System.out.print(vec[i]  + "\t");          
        }
        System.out.println();
    }
    
}
