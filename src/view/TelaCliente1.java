/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ClienteDAO;
import controller.UsuarioDAO;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Usuario;

/**
 *
 * @author clebe
 */
public class TelaCliente1 extends javax.swing.JFrame {

    /**
     * Creates new form TelaCliente
     */
    public TelaCliente1() {
        initComponents();
    }
    
    //Metodo Listar na tabela
    public void listar() {

        ClienteDAO dao = new ClienteDAO();

        List<Cliente> lista = dao.listarClientes();
        DefaultTableModel dados = (DefaultTableModel) jTblClientes.getModel();
        dados.setNumRows(0);

        for (Cliente c : lista) {
            dados.addRow(new Object[]
            {
                c.getNome(),
                c.getDocumento(),
                c.getTipoCliente(),
                c.getTelefone(),
                c.getEmail(),
                c.getLogradouro(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getEstado(),
                c.getCep(),
                c.getObservacoes()
            });

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel14 = new javax.swing.JLabel();
        jTxtNome1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTxtDocumento1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTxtTelefone1 = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jTxtEmail1 = new javax.swing.JTextField();
        tableNameClientes = new javax.swing.JTabbedPane();
        Cadastro = new javax.swing.JPanel();
        jTxtNumero = new javax.swing.JTextField();
        jTxtComplemento = new javax.swing.JTextField();
        jTxtBairro = new javax.swing.JTextField();
        jTxtCidade = new javax.swing.JTextField();
        jTxtTelefone = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTxtCep = new javax.swing.JFormattedTextField();
        jRdBtnJuridica = new javax.swing.JRadioButton();
        jRdBtnFisica = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jCbxUF = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtObs = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jTxtDocumento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jTxtEndereco = new javax.swing.JTextField();
        jBtnExcluir = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jBtnAdicionar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        consulta = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTxtConsultaNome = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTxtConsultaDocumento = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTxtConsultaTelefone = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        jTxtConsultaEmail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblClientes = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jLabel14.setText("Nome");

        jTxtNome1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtNome1MouseClicked(evt);
            }
        });

        jLabel15.setText("Documento");

        jLabel16.setText("Telefone");

        try {
            jTxtTelefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9 ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel17.setText("e-mail");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTxtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNumeroActionPerformed(evt);
            }
        });

        try {
            jTxtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9 ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel11.setText("Cep");

        jLabel13.setText("UF");

        try {
            jTxtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtCepKeyPressed(evt);
            }
        });

        jRdBtnJuridica.setText("Pessoa Jurídica");
        jRdBtnJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdBtnJuridicaActionPerformed(evt);
            }
        });

        jRdBtnFisica.setText("Pessoa Física");
        jRdBtnFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdBtnFisicaActionPerformed(evt);
            }
        });

        jLabel2.setText("Documento");

        jCbxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RR", "SC", "SE", "SP", "TO" }));

        jLabel4.setText("Telefone");

        jTxtObs.setColumns(20);
        jTxtObs.setRows(5);
        jScrollPane1.setViewportView(jTxtObs);

        jLabel5.setText("e-mail");

        jLabel6.setText("Endereço");

        jLabel3.setText("Observações");

        jLabel7.setText("Nº");

        jLabel8.setText("Complemento");

        jLabel9.setText("Bairro");

        jLabel10.setText("Cidade");

        jTxtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtNomeMouseClicked(evt);
            }
        });

        jLabel1.setText("Nome");

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jBtnExcluir.setToolTipText("Excluir Usuário");
        jBtnExcluir.setEnabled(false);
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jBtnEditar.setToolTipText("Editar Usuário");
        jBtnEditar.setEnabled(false);
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jBtnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/create.png"))); // NOI18N
        jBtnAdicionar.setToolTipText("Adiconar Usuário");
        jBtnAdicionar.setMaximumSize(new java.awt.Dimension(80, 80));
        jBtnAdicionar.setMinimumSize(new java.awt.Dimension(80, 80));
        jBtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel12.setText("CADASTRO DE USUARIOS");

        javax.swing.GroupLayout CadastroLayout = new javax.swing.GroupLayout(Cadastro);
        Cadastro.setLayout(CadastroLayout);
        CadastroLayout.setHorizontalGroup(
            CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CadastroLayout.createSequentialGroup()
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(25, 25, 25)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(CadastroLayout.createSequentialGroup()
                                                .addComponent(jTxtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRdBtnJuridica)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRdBtnFisica))
                                            .addGroup(CadastroLayout.createSequentialGroup()
                                                .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLayout.createSequentialGroup()
                                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(CadastroLayout.createSequentialGroup()
                                                .addComponent(jTxtCep)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTxtCidade))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTxtNumero)
                                            .addComponent(jCbxUF, 0, 111, Short.MAX_VALUE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CadastroLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(57, 57, 57)
                                .addComponent(jTxtBairro))
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtComplemento))
                            .addComponent(jScrollPane1))
                        .addGap(14, 14, 14))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLayout.createSequentialGroup()
                        .addComponent(jBtnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jBtnEditar)
                        .addGap(130, 130, 130)
                        .addComponent(jBtnExcluir)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        CadastroLayout.setVerticalGroup(
            CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addGap(26, 26, 26)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CadastroLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTxtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRdBtnJuridica)
                                .addComponent(jRdBtnFisica))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(jTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))
                        .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jCbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableNameClientes.addTab("Cadastro", Cadastro);

        jLabel18.setText("Nome");

        jTxtConsultaNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtConsultaNomeMouseClicked(evt);
            }
        });
        jTxtConsultaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtConsultaNomeActionPerformed(evt);
            }
        });
        jTxtConsultaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtConsultaNomeKeyPressed(evt);
            }
        });

        jLabel19.setText("Documento");

        jLabel20.setText("Telefone");

        try {
            jTxtConsultaTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9 ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel21.setText("e-mail");

        jTblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "nome", "documento", "tipo_cliente", "telefone", "email", "logradouro", "numero", "complemento", "bairro", "cidade", "estado", "cep", "observacoes"
            }
        ));
        jTblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTblClientes);

        javax.swing.GroupLayout consultaLayout = new javax.swing.GroupLayout(consulta);
        consulta.setLayout(consultaLayout);
        consultaLayout.setHorizontalGroup(
            consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addGap(25, 25, 25)
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTxtConsultaEmail)
                    .addComponent(jTxtConsultaNome, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addComponent(jTxtConsultaDocumento)
                    .addComponent(jTxtConsultaTelefone))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(consultaLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jScrollPane2)
                    .addGap(16, 16, 16)))
        );
        consultaLayout.setVerticalGroup(
            consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jTxtConsultaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtConsultaDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtConsultaTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTxtConsultaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(358, Short.MAX_VALUE))
            .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(consultaLayout.createSequentialGroup()
                    .addGap(208, 208, 208)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        tableNameClientes.addTab("Visualizar", consulta);

        jMenu1.setText("Arquivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableNameClientes)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableNameClientes, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        listar();
    }//GEN-LAST:event_formWindowOpened

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jTxtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNumeroActionPerformed

    private void jTxtCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCepKeyPressed
        //Programacao do keypress
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Cliente obj = new Cliente();
            ClienteDAO dao = new ClienteDAO();
            obj = dao.buscaCep(jTxtCep.getText());

            jTxtEndereco.setText(obj.getLogradouro());
            jTxtBairro.setText(obj.getBairro());
            jTxtCidade.setText(obj.getCidade());
            jCbxUF.setSelectedItem(obj.getEstado());
            // System.out.println(obj.getEstado());
            jTxtNumero.requestFocus();
        }
    }//GEN-LAST:event_jTxtCepKeyPressed

    private void jRdBtnJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdBtnJuridicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRdBtnJuridicaActionPerformed

    private void jRdBtnFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdBtnFisicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRdBtnFisicaActionPerformed

    private void jTxtNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtNomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeMouseClicked

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        //        if ((jTxtNomeCliente.getText().isEmpty()) || (jTxtSenha.getText().isEmpty())
            //            || (jTxtNomeCompleto.getText().isBlank()) || (jCbxPerfil.getSelectedItem().equals(" ")) || (jTxtEmail.getText().isEmpty())) {
            //            JOptionPane.showMessageDialog(null, "Preencha todos os campos!!!");
            //        } else {
            //
            //            ClienteDAO dao = new ClienteDAO();
            //            int resp = JOptionPane.showConfirmDialog(null, "Confirma exclusão do Usuário\n" + jTblCliente.getValueAt(jTblCliente.getSelectedRow(), 1));
            //
            //            if (resp == 0) {
                //                dao.excluirCliente((int) jTblCliente.getValueAt(jTblCliente.getSelectedRow(), 0));
                //            }
            //            jTxtNomeCliente.setText("");
            //            jTxtEmail.setText(null);
            //            jTxtNomeCompleto.setText(null);
            //            jTxtSenha.setText(null);
            //            jCbxPerfil.setSelectedItem("Usuário");
            //            jBtnAdicionar.setEnabled(true);
            //            jBtnEditar.setEnabled(false);
            //            jBtnExcluir.setEnabled(false);
            //        }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        //        if ((jTxtNomeCliente.getText().isEmpty()) || (jTxtSenha.getText().isEmpty())
            //            || (jTxtNomeCompleto.getText().isBlank()) || (jCbxPerfil.getSelectedItem().equals(" ")) || (jTxtEmail.getText().isEmpty())) {
            //            JOptionPane.showMessageDialog(null, "Preencha todos os campos!!!");
            //        } else {
            //
            //            String nome = jTxtNomeCliente.getText();
            //            String senha = jTxtSenha.getText();
            //            String perfil = jCbxPerfil.getSelectedItem().toString();
            //            String nomeCompleto = jTxtNomeCompleto.getText();
            //            String email = jTxtEmail.getText();
            //            int id = (int) jTblCliente.getValueAt(jTblCliente.getSelectedRow(), 0);
            //            Cliente usuario = new Cliente(id, nome, senha, perfil, nomeCompleto, email);
            //
            //            ClienteDAO dao = new ClienteDAO();
            //            dao.alterarCliente(usuario);
            //            jTxtNomeCliente.setText("");
            //            jTxtEmail.setText(null);
            //            jTxtNomeCompleto.setText(null);
            //            jTxtSenha.setText(null);
            //            jCbxPerfil.setSelectedItem("Usuário");
            //            jBtnAdicionar.setEnabled(true);
            //            jBtnEditar.setEnabled(false);
            //            jBtnExcluir.setEnabled(false);
            //        }
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionarActionPerformed
        if ((jTxtNome.getText().isEmpty()) || (jTxtDocumento.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Nome ou documento vazio!!!\nPreencha os campos");
        } else {

            String nome = jTxtNome.getText();
            String documento = jTxtDocumento.getText();
            String tipo;
            if (jRdBtnFisica.isSelected()) {
                tipo = jRdBtnFisica.getText();
            } else {
                tipo = jRdBtnJuridica.getText();
            }
            String telefone = jTxtTelefone.getText().replaceAll("[^0-9]", "");
            String email = jTxtEmail.getText();
            String endereco = jTxtEndereco.getText();
            String numero = jTxtNumero.getText();
            String complemento = jTxtComplemento.getText();
            String bairro = jTxtBairro.getText();
            String cidade = jTxtCidade.getText();
            String uf = jCbxUF.getSelectedItem().toString();
            String cep = jTxtCep.getText().replaceAll("[^0-9]", "");
            String obs = jTxtObs.getText();

            Cliente usuario = new Cliente(nome, documento, tipo, telefone, email, endereco, numero, complemento, bairro, cidade, uf, cep, obs);
            System.out.println(usuario.getEstado());
            System.out.println(usuario.getCep());
            ClienteDAO dao = new ClienteDAO();
            dao.adicionarUsuario(usuario);
            jTxtNome.setText("");
            jTxtEmail.setText(null);
            jTxtDocumento.setText(null);
            jTxtTelefone.setText(null);
            buttonGroup1.isSelected(null);
            jTxtCep.setText(null);
            jTxtEndereco.setText(null);
            jTxtNumero.setText(null);
            jTxtCidade.setText(null);
            jCbxUF.setSelectedItem(null);
            jTxtBairro.setText(null);
            jTxtComplemento.setText(null);
            jTxtObs.setText(null);
            jBtnAdicionar.setEnabled(true);
            jBtnEditar.setEnabled(false);
            jBtnExcluir.setEnabled(false);
        }
        listar();
    }//GEN-LAST:event_jBtnAdicionarActionPerformed

    private void jTxtNome1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtNome1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNome1MouseClicked

    private void jTxtConsultaNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtConsultaNomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtConsultaNomeMouseClicked

    private void jTblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblClientesMouseClicked
        
        
        
        jTxtNome.setText(jTblClientes.getValueAt(jTblClientes.getSelectedRow(),0).toString());
        jTxtDocumento.setText(jTblClientes.getValueAt(jTblClientes.getSelectedRow(),1).toString());
        
        String tipo = jTblClientes.getValueAt(jTblClientes.getSelectedRow(),2).toString();
        switch (tipo)
        {
            case "Pessoa Física":
            jRdBtnFisica.setSelected(true);
            jRdBtnJuridica.setSelected(false);
            break;
            case "Pessoa Jurídica":
            jRdBtnFisica.setSelected(false);
            jRdBtnJuridica.setSelected(true);
            break;
            default:
            break;
        }
        
        jTxtTelefone.setText(jTblClientes.getValueAt(jTblClientes.getSelectedRow(),3).toString());
        jTxtEmail.setText(jTblClientes.getValueAt(jTblClientes.getSelectedRow(),4).toString());
        jTxtNumero.setText(jTblClientes.getValueAt(jTblClientes.getSelectedRow(),5).toString());
        jTxtComplemento.setText(jTblClientes.getValueAt(jTblClientes.getSelectedRow(),6).toString());
        jTxtBairro.setText(jTblClientes.getValueAt(jTblClientes.getSelectedRow(),7).toString());
        jTxtCidade.setText(jTblClientes.getValueAt(jTblClientes.getSelectedRow(),8).toString());
        // Verificar estado
        jTxtCep.setText(jTblClientes.getValueAt(jTblClientes.getSelectedRow(),10).toString());
        jTxtObs.setText(jTblClientes.getValueAt(jTblClientes.getSelectedRow(),11).toString());
       
    }//GEN-LAST:event_jTblClientesMouseClicked

    private void jTxtConsultaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtConsultaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtConsultaNomeActionPerformed

    private void jTxtConsultaNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtConsultaNomeKeyPressed
        
        String nome = "%"+jTxtConsultaNome.getText()+"%";
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> lista = dao.listarClienteNome(nome);
        
        DefaultTableModel dados = (DefaultTableModel) jTblClientes.getModel();
        
        dados.setNumRows(0);
        
        for (Cliente c : lista) 
        {
            dados.addRow(new Object[]
            {
                c.getNome(),
                c.getDocumento(),
                c.getTipoCliente(),
                c.getTelefone(),
                c.getEmail(),
                c.getLogradouro(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getEstado(),
                c.getCep(),
                c.getObservacoes()
            });
        }    
    }//GEN-LAST:event_jTxtConsultaNomeKeyPressed
        
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
            java.util.logging.Logger.getLogger(TelaCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cadastro;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel consulta;
    private javax.swing.JButton jBtnAdicionar;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JComboBox<String> jCbxUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton jRdBtnFisica;
    private javax.swing.JRadioButton jRdBtnJuridica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTblClientes;
    private javax.swing.JTextField jTxtBairro;
    private javax.swing.JFormattedTextField jTxtCep;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtComplemento;
    private javax.swing.JTextField jTxtConsultaDocumento;
    private javax.swing.JTextField jTxtConsultaEmail;
    private javax.swing.JTextField jTxtConsultaNome;
    private javax.swing.JFormattedTextField jTxtConsultaTelefone;
    private javax.swing.JTextField jTxtDocumento;
    private javax.swing.JTextField jTxtDocumento1;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEmail1;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtNome1;
    private javax.swing.JTextField jTxtNumero;
    private javax.swing.JTextArea jTxtObs;
    private javax.swing.JFormattedTextField jTxtTelefone;
    private javax.swing.JFormattedTextField jTxtTelefone1;
    private javax.swing.JTabbedPane tableNameClientes;
    // End of variables declaration//GEN-END:variables
}
