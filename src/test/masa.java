/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Oyuncular.Bilgisayar;
import Oyuncular.Kullanıcı;
import Sporcu.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class masa extends javax.swing.JFrame {

    /**
     * Creates new form deneme
     */
    int kartsayisi = 0;
    Kullanıcı oyuncu;
    Bilgisayar B1;
    ArrayList<Futbolcu> flist;
    ArrayList<Basketbolcu> blist;
    Futbolcu ahmet= new Futbolcu(90, 90,90, "ahmet","a");
    
    Futbolcu Ronaldo = new Futbolcu();
    Futbolcu Messi = new Futbolcu();
    Futbolcu Bale = new Futbolcu();
    Futbolcu Silva = new Futbolcu();
    Futbolcu Pogba = new Futbolcu();
    Futbolcu Rodríguez = new Futbolcu();
    Futbolcu Neymar = new Futbolcu();
    Futbolcu Hazard = new Futbolcu();
    Basketbolcu LeBron = new Basketbolcu();
    Basketbolcu Morris = new Basketbolcu();
    Basketbolcu Leonard = new Basketbolcu();
    Basketbolcu Luka = new Basketbolcu();
    Basketbolcu George = new Basketbolcu();
    Basketbolcu Davis = new Basketbolcu();
    Basketbolcu Coby = new Basketbolcu();
    Basketbolcu Curry = new Basketbolcu();
    Sporcu[] KartListesi = {
        Ronaldo,
        Messi,
        Bale,
        Silva,
        Pogba,
        Rodríguez,
        Neymar,
        Hazard,
        LeBron,
        Morris,
        Leonard,
        Luka,
        George,
        Davis,
        Coby,
        Curry
    };
    int bskor = 0;
    int kskor = 0;
    int[] pozisyon = new int[8];
    int sayac=1;
    String oyuncuadi;

    public masa() {
        initComponents();
        iconata();
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jButton1.setVisible(false);
        jButton3.setVisible(false);
        jPanel4.setVisible(false);
        jLabel7.setVisible(false);
        flist = new ArrayList<Futbolcu>();
        blist = new ArrayList<Basketbolcu>();

        Ronaldo.setSporcuİsmi("ronaldo");
        Ronaldo.setSporcuTakim("a");
        Ronaldo.setSerbestVurus(93);
        Ronaldo.setPenaltı(95);
        Ronaldo.setKaleciKarsiKarsiya(99);

        Messi.setSporcuİsmi("Messi");
        Messi.setSporcuTakim("a");
        Messi.setSerbestVurus(92);
        Messi.setPenaltı(95);
        Messi.setKaleciKarsiKarsiya(99);

        Bale.setSporcuİsmi("Bale");
        Bale.setSporcuTakim("a");
        Bale.setSerbestVurus(90);
        Bale.setPenaltı(95);
        Bale.setKaleciKarsiKarsiya(99);

        Silva.setSporcuİsmi("Silva");
        Silva.setSporcuTakim("a");
        Silva.setSerbestVurus(86);
        Silva.setPenaltı(90);
        Silva.setKaleciKarsiKarsiya(87);

        Pogba.setSporcuİsmi("Pogba");
        Pogba.setSporcuTakim("a");
        Pogba.setSerbestVurus(86);
        Pogba.setPenaltı(95);
        Pogba.setKaleciKarsiKarsiya(99);

        Rodríguez.setSporcuİsmi("Rodríguez");
        Rodríguez.setSporcuTakim("a");
        Rodríguez.setSerbestVurus(90);
        Rodríguez.setPenaltı(95);
        Rodríguez.setKaleciKarsiKarsiya(92);

        Neymar.setSporcuİsmi("Neymar");
        Neymar.setSporcuTakim("a");
        Neymar.setSerbestVurus(90);
        Neymar.setPenaltı(95);
        Neymar.setKaleciKarsiKarsiya(99);

        Hazard.setSporcuİsmi("Hazard");
        Hazard.setSporcuTakim("a");
        Hazard.setSerbestVurus(90);
        Hazard.setPenaltı(95);
        Hazard.setKaleciKarsiKarsiya(99);

        LeBron.setSporcuİsmi("LeBron");
        LeBron.setSporcuTakim("a");
        LeBron.setSerbestAtis(95);
        LeBron.setUcluk(92);
        LeBron.setIkilik(87);

        Morris.setSporcuİsmi("Morris");
        Morris.setSporcuTakim("a");
        Morris.setSerbestAtis(82);
        Morris.setUcluk(90);
        Morris.setIkilik(87);

        Leonard.setSporcuİsmi("Leonard");
        Leonard.setSporcuTakim("a");
        Leonard.setSerbestAtis(88);
        Leonard.setUcluk(90);
        Leonard.setIkilik(87);

        Luka.setSporcuİsmi("Luka");
        Luka.setSporcuTakim("a");
        Luka.setSerbestAtis(98);
        Luka.setUcluk(80);
        Luka.setIkilik(87);

        George.setSporcuİsmi("George");
        George.setSporcuTakim("a");
        George.setSerbestAtis(95);
        George.setUcluk(90);
        George.setIkilik(87);

        Davis.setSporcuİsmi("Davis");
        Davis.setSporcuTakim("a");
        Davis.setSerbestAtis(90);
        Davis.setUcluk(80);
        Davis.setIkilik(87);

        Coby.setSporcuİsmi("Coby");
        Coby.setSporcuTakim("a");
        Coby.setSerbestAtis(92);
        Coby.setUcluk(85);
        Coby.setIkilik(87);

        Curry.setSporcuİsmi("Curry");
        Curry.setSporcuTakim("a");
        Curry.setSerbestAtis(90);
        Curry.setUcluk(95);
        Curry.setIkilik(85);

        flist.add(Ronaldo);
        flist.add(Hazard);
        flist.add(Messi);
        flist.add(Bale);
        flist.add(Neymar);
        flist.add(Silva);
        flist.add(Pogba);
        flist.add(Rodríguez);
        blist.add(LeBron);
        blist.add(Morris);
        blist.add(Leonard);
        blist.add(Luka);
        blist.add(George);
        blist.add(Coby);
        blist.add(Davis);
        blist.add(Curry);
        b1.setVisible(true);
        b2.setVisible(true);
        b3.setVisible(true);
        b4.setVisible(true);
        b5.setVisible(true);
        b6.setVisible(true);
        b7.setVisible(true);
        b8.setVisible(true);
        a1.setVisible(true);
        a2.setVisible(true);
        a3.setVisible(true);
        a4.setVisible(true);
        a5.setVisible(true);
        a6.setVisible(true);
        a7.setVisible(true);
        a8.setVisible(true);
        
        Random x = new Random();
        int num = x.nextInt(2) + 1;
        pozisyon[0] = num;
        for (int i = 0; i < pozisyon.length; i++) {
            num = x.nextInt(3);
            pozisyon[i] = num;

            
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        a1 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        a5 = new javax.swing.JButton();
        a6 = new javax.swing.JButton();
        a7 = new javax.swing.JButton();
        a8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        klncskor = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bilgsyrskor = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bsskr = new javax.swing.JLabel();
        ksskor = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyuncu bilgisi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(572, 148));

        jLabel2.setText("Oyuncu Adı:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Başla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        b1.setText("neymar");

        b2.setText("messi");

        b3.setText("bale");

        b4.setText("hazard");

        b5.setText("ronaldo");
        b5.setName(""); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setText("pogba");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setText("rodriguez");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setText("silva");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        a1.setText("Cobby");
        a1.setToolTipText("");
        a1.setName("evt"); // NOI18N

        a2.setText("Curry");

        a3.setText("davis");

        a4.setText("George");

        a5.setText("morris");
        a5.setName(""); // NOI18N
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });

        a6.setText("jButton1");
        a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ActionPerformed(evt);
            }
        });

        a7.setText("jButton3");
        a7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a7ActionPerformed(evt);
            }
        });

        a8.setText("luka");
        a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");

        jButton3.setText("jButton3");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jButton3ComponentHidden(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("karşılaştırılan özellik:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(471, 471, 471))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton3.getAccessibleContext().setAccessibleDescription("");

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Skor");

        jLabel1.setText("Kullanıcı");

        klncskor.setText("0");

        jLabel4.setText("Bilgisayar");

        bilgsyrskor.setText("0");

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setText("Kullanıcı");

        jLabel6.setText("Bilgisayar");

        bsskr.setText("0");

        ksskor.setText("jLabel7");

        jLabel8.setText("Sonuc");

        jLabel9.setText("Sonuç");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ksskor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bsskr, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsskr, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ksskor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(klncskor, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bilgsyrskor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(199, 199, 199)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klncskor))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(bilgsyrskor))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.getAccessibleContext().setAccessibleName("Kullanıcı bilgisii");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        oyuncuadi = jTextField3.getText();
        jPanel3.setVisible(false);
        jPanel1.setVisible(true);
        jPanel2.setVisible(true);
        jLabel1.setText(oyuncuadi);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8ActionPerformed
        if (blist.get(tut[7]).kartKullanildiMi == false) {
            jButton1.setVisible(true);

            jButton1.setText("" + blist.get(tut[7]).getSporcuİsmi() + "\n" + blist.get(tut[7]).sporcuPuaniGoster());
            jButton1.setIcon(new javax.swing.ImageIcon(bikon[tut[7]]));
            blist.get(tut[7]).kartKullanildiMi = true;

            a7.setEnabled(false);
            a6.setEnabled(false);
            a5.setEnabled(false);

            if (flist.get(tut[7]).kartKullanildiMi == false) {
                b8.setEnabled(true);
            }
            if (flist.get(tut[6]).kartKullanildiMi == false) {
                b7.setEnabled(true);
            }
            if (flist.get(tut[5]).kartKullanildiMi == false) {
                b6.setEnabled(true);
            }
            if (flist.get(tut[4]).kartKullanildiMi == false) {
                b5.setEnabled(true);
            }
        }
        if (blist.get(tut[3]).kartKullanildiMi == false) {
            jButton3.setVisible(true);
            jButton3.setText("" + blist.get(tut[3]).getSporcuİsmi());
            jButton3.setIcon(new javax.swing.ImageIcon(bikon[tut[3]]));
            a4.setVisible(false);
            blist.get(tut[3]).kartKullanildiMi = true;
            
            bskorekle(7, 3);

        }
        a8.setVisible(false);
    }//GEN-LAST:event_a8ActionPerformed

    private void a7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a7ActionPerformed
        if (blist.get(tut[6]).kartKullanildiMi == false) {
            jButton1.setVisible(true);

            jButton1.setText("" + blist.get(tut[6]).getSporcuİsmi() + "\n" + blist.get(tut[6]).sporcuPuaniGoster());
            jButton1.setIcon(new javax.swing.ImageIcon(bikon[tut[6]]));
            blist.get(tut[6]).kartKullanildiMi = true;

            a8.setEnabled(false);
            a5.setEnabled(false);
            a6.setEnabled(false);
            if (flist.get(tut[7]).kartKullanildiMi == false) {
                b8.setEnabled(true);
            }
            if (flist.get(tut[6]).kartKullanildiMi == false) {
                b7.setEnabled(true);
            }
            if (flist.get(tut[5]).kartKullanildiMi == false) {
                b6.setEnabled(true);
            }
            if (flist.get(tut[4]).kartKullanildiMi == false) {
                b5.setEnabled(true);
            }
            if (blist.get(tut[2]).kartKullanildiMi == false) {
                jButton3.setVisible(true);
                jButton3.setText("" + blist.get(tut[2]).getSporcuİsmi());
                jButton3.setIcon(new javax.swing.ImageIcon(bikon[tut[2]]));
                a3.setVisible(false);
                blist.get(tut[2]).kartKullanildiMi = true;
                bskorekle(6, 2);
            }
            a7.setVisible(false);
        }

    }//GEN-LAST:event_a7ActionPerformed

    private void a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6ActionPerformed
        if (blist.get(tut[5]).kartKullanildiMi == false) {
            jButton1.setVisible(true);

            jButton1.setText("" + blist.get(tut[5]).getSporcuİsmi() + "\n" + blist.get(tut[5]).sporcuPuaniGoster());
            jButton1.setIcon(new javax.swing.ImageIcon(bikon[tut[5]]));
            blist.get(tut[5]).kartKullanildiMi = true;

            a7.setEnabled(false);
            a5.setEnabled(false);
            a8.setEnabled(false);
            if (flist.get(tut[7]).kartKullanildiMi == false) {
                b8.setEnabled(true);
            }
            if (flist.get(tut[6]).kartKullanildiMi == false) {
                b7.setEnabled(true);
            }
            if (flist.get(tut[5]).kartKullanildiMi == false) {
                b6.setEnabled(true);
            }
            if (flist.get(tut[4]).kartKullanildiMi == false) {
                b5.setEnabled(true);
            }
            if (blist.get(tut[1]).kartKullanildiMi == false) {
                jButton3.setVisible(true);
                jButton3.setText("" + blist.get(tut[1]).getSporcuİsmi());
                jButton3.setIcon(new javax.swing.ImageIcon(bikon[tut[1]]));
                a2.setVisible(false);
                blist.get(tut[1]).kartKullanildiMi = true;
                bskorekle(5, 1);
            }
            a6.setVisible(false);
        }

    }//GEN-LAST:event_a6ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
        if (blist.get(tut[4]).kartKullanildiMi == false) {
            jButton1.setVisible(true);

            jButton1.setText("" + blist.get(tut[4]).getSporcuİsmi() + "\n" + blist.get(tut[4]).sporcuPuaniGoster());
            jButton1.setIcon(new javax.swing.ImageIcon(bikon[tut[4]]));
            blist.get(tut[4]).kartKullanildiMi = true;

            a7.setEnabled(false);
            a8.setEnabled(false);
            a6.setEnabled(false);
            if (flist.get(tut[7]).kartKullanildiMi == false) {
                b8.setEnabled(true);
            }
            if (flist.get(tut[6]).kartKullanildiMi == false) {
                b7.setEnabled(true);
            }
            if (flist.get(tut[5]).kartKullanildiMi == false) {
                b6.setEnabled(true);
            }
            if (flist.get(tut[4]).kartKullanildiMi == false) {
                b5.setEnabled(true);
            }
            if (blist.get(tut[0]).kartKullanildiMi == false) {
                jButton3.setVisible(true);
                jButton3.setText("" + blist.get(tut[0]).getSporcuİsmi());
                jButton3.setIcon(new javax.swing.ImageIcon(bikon[tut[0]]));
                a1.setVisible(false);
                blist.get(tut[0]).kartKullanildiMi = true;
                bskorekle(4, 0);
            }
            a5.setVisible(false);
        }

    }//GEN-LAST:event_a5ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if (flist.get(tut[7]).kartKullanildiMi == false) {
            jButton1.setVisible(true);

            jButton1.setText("" + flist.get(tut[7]).getSporcuİsmi() + "\n" + flist.get(tut[7]).sporcuPuaniGoster());
            jButton1.setIcon(new javax.swing.ImageIcon(fikon[tut[7]]));
            flist.get(tut[7]).kartKullanildiMi = true;

            b7.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            if (blist.get(tut[7]).kartKullanildiMi == false) {
                a8.setEnabled(true);
            }
            if (blist.get(tut[6]).kartKullanildiMi == false) {
                a7.setEnabled(true);
            }
            if (blist.get(tut[5]).kartKullanildiMi == false) {
                a6.setEnabled(true);
            }
            if (blist.get(tut[4]).kartKullanildiMi == false) {
                a5.setEnabled(true);
            }
            if (flist.get(tut[3]).kartKullanildiMi == false) {
                jButton3.setVisible(true);
                jButton3.setText("" + flist.get(tut[3]).getSporcuİsmi());
                jButton3.setIcon(new javax.swing.ImageIcon(fikon[tut[3]]));
                b4.setVisible(false);
                flist.get(tut[3]).kartKullanildiMi = true;
                fskorekle(7, 3);
            }
            b8.setVisible(false);
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if (flist.get(tut[6]).kartKullanildiMi == false) {
            jButton1.setVisible(true);

            jButton1.setText("" + flist.get(tut[6]).getSporcuİsmi() + "\n" + flist.get(tut[6]).sporcuPuaniGoster());
            jButton1.setIcon(new javax.swing.ImageIcon(fikon[tut[6]]));
            flist.get(tut[6]).kartKullanildiMi = true;

            b8.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            if (blist.get(tut[7]).kartKullanildiMi == false) {
                a8.setEnabled(true);
            }
            if (blist.get(tut[6]).kartKullanildiMi == false) {
                a7.setEnabled(true);
            }
            if (blist.get(tut[5]).kartKullanildiMi == false) {
                a6.setEnabled(true);
            }
            if (blist.get(tut[4]).kartKullanildiMi == false) {
                a5.setEnabled(true);
            }
            if (flist.get(tut[2]).kartKullanildiMi == false) {
                jButton3.setVisible(true);
                jButton3.setText("" + flist.get(tut[2]).getSporcuİsmi());
                jButton3.setIcon(new javax.swing.ImageIcon(fikon[tut[2]]));
                b3.setVisible(false);
                flist.get(tut[2]).kartKullanildiMi = true;
                fskorekle(6, 2);
            }
            b7.setVisible(false);
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed

        if (flist.get(tut[5]).kartKullanildiMi == false) {
            jButton1.setVisible(true);

            jButton1.setText("" + flist.get(tut[5]).getSporcuİsmi() + "\n" + flist.get(tut[5]).sporcuPuaniGoster());
            jButton1.setIcon(new javax.swing.ImageIcon(fikon[tut[5]]));
            flist.get(tut[5]).kartKullanildiMi = true;

            b8.setEnabled(false);
            b5.setEnabled(false);
            b7.setEnabled(false);
            if (blist.get(tut[7]).kartKullanildiMi == false) {
                a8.setEnabled(true);
            }
            if (blist.get(tut[6]).kartKullanildiMi == false) {
                a7.setEnabled(true);
            }
            if (blist.get(tut[5]).kartKullanildiMi == false) {
                a6.setEnabled(true);
            }
            if (blist.get(tut[4]).kartKullanildiMi == false) {
                a5.setEnabled(true);
            }
            if (flist.get(tut[1]).kartKullanildiMi == false) {
                jButton3.setVisible(true);
                jButton3.setText("" + flist.get(tut[1]).getSporcuİsmi());
                jButton3.setIcon(new javax.swing.ImageIcon(fikon[tut[1]]));
                b2.setVisible(false);
                flist.get(tut[1]).kartKullanildiMi = true;
                fskorekle(5, 1);
            }
            b6.setVisible(false);
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if (flist.get(tut[4]).kartKullanildiMi == false) {
            jButton1.setVisible(true);

            jButton1.setText("" + flist.get(tut[4]).getSporcuİsmi() + "\n" + flist.get(tut[4]).sporcuPuaniGoster());
            jButton1.setIcon(new javax.swing.ImageIcon(fikon[tut[4]]));
            flist.get(tut[4]).kartKullanildiMi = true;

            b8.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            if (blist.get(tut[7]).kartKullanildiMi == false) {
                a8.setEnabled(true);
            }
            if (blist.get(tut[6]).kartKullanildiMi == false) {
                a7.setEnabled(true);
            }
            if (blist.get(tut[5]).kartKullanildiMi == false) {
                a6.setEnabled(true);
            }
            if (blist.get(tut[4]).kartKullanildiMi == false) {
                a5.setEnabled(true);
            }
            if (flist.get(tut[0]).kartKullanildiMi == false) {
                jButton3.setVisible(true);
                jButton3.setText("" + flist.get(tut[0]).getSporcuİsmi());
                jButton3.setIcon(new javax.swing.ImageIcon(fikon[tut[0]]));
                b1.setVisible(false);
                flist.get(tut[0]).kartKullanildiMi = true;
                fskorekle(4, 0);
            }
            b5.setVisible(false);
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void jButton3ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton3ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ComponentHidden

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
            java.util.logging.Logger.getLogger(masa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(masa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(masa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(masa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new masa().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a1;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JButton a5;
    private javax.swing.JButton a6;
    private javax.swing.JButton a7;
    private javax.swing.JButton a8;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JLabel bilgsyrskor;
    private javax.swing.JLabel bsskr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel klncskor;
    private javax.swing.JLabel ksskor;
    // End of variables declaration//GEN-END:variables
    String[] fikon = new String[8];
    String[] bikon = new String[8];
    int[] tut = new int[8];
    int[] say = new int[3];

    private void iconata() {
        fikon[3] = "./src/img/bale.jpg";
        fikon[1] = "./src/img/hazard.jpg";
        fikon[2] = "./src/img/messi.jpg";
        fikon[4] = "./src/img/neymar.jpg";
        fikon[6] = "./src/img/pogba.jpg";
        fikon[7] = "./src/img/rodriguez.jpg";
        fikon[0] = "./src/img/ronaldo.jpg";
        fikon[5] = "./src/img/silva.jpg";
        bikon[5] = "./src/img/Cobby.jpg";
        bikon[4] = "./src/img/George.jpg";
        bikon[0] = "./src/img/Lebron.jpg";
        bikon[3] = "./src/img/Luka.jpeg";
        bikon[1] = "./src/img/Morris.jpg";
        bikon[7] = "./src/img/curry.jpg";
        bikon[6] = "./src/img/davis.jpg";
        bikon[2] = "./src/img/Leonard.jpg";

        Random yeni = new Random();
        int sayi = yeni.nextInt(7) + 1;
        tut[0] = sayi;
        for (int i = 0; i < tut.length; i++) {
            sayi = yeni.nextInt(8);
            for (int j = 0; j < i; j++) {
                if (tut[j] == sayi) {
                    i--;
                    break;
                } else {
                    tut[i] = sayi;
                }
            }
        }

        b1.setIcon(new javax.swing.ImageIcon("./src/img/futbol.jpg"));
        b1.setText("" + tut[0]);
        b2.setIcon(new javax.swing.ImageIcon("./src/img/futbol.jpg"));
        b2.setText("" + tut[1]);
        b3.setIcon(new javax.swing.ImageIcon("./src/img/futbol.jpg"));
        b3.setText("" + tut[2]);
        b4.setIcon(new javax.swing.ImageIcon("./src/img/futbol.jpg"));
        b4.setText("" + tut[3]);
        b5.setIcon(new javax.swing.ImageIcon(fikon[tut[4]]));
        b5.setText("" + tut[4]);
        b6.setIcon(new javax.swing.ImageIcon(fikon[tut[5]]));
        b6.setText("" + tut[5]);
        b7.setIcon(new javax.swing.ImageIcon(fikon[tut[6]]));
        b7.setText("" + tut[6]);
        b8.setIcon(new javax.swing.ImageIcon(fikon[tut[7]]));
        b8.setText("" + tut[7]);

        a1.setText("" + tut[0]);
        a1.setIcon(new javax.swing.ImageIcon("./src/img/basketbol.jpg"));
        a2.setText("" + tut[1]);
        a2.setIcon(new javax.swing.ImageIcon("./src/img/basketbol.jpg"));
        a3.setText("" + tut[2]);
        a3.setIcon(new javax.swing.ImageIcon("./src/img/basketbol.jpg"));
        a4.setText("" + tut[3]);
        a4.setIcon(new javax.swing.ImageIcon("./src/img/basketbol.jpg"));
        a5.setText("" + tut[4]);
        a5.setIcon(new javax.swing.ImageIcon(bikon[tut[4]]));
        a6.setText("" + tut[5]);
        a6.setIcon(new javax.swing.ImageIcon(bikon[tut[5]]));
        a7.setText("" + tut[6]);
        a7.setIcon(new javax.swing.ImageIcon(bikon[tut[6]]));
        a8.setText("" + tut[7]);
        a8.setIcon(new javax.swing.ImageIcon(bikon[tut[7]]));

    }

    private void bskorekle(int kindis, int bindis) {
        jLabel7.setVisible(true);
        if (pozisyon[kindis] == 0) {
            jLabel7.setText("Karşılaştırılan Özellik: İkilik");
            if (blist.get(tut[bindis]).getIkilik() > blist.get(tut[kindis]).getIkilik()) {
                bskor += 10;
                bilgsyrskor.setText("" + bskor);

            } else if (blist.get(tut[bindis]).getIkilik() < blist.get(tut[kindis]).getIkilik()) {
                kskor += 10;
                klncskor.setText("" + kskor);
            }

        }
        if (pozisyon[kindis] == 1) {
            jLabel7.setText("Karşılaştırılan Özellik: Serbest Atış");
            if (blist.get(tut[bindis]).getSerbestAtis() > blist.get(tut[kindis]).getSerbestAtis()) {
                bskor += 10;
                bilgsyrskor.setText("" + bskor);

            }
            if (blist.get(tut[bindis]).getSerbestAtis() < blist.get(tut[kindis]).getSerbestAtis()) {
                kskor += 10;
                klncskor.setText("" + kskor);
            }

        }
        if (pozisyon[kindis] == 2) {
             jLabel7.setText("karşılaştırılan özellik: Üçlük");
            if (blist.get(tut[bindis]).getUcluk() > blist.get(tut[kindis]).getUcluk()) {
                bskor += 10;
                bilgsyrskor.setText("" + bskor);
            }
            if (blist.get(tut[bindis]).getUcluk() < blist.get(tut[kindis]).getUcluk()) {
                kskor += 10;
                klncskor.setText("" + kskor);
            }

        }
        sayac+=1;
        if(sayac==9){
           
            jLabel3.setText(oyuncuadi);
            ksskor.setText(""+kskor);
            bsskr.setText(""+bskor);
            if(kskor>bskor)
                jLabel8.setText(""+oyuncuadi);
            else if(bskor>kskor)
                jLabel8.setText("Bilgisayar");
               else
                jLabel8.setText("Berabere");
           jPanel4.setVisible(true); 
             
        }
    }

    private void fskorekle(int kindis, int bindis) {
        jLabel7.setVisible(true);
        if (pozisyon[kindis] == 0) {
             jLabel7.setText("Karşılaştırılan Özellik: Serbest Vuruş");
            if (flist.get(tut[bindis]).getSerbestVurus() > flist.get(tut[kindis]).getSerbestVurus()) {
                bskor += 10;
                bilgsyrskor.setText("" + bskor);

            } else if (flist.get(tut[bindis]).getSerbestVurus() < flist.get(tut[kindis]).getSerbestVurus()) {
                kskor += 10;
                klncskor.setText("" + kskor);
                
            }
             
        }
        if (pozisyon[kindis] == 1) {
             jLabel7.setText("Karşılaştırılan Özellik: KaleciKarşıKarşıya");
            if (flist.get(tut[bindis]).getKaleciKarsiKarsiya() > flist.get(tut[kindis]).getKaleciKarsiKarsiya()) {
                bskor += 10;
                bilgsyrskor.setText("" + bskor);

            }
            if (flist.get(tut[bindis]).getKaleciKarsiKarsiya() < flist.get(tut[kindis]).getKaleciKarsiKarsiya()) {
                kskor += 10;
                klncskor.setText("" + kskor);
            }
           

        }
        if (pozisyon[kindis] == 2) {
             jLabel7.setText("karşılaştırılan özellik: Penaltı");
            if (flist.get(tut[bindis]).getPenaltı() > flist.get(tut[kindis]).getPenaltı()) {
                bskor += 10;
                bilgsyrskor.setText("" + bskor);
            }
            if (flist.get(tut[bindis]).getPenaltı() < flist.get(tut[kindis]).getPenaltı()) {
                kskor += 10;
                klncskor.setText("" + kskor);
            }

        }
        sayac+=1;
        if(sayac==9){
           
            jLabel3.setText(oyuncuadi);
             ksskor.setText(""+kskor); 
            bsskr.setText(""+bskor);
            if(kskor>bskor)
                jLabel8.setText(""+oyuncuadi);
            else if(bskor>kskor)
                jLabel8.setText("Bilgisayar");
               else
                jLabel8.setText("Berabere");
           jPanel4.setVisible(true);
        }
    }
    
    }


