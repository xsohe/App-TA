/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

/**
 *
 * @author YANUAREKA
 */
import Config.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import com.formdev.flatlaf.FlatLightLaf;
import table.TableCustom;

public class DataPeminjaman extends javax.swing.JDialog {

    private Connection conn;
    
    private String idPeminjaman;
    private String tanggalPinjam;
    private String tanggalKembali;
    private String idAnggota;
    private String namaAnggota;
    private String idBuku;
    private String judulBuku;
    private String pengarangBuku;
    private String penerbitBuku;
    private String jumlahPinjam;
    
    //GETTER
    public String getIdPeminjaman() {
        return idPeminjaman;
    }
    public String getTanggalPinjam() {
        return tanggalPinjam;
    }
    public String getTanggalKembali() {
        return tanggalKembali;
    }
    public String getIdAnggota() {
        return idAnggota;
    }
    public String getNamaAnggota() {
        return namaAnggota;
    }
    public String getIdBuku() {
        return idBuku;
    }
    public String getJudulBuku() {
        return judulBuku;
    }
    public String getPengarangBuku() {
        return pengarangBuku;
    }
    public String getPenerbitBuku() {
        return penerbitBuku;
    }
    public String getJumlahPinjam() {
        return jumlahPinjam;
    }
    
    public DataPeminjaman(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //Set table costum
        tableCustom1.apply(jScrollPane1, TableCustom.TableType.DEFAULT);
        
        conn = Koneksi.getConnection();
        setTableModel();
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

        tableCustom1 = new table.TableCustom();
        pn_view = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        searchTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pn_view.setBackground(new java.awt.Color(255, 255, 255));

        tblData.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tanggal Pinjam", "Tanggal Kembali", "Id Anggota", "Nama Anggota", "Id Buku", "Judul", "Pengarang", "Penerbit", "Jumlah"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Books.png"))); // NOI18N
        jLabel1.setText("Data Peminjaman Buku Perpustakaan");

        searchTf.setFont(new java.awt.Font("Poppins", 2, 14)); // NOI18N
        searchTf.setForeground(new java.awt.Color(153, 153, 153));
        searchTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTfKeyReleased(evt);
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
                .addContainerGap()
                .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_viewLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1294, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pn_viewLayout.createSequentialGroup()
                        .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_viewLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchTf))
                            .addGroup(pn_viewLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))))
        );
        pn_viewLayout.setVerticalGroup(
            pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1306, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pn_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pn_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchTfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTfKeyReleased
        // TODO add your handling code here:
        searchData();
    }//GEN-LAST:event_searchTfKeyReleased

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        pilihData();
    }//GEN-LAST:event_tblDataMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DataPeminjaman dialog = new DataPeminjaman(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pn_view;
    private javax.swing.JTextField searchTf;
    private table.TableCustom tableCustom1;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        getData((DefaultTableModel) tblData.getModel());
    }
    
    //Set model
    private void setTableModel() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
    }

    
    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT *\n"+
                    "FROM detail_peminjaman pmd\n"+
                    "INNER JOIN peminjaman pm ON pm.id_peminjaman = pmd.id_peminjaman\n" +
                    "INNER JOIN anggota agt ON agt.id_anggota = pm.id_anggota\n"+
                    "INNER JOIN buku bk ON bk.id_buku = pmd.id_buku\n"+
                    "INNER JOIN penerbit pnb ON pnb.id_penerbit = bk.id_penerbit\n"+
                    "WHERE status_peminjaman = 'Sedang Dipinjam'";
            PreparedStatement pStm = conn.prepareStatement(sql);
            ResultSet rs = pStm.executeQuery(sql);
            
            while(rs.next()) {
                String idPeminjaman = rs.getString("id_peminjaman");
                String tglPinjam = rs.getString("tanggal_peminjaman");
                String tglKembali = rs.getString("tanggal_pengembalian");
                String idAnggota = rs.getString("id_anggota");
                String namaAnggota = rs.getString("nama_anggota");
                String idBuku = rs.getString("id_buku");
                String judulBuku = rs.getString("judul_buku");
                String pengarangBuku = rs.getString("pengarang_buku");
                String namaPenerbit = rs.getString("nama_penerbit");
                String jumlahPinjam = rs.getString("jumlah_pinjam");
                
                Object[] dataAnggota = {
                    idPeminjaman,
                    tglPinjam,
                    tglKembali,
                    idAnggota,
                    namaAnggota,
                    idBuku,
                    judulBuku,
                    pengarangBuku,
                    namaPenerbit,
                    jumlahPinjam
                };
                model.addRow(dataAnggota);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Gagal" + e.getMessage());
        }
    }
    
    private void searchData() {
        String keyword = searchTf.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);
        String sql;
        
        //Pengecekan jika tidak ada inputan dari keyword maka akan ditampilkan seluruh datanya 
        //jika ada inputan maka menampilkan data sesuai yg diinputkan
        if(!keyword.isEmpty()) {
            sql = "SELECT *\n"+
                    "FROM detail_peminjaman pmd\n"+
                    "INNER JOIN peminjaman pm ON pm.id_peminjaman = pmd.id_peminjaman\n" +
                    "INNER JOIN anggota agt ON agt.id_anggota = pm.id_anggota\n"+
                    "INNER JOIN buku bk ON bk.id_buku = pmd.id_buku\n"+
                    "INNER JOIN penerbit pnb ON pnb.id_penerbit = bk.id_penerbit\n" +
                    "WHERE status_peminjaman ='Sedang Dipinjam' AND pm.id_peminjaman LIKE ? OR agt.nama_anggota LIKE ?";
        } else {
            sql = "SELECT *\n"+
                    "FROM detail_peminjaman pmd\n"+
                    "INNER JOIN peminjaman pm ON pm.id_peminjaman = pmd.id_peminjaman\n" +
                    "INNER JOIN anggota agt ON agt.id_anggota = pm.id_anggota\n"+
                    "INNER JOIN buku bk ON bk.id_buku = pmd.id_buku\n"+
                    "INNER JOIN penerbit pnb ON pnb.id_penerbit = bk.id_penerbit\n" +
                    "WHERE status_peminjaman ='Sedang Dipinjam'";
        }
        try {
            PreparedStatement pStm = conn.prepareStatement(sql);
            if(!keyword.isEmpty()) {
                pStm.setString(1, "%" + keyword + "%");
                pStm.setString(2, "%" + keyword + "%");
            }
            ResultSet rs = pStm.executeQuery();
            
            while(rs.next()) {
                String idPeminjaman = rs.getString("id_peminjaman");
                String tglPinjam = rs.getString("tanggal_peminjaman");
                String tglKembali = rs.getString("tanggal_pengembalian");
                String idAnggota = rs.getString("id_anggota");
                String namaAnggota = rs.getString("nama_anggota");
                String idBuku = rs.getString("id_buku");
                String judulBuku = rs.getString("judul_buku");
                String pengarangBuku = rs.getString("pengarang_buku");
                String namaPenerbit = rs.getString("nama_penerbit");
                String jumlahPinjam = rs.getString("jumlah_pinjam");
                
                Object[] dataAnggota = {
                    idPeminjaman,
                    tglPinjam,
                    tglKembali,
                    idAnggota,
                    namaAnggota,
                    idBuku,
                    judulBuku,
                    pengarangBuku,
                    namaPenerbit,
                    jumlahPinjam
                };
                model.addRow(dataAnggota);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Gagal" + e.getMessage());
        }
    }
    
    private void pilihData(){
        int row = tblData.getSelectedRow();
        
        idPeminjaman = tblData.getValueAt(row, 0).toString();
        tanggalPinjam = tblData.getValueAt(row, 1).toString();
        tanggalKembali = tblData.getValueAt(row, 2).toString();
        idAnggota = tblData.getValueAt(row, 3).toString();
        namaAnggota = tblData.getValueAt(row, 4).toString();
        idBuku = tblData.getValueAt(row, 5).toString();
        judulBuku = tblData.getValueAt(row, 6).toString();
        pengarangBuku = tblData.getValueAt(row, 7).toString();
        penerbitBuku = tblData.getValueAt(row, 8).toString();
        jumlahPinjam = tblData.getValueAt(row, 9).toString();
        
        dispose();
    }
}
