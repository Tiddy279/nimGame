/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.nimgame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Integer.max;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author DUY
 */
public class PlayWithBot extends javax.swing.JFrame {

    public PlayWithBot() {
        initComponents();
        init();
    }
    int player1;
    int bot;
    int[] arrA;
    int[] arrB;
    int[] arrC;
    int[] arrD;
    int[] arrE;
    int input;
    String string, numip;
    int numA, numB, numC, numD, numE;
    int total;
    int location = 0;
    int chosen = 0;
    //numAmount = totalNum
    int numAmount, remainAmount;
    int cola, colb, colc, cold, cole;

    private void init() {
        Random rd = new Random();
        numA = rd.nextInt(7 - 1) + 1;
        numB = rd.nextInt(7 - 1) + 1;
        numC = rd.nextInt(7 - 1) + 1;
        total = numA + numB + numC;
        player1 = 0;
        bot = 1;
        botmove=1;
        numAmount = total;
        chosen = 0;
        arrA = new int[numA];
        for (int i = 0; i < numA; i++) {
            arrA[i] = 1;
        }
        arrB = new int[numB];
        for (int i = 0; i < numB; i++) {
            arrB[i] = 1;
        }
        arrC = new int[numC];
        for (int i = 0; i < numC; i++) {
            arrC[i] = 1;
        }
        arrD = new int[numD];
        for (int i = 0; i < numD; i++) {
            arrD[i] = 1;
        }
        arrE = new int[numE];
        for (int i = 0; i < numE; i++) {
            arrE[i] = 1;
        }
        remainNum.setText(String.valueOf(numAmount));
        remainNum.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        int y;
        y = 40;
        createLable(colA);

        createLable(colB);

        createLable(colC);

        initBtn(numA, arrA, colA);
        initBtn(numB, arrB, colB);
        initBtn(numC, arrC, colC);
        btn_continue.setBackground(new java.awt.Color(242, 237, 237));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        colA = new javax.swing.JPanel();
        colB = new javax.swing.JPanel();
        colC = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Person2 = new javax.swing.JLabel();
        playTurn = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Person1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_continue = new javax.swing.JButton();
        remainNum = new javax.swing.JLabel();
        number = new javax.swing.JLabel();
        Recreate = new javax.swing.JButton();
        footer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NIM GAME");
        setLocation(new java.awt.Point(600, 280));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1190, 664));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setBackground(new java.awt.Color(242, 237, 237));
        btn_back.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_back.setText("Trở về");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 580, 110, 40));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(244, 251, 251));

        colA.setBackground(new java.awt.Color(38, 207, 207));

        javax.swing.GroupLayout colALayout = new javax.swing.GroupLayout(colA);
        colA.setLayout(colALayout);
        colALayout.setHorizontalGroup(
            colALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        colALayout.setVerticalGroup(
            colALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        colB.setBackground(new java.awt.Color(38, 207, 207));

        javax.swing.GroupLayout colBLayout = new javax.swing.GroupLayout(colB);
        colB.setLayout(colBLayout);
        colBLayout.setHorizontalGroup(
            colBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        colBLayout.setVerticalGroup(
            colBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        colC.setBackground(new java.awt.Color(38, 207, 207));
        colC.setToolTipText("");

        javax.swing.GroupLayout colCLayout = new javax.swing.GroupLayout(colC);
        colC.setLayout(colCLayout);
        colCLayout.setHorizontalGroup(
            colCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        colCLayout.setVerticalGroup(
            colCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(colA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(colB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(colC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(colA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1020, 530));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        Person2.setBackground(new java.awt.Color(51, 102, 255));
        Person2.setIcon(new javax.swing.ImageIcon("D:\\NLCSN\\nimGame\\src\\main\\java\\com\\mycompany\\images\\bot.png")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Person2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(Person2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        playTurn.setBackground(new java.awt.Color(244, 251, 251));
        playTurn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playTurn.setText("LƯỢT CHƠI");

        jPanel6.setBackground(new java.awt.Color(255, 51, 51));

        Person1.setBackground(new java.awt.Color(51, 102, 255));
        Person1.setIcon(new javax.swing.ImageIcon("D:\\NLCSN\\nimGame\\src\\main\\java\\com\\mycompany\\images\\person.png")); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Person1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(Person1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("P1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Máy");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(playTurn))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(49, 49, 49))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(50, 50, 50))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 140, 530));

        btn_continue.setBackground(new java.awt.Color(242, 237, 237));
        btn_continue.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_continue.setText("Tiếp tục");
        btn_continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_continueActionPerformed(evt);
            }
        });
        jPanel1.add(btn_continue, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 580, 110, 40));

        remainNum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(remainNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 587, 100, 30));

        number.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        number.setText("Số lượng :");
        jPanel1.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 90, -1));

        Recreate.setBackground(new java.awt.Color(242, 237, 237));
        Recreate.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Recreate.setText("Làm mới");
        Recreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecreateActionPerformed(evt);
            }
        });
        jPanel1.add(Recreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 580, 110, 40));

        footer.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 540, 1170, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void initBtn(int num, int[] arr, JPanel col) {
        createLable(col);
        int y = 40;
        for (int i = 0; i < num; i++) {
            if (arr[i] == 1) {
                int temp = i;
                JButton button = new JButton();
                button.addActionListener((e) -> {
                    if (button.getBackground() == Color.white) {// Ban đầu arr[i]=1 thì vẽ
                        // gán lại
                        if (location == 0 || location == col.getX()) {
                            button.setBackground(Color.lightGray);
                            arr[temp] = 0;
                            chosen += 1;

                            if (location == 0) {
                                location += col.getX();
                            } else {
                                location += 0;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Chỉ được chọn ô trong cùng cột", "Nhắc nhở", JOptionPane.WARNING_MESSAGE);
                        }

                    } else {
                        button.setBackground(Color.white);
                        arr[temp] = 1;
                        if (chosen == 1) {
                            location -= col.getX();
                        }
                        chosen -= 1;

                    }
//                    }
                });
                button.setBackground(Color.white);
                button.setSize(50, 50);
                button.setLocation(25, y);
                y = y + 70;
                col.add(button);
            }
        }
        repaint();
    }

    public boolean checkthdb() {
        if ((cola == 1 && colb == 1 && colc > 1) || (cola == 1 && colb > 1 && colc == 1) || (cola > 1 && colb == 1 && colc == 1)
                || (cola == 0 && colb == 1 && colc > 1) || (cola == 0 && colb > 1 && colc == 1) || (cola > 1 && colb == 0 && colc == 1)
                || (cola == 1 && colb == 0 && colc > 1) || (cola > 1 && colb == 1 && colc == 0) || (cola == 1 && colb > 1 && colc == 0)
                || (cola == 0 && colb == 0 && colc > 1) || (cola > 1 && colb == 0 && colc == 0) || (cola == 0 && colb > 1 && colc == 0)) {
            int temp = 0;
            bot++;
            if (cola != 0) {
                temp++;

            }
            if (colb != 0) {
                temp++;

            }
            if (colc != 0) {
                temp++;
            }
            if (temp == 3) {

                if (cola > 1) {
//                    cola = 1;
                    for (int i = 0; i < numA; i++) {
                        arrA[i] = 0;

                    }
                    numAmount -= (cola - 1);
                    arrA[0] = 1;
                    colA.removeAll();
                    initBtn(numA, arrA, colA);
                } else if (colb > 1) {
//                    colb = 1;
                    for (int i = 0; i < numB; i++) {
                        arrB[i] = 0;
                    }
                    numAmount -= (colb - 1);
                    arrB[0] = 1;
                    colB.removeAll();
                    initBtn(numB, arrB, colB);
                } else {
//                    colc = 1;
                    for (int i = 0; i < numC; i++) {
                        arrC[i] = 0;
                    }
                    arrC[0] = 1;
                    numAmount -= (colc - 1);
                    colC.removeAll();
                    initBtn(numC, arrC, colC);
                }
            } else if (temp == 2) {

                if (cola > 1) {
//                    cola = 0;
                    for (int i = 0; i < numA; i++) {
                        arrA[i] = 0;
                    }
                    numAmount -= cola;
                    colA.removeAll();
                    initBtn(numA, arrA, colA);
                } else if (colb > 1) {
//                    colb = 0;
                    for (int i = 0; i < numB; i++) {
                        arrB[i] = 0;
                    }
                    numAmount -= colb;
                    colB.removeAll();
                    initBtn(numB, arrB, colB);
                } else {
//                    colc = 0;
                    for (int i = 0; i < numC; i++) {
                        arrC[i] = 0;
                        System.out.print(arrC[i] + " ");
                    }
                    numAmount -= colc;
                    colC.removeAll();
                    initBtn(numC, arrC, colC);
                }
            } else {
                if (cola > 1) {
//                    cola = 1;
                    for (int i = 0; i < numA; i++) {
                        arrA[i] = 0;
                    }
                    numAmount -= (cola - 1);
                    arrA[0] = 1;
                    colA.removeAll();
                    initBtn(numA, arrA, colA);
                } else if (colb > 1) {
//                    colb = 1;
                    for (int i = 0; i < numB; i++) {
                        arrB[i] = 0;
                    }
                    numAmount -= (colb - 1);
                    arrB[0] = 1;
                    colB.removeAll();
                    initBtn(numB, arrB, colB);
                } else {
//                    colc = 1;
                    for (int i = 0; i < numC; i++) {
                        arrC[i] = 0;
                    }
                    numAmount -= (colc - 1);
                    arrC[0] = 1;
                    colC.removeAll();
                    initBtn(numC, arrC, colC);
                }
            }
//            System.out.print(cola + " " + colb + " " + colc);
            repaint();
            checkWin();
            return true;
        }
        return false;
    }

    public void getColNum() {
        cola = 0;
        colb = 0;
        colc = 0;
        for (int i = 0; i < numA; i++) {
            if (arrA[i] == 1) {
                cola++;
            }
        }
        for (int i = 0; i < numB; i++) {
            if (arrB[i] == 1) {
                colb++;
            }
        }
        for (int i = 0; i < numC; i++) {
            if (arrC[i] == 1) {
                colc++;
            }
        }
        int numAmount1 = cola + colb + colc;
        remainNum.setText(string.valueOf(numAmount1));
    }

    public void botMove() {
        getColNum();
        int s = cola ^ colb ^ colc;
        bot++;
        if (s != 0) {
            if ((cola ^ (cola ^ colb ^ colc)) < cola) {
                int sosoiboc = cola - (cola ^ (cola ^ colb ^ colc));
//                cola -= sosoiboc;
                numAmount -= sosoiboc;
               
                int temp = 0;

                int i = 0;
                do {
                    if (arrA[i] == 1) {
                        arrA[i] = 0;
                        i++;
                        temp++;
                    } else {
                        i++;
                    }
                } while (temp != sosoiboc);
                colA.removeAll();
                initBtn(numA, arrA, colA);
            } else if ((colb ^ (cola ^ colb ^ colc)) < colb) {
                int sosoiboc = colb - (colb ^ (cola ^ colb ^ colc));
                numAmount -= sosoiboc;
               
//                colb -= sosoiboc;
                int temp = 0;
                numAmount -= temp;
                int i = 0;
                do {
                    if (arrB[i] == 1) {
                        arrB[i] = 0;
                        i++;
                        temp++;
                    } else {
                        i++;
                    }
                } while (temp != sosoiboc);
                colB.removeAll();
                initBtn(numB, arrB, colB);
            } else if ((colc ^ (cola ^ colb ^ colc)) < colc) {
                int sosoiboc = colc - (colc ^ (cola ^ colb ^ colc));
                numAmount -= sosoiboc;
                
//                colc -= sosoiboc;

                int temp = 0;
                int i = 0;
                do {
                    if (arrC[i] == 1) {
                        arrC[i] = 0;
                        i++;
                        temp++;
                    } else {
                        i++;
                    }
                } while (temp != sosoiboc);
                colC.removeAll();
                numAmount -= sosoiboc;
                
                initBtn(numC, arrC, colC);
            }
        } else {
      
            int temp = Math.max(cola, max(colb, colc));
            numAmount -= temp;
           
            if (cola == temp) {
//                cola--;
                int y = 0;
                int i = 0;
                do {
                    if (arrA[i] == 1) {
                        arrA[i] = 0;
                        i++;
                        y++;
                    } else {
                        i++;
                    }
                } while (y != 1);
                colA.removeAll();

                initBtn(numA, arrA, colA);
            } else if (colb == temp) {

//                colb--;
                int y = 0;
                int i = 0;
                do {
                    if (arrB[i] == 1) {
                        arrB[i] = 0;
                        i++;
                        y++;
                    } else {
                        i++;
                    }

                } while (y != 1);
                colB.removeAll();

                initBtn(numB, arrB, colB);
            } else {
//                colc--;
                int y = 0;
                int i = 0;
                do {
                    if (arrC[i] == 1) {
                        arrC[i] = 0;
                        i++;
                        y++;
                    } else {
                        i++;
                    }
                } while (y != 1);
                colC.removeAll();
                initBtn(numC, arrC, colC);
            }
        }
        repaint();
//        System.out.print("\n" + cola + " " + colb + " " + colc);
    }

    private void createLable(JPanel collum) {
        JLabel lb = new JLabel();
        collum.add(lb);
        if (collum == colA) {
            lb.setText("Cột A");
        } else if (collum == colB) {
            lb.setText("Cột B");
        } else if (collum == colC) {
            lb.setText("Cột C");
        }
        lb.setSize(50, 30);
        lb.setLocation(30, 450);
        lb.setFont(new Font("Segoe UI", Font.BOLD, 14));
    }
    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        int choice = JOptionPane.showConfirmDialog(
                null,
                "Bạn có chắc chắn muốn trở về trang chủ?",
                "Xác nhận trở về",
                JOptionPane.YES_NO_OPTION
        );

        if (choice == JOptionPane.YES_OPTION) {
            HomePage homePage = new HomePage();
            homePage.setVisible(true);

            dispose();// Đóng jframe hiện tại
        }
        else if (choice == JOptionPane.CANCEL_OPTION){
            dispose();// Đóng jframe hiện tại
        }
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_continueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continueActionPerformed
//        if (numAmount == 0) {
//            Object[] option = {
//                "Làm mới",
//                "Về trang chủ"
//            };
//            JOptionPane.showOptionDialog(null, null, "Trò chơi kết thúc!!!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
//        }
        checkLocation();
    }//GEN-LAST:event_btn_continueActionPerformed
    int botmove = 0;

    private void checkLocation() {
        if (location == colA.getX()) {
            test(numA, arrA, colA);
            getColNum();
            if (checkthdb() == false &&botmove==0) {
                botMove();
            }
            getColNum();
            checkWin();;
        } else if (location == colB.getX()) {
            test(numB, arrB, colB);
            getColNum();
            if (checkthdb() == false&&botmove==0) {
                botMove();
            }
            getColNum();
            checkWin();;
        } else {
            test(numC, arrC, colC);
            getColNum();
            if (checkthdb() == false&&botmove==0) {
                botMove();
            }
            getColNum();
            checkWin();
        }
        repaint();
    }

    private void RecreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecreateActionPerformed
        int choice = JOptionPane.showConfirmDialog(
                null, "Bạn có muốn làm mới trò chơi?",
                "Thông báo",
                JOptionPane.YES_NO_OPTION
        );
        if (choice == JOptionPane.YES_OPTION) {
            colA.removeAll();
            colB.removeAll();
            colC.removeAll();

            location = 0;
            chosen = 0;
            init();
        }
        
    }//GEN-LAST:event_RecreateActionPerformed

    private void test(int num, int[] arr, JPanel col) {
        if (chosen == 0 && numAmount > 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ít nhất 1 ô", "Nhắc nhở", JOptionPane.WARNING_MESSAGE);
            botmove=1;
        } else {
            botmove=0;
            numAmount -= chosen;
            remainNum.setText(String.valueOf(numAmount));
            location = 0;
            chosen = 0;
            col.removeAll();
            initBtn(num, arr, col);
            if (numAmount == 0) {
                btn_continue.setBackground(Color.red);
            }
            if (player1 < bot) {
                jPanel6.setBackground(Color.red);
                jPanel6.setBackground(Color.white);
                jPanel6.setBackground(Color.white);
                jPanel6.setBackground(Color.white);
                jPanel6.setBackground(Color.red);
                player1 += 1;
            } 
            checkWin();
            repaint();
        }

    }

    private void deleteBtn(int num, int[] arr, JPanel col, int numip) {
        int y = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] == 1 && y < numip) {
                arr[i] = 0;
                y++;
            }
        }
        chosen = numip;
        test(num, arr, col);
        repaint();
    }

    public void checkWin() {
        int colAcheck = 0;
        for (int i = 0; i < numA; i++) {
            if (arrA[i] == 1) {
                colAcheck += 1;
            }
        }
        int colBcheck = 0;
        for (int i = 0; i < numB; i++) {
            if (arrB[i] == 1) {
                colBcheck += 1;
            }
        }
        int colCcheck = 0;
        for (int i = 0; i < numC; i++) {
            if (arrC[i] == 1) {
                colCcheck += 1;
            }
        }
        if ((colAcheck + colBcheck + colCcheck) == 0) {
            if (bot <= player1) {
                botmove=0;
                int choice = JOptionPane.showConfirmDialog(null, "Máy chiến thắng!!!", "Thông báo", JOptionPane.CLOSED_OPTION);
                if (choice == JOptionPane.OK_OPTION || choice == JOptionPane.CLOSED_OPTION) {
                    Object[] option = {
                        "Làm mới",
                        "Về trang chủ"
                    };
                    int a = JOptionPane.showOptionDialog(null, null, "Trò chơi kết thúc!!!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
                    if (a == JOptionPane.YES_OPTION) {
                        colA.removeAll();
                        colB.removeAll();
                        colC.removeAll();
                        location = 0;
                        chosen = 0;
                        init();
                    } else if(a == JOptionPane.NO_OPTION){
                        HomePage homePage = new HomePage();
                        homePage.setVisible(true);
                        dispose();// Đóng jframe hiện tại
                    }
                }

            } else {
                botmove=0;
                int choice = JOptionPane.showConfirmDialog(null, "P1 chiến thắng!!!", "Thông báo", JOptionPane.CLOSED_OPTION);
                if (choice == JOptionPane.OK_OPTION || choice == JOptionPane.CLOSED_OPTION) {
                    Object[] option = {
                        "Làm mới",
                        "Về trang chủ"
                    };
                    int a = JOptionPane.showOptionDialog(null, null, "Trò chơi kết thúc!!!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
                    if (a == JOptionPane.YES_OPTION) {
                        colA.removeAll();
                        colB.removeAll();
                        colC.removeAll();
                        location = 0;
                        chosen = 0;
                        init();
                    } else if(a == JOptionPane.NO_OPTION){
                        HomePage homePage = new HomePage();
                        homePage.setVisible(true);

                        dispose();// Đóng jframe hiện tại
                    }
                }
            }
        
            }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PlayWithBot().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Person1;
    private javax.swing.JLabel Person2;
    private javax.swing.JButton Recreate;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_continue;
    private javax.swing.JPanel colA;
    private javax.swing.JPanel colB;
    private javax.swing.JPanel colC;
    private javax.swing.JLabel footer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel number;
    private javax.swing.JLabel playTurn;
    private javax.swing.JLabel remainNum;
    // End of variables declaration//GEN-END:variables

}
