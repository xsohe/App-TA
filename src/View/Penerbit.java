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

public class Penerbit extends javax.swing.JPanel {

    /**
     * Creates new form Dashboard
     */
    private Connection conn;
    private Statement stm;
    private PreparedStatement pStm;
    private ResultSet rs;
    
    public Penerbit() {
        initComponents();
        
        //Set table costum
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
        situsTf = new javax.swing.JTextField();

        dateChooser1.setForeground(new java.awt.Color(55, 71, 79));
        dateChooser1.setDateFormat("yyyy-MM-dd");
        dateChooser1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        setLayout(new java.awt.CardLayout());

        pn_main.setBackground(new java.awt.Color(255, 255, 255));
        pn_main.setLayout(new java.awt.CardLayout());

        pn_view.setBackground(new java.awt.Color(255, 255, 255));

        tblData.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nama", "Situs"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel1.setText("Data Penerbit Buku");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Literature.png"))); // NOI18N
        jLabel2.setText("Master Data > Penerbit");

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
        labelHeader.setText("Tambah Data Penerbit Buku");

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
        jLabel9.setText("Situs");

        situsTf.setFont(new java.awt.Font("Poppins", 2, 14)); // NOI18N
        situsTf.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout pn_addLayout = new javax.swing.GroupLayout(pn_add);
        pn_add.setLayout(pn_addLayout);
        pn_addLayout.setHorizontalGroup(
            pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addLayout.createSequentialGroup()
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_addLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelData, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_addLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHeader)
                            .addComponent(jLabel8)
                            .addComponent(namaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(situsTf, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(situsTf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(364, Short.MAX_VALUE))
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
        
        idTf.setText(setIdPenerbit());
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
            showPanelView();
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
    private javax.swing.JTextField idTf;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField searchTf;
    private javax.swing.JTextField situsTf;
    private table.TableCustom tableCustom1;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables

    //Set model
    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
    }

    private void loadData() {
        getData((DefaultTableModel) tblData.getModel());
        btnDelete.setVisible(false);
        btnCancel.setVisible(false);
    }
    
    private void showPanelView(){
        pn_main.removeAll();
        pn_main.add(new Penerbit());
        pn_main.repaint();
        pn_main.revalidate();
    }
    
    private void resetForm() {
        idTf.setText("");
        namaTf.setText("");
        situsTf.setText("");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM penerbit";
            stm = conn.prepareStatement(sql);
            
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()) {
                String idPenerbit = rs.getString("id_penerbit");
                String namaPenerbit = rs.getString("nama_penerbit");
                String emailPenerbit = rs.getString("situs_penerbit");
                Object[] dataPenerbit = {
                    idPenerbit,
                    namaPenerbit,
                    emailPenerbit
                };
                model.addRow(dataPenerbit);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Gagal" + e.getMessage());
        }
    }
    
    //Set id otomatis
    private String setIdPenerbit() {
        String urut = null;
        Date now = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("yyMM");
        String no = noFormat.format(now);
        
        String sql = "SELECT RIGHT (id_penerbit, 3) AS Nomor " +
                "FROM penerbit " + 
                "WHERE id_penerbit LIKE 'PNT" + no + "%' " +
                "ORDER BY id_penerbit DESC " +
                "LIMIT 1";
        
        try {
            stm = conn.prepareStatement(sql);
            rs = stm.executeQuery(sql);
            
            if(rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor")) + 1;
                urut = "PNT" + no + String.format("%03d", nomor);
            } else {
                urut = "PNT" + no + "001";
            }
        } catch (Exception e) {
            System.err.println("Set Id GAGAL" + e.getMessage());
        }
        return urut;
    }
    
    public boolean validasiNameKategori() {
        boolean valid = false;
        String idPenerbit = idTf.getText();
        String namaPenerbit = namaTf.getText();
        
        String sql = "SELECT nama_penerbit FROM penerbit WHERE id_penerbit!='"+ idPenerbit +"' AND nama_penerbit LIKE BINARY '"+ namaPenerbit +"'";
        try {
            pStm = conn.prepareStatement(sql);
            rs = pStm.executeQuery();
            
            if(rs.next()) {
                JOptionPane.showMessageDialog(this, 
                        "Nama penerbit sudah tersedia\nSilahkan menggunakan nama yang berbeda!!!", 
                        "Peringatan", 
                        JOptionPane.WARNING_MESSAGE);
            } else {
                valid = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Validasi penerbit gagal" + e.getMessage());
        }
        return valid;
    }

    private void insertData() {
        String idPenerbit = idTf.getText();
        String namaPenerbit = namaTf.getText();
        String situsPenerbit = situsTf.getText();
        
        if(idPenerbit.isEmpty() || namaPenerbit.isEmpty() || situsPenerbit.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Field tidak boleh ada yang kosong", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        
        if(!validasiNameKategori()) {
            return;
        }
        
        try {
            String sql = "INSERT INTO penerbit (id_penerbit, nama_penerbit, situs_penerbit) values (?,?,?)";
            pStm = conn.prepareStatement(sql);
            pStm.setString(1, idPenerbit);
            pStm.setString(2, namaPenerbit);
            pStm.setString(3, situsPenerbit);
            
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
        labelHeader.setText("Ubah Data Penerbit Buku");
        
        idTf.setEnabled(false);
        
        idTf.setText(tblData.getValueAt(row, 0).toString());
        namaTf.setText(tblData.getValueAt(row, 1).toString());
        situsTf.setText(tblData.getValueAt(row, 2).toString());
    }
    
    private void updateData() {
        String idPenerbit = idTf.getText();
        String namaPenerbit = namaTf.getText();
        String situsPenerbit = situsTf.getText();
        
        if(idPenerbit.isEmpty() || namaPenerbit.isEmpty() || situsPenerbit.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Field tidak boleh ada yang kosong", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        
        try {
            String sql = "UPDATE penerbit SET nama_penerbit=?, situs_penerbit=? WHERE id_penerbit=?";
            pStm = conn.prepareStatement(sql);
            pStm.setString(1, namaPenerbit);
            pStm.setString(2, situsPenerbit);
            pStm.setString(3, idPenerbit);
            
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
                String sql = "DELETE FROM penerbit WHERE id_penerbit=?";
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
                System.err.println("Error delete data gagal" + e.getMessage());
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
            String sql = "SELECT * FROM penerbit WHERE nama_penerbit LIKE ? OR situs_penerbit LIKE ?";
            pStm = conn.prepareStatement(sql);
            pStm.setString(1, "%" + keyword + "%");
            pStm.setString(2, "%" + keyword + "%");
            rs = pStm.executeQuery();
            
            while(rs.next()) {
                String idPenerbit = rs.getString("id_penerbit");
                String namaPenerbit = rs.getString("nama_penerbit");
                String emailPenerbit = rs.getString("situs_penerbit");
                
                Object[] dataPenerbit = {
                    idPenerbit,
                    namaPenerbit,
                    emailPenerbit
                };
                model.addRow(dataPenerbit);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Gagal search data penerbit" + e.getMessage());
        }
    }

}
