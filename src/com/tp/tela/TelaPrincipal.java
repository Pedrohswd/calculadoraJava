/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tp.tela;

import com.tp.utils.Utils;
import java.awt.event.KeyEvent;

/**
 *
 * @author pedro
 */
public class TelaPrincipal extends javax.swing.JFrame {

    Utils cal = new Utils();
    String operador = "";
    public double valor;
    String operadorDois="";

    public TelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtResultado.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButtonOperadorRaiz = new javax.swing.JButton();
        jButtonTrocaDeSinal = new javax.swing.JButton();
        jButtonOperadorPotencia = new javax.swing.JButton();
        jButtonOperadorDivisao = new javax.swing.JButton();
        jButtonClearCE = new javax.swing.JButton();
        numeroQuatro = new javax.swing.JButton();
        numeroSeis = new javax.swing.JButton();
        jButtonOperadorSubtracao = new javax.swing.JButton();
        numeroCinco = new javax.swing.JButton();
        numeroUm = new javax.swing.JButton();
        numeroDois = new javax.swing.JButton();
        numeroTres = new javax.swing.JButton();
        jButtonOperadorSoma = new javax.swing.JButton();
        numeroZero = new javax.swing.JButton();
        separadorDecimal = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField("");
        jButtonOperadorPorcentagem = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        numeroSete = new javax.swing.JButton();
        numeroOito = new javax.swing.JButton();
        numeroNove = new javax.swing.JButton();
        jButtonOperadorMultiplicacao = new javax.swing.JButton();
        jButtonOperadorResultado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jButtonOperadorRaiz.setBackground(new java.awt.Color(102, 102, 102));
        jButtonOperadorRaiz.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonOperadorRaiz.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOperadorRaiz.setText("√");
        jButtonOperadorRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOperadorRaizActionPerformed(evt);
            }
        });

        jButtonTrocaDeSinal.setBackground(new java.awt.Color(102, 102, 102));
        jButtonTrocaDeSinal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonTrocaDeSinal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTrocaDeSinal.setText("+/-");
        jButtonTrocaDeSinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrocaDeSinalActionPerformed(evt);
            }
        });

        jButtonOperadorPotencia.setBackground(new java.awt.Color(102, 102, 102));
        jButtonOperadorPotencia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonOperadorPotencia.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOperadorPotencia.setText("X^2");
        jButtonOperadorPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOperadorPotenciaActionPerformed(evt);
            }
        });

        jButtonOperadorDivisao.setBackground(new java.awt.Color(102, 102, 102));
        jButtonOperadorDivisao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonOperadorDivisao.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOperadorDivisao.setText("/");
        jButtonOperadorDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOperadorDivisaoActionPerformed(evt);
            }
        });

        jButtonClearCE.setBackground(new java.awt.Color(102, 102, 102));
        jButtonClearCE.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClearCE.setText("CE");
        jButtonClearCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearCEActionPerformed(evt);
            }
        });

        numeroQuatro.setBackground(new java.awt.Color(0, 0, 0));
        numeroQuatro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        numeroQuatro.setForeground(new java.awt.Color(255, 255, 255));
        numeroQuatro.setText("4");
        numeroQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroQuatroActionPerformed(evt);
            }
        });

        numeroSeis.setBackground(new java.awt.Color(0, 0, 0));
        numeroSeis.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        numeroSeis.setForeground(new java.awt.Color(255, 255, 255));
        numeroSeis.setText("6");
        numeroSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroSeisActionPerformed(evt);
            }
        });

        jButtonOperadorSubtracao.setBackground(new java.awt.Color(102, 102, 102));
        jButtonOperadorSubtracao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonOperadorSubtracao.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOperadorSubtracao.setText("-");
        jButtonOperadorSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOperadorSubtracaoActionPerformed(evt);
            }
        });

        numeroCinco.setBackground(new java.awt.Color(0, 0, 0));
        numeroCinco.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        numeroCinco.setForeground(new java.awt.Color(255, 255, 255));
        numeroCinco.setText("5");
        numeroCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroCincoActionPerformed(evt);
            }
        });

        numeroUm.setBackground(new java.awt.Color(0, 0, 0));
        numeroUm.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        numeroUm.setForeground(new java.awt.Color(255, 255, 255));
        numeroUm.setText("1");
        numeroUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroUmActionPerformed(evt);
            }
        });

        numeroDois.setBackground(new java.awt.Color(0, 0, 0));
        numeroDois.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        numeroDois.setForeground(new java.awt.Color(255, 255, 255));
        numeroDois.setText("2");
        numeroDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroDoisActionPerformed(evt);
            }
        });

        numeroTres.setBackground(new java.awt.Color(0, 0, 0));
        numeroTres.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        numeroTres.setForeground(new java.awt.Color(255, 255, 255));
        numeroTres.setText("3");
        numeroTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroTresActionPerformed(evt);
            }
        });

        jButtonOperadorSoma.setBackground(new java.awt.Color(102, 102, 102));
        jButtonOperadorSoma.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonOperadorSoma.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOperadorSoma.setText("+");
        jButtonOperadorSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOperadorSomaActionPerformed(evt);
            }
        });

        numeroZero.setBackground(new java.awt.Color(0, 0, 0));
        numeroZero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        numeroZero.setForeground(new java.awt.Color(255, 255, 255));
        numeroZero.setText("0");
        numeroZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroZeroActionPerformed(evt);
            }
        });

        separadorDecimal.setBackground(new java.awt.Color(0, 0, 0));
        separadorDecimal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        separadorDecimal.setForeground(new java.awt.Color(255, 255, 255));
        separadorDecimal.setText(",");
        separadorDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                separadorDecimalActionPerformed(evt);
            }
        });

        txtResultado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jButtonOperadorPorcentagem.setBackground(new java.awt.Color(102, 102, 102));
        jButtonOperadorPorcentagem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonOperadorPorcentagem.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOperadorPorcentagem.setText("%");
        jButtonOperadorPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOperadorPorcentagemActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(102, 102, 102));
        jButtonClear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setText("C");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonExcluir.setBackground(new java.awt.Color(102, 102, 102));
        jButtonExcluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        numeroSete.setBackground(new java.awt.Color(0, 0, 0));
        numeroSete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        numeroSete.setForeground(new java.awt.Color(255, 255, 255));
        numeroSete.setText("7");
        numeroSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroSeteActionPerformed(evt);
            }
        });

        numeroOito.setBackground(new java.awt.Color(0, 0, 0));
        numeroOito.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        numeroOito.setForeground(new java.awt.Color(255, 255, 255));
        numeroOito.setText("8");
        numeroOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroOitoActionPerformed(evt);
            }
        });

        numeroNove.setBackground(new java.awt.Color(0, 0, 0));
        numeroNove.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        numeroNove.setForeground(new java.awt.Color(255, 255, 255));
        numeroNove.setText("9");
        numeroNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroNoveActionPerformed(evt);
            }
        });

        jButtonOperadorMultiplicacao.setBackground(new java.awt.Color(102, 102, 102));
        jButtonOperadorMultiplicacao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonOperadorMultiplicacao.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOperadorMultiplicacao.setText("X");
        jButtonOperadorMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOperadorMultiplicacaoActionPerformed(evt);
            }
        });

        jButtonOperadorResultado.setBackground(new java.awt.Color(0, 0, 204));
        jButtonOperadorResultado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonOperadorResultado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOperadorResultado.setText("=");
        jButtonOperadorResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOperadorResultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtResultado)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(numeroSete, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(numeroOito, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(numeroNove, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(numeroQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(numeroCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(numeroSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(numeroUm, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(numeroDois, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(numeroTres, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonOperadorMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonOperadorSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonOperadorSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(separadorDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(numeroZero, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonOperadorResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButtonTrocaDeSinal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonOperadorRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonOperadorPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButtonOperadorPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonClearCE, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonOperadorDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOperadorPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClearCE, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOperadorRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOperadorPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTrocaDeSinal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOperadorDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroOito, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroNove, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroSete, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOperadorMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOperadorSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroDois, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroTres, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroUm, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOperadorSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroZero, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separadorDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOperadorResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int contador = 0;
    private void numeroZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroZeroActionPerformed
        if (contador == 1) {
            txtResultado.setText("");
            contador = 0;
        } else {
            txtResultado.setText(txtResultado.getText() + "0");

        }

    }//GEN-LAST:event_numeroZeroActionPerformed

    private void numeroUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroUmActionPerformed
        if (contador == 1) {
            txtResultado.setText("");
            contador = 0;
            txtResultado.setText(txtResultado.getText() + "1");
        } else {
            txtResultado.setText(txtResultado.getText() + "1");
        }
    }//GEN-LAST:event_numeroUmActionPerformed

    private void numeroDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroDoisActionPerformed
        if (contador == 1) {
            txtResultado.setText("");
            contador = 0;
            txtResultado.setText(txtResultado.getText() + "2");
        } else {
            txtResultado.setText(txtResultado.getText() + "2");
        }
    }//GEN-LAST:event_numeroDoisActionPerformed

    private void numeroTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroTresActionPerformed
        if (contador == 1) {
            txtResultado.setText("");
            contador = 0;
            txtResultado.setText(txtResultado.getText() + "3");
        } else {
            txtResultado.setText(txtResultado.getText() + "3");
        }
    }//GEN-LAST:event_numeroTresActionPerformed

    private void numeroQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroQuatroActionPerformed
        if (contador == 1) {
            txtResultado.setText("");
            contador = 0;
            txtResultado.setText(txtResultado.getText() + "4");
        } else {
            txtResultado.setText(txtResultado.getText() + "4");
        }
    }//GEN-LAST:event_numeroQuatroActionPerformed

    private void numeroCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroCincoActionPerformed
        if (contador == 1) {
            txtResultado.setText("");
            contador = 0;
            txtResultado.setText(txtResultado.getText() + "5");
        } else {
            txtResultado.setText(txtResultado.getText() + "5");
        }
    }//GEN-LAST:event_numeroCincoActionPerformed

    private void numeroSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroSeisActionPerformed
        if (contador == 1) {
            txtResultado.setText("");
            contador = 0;
            txtResultado.setText(txtResultado.getText() + "6");
        } else {
            txtResultado.setText(txtResultado.getText() + "6");
        }
    }//GEN-LAST:event_numeroSeisActionPerformed

    private void numeroSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroSeteActionPerformed
        if (contador == 1) {
            txtResultado.setText("");
            contador = 0;
            txtResultado.setText(txtResultado.getText() + "7");
        } else {
            txtResultado.setText(txtResultado.getText() + "7");
        }
    }//GEN-LAST:event_numeroSeteActionPerformed

    private void numeroOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroOitoActionPerformed
        if (contador == 1) {
            txtResultado.setText("");
            contador = 0;
            txtResultado.setText(txtResultado.getText() + "8");
        } else {
            txtResultado.setText(txtResultado.getText() + "8");
        }
    }//GEN-LAST:event_numeroOitoActionPerformed

    private void numeroNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroNoveActionPerformed
        if (contador == 1) {
            txtResultado.setText("");
            contador = 0;
            txtResultado.setText(txtResultado.getText() + "9");
        } else {
            txtResultado.setText(txtResultado.getText() + "9");
        }
    }//GEN-LAST:event_numeroNoveActionPerformed

    private void separadorDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_separadorDecimalActionPerformed
        if (contador == 1) {
            txtResultado.setText("");
            contador = 0;
            txtResultado.setText(txtResultado.getText() + ".");
        } else {
            txtResultado.setText(txtResultado.getText() + ".");
        }
    }//GEN-LAST:event_separadorDecimalActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        txtResultado.setText("");
        cal.clearC();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonOperadorSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOperadorSomaActionPerformed
        // TODO add your handling code here:
        if("".equals(txtResultado.getText())){
            cal.valorUm =0;
        }else{
            cal.valorUm = Double.parseDouble(txtResultado.getText());
        }
        
        txtResultado.setText("");
        operador = "+";
    }//GEN-LAST:event_jButtonOperadorSomaActionPerformed

    private void jButtonOperadorResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOperadorResultadoActionPerformed
        // TODO add your handling code here:
        String saida = "";
        
        if (operador == "") {
            if (operadorDois == "+") {
                saida = Double.toString(cal.somar());
                contador = 1;
            }
            if (operadorDois == "-") {
                saida = Double.toString(cal.subtrair());
                contador = 1;
            }
            if (operadorDois == "*") {
                saida = Double.toString(cal.multiplicar());
                contador = 1;
            }
            if (operadorDois == "/") {
                saida = Double.toString(cal.dividir());
                contador = 1;
            }
            if (operadorDois == "^") {
                saida = Double.toString(cal.potenciacao());
                contador = 1;
            }
            if (operadorDois == "raiz") {
                saida = Double.toString(cal.radiciacao());
                contador = 1;
            }
            if (operadorDois == "%") {
                saida = Double.toString(cal.porcentagem());
                contador = 1;
            }
        }else{
            operadorDois = operador;
            if("".equals(txtResultado.getText())){
                cal.valorDois =0;
            }else{
                cal.valorDois = Double.parseDouble(txtResultado.getText());
            }

            if (operador == "+") {
                saida = Double.toString(cal.somar());
                contador = 1;
                operador = "";
            }
            if (operador == "-") {
                saida = Double.toString(cal.subtrair());
                contador = 1;
                operador = "";
            }
            if (operador == "*") {
                saida = Double.toString(cal.multiplicar());
                contador = 1;
                operador = "";
            }
            if (operador == "/") {
                saida = Double.toString(cal.dividir());
                contador = 1;
                operador = "";
            }
            if (operador == "^") {
                saida = Double.toString(cal.potenciacao());
                contador = 1;
                operador = "";
            }
            if (operador == "raiz") {
                saida = Double.toString(cal.radiciacao());
                contador = 1;
                operador = "";
            }
            if (operador == "%") {
                saida = Double.toString(cal.porcentagem());
                contador = 1;
                operador = "";
            }
        }
        txtResultado.setText(saida);
    }//GEN-LAST:event_jButtonOperadorResultadoActionPerformed

    private void jButtonOperadorMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOperadorMultiplicacaoActionPerformed
        // TODO add your handling code here:
        if("".equals(txtResultado.getText())){
            cal.valorUm =0;
        }else{
            cal.valorUm = Double.parseDouble(txtResultado.getText());
        }
        txtResultado.setText("");
        operador = "*";
    }//GEN-LAST:event_jButtonOperadorMultiplicacaoActionPerformed

    private void jButtonOperadorPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOperadorPotenciaActionPerformed
        // TODO add your handling code here:
        if("".equals(txtResultado.getText())){
            cal.valorUm =0;
        }else{
            cal.valorUm = Double.parseDouble(txtResultado.getText());
        }
        txtResultado.setText("");
        operador = "^";
    }//GEN-LAST:event_jButtonOperadorPotenciaActionPerformed

    private void jButtonOperadorRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOperadorRaizActionPerformed
        // TODO add your handling code here:
        if("".equals(txtResultado.getText())){
            cal.valorUm =0;
        }else{
            cal.valorUm = Double.parseDouble(txtResultado.getText());
        }
        txtResultado.setText("");
        operador = "raiz";
    }//GEN-LAST:event_jButtonOperadorRaizActionPerformed

    private void jButtonClearCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearCEActionPerformed
        // TODO add your handling code here:
        txtResultado.setText("");
    }//GEN-LAST:event_jButtonClearCEActionPerformed

    private void jButtonOperadorSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOperadorSubtracaoActionPerformed
        // TODO add your handling code here:
        if("".equals(txtResultado.getText())){
            cal.valorUm =0;
        }else{
            cal.valorUm = Double.parseDouble(txtResultado.getText());
        }
        txtResultado.setText("");
        operador = "-";
    }//GEN-LAST:event_jButtonOperadorSubtracaoActionPerformed

    private void jButtonOperadorDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOperadorDivisaoActionPerformed
        // TODO add your handling code here:
        if("".equals(txtResultado.getText())){
            cal.valorUm =0;
        }else{
            cal.valorUm = Double.parseDouble(txtResultado.getText());
        }
        txtResultado.setText("");
        operador = "/";
    }//GEN-LAST:event_jButtonOperadorDivisaoActionPerformed

    private void jButtonOperadorPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOperadorPorcentagemActionPerformed
        // TODO add your handling code here:
        if("".equals(txtResultado.getText())){
            cal.valorUm =0;
        }else{
            cal.valorUm = Double.parseDouble(txtResultado.getText());
        }
        txtResultado.setText("");
        operador = "%";
    }//GEN-LAST:event_jButtonOperadorPorcentagemActionPerformed

    private void jButtonTrocaDeSinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrocaDeSinalActionPerformed
        // TODO add your handling code here:
        String texto = txtResultado.getText();
        double textoDouble = Double.parseDouble(texto);
        txtResultado.setText(Double.toString(textoDouble * -1));

    }//GEN-LAST:event_jButtonTrocaDeSinalActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:

        String texto = txtResultado.getText();
        texto = texto.replaceFirst(".$", "");
        txtResultado.setText(texto);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });

    }
    //metodosGet


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonClearCE;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonOperadorDivisao;
    private javax.swing.JButton jButtonOperadorMultiplicacao;
    private javax.swing.JButton jButtonOperadorPorcentagem;
    private javax.swing.JButton jButtonOperadorPotencia;
    private javax.swing.JButton jButtonOperadorRaiz;
    private javax.swing.JButton jButtonOperadorResultado;
    private javax.swing.JButton jButtonOperadorSoma;
    private javax.swing.JButton jButtonOperadorSubtracao;
    private javax.swing.JButton jButtonTrocaDeSinal;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton numeroCinco;
    private javax.swing.JButton numeroDois;
    private javax.swing.JButton numeroNove;
    private javax.swing.JButton numeroOito;
    private javax.swing.JButton numeroQuatro;
    private javax.swing.JButton numeroSeis;
    private javax.swing.JButton numeroSete;
    private javax.swing.JButton numeroTres;
    private javax.swing.JButton numeroUm;
    private javax.swing.JButton numeroZero;
    private javax.swing.JButton separadorDecimal;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
