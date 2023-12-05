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
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
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
public class PlayWithPerson extends javax.swing.JFrame {

    public PlayWithPerson() {
        initComponents();
        File f = new File("file.txt");
        if (f.exists()) {
            Object[] option = {
                "Có",
                "Ván mới",};
            int x = JOptionPane.showOptionDialog(null, "Bạn có muốn chơi tiếp ván trước không ?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
            if (x == JOptionPane.YES_OPTION) {
                open();
            } else {
                init();
            }
        } else {
                init();
        }
    }
    int player1;
    int player2;
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

    private void init() {
        Random rd = new Random();
        numA = rd.nextInt(7 - 1) + 1;
        numB = rd.nextInt(7 - 1) + 1;
        numC = rd.nextInt(7 - 1) + 1;
        numD = rd.nextInt(7 - 1) + 1;
        numE = rd.nextInt(7 - 1) + 1;
        total = numA + numB + numC + numD + numE;
        player1 = 0;
        player2 = 1;
        numAmount = total;
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

        createLable(colD);

        createLable(colE);

        initBtn(numA, arrA, colA);
        initBtn(numB, arrB, colB);
        initBtn(numC, arrC, colC);
        initBtn(numD, arrD, colD);
        initBtn(numE, arrE, colE);
        btn_continue.setBackground(new java.awt.Color(242, 237, 237));
        jTextField1.setText("");
        jTextField2.setText("");
        jPanel6.setBackground(Color.red);
        jPanel5.setBackground(Color.white);
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
        colD = new javax.swing.JPanel();
        colE = new javax.swing.JPanel();
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        number = new javax.swing.JLabel();
        Recreate = new javax.swing.JButton();
        delete = new javax.swing.JLabel();
        index = new javax.swing.JLabel();
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

        colD.setBackground(new java.awt.Color(38, 207, 207));

        javax.swing.GroupLayout colDLayout = new javax.swing.GroupLayout(colD);
        colD.setLayout(colDLayout);
        colDLayout.setHorizontalGroup(
            colDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        colDLayout.setVerticalGroup(
            colDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        colE.setBackground(new java.awt.Color(38, 207, 207));

        javax.swing.GroupLayout colELayout = new javax.swing.GroupLayout(colE);
        colE.setLayout(colELayout);
        colELayout.setHorizontalGroup(
            colELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        colELayout.setVerticalGroup(
            colELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGap(86, 86, 86)
                .addComponent(colD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(colE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(colA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        Person2.setIcon(new javax.swing.ImageIcon("D:\\NLCSN\\nimGame\\src\\main\\java\\com\\mycompany\\images\\person.png")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Person2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Person2, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addGap(10, 10, 10))
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
        jLabel2.setText("P2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(playTurn))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(56, 56, 56))
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
        jPanel1.add(remainNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 593, 70, 20));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, 110, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 110, 30));

        number.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        number.setText("Số lượng :");
        jPanel1.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, 90, -1));

        Recreate.setBackground(new java.awt.Color(242, 237, 237));
        Recreate.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Recreate.setText("Làm mới");
        Recreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecreateActionPerformed(evt);
            }
        });
        jPanel1.add(Recreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 580, 110, 40));

        delete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        delete.setText("Xóa:");
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, -1, -1));

        index.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        index.setText("Tên cột: ");
        jPanel1.add(index, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, -1, -1));

        footer.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 1170, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1192, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
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
                    if (jTextField1.getText().isEmpty() && jTextField2.getText().isEmpty()) {

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
                    }
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

    private void createLable(JPanel collum) {
        JLabel lb = new JLabel();
        collum.add(lb);
        if (collum == colA) {
            lb.setText("Cột A");
        } else if (collum == colB) {
            lb.setText("Cột B");
        } else if (collum == colC) {
            lb.setText("Cột C");
        } else if (collum == colD) {
            lb.setText("Cột D");
        } else if (collum == colE) {
            lb.setText("Cột E");
        }
        lb.setSize(50, 30);
        lb.setLocation(30, 450);
        lb.setFont(new Font("Segoe UI", Font.BOLD, 14));
    }
    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        Object[] option = {
            "Lưu và thoát",
            "Không lưu và thoát",
            "Ở lại"
        };
        int choice = JOptionPane.showOptionDialog(null, null, "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);

        if (choice == JOptionPane.YES_OPTION) {
            save();
            HomePage homePage = new HomePage();
            homePage.setVisible(true);
            dispose();// Đóng jframe hiện tại
        } else if (choice == JOptionPane.NO_OPTION) {
            HomePage homePage = new HomePage();
            homePage.setVisible(true);
            File f = new File("file.txt");
            f.delete();
            dispose();// Đóng jframe hiện tại
        } else {
            File f = new File("file.txt");
            f.delete();
        }
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_continueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continueActionPerformed
        if (numAmount == 0) {
            Object[] option = {
                "Làm mới",
                "Về trang chủ"
            };
            int a = JOptionPane.showOptionDialog(null, null, "Trò chơi kết thúc!!!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
            if (a == JOptionPane.YES_OPTION) {
                colA.removeAll();
                colB.removeAll();
                colC.removeAll();
                colD.removeAll();
                colE.removeAll();
                location = 0;
                chosen = 0;
                init();
            } else if(a== JOptionPane.NO_OPTION){
                HomePage homePage = new HomePage();
                homePage.setVisible(true);
                dispose();// Đóng jframe hiện tại
            }
        }
        if (jTextField1.getText().isEmpty() && jTextField2.getText().isEmpty()) {
            checkLocation();
            checkWin();
        } else if(!jTextField1.getText().isEmpty() && !jTextField2.getText().isEmpty()){
            continute();
            checkWin();
        }
    }//GEN-LAST:event_btn_continueActionPerformed

    private void checkLocation() {

        if (location == colA.getX()) {
            test(numA, arrA, colA);
        } else if (location == colB.getX()) {
            test(numB, arrB, colB);
        } else if (location == colC.getX()) {
            test(numC, arrC, colC);
        } else if (location == colD.getX()) {
            test(numD, arrD, colD);
        } else {
            test(numE, arrE, colE);
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
            colD.removeAll();
            colE.removeAll();
            location = 0;
            chosen = 0;
            init();
        }

    }//GEN-LAST:event_RecreateActionPerformed

    private void test(int num, int[] arr, JPanel col) {
        if (chosen == 0 && numAmount > 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ít nhất 1 ô", "Nhắc nhở", JOptionPane.WARNING_MESSAGE);
        } else {
            numAmount -= chosen;
            remainNum.setText(String.valueOf(numAmount));
            location = 0;
            chosen = 0;
            col.removeAll();
            initBtn(num, arr, col);
            if (numAmount == 0) {
                btn_continue.setBackground(Color.red);
            }
            if (player1 < player2) {
                jPanel6.setBackground(Color.white);
                jPanel5.setBackground(Color.red);
                player1 += 1;
            } else {
                jPanel6.setBackground(Color.red);
                jPanel5.setBackground(Color.white);
                player2 += 1;
            }
            repaint();
        }

    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        String string = jTextField1.getText();
    }//GEN-LAST:event_jTextField1ActionPerformed

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

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private boolean remain(int[] arr, int num, JPanel col, int input) {
        int temp=0;
        for (int i = 0; i < num; i++) {
            if (arr[i] == 1) {
                temp += 1;
            }
        }
        if (temp < input || temp <= 0) {
            JOptionPane.showMessageDialog(null, "Vuợt quá số lượng ô trong cột", "Nhắc nhở", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

    private void checkWin() {
        if (numAmount - chosen == 0) {         
            if (player2 <= player1) {
                jPanel6.setBackground(Color.white);
                jPanel5.setBackground(Color.white);
                int choice = JOptionPane.showConfirmDialog(null, "P2 chiến thắng!!!", "Thông báo", JOptionPane.CLOSED_OPTION);
                if (choice == JOptionPane.OK_OPTION || choice == JOptionPane.CANCEL_OPTION) {
                    Object[] option = {
                        "Làm mới",
                        "Về trang chủ"
                    };
                    int a = JOptionPane.showOptionDialog(null, null, "Trò chơi kết thúc!!!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
                    if (a == JOptionPane.YES_OPTION) {
                        colA.removeAll();
                        colB.removeAll();
                        colC.removeAll();
                        colD.removeAll();
                        colE.removeAll();
                        location = 0;
                        chosen = 0;
                        init();
                    } else if (a == JOptionPane.NO_OPTION) {
                        HomePage homePage = new HomePage();
                        homePage.setVisible(true);

                        dispose();// Đóng jframe hiện tại
                    } else {
                       
                    }
                }

            } else {
                int choice = JOptionPane.showConfirmDialog(null, "P1 chiến thắng!!!", "Thông báo", JOptionPane.CLOSED_OPTION);
                jPanel6.setBackground(Color.white);
                jPanel5.setBackground(Color.white);
                if (choice == JOptionPane.OK_OPTION || choice == JOptionPane.CANCEL_OPTION) {
                    Object[] option = {
                        "Làm mới",
                        "Về trang chủ"
                    };
                    int a = JOptionPane.showOptionDialog(null, null, "Trò chơi kết thúc!!!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
                    if (a == JOptionPane.YES_OPTION) {
                        colA.removeAll();
                        colB.removeAll();
                        colC.removeAll();
                        colD.removeAll();
                        colE.removeAll();
                        location = 0;
                        chosen = 0;
                        init();
                    } else if (a == JOptionPane.NO_OPTION) {
                        HomePage homePage = new HomePage();
                        homePage.setVisible(true);
                        dispose();// Đóng jframe hiện tại
                    } else {
                        
                    }
                }
            }
        }
    }

    private void continute() {
        string = jTextField2.getText();
        numip = jTextField1.getText();
        input = Integer.valueOf(numip);
        char string1 = string.charAt(0);
        if (string1 == 'A' && remain(arrA, numA, colA, input)) {
            deleteBtn(numA, arrA, colA, input);
        } else if (string1 == 'B' && remain(arrB, numB, colB, input)) {
            deleteBtn(numB, arrB, colB, input);
        } else if (string1 == 'C' && remain(arrC, numC, colC, input)) {
            deleteBtn(numC, arrC, colC, input);
        } else if (string1 == 'D' && remain(arrD, numD, colD, input)) {
            deleteBtn(numD, arrD, colD, input);
        } else if (string1 == 'E' && remain(arrE, numE, colE, input)) {
            deleteBtn(numE, arrE, colE, input);
        } else if (string1 != 'A' && string1 != 'B' && string1 != 'C' && string1 != 'D' && string1 != 'E') {
            JOptionPane.showMessageDialog(null, "Cột " + string + " không tồn tại", "Nhắc nhở", JOptionPane.WARNING_MESSAGE);
        }
        jTextField1.setText("");
        jTextField2.setText("");
    }

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    public void save() {
        try {
            PrintWriter bw = new PrintWriter("file.txt", "UTF-8");
            int tempA = 0;
            int tempB = 0;
            int tempC = 0;
            int tempD = 0;
            int tempE = 0;
            int numAmount = 0;
            if (location == colA.getX()) {
                tempA += chosen;
                numAmount += chosen;
            } else if (location == colB.getX()) {
                tempB += chosen;
                numAmount += chosen;
            } else if (location == colC.getX()) {
                tempC += chosen;
                numAmount += chosen;
            } else if (location == colD.getX()) {
                tempD += chosen;
                numAmount += chosen;
            } else {
                tempE += chosen;
                numAmount += chosen;
            }
            for (int i = 0; i < numA; i++) {
                if (arrA[i] == 1) {
                    tempA += 1;
                    numAmount++;
                }
            }
            bw.write(tempA + ";");
            for (int i = 0; i < numB; i++) {
                if (arrB[i] == 1) {
                    tempB += 1;
                    numAmount++;
                }
            }
            bw.write(tempB + ";");
            for (int i = 0; i < numC; i++) {
                if (arrC[i] == 1) {
                    tempC += 1;
                    numAmount++;
                }
            }
            bw.write(tempC + ";");
            for (int i = 0; i < numD; i++) {
                if (arrD[i] == 1) {
                    tempD += 1;
                    numAmount++;
                }
            }
            bw.write(tempD + ";");
            for (int i = 0; i < numE; i++) {
                if (arrE[i] == 1) {
                    tempE += 1;
                    numAmount++;
                }
            }
            bw.write(tempE + ";" + total + ";" + numAmount);
            bw.write(";" + player1 + ";" + player2);
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void loaddata() {
        colA.removeAll();
        colB.removeAll();
        colC.removeAll();
        colD.removeAll();
        colE.removeAll();
        chosen = 0;
        location = 0;
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
        initBtn(numA, arrA, colA);
        initBtn(numB, arrB, colB);
        initBtn(numC, arrC, colC);
        initBtn(numD, arrD, colD);
        initBtn(numE, arrE, colE);
        if (player1 < player2) {
            jPanel6.setBackground(Color.white);
            jPanel5.setBackground(Color.red);
            player1 += 1;
        } else {
            jPanel6.setBackground(Color.red);
            jPanel5.setBackground(Color.white);
            player2 += 1;
        }
        remainNum.setText(String.valueOf(numAmount));
        repaint();
    }

    public void open() {
        try {
            FileReader f = new FileReader("file.txt", StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(f);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                } else {
                    String txt[] = line.split(";");
                    numA = Integer.parseInt(txt[0]);
                    numB = Integer.parseInt(txt[1]);
                    numC = Integer.parseInt(txt[2]);
                    numD = Integer.parseInt(txt[3]);
                    numE = Integer.parseInt(txt[4]);
                    numAmount = Integer.parseInt(txt[6]);
                    player1 = Integer.parseInt(txt[7]);
                    player2 = Integer.parseInt(txt[8]);
                }
            }
            loaddata();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PlayWithPerson().setVisible(true);
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
    private javax.swing.JPanel colD;
    private javax.swing.JPanel colE;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel footer;
    private javax.swing.JLabel index;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel number;
    private javax.swing.JLabel playTurn;
    private javax.swing.JLabel remainNum;
    // End of variables declaration//GEN-END:variables

}
