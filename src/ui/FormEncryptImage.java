/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormEncryptImage.java
 *
 * Created on Apr 24, 2015, 1:29:31 PM
 */
package ui;

import advancedhillcipher.HillCipher;
import advancedhillcipher.Matrix;
import advancedhillcipher.Permutation;
import entity.BitmapImage;
import imagesecurityadvancedhillcipher.Affine;
import imagesecurityadvancedhillcipher.ImageReader;
import imagesecurityadvancedhillcipher.ImageViewer;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import utility.ExtensionFileFilter;
import utility.Util;

/**
 *
 * @author Fiqih Amrullah
 */
public class FormEncryptImage extends javax.swing.JFrame {
   BitmapImage gbr1;
   BitmapImage gbr2;
    /** Creates new form FormEncryptImage */
    public FormEncryptImage() {
        initComponents();
        Util.TengahWindow(this);
        gbr1=null;
        gbr2=null;
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgmetode = new javax.swing.ButtonGroup();
        panelYellow1 = new ui.PanelYellow();
        btnBrowse = new ui.ButtonGlass();
        jlblGambarUji = new javax.swing.JLabel();
        btnKeluar = new ui.ButtonGlass();
        panelYellow2 = new ui.PanelYellow();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jtxtk1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtk2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtxtSeed = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtMultiplier = new javax.swing.JTextField();
        jtxtD = new javax.swing.JTextField();
        btnJalankanEnkripsi = new ui.ButtonGlass();
        btnSimpanGambar = new ui.ButtonGlass();
        jLabel1 = new javax.swing.JLabel();
        jrbtnMetodeAT = new javax.swing.JRadioButton();
        jrbtnMetodeATAHC = new javax.swing.JRadioButton();
        panelYellow3 = new ui.PanelYellow();
        jlblHasilEnkripsi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Enkripsi");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelYellow1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnBrowse.setForeground(new java.awt.Color(255, 255, 255));
        btnBrowse.setText("Browse..");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        jlblGambarUji.setForeground(new java.awt.Color(255, 255, 255));
        jlblGambarUji.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblGambarUji.setText("Pilih Browse Untuk Membuka 'Gambar'");
        jlblGambarUji.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelYellow1Layout = new javax.swing.GroupLayout(panelYellow1);
        panelYellow1.setLayout(panelYellow1Layout);
        panelYellow1Layout.setHorizontalGroup(
            panelYellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelYellow1Layout.createSequentialGroup()
                .addGroup(panelYellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelYellow1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelYellow1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jlblGambarUji, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelYellow1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelYellow1Layout.setVerticalGroup(
            panelYellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelYellow1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlblGambarUji, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(61, 61, 61))
        );

        getContentPane().add(panelYellow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 520));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Parameter Affine"));

        jLabel6.setText("K1");

        jtxtk1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtk1.setText("31");

        jLabel7.setText("K2");

        jtxtk2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtk2.setText("8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtk1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtk2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtxtk2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Parameter Hill Cipher"));

        jLabel3.setText("Seed");

        jtxtSeed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtSeed.setText("5");

        jLabel4.setText("Mulltiplier");

        jLabel5.setText("d");

        jtxtMultiplier.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtMultiplier.setText("7");

        jtxtD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtD.setText("3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtD)
                    .addComponent(jtxtMultiplier)
                    .addComponent(jtxtSeed, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtSeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtMultiplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnJalankanEnkripsi.setText("Jalankan Enkripsi");
        btnJalankanEnkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJalankanEnkripsiActionPerformed(evt);
            }
        });

        btnSimpanGambar.setText("Simpan Gambar");
        btnSimpanGambar.setEnabled(false);
        btnSimpanGambar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanGambarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("METODE");

        bgmetode.add(jrbtnMetodeAT);
        jrbtnMetodeAT.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnMetodeAT.setText("Affine Transform");

        bgmetode.add(jrbtnMetodeATAHC);
        jrbtnMetodeATAHC.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnMetodeATAHC.setText("Affine Transform +  Advanced Hill Cipher");
        jrbtnMetodeATAHC.setName(""); // NOI18N

        javax.swing.GroupLayout panelYellow2Layout = new javax.swing.GroupLayout(panelYellow2);
        panelYellow2.setLayout(panelYellow2Layout);
        panelYellow2Layout.setHorizontalGroup(
            panelYellow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelYellow2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelYellow2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelYellow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSimpanGambar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(btnJalankanEnkripsi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                .addGap(19, 19, 19))
            .addGroup(panelYellow2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelYellow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbtnMetodeAT)
                    .addComponent(jrbtnMetodeATAHC, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addGroup(panelYellow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelYellow2Layout.setVerticalGroup(
            panelYellow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelYellow2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jrbtnMetodeAT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbtnMetodeATAHC)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnJalankanEnkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSimpanGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        getContentPane().add(panelYellow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 290, 510));

        jlblHasilEnkripsi.setForeground(new java.awt.Color(255, 255, 255));
        jlblHasilEnkripsi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblHasilEnkripsi.setText("Hasil Enkripsi");
        jlblHasilEnkripsi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HASIL");

        javax.swing.GroupLayout panelYellow3Layout = new javax.swing.GroupLayout(panelYellow3);
        panelYellow3.setLayout(panelYellow3Layout);
        panelYellow3Layout.setHorizontalGroup(
            panelYellow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelYellow3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelYellow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelYellow3Layout.createSequentialGroup()
                        .addComponent(jlblHasilEnkripsi, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelYellow3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        panelYellow3Layout.setVerticalGroup(
            panelYellow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelYellow3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(jlblHasilEnkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        getContentPane().add(panelYellow3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 270, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
// TODO add your handling code here:
    JFileChooser flchooser = new JFileChooser();
    FileFilter filter1 = new ExtensionFileFilter("Picture Files", new String[] { "JPG","TIFF","PNG","BMP"});
    flchooser.setFileFilter(filter1);
    int tanggapan = flchooser.showOpenDialog(this);   
    if(tanggapan==JFileChooser.APPROVE_OPTION)
    {
        BufferedImage img=null;
        try
        {
         img = ImageIO.read(flchooser.getSelectedFile());
        }catch(IOException ex)
        {
            
        }
       
        ImageIcon imgicon = new ImageIcon(img); 
        ImageReader imgLoader = new ImageReader();
        imgLoader.readPixelsFrom(imgicon);
        gbr1 = imgLoader.getImage();       
        ImageViewer imgv = new ImageViewer();
        imgv.setImage(gbr1);
        imgv.setViewer(jlblGambarUji);
        imgv.viewImageDefault();
        
        
        imgLoader = new ImageReader();
        imgLoader.readPixelsFrom(imgicon);
        gbr2 = imgLoader.getImage();       
        
      
    }
}//GEN-LAST:event_btnBrowseActionPerformed

private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
// TODO add your handling code here:
    this.dispose();
}//GEN-LAST:event_btnKeluarActionPerformed

public void saveFirstPicOutput() 
{
       JFileChooser  fc = new JFileChooser();
      FileFilter filter1 = new ExtensionFileFilter("Picture Files", new String[] { "JPG","TIFF","PNG","BMP"});
       fc.setFileFilter(filter1);
       String filesimpan = "";
       int respon =  fc.showSaveDialog(null);
       if (respon == fc.APPROVE_OPTION)
       {
            int w = gbr1.getWidth();
            int h =  gbr1.getHeight();
            int pixwm[] = gbr1.toOneDimensionalPixelOutput();
            BufferedImage image = new BufferedImage(w , h , BufferedImage.TYPE_INT_RGB);     
            image.setRGB(0, 0, w , h ,pixwm, 0, w);
            BufferedImage bf =image;
            
            File outputfile = new File(fc.getSelectedFile().getAbsolutePath());
            try{
             String fileapp = fc.getSelectedFile().getAbsolutePath();
             if (fileapp.contains("jpg")) 
             {
                  ImageIO.write(bf, "jpg", outputfile);
             }else  if (fileapp.contains("png")) 
             {
                  ImageIO.write(bf, "png", outputfile);
             }else if (fileapp.contains("tiff")) 
             {
                  ImageIO.write(bf, "tiff", outputfile);
             }else if (fileapp.contains("bmp")) 
             {
                  ImageIO.write(bf, "bmp", outputfile);
             }
            
             JOptionPane.showMessageDialog(null, "Citra Hasil Enkripsi Berhasil disimpan!");
            }catch(IOException e){
                 
            }

       }
}

public void saveSecondPicOutput() {
     JFileChooser  fc = new JFileChooser();
      FileFilter filter1 = new ExtensionFileFilter("Picture Files", new String[] { "JPG","TIFF","PNG","BMP"});
       fc.setFileFilter(filter1);
       String filesimpan = "";
       int respon =  fc.showSaveDialog(null);
       if (respon == fc.APPROVE_OPTION)
       {
            int w = gbr2.getWidth();
            int h =  gbr2.getHeight();
            int pixwm[] = gbr2.toOneDimensionalPixelOutput();
            BufferedImage image = new BufferedImage(w , h , BufferedImage.TYPE_INT_RGB);     
            image.setRGB(0, 0, w , h ,pixwm, 0, w);
            BufferedImage bf =image;
            File outputfile = new File(fc.getSelectedFile().getAbsolutePath());
            try{
              String fileapp = fc.getSelectedFile().getAbsolutePath();
             if (fileapp.contains("jpg")) 
             {
                  ImageIO.write(bf, "jpg", outputfile);
             }else  if (fileapp.contains("png")) 
             {
                  ImageIO.write(bf, "png", outputfile);
             }else if (fileapp.contains("tiff")) 
             {
                  ImageIO.write(bf, "tiff", outputfile);
             }else if (fileapp.contains("bmp")) 
             {
                  ImageIO.write(bf, "bmp", outputfile);
             }
             JOptionPane.showMessageDialog(null, "Citra Hasil Enkripsi Berhasil disimpan!");
            }catch(IOException e){
                 
            }

       }
}

private void btnJalankanEnkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJalankanEnkripsiActionPerformed
// TODO add your handling code here:
    if (gbr1==null && gbr2==null) 
    {
        JOptionPane.showMessageDialog(null, "Anda Belum Memilih Gambar!","Peringatan",JOptionPane.WARNING_MESSAGE);
    }else {
    if (jrbtnMetodeAT.isSelected()) 
    {
     int a = Integer.parseInt(jtxtk1.getText());
     int b = Integer.parseInt(jtxtk2.getText());
     
     Affine affine  = new Affine(a,b);
     affine.encrypt(gbr1.getPixelAsli());  
     gbr1.setPixeloutput(affine.getResult());
     ImageViewer imgv = new ImageViewer();
     imgv.setImage(gbr1);
     imgv.setViewer(jlblHasilEnkripsi);
     imgv.viewImageOutput();
     btnSimpanGambar.setEnabled(true);
    }else if (jrbtnMetodeATAHC.isSelected())
    {
        int a = Integer.parseInt(jtxtk1.getText());
        int b = Integer.parseInt(jtxtk2.getText());
        
        Affine affine  = new Affine(a,b);
        ImageViewer imgv = new ImageViewer();
        
        int seed = Integer.parseInt(jtxtSeed.getText());
        int k = Integer.parseInt(jtxtD.getText());
        int multiplier = Integer.parseInt(jtxtMultiplier.getText());    
        
       
        affine.encrypt(gbr2.getPixelAsli());  
        gbr2.setPixeloutput(affine.getResult());    
        HillCipher hc = new HillCipher(seed,k, multiplier,gbr2.getWidth());   
        int pixels[][] = null;
    
        for(int r=0;r<16;r++) 
        {
            pixels= gbr2.getPixelOutput(); 
        
            for(int i=0;i<pixels.length;i++)
            {
              int vecplain[] = Matrix.getVecOfRow(pixels, i);
              int cipher[] = hc.encrypt(vecplain);              
              Permutation.runPermutate(cipher);                
              gbr2.setPixelOutput(i, cipher);
            }
        }       
        imgv.setImage(gbr2);
        imgv.setViewer(jlblHasilEnkripsi);
        imgv.viewImageOutput();
        btnSimpanGambar.setEnabled(true);
    }else {
         JOptionPane.showMessageDialog(null, "Anda Belum Memilih Metode Enkripsi!","Peringatan",JOptionPane.WARNING_MESSAGE);
    }
    }
}//GEN-LAST:event_btnJalankanEnkripsiActionPerformed

private void btnSimpanGambarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanGambarActionPerformed
// TODO add your handling code here:
    if (jrbtnMetodeAT.isSelected()) 
    {
       saveFirstPicOutput();
    }else {
       saveSecondPicOutput();
    }
}//GEN-LAST:event_btnSimpanGambarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormEncryptImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEncryptImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEncryptImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEncryptImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormEncryptImage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgmetode;
    private ui.ButtonGlass btnBrowse;
    private ui.ButtonGlass btnJalankanEnkripsi;
    private ui.ButtonGlass btnKeluar;
    private ui.ButtonGlass btnSimpanGambar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlblGambarUji;
    private javax.swing.JLabel jlblHasilEnkripsi;
    private javax.swing.JRadioButton jrbtnMetodeAT;
    private javax.swing.JRadioButton jrbtnMetodeATAHC;
    private javax.swing.JTextField jtxtD;
    private javax.swing.JTextField jtxtMultiplier;
    private javax.swing.JTextField jtxtSeed;
    private javax.swing.JTextField jtxtk1;
    private javax.swing.JTextField jtxtk2;
    private ui.PanelYellow panelYellow1;
    private ui.PanelYellow panelYellow2;
    private ui.PanelYellow panelYellow3;
    // End of variables declaration//GEN-END:variables
}