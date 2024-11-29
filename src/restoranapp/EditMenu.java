/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restoranapp;

import DataAccessObject.DbOperation;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produk;
/**
 *
 * @author kurohana
 */
public class EditMenu extends javax.swing.JFrame {

    /**
     * Creates new form EditMenu
     */
    DbOperation db;
    ArrayList<Produk> listMenu;
    DefaultTableModel menuTableModel;
    
    public EditMenu() {
        initComponents();
        db = new DbOperation();
        getData();
    }
    
    public void getData(){
        listMenu = db.lihatDaftarMenu();
        showDataTable();
    }
    
    public void showDataTable(){
        String[] headerTableColumns = {"ID Menu", "Nama ", "Kategori", "Harga"};
        Object[][] menuValue = new Object[listMenu.size()][headerTableColumns.length];
        int i = 0;
        
        for(Produk menu: listMenu) {
            String menuData[] = {menu.id_menu, menu.nama, menu.kategori, menu.harga};
            menuValue[i] = menuData;
            i++;
        };
        
        menuTableModel = new DefaultTableModel(menuValue, headerTableColumns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            };        
        };
        
        menuTable.setModel(menuTableModel);
    };
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namaTF = new javax.swing.JTextField();
        hargaTF = new javax.swing.JTextField();
        kategoriCB = new javax.swing.JComboBox<>();
        BtnTambah = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        BtnKembali = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Edit Menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 85, 200, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Nama Produk");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 206, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Harga");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 253, 98, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Kategori");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 98, -1));

        namaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTFActionPerformed(evt);
            }
        });
        getContentPane().add(namaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 204, 290, -1));

        hargaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaTFActionPerformed(evt);
            }
        });
        getContentPane().add(hargaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 251, 290, -1));

        kategoriCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "food", "drink", "snack", "ice cream" }));
        kategoriCB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        kategoriCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriCBActionPerformed(evt);
            }
        });
        getContentPane().add(kategoriCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 298, 290, -1));

        BtnTambah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new product.png"))); // NOI18N
        BtnTambah.setText("Tambahkan");
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(BtnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, -1, -1));

        BtnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        BtnUpdate.setText("Update");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(BtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, -1, -1));

        BtnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        BtnDelete.setText("Delete");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(BtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, -1, -1));

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(menuTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 411, 650, 199));

        BtnKembali.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        BtnKembali.setText("Kembali");
        BtnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(BtnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 96, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home-background-image.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTFActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_namaTFActionPerformed

    private void BtnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKembaliActionPerformed
        // TODO add your handling code here:
        Home kembali = new Home();
        kembali.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnKembaliActionPerformed

    private void kategoriCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriCBActionPerformed
        // TODO add your handling code here
        
    }//GEN-LAST:event_kategoriCBActionPerformed

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        // TODO add your handling code here:        
        try{
            String nama = namaTF.getText();
            int harga = Integer.parseInt(hargaTF.getText().toString());
            String kategori = kategoriCB.getSelectedItem().toString();
            db.setDataOrDelete("insert into menu(nama, kategori, harga) values('"+nama+"','"+kategori+"', "+harga+")", "Menu berhasil ditambahkan.");
            getData();
            namaTF.setText("");
            hargaTF.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Harap mengisi data dengan benar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnTambahActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        // TODO add your handling code here:
        try{
            int selectedRow = menuTable.getSelectedRow();
            String id_menu = menuTable.getValueAt(selectedRow, 0).toString();
            db.setDataOrDelete("delete from menu where id_menu = '"+id_menu+"'", "Menu berhasil dihapus.");
            getData();
            namaTF.setText("");
            hargaTF.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Harap mengisi data dengan benar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        // TODO add your handling code here:
        try{
            int selectedRow = menuTable.getSelectedRow();
            String id_menu = menuTable.getValueAt(selectedRow, 0).toString();
            String nama = namaTF.getText();
            int harga = Integer.parseInt(hargaTF.getText().toString());
            String kategori = kategoriCB.getSelectedItem().toString();
            db.setDataOrDelete("update menu set nama = '"+nama+"', kategori = '"+kategori+"', harga = '"+harga+"' where id_menu = '"+id_menu+"'", "Menu berhasil diupdate.");
            getData();
            namaTF.setText("");
            hargaTF.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Harap mengisi data dengan benar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void hargaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaTFActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_hargaTFActionPerformed

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
            java.util.logging.Logger.getLogger(EditMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnKembali;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JTextField hargaTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kategoriCB;
    private javax.swing.JTable menuTable;
    private javax.swing.JTextField namaTF;
    // End of variables declaration//GEN-END:variables
}
