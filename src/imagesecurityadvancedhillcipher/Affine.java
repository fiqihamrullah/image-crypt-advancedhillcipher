/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imagesecurityadvancedhillcipher;

/**
 *
 * @author Fiqih Amrullah
 */
public class Affine {
    int result[][];
    String strresult="";
    static int m = 255; //modulus
    int a=31;
    int b= 8;

    public Affine() 
    {
        
    }
    
    
    
    public Affine(int a,int b) 
    {
        this.a =a;
        this.b = b;
    }
    
    public static String hexDecode(String encoded)
    {
	String str="";
	for (int i=0; i < encoded.length()-1; i+=2) 
        {
            String g = String.valueOf(encoded.charAt(i)) + encoded.charAt(i+1);
            // System.out.println(g);            
	    str += (char)(Integer.parseInt(g,16));	
	}
	return str;	 
    }
    
    public static String hexEncode(String txt)
    {
	String hex = "";
	for (int i=0; i < txt.length(); i++)
        {
	String h =  Integer.toHexString((int)(txt.charAt(i)));
	if (h.length() ==1) h = "0" + h;
	hex += h;
	
	}
		return hex;
	
	}
    
    public void encrypt(int  plaintdata[][])            
    {
      
        result = new int[plaintdata.length][plaintdata[0].length];
        for(int i=0;i<plaintdata.length;i++)
        {
            for(int j=0;j<plaintdata[i].length;j++) 
            {
              result[i][j]=(a*plaintdata[i][j] + b) % m;
              if (result[i][j]<8)
              {
                //  System.out.println("Hasil "  + result[i][j] + "  ketika plain->" + plaintdata[i][j]);
              }
            }
            
        }            
    }
    
     public void encryptString(String plain,int a,int b)            
    {
         
        plain = plain.toUpperCase();
        strresult="";
        for(int i=0;i<plain.length();i++)
        {
            
           // strresult +=(char)(((a*(plain.charAt(i))  + b) % m));
             strresult +=(char)(((a*(plain.charAt(i))  + b) % m));
            
        }        
        
    }
     
      public void decrypt(int cipherdata[][])
    {
        int inva =getInverse(a, m) ;
        
        result = new int [cipherdata.length][cipherdata[0].length];
        for(int i=0;i<cipherdata.length;i++)
        {
            for(int j=0;j<cipherdata[i].length;j++)
            {
              result[i][j]=(inva*(cipherdata[i][j] - b)) % m;
              if (result[i][j]<0) 
              {
                  result[i][j] = 255+result[i][j];
                 // System.out.println("Hasil : " +result[i][j] + " CipherData: " + cipherdata[i][j] );    
              }
            }
            
        }
        
        
    }
      
     //metode brute force
      
      public int getMultiplication(int m,int p1)
      {
          int hasil=0;
          for (int i=0;i<m;i++){
              int temp = m *i;
              if (p1<0){
                if (temp>Math.abs(p1))
                {
                    hasil = temp;
                    break;
                }   
              }else {
                if (temp>p1){
                    break;
                }else{
                    hasil = temp;
                 }
              }
          }
          return hasil;
      }
      
      public int getInverse(int a,int m)
      {
          int hasil=0;
          for (int i=0;i<m;i++){
              if ((a*i)%m==1){
                  hasil = i;
                  break;
              }
          }
          return hasil;
      }
      
    
    public void decryptString(String cipherdata,int a,int b)
    {
        int inva = getInverse(a, m) ;
       
        strresult="";
       // cipherdata = cipherdata.substring(cipherdata.length()-2);
        for(int i=0;i<cipherdata.length();i++)
        {
            if (cipherdata.charAt(i)!=0){
            int temp = inva*((cipherdata.charAt(i)) - b);
           
            int n = getMultiplication(m, temp);
            System.out.println(n);
            int hcar=0;
            if (temp<0)
            {
                hcar = n - Math.abs(temp);
            }else
            {
                hcar = temp - n;
            }
             
             strresult +=(char)(hcar);
           // System.out.println(temp);
            /*
           if (temp==-62){
            strresult +=(char)66;   
           }else if (temp==-58){
            strresult +=(char)69;   
           }else if (temp==-29){
            strresult +=(char)99;   
           }else if (temp==-25){
            strresult +=(char)103;   
           }else{
            strresult +=(char)((inva*(cipherdata.charAt(i) - b)) % 26);
           }*/
            }
        }
        
        
    }
    
  
    public int[][] getResult() {
        return result;
    }
    
      public String getStringResult() {
        return strresult;
    }
    
    
    
    
}
