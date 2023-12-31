/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

/**
 *
 * @author YANUAREKA
 */
import Config.Koneksi;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import table.TableCustom;

public class Anggota extends javax.swing.JPanel {

    /**
     * Creates new form Dashboard
     */
    private Connection conn;
    private Statement stm;
    private PreparedStatement pStm;
    private ResultSet rs;
    
    public Anggota() {
        initComponents();
        
        //Set table custom
        tableCustom1.apply(jScrollPane1, TableCustom.TableType.DEFAULT);
        
        conn = Koneksi.getConnection();
        setTabelModel();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form. 
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        tableCustom1 = new table.TableCustom();
        rbBtnGroupJk = new javax.swing.ButtonGroup();
        pn_main = new javax.swing.JPanel();
        pn_view = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnTambah = new rojerusan.RSMaterialButtonRectangle();
        btnDelete = new rojerusan.RSMaterialButtonRectangle();
        btnCancel = new rojerusan.RSMaterialButtonRectangle();
        searchTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pn_add = new javax.swing.JPanel();
        labelHeader = new javax.swing.JLabel();
        btnSave = new rojerusan.RSMaterialButtonRectangle();
        btnCancelData = new rojerusan.RSMaterialButtonRectangle();
        jLabel7 = new javax.swing.JLabel();
        idTf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        namaTf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        emailTf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        teleponTf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tanggalTf = new javax.swing.JTextField();
        rbLaki = new javax.swing.JRadioButton();
        rbPrempuan = new javax.swing.JRadioButton();

        dateChooser1.setForeground(new java.awt.Color(55, 71, 79));
        dateChooser1.setDateFormat("yyyy-MM-dd");
        dateChooser1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        dateChooser1.setTextRefernce(tanggalTf);

        setLayout(new java.awt.CardLayout());

        pn_main.setBackground(new java.awt.Color(255, 255, 255));
        pn_main.setLayout(new java.awt.CardLayout());

        pn_view.setBackground(new java.awt.Color(255, 255, 255));

        tblData.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nama", "Email", "Telepon", "Jenis Kelamin", "Tanggal Bergabung"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel1.setText("Data Anggota Perpustakaan");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/People_2.png"))); // NOI18N
        jLabel2.setText("Master Data > Anggota");

        btnTambah.setBackground(new java.awt.Color(55, 71, 79));
        btnTambah.setText("tambah");
        btnTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambah.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setText("hapus");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(204, 204, 204));
        btnCancel.setText("batal");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        searchTf.setFont(new java.awt.Font("Poppins", 2, 14)); // NOI18N
        searchTf.setForeground(new java.awt.Color(153, 153, 153));
        searchTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchTfKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Cari");

        javax.swing.GroupLayout pn_viewLayout = new javax.swing.GroupLayout(pn_view);
        pn_view.setLayout(pn_viewLayout);
        pn_viewLayout.setHorizontalGroup(
            pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewLayout.createSequentialGroup()
                .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_viewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(pn_viewLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_viewLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2))))
                    .addGroup(pn_viewLayout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 366, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pn_viewLayout.setVerticalGroup(
            pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_viewLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        pn_main.add(pn_view, "card2");

        pn_add.setBackground(new java.awt.Color(255, 255, 255));

        labelHeader.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        labelHeader.setText("Tambah Data Anggota Perpustakaan");

        btnSave.setBackground(new java.awt.Color(55, 71, 79));
        btnSave.setText("simpan");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancelData.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelData.setText("batal");
        btnCancelData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelData.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnCancelData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelDataActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setText("ID");

        idTf.setFont(new java.awt.Font("Poppins", 2, 14)); // NOI18N
        idTf.setForeground(new java.awt.Color(153, 153, 153));

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setText("Nama");

        namaTf.setFont(new java.awt.Font("Poppins", 2, 14)); // NOI18N
        namaTf.setForeground(new java.awt.Color(153, 153, 153));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel9.setText("Email");

        emailTf.setFont(new java.awt.Font("Poppins", 2, 14)); // NOI18N
        emailTf.setForeground(new java.awt.Color(153, 153, 153));

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel10.setText("Telepon");

        teleponTf.setFont(new java.awt.Font("Poppins", 2, 14)); // NOI18N
        teleponTf.setForeground(new java.awt.Color(153, 153, 153));

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel11.setText("Jenis Kelamin");

        jLabel12.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel12.setText("Tanggal Bergabung");

        tanggalTf.setBackground(new java.awt.Color(255, 255, 255));
        tanggalTf.setFont(new java.awt.Font("Poppins", 2, 14)); // NOI18N
        tanggalTf.setForeground(new java.awt.Color(153, 153, 153));

        rbBtnGroupJk.add(rbLaki);
        rbLaki.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rbLaki.setText("Laki-laki");

        rbBtnGroupJk.add(rbPrempuan);
        rbPrempuan.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rbPrempuan.setText("Perempuan");

        javax.swing.GroupLayout pn_addLayout = new javax.swing.GroupLayout(pn_add);
        pn_add.setLayout(pn_addLayout);
        pn_addLayout.setHorizontalGroup(
            pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addLayout.createSequentialGroup()
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelData, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_addLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_addLayout.createSequentialGroup()
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(tanggalTf, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(179, 179, 179))
                    .addGroup(pn_addLayout.createSequentialGroup()
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_addLayout.createSequentialGroup()
                                .addComponent(rbLaki)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbPrempuan))
                            .addComponent(labelHeader)
                            .addComponent(jLabel8)
                            .addComponent(namaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(emailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(teleponTf, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pn_addLayout.setVerticalGroup(
            pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(labelHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelData, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_addLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_addLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanggalTf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teleponTf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLaki)
                    .addComponent(rbPrempuan))
                .addContainerGap(214, Short.MAX_VALUE))
        );

        pn_main.add(pn_add, "card2");

        add(pn_main, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        pn_main.removeAll();
        pn_main.add(pn_add);
        pn_main.repaint();
        pn_main.revalidate();
        
        idTf.setText(setIdAnggota());
        if(btnTambah.getText().equals("ubah")) {
            dataTabel();
            btnSave.setText("perbarui");
        }
    }//GEN-LAST:event_btnTambahActionPerformed
    
    private void btnCancelDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelDataActionPerformed
        // TODO add your handling code here:
        pn_main.removeAll();
        pn_main.add(pn_view);
        pn_main.repaint();
        pn_main.revalidate();
        
        showPanelView();
    }//GEN-LAST:event_btnCancelDataActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (btnSave.getText().equals("simpan")) {
            insertData();
        } else if(btnSave.getText().equals("perbarui")) {
            updateData();
            showPanelView();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        if(btnTambah.getText().equals("tambah")) {
            btnTambah.setText("ubah");
            btnDelete.setVisible(true);
            btnCancel.setVisible(true);
        }
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        showPanelView();
        loadData();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        deleteData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void searchTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTfKeyTyped
        // TODO add your handling code here:
        searchData();
    }//GEN-LAST:event_searchTfKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnCancel;
    private rojerusan.RSMaterialButtonRectangle btnCancelData;
    private rojerusan.RSMaterialButtonRectangle btnDelete;
    private rojerusan.RSMaterialButtonRectangle btnSave;
    private rojerusan.RSMaterialButtonRectangle btnTambah;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JTextField emailTf;
    private javax.swing.JTextField idTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JTextField namaTf;
    private javax.swing.JPanel pn_add;
    private javax.swing.JPanel pn_main;
    private javax.swing.JPanel pn_view;
    private javax.swing.ButtonGroup rbBtnGroupJk;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPrempuan;
    private javax.swing.JTextField searchTf;
    private table.TableCustom tableCustom1;
    private javax.swing.JTextField tanggalTf;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField teleponTf;
    // End of variables declaration//GEN-END:variables

    //Set model
    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
    }

    //Refresh tabel
    private void loadData() {
        getData((DefaultTableModel) tblData.getModel());
        btnDelete.setVisible(false);
        btnCancel.setVisible(false);
    }
    
    private void showPanelView(){
        pn_main.removeAll();
        pn_main.add(new Anggota());
        pn_main.repaint();
        pn_main.revalidate();
    }
    
    private void resetForm() {
        idTf.setText("");
        namaTf.setText("");
        emailTf.setText("");
        teleponTf.setText("");
        rbBtnGroupJk.clearSelection();
        tanggalTf.setText("");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM anggota";
            stm = conn.prepareStatement(sql);
            
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()) {
                String idAnggota = rs.getString("id_anggota");
                String namaAnggota = rs.getString("nama_anggota");
                String emailAnggota = rs.getString("email");
                String teleponAnggota = rs.getString("telepon");
                String jenisKelaminAnggota = rs.getString("jenis_kelamin");
                String tanggalBergabungAnggota = rs.getString("tanggal_bergabung");
                
                Object[] dataAnggota = {
                    idAnggota,
                    namaAnggota,
                    emailAnggota,
                    teleponAnggota,
                    jenisKelaminAnggota,
                    tanggalBergabungAnggota
                };
                model.addRow(dataAnggota);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Gagal" + e.getMessage());
        }
    }
    
    //Set id otomatis
    private String setIdAnggota() {
        String urut = null;
        Date now = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("yyMM");
        String no = noFormat.format(now);
        
        String sql = "SELECT RIGHT (id_anggota, 3) AS Nomor " +
                "FROM anggota " + 
                "WHERE id_anggota LIKE 'DES" + no + "%' " +
                "ORDER BY id_anggota DESC " +
                "LIMIT 1";
        
        try {
            stm = conn.prepareStatement(sql);
            rs = stm.executeQuery(sql);
            
            if(rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor")) + 1;
                urut = "DES" + no + String.format("%03d", nomor);
            } else {
                urut = "DES" + no + "001";
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Set Id GAGAL" + e.getMessage());
        }
        return urut;
    }

    private void insertData() {
        String idAnggota = idTf.getText();
        String namaAnggota = namaTf.getText();
        String emailAnggota = emailTf.getText();
        String teleponAnggota = teleponTf.getText();
        
        String jenisKelamin;
        if(rbLaki.isSelected()) {
            jenisKelamin = rbLaki.getText();
        } else if(rbPrempuan.isSelected()) {
            jenisKelamin = rbPrempuan.getText();
        } else {
            jenisKelamin = "";
        }
        
        String tglBergabung = tanggalTf.getText();
        
        //Validasi textfield
        if(idAnggota.isEmpty() || namaAnggota.isEmpty() || emailAnggota.isEmpty() || teleponAnggota.isEmpty() || jenisKelamin.isEmpty() || tglBergabung.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Field tidak boleh ada yang kosong", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        
        try {
            String sql = "INSERT INTO anggota (id_anggota, nama_anggota, email, telepon, jenis_kelamin, tanggal_bergabung) values (?,?,?,?,?,?)";
            pStm = conn.prepareStatement(sql);
            pStm.setString(1, idAnggota);
            pStm.setString(2, namaAnggota);
            pStm.setString(3, emailAnggota);
            pStm.setString(4, teleponAnggota);
            pStm.setString(5, jenisKelamin);
            pStm.setString(6, tglBergabung);
            
            int rowInsertData = pStm.executeUpdate();
            if(rowInsertData > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan");
                resetForm();
                loadData();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Data gagal ditambahkan" + e.getMessage());
        }
    }
    
    private void dataTabel() {
        pn_view.setVisible(false);
        pn_add.setVisible(true);
        
        int row = tblData.getSelectedRow();
        labelHeader.setText("Ubah Data Anggota Perpustakaan");
        
        idTf.setEnabled(false);
        tanggalTf.setEnabled(false);
        
        idTf.setText(tblData.getValueAt(row, 0).toString());
        namaTf.setText(tblData.getValueAt(row, 1).toString());
        emailTf.setText(tblData.getValueAt(row, 2).toString());
        teleponTf.setText(tblData.getValueAt(row, 3).toString());
        
        String jenisKelamin = tblData.getValueAt(row, 4).toString();
        if(jenisKelamin.equals("Laki-laki")) {
            rbLaki.setSelected(true);
        } else if (jenisKelamin.equals("Perempuan")) {
            rbPrempuan.setSelected(true);
        }
        
        tanggalTf.setText(tblData.getValueAt(row, 5).toString());
    }
    
    private void updateData() {
        String idAnggota = idTf.getText();
        String namaAnggota = namaTf.getText();
        String emailAnggota = emailTf.getText();
        String teleponAnggota = teleponTf.getText();
        
        String jenisKelamin;
        if(rbLaki.isSelected()) {
            jenisKelamin = rbLaki.getText();
        } else if(rbPrempuan.isSelected()) {
            jenisKelamin = rbPrempuan.getText();
        } else {
            jenisKelamin = "";
        }
        
        String tglBergabung = tanggalTf.getText();
        
        //Validasi textfield
        if(idAnggota.isEmpty() || namaAnggota.isEmpty() || emailAnggota.isEmpty() || teleponAnggota.isEmpty() || jenisKelamin.isEmpty() || tglBergabung.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Field tidak boleh ada yang kosong", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        
        try {
            String sql = "UPDATE anggota SET nama_anggota=?, email=?, telepon=?, jenis_kelamin=?, tanggal_bergabung=? WHERE id_anggota=?";
            pStm = conn.prepareStatement(sql);
            pStm.setString(1, namaAnggota);
            pStm.setString(2, emailAnggota);
            pStm.setString(3, teleponAnggota);
            pStm.setString(4, jenisKelamin);
            pStm.setString(5, tglBergabung);
            pStm.setString(6, idAnggota);
            
            int rowInsertData = pStm.executeUpdate();
            if(rowInsertData > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate");
                resetForm();
                loadData();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Data gagal diupdate" + e.getMessage());
        }
    }
    
    
    private void deleteData() {
        int selectRow = tblData.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, 
                "Apakah yakin ingin dihapus?",
                "Konfirmasi Hapus Data",
                JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION) {
            String id = tblData.getValueAt(selectRow, 0).toString();
            try {
                String sql = "DELETE FROM anggota WHERE id_anggota=?";
                pStm = conn.prepareStatement(sql);
                pStm.setString(1, id);
                
                int rowDeleted = pStm.executeUpdate();
                if(rowDeleted > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil Dihapus");
                } else {
                    JOptionPane.showMessageDialog(this, "Data gagal Dihapus");
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Delete data gagal" + e.getMessage());
            }
        }
        resetForm();
        loadData();
        showPanelView();
    }
    
    private void searchData() {
        String keyword = searchTf.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM anggota WHERE nama_anggota LIKE ? OR email LIKE ?";
            pStm = conn.prepareStatement(sql);
            pStm.setString(1, "%" + keyword + "%");
            pStm.setString(2, "%" + keyword + "%");
            rs = pStm.executeQuery();
            
            while(rs.next()) {
                String idAnggota = rs.getString("id_anggota");
                String namaAnggota = rs.getString("nama_anggota");
                String emailAnggota = rs.getString("email");
                String teleponAnggota = rs.getString("telepon");
                String jenisKelaminAnggota = rs.getString("jenis_kelamin");
                String tanggalBergabungAnggota = rs.getString("tanggal_bergabung");
                
                Object[] dataAnggota = {
                    idAnggota,
                    namaAnggota,
                    emailAnggota,
                    teleponAnggota,
                    jenisKelaminAnggota,
                    tanggalBergabungAnggota
                };
                model.addRow(dataAnggota);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Gagal" + e.getMessage());
        }
    }

}
