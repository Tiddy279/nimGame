package com.mycompany.nimgame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import com.mycompany.nimgame.perSon;
import java.awt.Font;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import javax.swing.text.Style;

/**
 *
 * @author DUY
 */
public class homePage extends javax.swing.JFrame {

    /**
     * Creates new form Option
     */
    public homePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        Start = new javax.swing.JButton();
        lawPlay = new javax.swing.JButton();
        bg0 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NIM GAME");
        setLocation(new java.awt.Point(600, 280));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setBackground(new java.awt.Color(204, 255, 255));
        Exit.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Exit.setText("Thoát");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 130, 40));

        Start.setBackground(new java.awt.Color(204, 255, 255));
        Start.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Start.setText("Bắt đầu");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        jPanel1.add(Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 130, 40));

        lawPlay.setBackground(new java.awt.Color(204, 255, 255));
        lawPlay.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lawPlay.setText("Luật chơi");
        lawPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lawPlayActionPerformed(evt);
            }
        });
        jPanel1.add(lawPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 130, 40));

        bg0.setBackground(new java.awt.Color(204, 255, 255));
        bg0.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        bg0.setIcon(new javax.swing.ImageIcon("D:\\NLCSN\\nimGame\\src\\main\\java\\com\\mycompany\\images\\bg.png")); // NOI18N
        jPanel1.add(bg0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lawPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lawPlayActionPerformed

        String message = "Luật chơi của Nim Game như sau :\n \t 1. Bắt đầu: Với một số lượng các ô nằm trong một tập hợp chung.\n \t 2. Luân phiên lấy ô: Hai người chơi lần lượt thực hiện nước đi. Mỗi lượt, người chơi có thể lấy một hoặc nhiều ô từ tập hợp ( trong cùng cột ), nhưng phải lấy ít nhất một ô.\n \t 3. Thắng cuộc: Người chơi cuối cùng lấy được ô cuối cùng từ tập hợp là người thua cuộc. Người chơi còn lại là người chiến thắng.";

        JOptionPane.showMessageDialog(null, message, "LUẬT CHƠI", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_lawPlayActionPerformed

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed

        Object[] op = {
            "Chơi với người",
            "Chơi với máy"
        };
        int a = JOptionPane.showOptionDialog(null, null, "Chọn đối tượng chơi cùng?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, op, op[0]);
        if (a == JOptionPane.YES_OPTION) {
            perSon playWithPerson = new perSon();
            playWithPerson.setVisible(true);
            dispose();// Đóng jframe hiện tại
        } else if (a == JOptionPane.NO_OPTION) {
                Object[] option = {
                "Đơn giản",
                "Khó"
                    };
                int b = JOptionPane.showOptionDialog(null, null, "Chọn cấp độ?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
                if (b == JOptionPane.YES_OPTION) {
                        easyBot easyBot = new easyBot();
                        easyBot.setVisible(true);
                        dispose();
                }else if(b == JOptionPane.NO_OPTION){
                    hardBot hardBot = new hardBot();
                    hardBot.setVisible(true);
                    dispose();
                }
                else if(a == JOptionPane.CANCEL_OPTION){
                    dispose();
                }
        } else if (a == JOptionPane.CANCEL_OPTION) {
            dispose();// Đóng jframe hiện tại
        }

    }//GEN-LAST:event_StartActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed

        // Xử lý sự kiện khi người dùng click vào button
        int choice = JOptionPane.showConfirmDialog(
                null,
                "Bạn có chắc chắn muốn thoát game?",
                "Xác nhận thoát",
                JOptionPane.YES_NO_OPTION
        );

        if (choice == JOptionPane.YES_OPTION) {
            // Thoát game (hoặc thực hiện các thao tác thoát game ở đây)
            System.exit(0);
        }


    }//GEN-LAST:event_ExitActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton Start;
    private javax.swing.JLabel bg0;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lawPlay;
    // End of variables declaration//GEN-END:variables
}
