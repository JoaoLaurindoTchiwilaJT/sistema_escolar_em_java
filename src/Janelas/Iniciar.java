package Janelas;

import BD.*;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Iniciar extends javax.swing.JFrame {
    
    public Iniciar() {
        initComponents();
        
       
          conect.CriarBD();
          conect.Turmas();
          conect.Prof();
          conect.Curso();
          conect.Alunos();
          
        //Operações de visibilidade dos objectos
          Nomes.setVisible(false);
          nome.setVisible(false);
          Classes.setVisible(false);
          Classe.setVisible(false);
          Turnos.setVisible(false);
          Turno.setVisible(false);
          Turmas.setVisible(false);
          Turm.setVisible(false);
          P1.setVisible(false);
          P2.setVisible(false);
          P3.setVisible(false);
          jSpinner1.setVisible(false);
          jSpinner2.setVisible(false);
          jSpinner3.setVisible(false);
          Cursos.setVisible(false);
          Curso.setVisible(false);
          Adicionar.setVisible(false);
          Mostrar.setVisible(false);
          Trimestre.setVisible(false);
          Trimestres1.setVisible(false);
          PainelAluno.setVisible(false);
          PainelProf.setVisible(false);
          PainelTurma.setVisible(false);
          PainelCurso.setVisible(false); 
          PainelPauta.setVisible(false);
          TabelaAluno.setEnabled(false);
          TabelaCurso.setEnabled(false);
          TabelaTurma.setEnabled(false);
          Tabelaprof.setEnabled(false);
          TabelaPauta.setEnabled(false);
    }
    
    int x1=0, y1=0,  tot = 0;
    Conexao conect = new Conexao();
    Insercao inseri = new Insercao();
    Buscar buscando = new Buscar();
    DefaultTableModel Tur,  curso,Profs,Aluno,pauta;
    DefaultComboBoxModel Turmaz, CUR;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        texto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Prof = new javax.swing.JButton();
        turm = new javax.swing.JButton();
        Pautas = new javax.swing.JButton();
        Estudant = new javax.swing.JButton();
        cursos = new javax.swing.JButton();
        P2 = new javax.swing.JLabel();
        P1 = new javax.swing.JLabel();
        Trimestres1 = new javax.swing.JLabel();
        Cursos = new javax.swing.JLabel();
        Turm = new javax.swing.JComboBox<String>();
        Trimestre = new javax.swing.JComboBox<String>();
        Mostrar = new javax.swing.JButton();
        Turmas = new javax.swing.JLabel();
        P3 = new javax.swing.JLabel();
        Curso = new javax.swing.JComboBox<String>();
        Nomes = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        Turno = new javax.swing.JComboBox<String>();
        Turnos = new javax.swing.JLabel();
        Classe = new javax.swing.JComboBox<String>();
        Classes = new javax.swing.JLabel();
        Adicionar = new javax.swing.JButton();
        PainelAluno = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaAluno = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        PainelProf = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabelaprof = new javax.swing.JTable();
        PainelTurma = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaTurma = new javax.swing.JTable();
        PainelCurso = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TabelaCurso = new javax.swing.JTable();
        PainelPauta = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TabelaPauta = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(71, 43, 119));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        texto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        texto.setForeground(new java.awt.Color(255, 255, 255));
        texto.setText("Bem-Vindo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(texto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 990, 130));

        jPanel2.setBackground(new java.awt.Color(94, 70, 136));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIA LUCINDA");

        Prof.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Prof.setForeground(new java.awt.Color(255, 255, 255));
        Prof.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_tuition_30px.png"))); // NOI18N
        Prof.setText("   Professores");
        Prof.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 0, 0, new java.awt.Color(255, 255, 255)));
        Prof.setBorderPainted(false);
        Prof.setContentAreaFilled(false);
        Prof.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Prof.setRequestFocusEnabled(false);
        Prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfActionPerformed(evt);
            }
        });

        turm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        turm.setForeground(new java.awt.Color(255, 255, 255));
        turm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_folder_26px_1.png"))); // NOI18N
        turm.setText("    Turmas     ");
        turm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 0, 0, new java.awt.Color(255, 255, 255)));
        turm.setBorderPainted(false);
        turm.setContentAreaFilled(false);
        turm.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        turm.setRequestFocusEnabled(false);
        turm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turmActionPerformed(evt);
            }
        });

        Pautas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Pautas.setForeground(new java.awt.Color(255, 255, 255));
        Pautas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_test_32px.png"))); // NOI18N
        Pautas.setText("     Pauta        ");
        Pautas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 0, 0, new java.awt.Color(255, 255, 255)));
        Pautas.setBorderPainted(false);
        Pautas.setContentAreaFilled(false);
        Pautas.setRequestFocusEnabled(false);
        Pautas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PautasActionPerformed(evt);
            }
        });

        Estudant.setBackground(new java.awt.Color(255, 255, 255));
        Estudant.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Estudant.setForeground(new java.awt.Color(255, 255, 255));
        Estudant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_student_registration_30px.png"))); // NOI18N
        Estudant.setText("   Estudantes");
        Estudant.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 0, 0, new java.awt.Color(255, 255, 255)));
        Estudant.setBorderPainted(false);
        Estudant.setContentAreaFilled(false);
        Estudant.setFocusPainted(false);
        Estudant.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Estudant.setRequestFocusEnabled(false);
        Estudant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EstudantMouseClicked(evt);
            }
        });
        Estudant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstudantActionPerformed(evt);
            }
        });

        cursos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cursos.setForeground(new java.awt.Color(255, 255, 255));
        cursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_elective_26px.png"))); // NOI18N
        cursos.setText("     Cursos      ");
        cursos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 0, 0, new java.awt.Color(255, 255, 255)));
        cursos.setBorderPainted(false);
        cursos.setContentAreaFilled(false);
        cursos.setRequestFocusEnabled(false);
        cursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Estudant, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Prof, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(turm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pautas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addComponent(cursos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Estudant, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turm, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(cursos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pautas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 570));

        P2.setText("P2");
        jPanel1.add(P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 250, 40, -1));

        P1.setText("P1");
        jPanel1.add(P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 250, 40, -1));

        Trimestres1.setText("Trimestre");
        jPanel1.add(Trimestres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 250, 90, 20));

        Cursos.setText("Curso");
        jPanel1.add(Cursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 90, 20));

        Turm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        Turm.setFocusable(false);
        Turm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurmActionPerformed(evt);
            }
        });
        jPanel1.add(Turm, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 100, -1));

        Trimestre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1º Trimestre", "2º Trimestre", "3º Trimestre" }));
        Trimestre.setFocusable(false);
        jPanel1.add(Trimestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 280, 100, -1));

        Mostrar.setBackground(new java.awt.Color(71, 43, 119));
        Mostrar.setForeground(new java.awt.Color(255, 255, 255));
        Mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_eye_24px.png"))); // NOI18N
        Mostrar.setText("Mostrar");
        Mostrar.setBorderPainted(false);
        Mostrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Mostrar.setRequestFocusEnabled(false);
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        jPanel1.add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 310, 140, 30));

        Turmas.setText("Turma");
        jPanel1.add(Turmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 90, 20));

        P3.setText("P3");
        jPanel1.add(P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 250, 40, -1));

        Curso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        Curso.setFocusable(false);
        jPanel1.add(Curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 100, -1));

        Nomes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nomes.setText("Nome");
        jPanel1.add(Nomes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 140, -1));
        jPanel1.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 140, 30));

        Turno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manhã", "Tarde", "Noite" }));
        Turno.setFocusable(false);
        jPanel1.add(Turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 100, -1));

        Turnos.setText("Turno");
        jPanel1.add(Turnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 90, 20));

        Classe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1º", "2º", "3º", "4º", "5º", "6º", "7º", "8º", "9º", "10º", "11º", "12º" }));
        jPanel1.add(Classe, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 100, -1));

        Classes.setText("Classe");
        jPanel1.add(Classes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 90, 20));

        Adicionar.setBackground(new java.awt.Color(71, 43, 119));
        Adicionar.setForeground(new java.awt.Color(255, 255, 255));
        Adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_plus_math_24px.png"))); // NOI18N
        Adicionar.setText("     Adicionar");
        Adicionar.setBorderPainted(false);
        Adicionar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Adicionar.setRequestFocusEnabled(false);
        Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(Adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 310, 140, 30));

        PainelAluno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Classe", "Turno", "Curso", "Turma", "Trimestre", "Classificação"
            }
        ));
        jScrollPane1.setViewportView(TabelaAluno);
        if (TabelaAluno.getColumnModel().getColumnCount() > 0) {
            TabelaAluno.getColumnModel().getColumn(1).setHeaderValue("Classe");
            TabelaAluno.getColumnModel().getColumn(3).setHeaderValue("Curso");
            TabelaAluno.getColumnModel().getColumn(4).setHeaderValue("Turma");
            TabelaAluno.getColumnModel().getColumn(5).setHeaderValue("Trimestre");
            TabelaAluno.getColumnModel().getColumn(6).setHeaderValue("Classificação");
        }

        PainelAluno.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 220));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        PainelAluno.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jPanel1.add(PainelAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 990, 220));

        PainelProf.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabelaprof.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Classe", "Turno"
            }
        ));
        jScrollPane2.setViewportView(Tabelaprof);
        if (Tabelaprof.getColumnModel().getColumnCount() > 0) {
            Tabelaprof.getColumnModel().getColumn(1).setHeaderValue("Classe");
        }

        PainelProf.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 220));

        jPanel1.add(PainelProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 990, 220));

        PainelTurma.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelaTurma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Classe", "Turno"
            }
        ));
        jScrollPane3.setViewportView(TabelaTurma);
        if (TabelaTurma.getColumnModel().getColumnCount() > 0) {
            TabelaTurma.getColumnModel().getColumn(1).setHeaderValue("Classe");
        }

        PainelTurma.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 220));

        jPanel1.add(PainelTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 990, 220));

        PainelCurso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelaCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Turno"
            }
        ));
        jScrollPane4.setViewportView(TabelaCurso);

        PainelCurso.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 220));

        jPanel1.add(PainelCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 990, 220));

        PainelPauta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelaPauta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Classe", "Turno", "Curso", "Turma", "Trimestre", "Classificação"
            }
        ));
        jScrollPane5.setViewportView(TabelaPauta);
        if (TabelaPauta.getColumnModel().getColumnCount() > 0) {
            TabelaPauta.getColumnModel().getColumn(1).setHeaderValue("Classe");
            TabelaPauta.getColumnModel().getColumn(3).setHeaderValue("Curso");
            TabelaPauta.getColumnModel().getColumn(4).setHeaderValue("Turma");
            TabelaPauta.getColumnModel().getColumn(5).setHeaderValue("Trimestre");
            TabelaPauta.getColumnModel().getColumn(6).setHeaderValue("Classificação");
        }

        PainelPauta.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 220));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        PainelPauta.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jPanel1.add(PainelPauta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 990, 220));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(252, 19, 19));
        jButton1.setText("X");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 50, 50));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 280, 40, -1));
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 280, 40, -1));
        jPanel1.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 280, 40, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Trimestre(){
        
        
        buscando.Curso();
         CUR = (DefaultComboBoxModel)Curso.getModel();
         CUR.removeAllElements();
         
          for (int i = 0; i < buscando.getDados().size(); i++) {
            CUR.addElement(buscando.getDados().get(i).split("_")[0]);
          }
          
          buscando.Turmas();
          Turmaz = (DefaultComboBoxModel) Turm.getModel();
          Turmaz.removeAllElements();
         
          for (int i = 0; i < buscando.getDados().size(); i++) {
            Turmaz.addElement(buscando.getDados().get(i).split("_")[0]);
        }
          
       try{
         int b = 0;
         Aluno = (DefaultTableModel) TabelaAluno.getModel();
         buscando.Alunos();
        
         Aluno.setNumRows(0);
         
         
        for (int i = 0; i < buscando.getVendo(); i++) {
              Aluno.addRow( new Object[]{
               buscando.getDados().get(b).split("_")[0],
               buscando.getDados().get(b).split("_")[1],
               buscando.getDados().get(b).split("_")[2],
               buscando.getDados().get(b).split("_")[3],
               buscando.getDados().get(b).split("_")[4],
               buscando.getDados().get(b).split("_")[5],
               buscando.getDados().get(b).split("_")[6]    
                  
              });
           b+=1;
          }
         }catch(Exception ex){
        }
    }
    
    public void Prof( ){
          try{
           int b =0;
            Profs = (DefaultTableModel) Tabelaprof.getModel();
            
            buscando.Professores();
            
            Profs.setNumRows(0);
            
            for (int i = 0; i < buscando.getVendo(); i++) {
              
              Profs.addRow( new Object[]{
               buscando.getDados().get(b).split("_")[0],
               buscando.getDados().get(b).split("_")[1],
               buscando.getDados().get(b).split("_")[2],
              });
             
              b+=1;
          }
          
          }catch(Exception ex){

          } 
       
    }
      
    
    public void Pauta(){
       try{
         int b = 0;
          pauta = (DefaultTableModel) TabelaPauta.getModel();
          buscando.Pauta(Turm.getSelectedItem().toString());
          pauta.setNumRows(0);
          
         for (int i = 0; i <= buscando.getVendo(); i++) {
             
         if (Classe.getSelectedItem().toString().equalsIgnoreCase(buscando.getDados().get(b).split("_")[1]) &  Turno.getSelectedItem().toString().equalsIgnoreCase(buscando.getDados().get(b).split("_")[2]) &   Turm.getSelectedItem().toString().equalsIgnoreCase(buscando.getDados().get(b).split("_")[4])  & Trimestre.getSelectedItem().toString().equalsIgnoreCase(buscando.getDados().get(b).split("_")[5])) {
              pauta.addRow( new Object[]{
               buscando.getDados().get(b).split("_")[0],
               buscando.getDados().get(b).split("_")[1],
               buscando.getDados().get(b).split("_")[2],
               buscando.getDados().get(b).split("_")[3],
               buscando.getDados().get(b).split("_")[4],
               buscando.getDados().get(b).split("_")[5],
               buscando.getDados().get(b).split("_")[6]    
                  
              });
           
         }else if(Classe.getSelectedItem().toString().equalsIgnoreCase(buscando.getDados().get(b).split("_")[1]) &  Turno.getSelectedItem().toString().equalsIgnoreCase(buscando.getDados().get(b).split("_")[2]) &  Curso.getSelectedItem().toString().equalsIgnoreCase(buscando.getDados().get(b).split("_")[3]) & Turm.getSelectedItem().toString().equalsIgnoreCase(buscando.getDados().get(b).split("_")[4])  & Trimestre.getSelectedItem().toString().equalsIgnoreCase(buscando.getDados().get(b).split("_")[5])) {
               pauta.addRow( new Object[]{
               buscando.getDados().get(b).split("_")[0],
               buscando.getDados().get(b).split("_")[1],
               buscando.getDados().get(b).split("_")[2],
               buscando.getDados().get(b).split("_")[3],
               buscando.getDados().get(b).split("_")[4],
               buscando.getDados().get(b).split("_")[5],
               buscando.getDados().get(b).split("_")[6]    
                  
              });
           }
         b+=1;
         }
         }catch(Exception ex){
        }
        
    }
    
    public void Turmas( ){
          
          try{
           int b = 0;
            Tur = (DefaultTableModel) TabelaTurma.getModel();
            
            buscando.Turmas();
            
            Tur.setNumRows(0);
            
            for (int i = 0; i < buscando.getVendo(); i++) {
              
              Tur.addRow( new Object[]{
               buscando.getDados().get(b).split("_")[0],
                buscando.getDados().get(b).split("_")[1],
                 buscando.getDados().get(b).split("_")[2],
              });
             
              b+=1;
          }
          
          }catch(Exception ex){

          }     
              
    }
      
    public void Curso(){
        
          try{
           int b =0,c=1,c1=0;
            curso = (DefaultTableModel) TabelaCurso.getModel();
            
            buscando.Curso();
            
            curso.setNumRows(0);
            
            for (int i = 0; i < buscando.getVendo(); i++) {
              
              curso.addRow( new Object[]{
               buscando.getDados().get(b).split("_")[0],
               buscando.getDados().get(b).split("_")[1],
              });
             
              b+=1;
          }
          
          }catch(Exception ex){

          } 
       
    }
    
    private void ProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfActionPerformed
          Prof.setBorderPainted(true);
          Estudant.setBorderPainted(false);
          turm.setBorderPainted(false);
          Pautas.setBorderPainted(false);
          cursos.setBorderPainted(false);
          PainelAluno.setVisible(false);
          PainelProf.setVisible(true);
          PainelTurma.setVisible(false);
          PainelCurso.setVisible(false);
          PainelPauta.setVisible(false);
          
           //Animação nos Botões
          Prof.setBackground(new Color(80, 54, 125));
          Prof.setContentAreaFilled(true);
          Pautas.setBackground(new Color(71, 43, 119));
          Pautas.setContentAreaFilled(false);
          turm.setBackground(new Color(71, 43, 119));
          turm.setContentAreaFilled(false);
          Estudant.setBackground(new Color(71, 43, 119));
          Estudant.setContentAreaFilled(false);
          cursos.setBackground(new Color(80, 54, 125));
          cursos.setContentAreaFilled(false);
          
          //Operações de visibilidade dos objectos
          Nomes.setVisible(true);
          nome.setVisible(true);
          nome.setEnabled(true);
          Turnos.setVisible(true);
          Turno.setVisible(true);
          Classes.setVisible(true);
          Classe.setVisible(true);
          Classe.setEnabled(true);
          Cursos.setVisible(true);
          Curso.setVisible(true);
          Curso.setEnabled(false);
          Trimestre.setVisible(true);
          Trimestres1.setVisible(true); 
          Trimestre.setEnabled(false);
          Turmas.setVisible(true);
          Turm.setVisible(true);
          Turm.setEnabled(false);
          Adicionar.setVisible(true);
          P1.setVisible(false);
          P2.setVisible(false);
          P3.setVisible(false);
          jSpinner3.setVisible(false);
          jSpinner2.setVisible(false);
          jSpinner1.setVisible(false);
          Mostrar.setVisible(false);
          texto.setText("TiaLucinda/Professores");
          
          
          //Apagando dados dos objectos
          nome.setText(" ");
          
          Prof();
    }//GEN-LAST:event_ProfActionPerformed

    private void turmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turmActionPerformed
          turm.setBorderPainted(true); 
          Prof.setBorderPainted(false);
          Estudant.setBorderPainted(false);
          Pautas.setBorderPainted(false);
          PainelAluno.setVisible(false);
          PainelProf.setVisible(false);
          PainelTurma.setVisible(true);
          PainelCurso.setVisible(false);
          PainelPauta.setVisible(false);
          cursos.setBorderPainted(false);
          
           //Animação nos Botões
          turm.setBackground(new Color(80, 54, 125));
          turm.setContentAreaFilled(true);
          Prof.setBackground(new Color(71, 43, 119));
          Prof.setContentAreaFilled(false);
          Pautas.setBackground(new Color(71, 43, 119));
          Pautas.setContentAreaFilled(false);
          Estudant.setBackground(new Color(71, 43, 119));
          Estudant.setContentAreaFilled(false);
          cursos.setBackground(new Color(80, 54, 125));
          cursos.setContentAreaFilled(false);
           Adicionar.setContentAreaFilled(true);
          
          
            //Operações de visibilidade dos objectos
          Nomes.setVisible(true);
          nome.setVisible(true);
          nome.setEnabled(true);
          Turnos.setVisible(true);
          Turno.setVisible(true);
          Classes.setVisible(true);
          Classe.setVisible(true);
          Classe.setEnabled(true);
          Cursos.setVisible(true);
          Curso.setVisible(true);
          Curso.setEnabled(false);
          Trimestre.setVisible(true);
          Trimestres1.setVisible(true); 
          Trimestre.setEnabled(false);
          Turmas.setVisible(true);
          Turm.setVisible(true);
          Turm.setEnabled(false);
          Adicionar.setVisible(true);
          P1.setVisible(false);
          P2.setVisible(false);
          P3.setVisible(false);
          jSpinner1.setVisible(false);
          jSpinner2.setVisible(false);
          jSpinner3.setVisible(false);
          Adicionar.setVisible(false);
          Mostrar.setVisible(false);
          texto.setText("TiaLucinda/Turmas");
          
          //Apagando dados dos objectos
          nome.setText(" ");
          
          Turmas();
         
         
    }//GEN-LAST:event_turmActionPerformed

    private void PautasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PautasActionPerformed
          Pautas.setBorderPainted(true);
          Estudant.setBorderPainted(false);
          Prof.setBorderPainted(false);
          turm.setBorderPainted(false);
          cursos.setBorderPainted(false);
          PainelPauta.setVisible(true);
          PainelProf.setVisible(false);
          PainelTurma.setVisible(false);
          PainelCurso.setVisible(false);
          PainelCurso.setVisible(false);
          PainelAluno.setVisible(false);
          
           //Animação nos Botões
          Pautas.setBackground(new Color(80, 54, 125));
          Pautas.setContentAreaFilled(true);
          Prof.setBackground(new Color(71, 43, 119));
          Prof.setContentAreaFilled(false);
          turm.setBackground(new Color(71, 43, 119));
          turm.setContentAreaFilled(false);
          Estudant.setBackground(new Color(71, 43, 119));
          Estudant.setContentAreaFilled(false);
          cursos.setBackground(new Color(80, 54, 125));
          cursos.setContentAreaFilled(false);
         
          
          //Operações de visibilidade dos objectos
          Turnos.setVisible(true);
          Turno.setVisible(true);
          Classes.setVisible(true);
          Classe.setVisible(true);
          Classe.setEnabled(true);
          Cursos.setVisible(true);
          Curso.setVisible(true);
          Curso.setEnabled(true);
          Trimestre.setVisible(true);
          Trimestres1.setVisible(true); 
          Trimestre.setEnabled(true);
          Turmas.setVisible(true);
          Turm.setVisible(true);
          Turm.setEnabled(true);
          Mostrar.setVisible(true);
          Nomes.setVisible(true);
          nome.setVisible(true);
          nome.setEnabled(false);
          P1.setVisible(false);
          P2.setVisible(false);
          P3.setVisible(false);
          jSpinner1.setVisible(false);
          jSpinner2.setVisible(false);
          jSpinner3.setVisible(false);
          Adicionar.setVisible(false);
          texto.setText("TiaLucinda/Pauta");
          
          
          //Apagando dados dos objectos
          nome.setText(" ");
             buscando.Curso();
         CUR = (DefaultComboBoxModel)Curso.getModel();
         CUR.removeAllElements();
         
          for (int i = 0; i < buscando.getDados().size(); i++) {
            CUR.addElement(buscando.getDados().get(i).split("_")[0]);
          }
          
          buscando.Turmas();
          Turmaz = (DefaultComboBoxModel) Turm.getModel();
          Turmaz.removeAllElements();
         
          for (int i = 0; i < buscando.getDados().size(); i++) {
            Turmaz.addElement(buscando.getDados().get(i).split("_")[0]);
        }
          Pauta();
         
    }//GEN-LAST:event_PautasActionPerformed

    private void EstudantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstudantActionPerformed
          Estudant.setBorderPainted(true);
          Prof.setBorderPainted(false);
          turm.setBorderPainted(false);
          cursos.setBorderPainted(false);
          Pautas.setBorderPainted(false);
          Adicionar.setBorderPainted(false);
          PainelAluno.setVisible(true);
          PainelProf.setVisible(false);
          PainelTurma.setVisible(false);
          PainelCurso.setVisible(false);
          PainelCurso.setVisible(false);
          
          
          //Animação nos Botões
          Estudant.setBackground(new Color(80, 54, 125));
          Estudant.setContentAreaFilled(true);
          Prof.setBackground(new Color(71, 43, 119));
          Prof.setContentAreaFilled(false);
          turm.setBackground(new Color(71, 43, 119));
          turm.setContentAreaFilled(false);
          Pautas.setBackground(new Color(71, 43, 119));
          Pautas.setContentAreaFilled(false);
          cursos.setBackground(new Color(80, 54, 125));
          cursos.setContentAreaFilled(false);

          //Operações de visibilidade dos objectos
          Nomes.setVisible(true);
          nome.setVisible(true);
          nome.setEnabled(true);
          Turnos.setVisible(true);
          Turno.setVisible(true);
          Classes.setVisible(true);
          Classe.setVisible(true);
          Classe.setEnabled(true);
          Cursos.setVisible(true);
          Curso.setVisible(true);
          Curso.setEnabled(true);
          Trimestre.setVisible(true);
          Trimestres1.setVisible(true); 
          Trimestre.setEnabled(true);
          Turmas.setVisible(true);
          Turm.setVisible(true);
          Turm.setEnabled(true);
          Adicionar.setVisible(true);
          jSpinner1.setVisible(true);
          jSpinner2.setVisible(true);
          jSpinner3.setVisible(true);
          P1.setVisible(true);
          P2.setVisible(true);
          P3.setVisible(true);
          Mostrar.setVisible(false);
          texto.setText("TiaLucinda/Estudantes");
          
          //Apagando dados dos objectos
          nome.setText(" ");
          jSpinner1.setValue(0);
          jSpinner2.setValue(0);
          jSpinner3.setValue(0);
    
          
          Trimestre();
          
    }//GEN-LAST:event_EstudantActionPerformed

    private void EstudantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstudantMouseClicked
          
    }//GEN-LAST:event_EstudantMouseClicked

    private void cursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursosActionPerformed
          cursos.setBorderPainted(true);
          Estudant.setBorderPainted(false);
          Prof.setBorderPainted(false);
          turm.setBorderPainted(false);
          Pautas.setBorderPainted(false);
          PainelCurso.setVisible(true);
          PainelAluno.setVisible(false);
          PainelProf.setVisible(false);
          PainelTurma.setVisible(false);
          PainelPauta.setVisible(false);
          
          
          //Animação nos Botões
          cursos.setBackground(new Color(80, 54, 125));
          cursos.setContentAreaFilled(true);
          Estudant.setBackground(new Color(80, 54, 125));
          Estudant.setContentAreaFilled(false);
          Prof.setBackground(new Color(71, 43, 119));
          Prof.setContentAreaFilled(false);
          turm.setBackground(new Color(71, 43, 119));
          turm.setContentAreaFilled(false);
          Pautas.setBackground(new Color(71, 43, 119));
          Pautas.setContentAreaFilled(false);
          
          
       //Operações de visibilidade dos objectos
          Nomes.setVisible(true);
          nome.setVisible(true);
          nome.setEnabled(true);
          Turnos.setVisible(true);
          Turno.setVisible(true);
          Classes.setVisible(true);
          Classe.setVisible(true);
          Classe.setEnabled(false);
          Cursos.setVisible(true);
          Curso.setVisible(true);
          Curso.setEnabled(false);
          Trimestre.setVisible(true);
          Trimestres1.setVisible(true); 
          Trimestre.setEnabled(false);
          Turmas.setVisible(true);
          Turm.setVisible(true);
          Turm.setEnabled(false);
          Adicionar.setVisible(true);
          P1.setVisible(false);
          P2.setVisible(false);
          P3.setVisible(false);
          jSpinner3.setVisible(false);
          jSpinner2.setVisible(false);
          jSpinner1.setVisible(false);
          Mostrar.setVisible(false);
          texto.setText("TiaLucinda/Cursos");
          
          //Apagando dados dos objectos
          nome.setText(" ");
          
          Curso();
         
    }//GEN-LAST:event_cursosActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        
        Pauta();
        
    }//GEN-LAST:event_MostrarActionPerformed

    private void TurmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurmActionPerformed

    }//GEN-LAST:event_TurmActionPerformed

    private void AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarActionPerformed
          
        try{
        if (Estudant.isContentAreaFilled() == true  ) {
          //Verificando Os requisitos preenchidos
         
          try{
          if (!nome.getText().equalsIgnoreCase("") & !nome.getText().equalsIgnoreCase(" ") & !Turm.getSelectedItem().toString().equalsIgnoreCase("") &  Classe.getSelectedIndex() < 9 & !Turno.getSelectedItem().toString().equalsIgnoreCase(" ")) {
            //inserindo na tabela
            int nota = ((int) jSpinner1.getValue() + (int) jSpinner2.getValue() + (int) jSpinner3.getValue());
            double classif =  nota / 3 ; 
            String classificacao = " " ;
            
              if (classif < 5 ) {
                  classificacao = "Reprovado" ;
              }else{
                  classificacao = "Aprovado" ;
              }
              
              if (!nome.getText().equalsIgnoreCase(buscando.getNome()) & Trimestre.getSelectedItem().toString().equalsIgnoreCase(buscando.getTrimestre()) || nome.getText().equalsIgnoreCase(buscando.getNome()) & !Trimestre.getSelectedItem().toString().equalsIgnoreCase(buscando.getTrimestre())) {
             
                        inseri.AdAlunos(nome.getText(), Classe.getSelectedItem().toString() , Turno.getSelectedItem().toString()," " , Turm.getSelectedItem().toString(), (int) jSpinner1.getValue(), (int) jSpinner2.getValue(), (int) jSpinner3.getValue(), Trimestre.getSelectedItem().toString(), classificacao);
                    //Mostrando na tabela
                    Trimestre();
                    //Apagando dados dos objectos
              }else {
                  JOptionPane.showMessageDialog(null, "Já foi cadastrado neste trimesntre!");
              }
               
                    nome.setText("");
                    jSpinner1.setValue(0);
                    jSpinner2.setValue(0);
                    jSpinner3.setValue(0);
              
              
          }else if(!nome.getText().equalsIgnoreCase("") & !nome.getText().equalsIgnoreCase(" ") & Classe.getSelectedIndex() > 8 & !Turm.getSelectedItem().toString().equalsIgnoreCase("") &  !Turno.getSelectedItem().toString().equalsIgnoreCase("") ){
             //Criando a tabela Alunos
             
            //inserindo na tabela
            int nota = ((int) jSpinner1.getValue() + (int) jSpinner2.getValue() + (int) jSpinner3.getValue());
            double classif =  nota / 3 ; 
            String classificacao = " " ;
            
              if (classif < 5 ) {
                  classificacao = "Reprovado" ;
              }else{
                  classificacao = "Aprovado" ;
              }
            
            if (!nome.getText().equalsIgnoreCase(buscando.getNome()) & Trimestre.getSelectedItem().toString().equalsIgnoreCase(buscando.getTrimestre()) || nome.getText().equalsIgnoreCase(buscando.getNome()) & !Trimestre.getSelectedItem().toString().equalsIgnoreCase(buscando.getTrimestre())) {
                    inseri.AdAlunos(nome.getText(), Classe.getSelectedItem().toString() , Turno.getSelectedItem().toString(),Curso.getSelectedItem().toString() , Turm.getSelectedItem().toString() ,(int) jSpinner1.getValue(), (int) jSpinner2.getValue(), (int) jSpinner3.getValue(), Trimestre.getSelectedItem().toString(), classificacao);
                    //Mostrando na tabela
                    Trimestre();
              }else {
                  JOptionPane.showMessageDialog(null, "Já foi cadastrado neste trimesntre!");
              }
              
              //Apagando dados dos objectos
              nome.setText("");
                    jSpinner1.setValue(0);
                    jSpinner2.setValue(0);
                    jSpinner3.setValue(0);
          }else{
                 JOptionPane.showMessageDialog(null, "Preencha correctamente os campos!");
           }
          
        }catch(Exception ex){
              JOptionPane.showMessageDialog(null, " Verifique os campos  selecionados " );
        } 
          ////Prof 
          }else if (Prof.isContentAreaFilled() == true) {
              
             if (!nome.getText().equalsIgnoreCase("") & !nome.getText().equalsIgnoreCase(" ") ) {
                 
                 if (!Turno.getSelectedItem().toString().equalsIgnoreCase(buscando.getTurno())) {
                     //Criando a tabela Professor
                    inseri.Prof(nome.getText(),  Classe.getSelectedItem().toString(), Turno.getSelectedItem().toString());
                    Prof();
                    nome.setText("");
                 }else {
                  JOptionPane.showMessageDialog(null, "Já foi cadastrado neste Turno!");
                }
             }else{
                 JOptionPane.showMessageDialog(null, "Preencha correctamente os campos!");
             }
           
              ////Turma
         }else if(turm.isContentAreaFilled() == true){
            if (!nome.getText().equalsIgnoreCase("") & !nome.getText().equalsIgnoreCase(" ") ) { 
             
                if (!nome.getText().equalsIgnoreCase(buscando.getNome())) {
                     inseri.AdTurmas(nome.getText(), Classe.getSelectedItem().toString(), Turno.getSelectedItem().toString());
                     nome.setText("");
                     Turmas();
                }else {
                  JOptionPane.showMessageDialog(null, "Já existe cadastro com esse nome");
              }
             }else{
                 JOptionPane.showMessageDialog(null, "Preencha correctamente os campos!");
             }
         }else if(cursos.isContentAreaFilled() == true){
             if (!nome.getText().equalsIgnoreCase("") & !nome.getText().equalsIgnoreCase(" ") ) { 
             
                 if (!nome.getText().equalsIgnoreCase(buscando.getNome())) {
                     inseri.Curso(nome.getText(), Turno.getSelectedItem().toString());
                    Curso();
                    nome.setText("");
                 }else {
                  JOptionPane.showMessageDialog(null, "Já existe cadastro com esse nome");
                }
            }else{
                 JOptionPane.showMessageDialog(null, "Preencha correctamente os campos!");
             }
         }
        }catch (HeadlessException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_AdicionarActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
          x1 = evt.getX();
          y1 = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
         setLocation(evt.getXOnScreen()-x1,evt.getYOnScreen()-y1);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
          x1 = evt.getX();
          y1 = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
         setLocation(evt.getXOnScreen()-x1,evt.getYOnScreen()-y1);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(252, 19, 19));
        jButton1.setOpaque(true);
        jButton1.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(255, 255, 255));
        jButton1.setOpaque(false);
        jButton1.setForeground(new Color(252, 19, 19));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciar().setVisible(true);
            }
        });
    } 
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicionar;
    private javax.swing.JComboBox<String> Classe;
    private javax.swing.JLabel Classes;
    private javax.swing.JComboBox<String> Curso;
    private javax.swing.JLabel Cursos;
    private javax.swing.JButton Estudant;
    private javax.swing.JButton Mostrar;
    private javax.swing.JLabel Nomes;
    private javax.swing.JLabel P1;
    private javax.swing.JLabel P2;
    private javax.swing.JLabel P3;
    private javax.swing.JPanel PainelAluno;
    private javax.swing.JPanel PainelCurso;
    private javax.swing.JPanel PainelPauta;
    private javax.swing.JPanel PainelProf;
    private javax.swing.JPanel PainelTurma;
    private javax.swing.JButton Pautas;
    private javax.swing.JButton Prof;
    private javax.swing.JTable TabelaAluno;
    private javax.swing.JTable TabelaCurso;
    private javax.swing.JTable TabelaPauta;
    private javax.swing.JTable TabelaTurma;
    private javax.swing.JTable Tabelaprof;
    private javax.swing.JComboBox<String> Trimestre;
    private javax.swing.JLabel Trimestres1;
    private javax.swing.JComboBox<String> Turm;
    private javax.swing.JLabel Turmas;
    private javax.swing.JComboBox<String> Turno;
    private javax.swing.JLabel Turnos;
    private javax.swing.JButton cursos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTextField nome;
    private javax.swing.JLabel texto;
    private javax.swing.JButton turm;
    // End of variables declaration//GEN-END:variables
}
