/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mform;

import mform.db.Database;
import javax.swing.JOptionPane;
import mform.model.BadanHukum;
import mform.model.Company;
import mform.model.KIP;
import mform.form.CompanyForm;

/**
 *
 * @author duta
 */
public class ViewForm extends javax.swing.JFrame {

    /**
     * Creates new form ViewForm
     */
    public ViewForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namaProvLabel = new javax.swing.JLabel();
        namaKabLabel = new javax.swing.JLabel();
        periodeDataLabel = new javax.swing.JLabel();
        namaProvComboBox = new javax.swing.JComboBox<>();
        namaKabComboBox = new javax.swing.JComboBox<>();
        periodeDataTextField = new javax.swing.JTextField();
        kipLabel = new javax.swing.JLabel();
        kodeProvLabel = new javax.swing.JLabel();
        kodeKabLabel = new javax.swing.JLabel();
        kodeKecLabel = new javax.swing.JLabel();
        noUrutKabLabel = new javax.swing.JLabel();
        alamatPerusahaanLabel = new javax.swing.JLabel();
        namaPerusahaanLabel = new javax.swing.JLabel();
        noTelpLabel = new javax.swing.JLabel();
        noFaxLabel = new javax.swing.JLabel();
        kodeProvTextField = new javax.swing.JTextField();
        kodeKabTextField = new javax.swing.JTextField();
        kodeKecTextField = new javax.swing.JTextField();
        noUrutKabTextField = new javax.swing.JTextField();
        namaPerusahaanTextField = new javax.swing.JTextField();
        alamatPerusahaanTextField = new javax.swing.JTextField();
        noTelpTextField = new javax.swing.JTextField();
        noFaxTextField = new javax.swing.JTextField();
        kodeKJULabel = new javax.swing.JLabel();
        kodeKJUTextField = new javax.swing.JTextField();
        badanHukumLabel = new javax.swing.JLabel();
        noLabel = new javax.swing.JLabel();
        noTextField = new javax.swing.JTextField();
        isKonfirmLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        DPPLabel = new javax.swing.JLabel();
        subsektorLabel = new javax.swing.JLabel();
        tanamanPanganLabel = new javax.swing.JLabel();
        holtikulturaLabel = new javax.swing.JLabel();
        perkebunanLabel = new javax.swing.JLabel();
        peternakanLabel = new javax.swing.JLabel();
        kehutananLabel = new javax.swing.JLabel();
        perikananLabel = new javax.swing.JLabel();
        usahaUtamaLabel = new javax.swing.JLabel();
        simpanButton = new javax.swing.JButton();
        konfirmTextField = new javax.swing.JTextField();
        badanHukumTextField = new javax.swing.JTextField();
        statusTextField = new javax.swing.JTextField();
        tanamanPanganTextField = new javax.swing.JTextField();
        holtikulturaTextField = new javax.swing.JTextField();
        peternakanTextField = new javax.swing.JTextField();
        kehutananTextField = new javax.swing.JTextField();
        perikananTextField = new javax.swing.JTextField();
        usahaUtamaTextField = new javax.swing.JTextField();
        perkebunanTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 770));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("UPDATING DIREKTORI PERUSAHAAN PERTANIAN BERBADAN HUKUM");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("REPUBLIK INDONESIA");

        namaProvLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        namaProvLabel.setText("Provinsi");

        namaKabLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        namaKabLabel.setText("Kabupaten/Kota");

        periodeDataLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        periodeDataLabel.setText("Periode Data");

        namaProvComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[32] JAWA BARAT", "[] JAWA TIMUR" }));

        namaKabComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[01] BOGOR", "[02] SUKABUMI" }));

        kipLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kipLabel.setText("Kode Identitas Perusahaan (KIP)");

        kodeProvLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kodeProvLabel.setText("(2) Kode Prov");

        kodeKabLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kodeKabLabel.setText("(3) Kode Kab");

        kodeKecLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kodeKecLabel.setText("(4) Kode Kec");

        noUrutKabLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        noUrutKabLabel.setText("(6) No. Urut");

        alamatPerusahaanLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alamatPerusahaanLabel.setText("(8) Alamat Perusahaan Pertanian");

        namaPerusahaanLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        namaPerusahaanLabel.setText("(7) Nama Perusahaan Pertanian");

        noTelpLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        noTelpLabel.setText("(9) Nomor Telepon");

        noFaxLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        noFaxLabel.setText("(10) Nomor Faksimili");

        kodeKJULabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kodeKJULabel.setText("(5) Kode KJU");

        badanHukumLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        badanHukumLabel.setText("(11) Bentuk Badan Hukum");

        noLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        noLabel.setText("(1) No");

        isKonfirmLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        isKonfirmLabel.setText("(12) Keterangan Pencacahan");

        statusLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statusLabel.setText("(13) Status Pencacahan");

        DPPLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DPPLabel.setText("Pencacahan DPP");

        subsektorLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subsektorLabel.setText("Subsektor");

        tanamanPanganLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tanamanPanganLabel.setText("(14) Tanaman Pangan");

        holtikulturaLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        holtikulturaLabel.setText("(15) Holtikultura");

        perkebunanLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        perkebunanLabel.setText("(16) Perkebunan");

        peternakanLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        peternakanLabel.setText("(17) Peternakan");

        kehutananLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kehutananLabel.setText("(18) Kehutanan");

        perikananLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        perikananLabel.setText("(19) Perikanan");

        usahaUtamaLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usahaUtamaLabel.setText("(20) Jenis Usaha Utama");

        simpanButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(simpanButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(613, 613, 613)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(448, 448, 448)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(namaProvLabel)
                                            .addComponent(namaKabLabel)
                                            .addComponent(periodeDataLabel))
                                        .addGap(61, 61, 61)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(namaProvComboBox, 0, 250, Short.MAX_VALUE)
                                            .addComponent(namaKabComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(periodeDataTextField)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(namaPerusahaanLabel)
                                                            .addComponent(alamatPerusahaanLabel)
                                                            .addComponent(noTelpLabel)
                                                            .addComponent(noFaxLabel))
                                                        .addGap(103, 103, 103)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(noFaxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(noTelpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(alamatPerusahaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(namaPerusahaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(kodeProvLabel)
                                                            .addComponent(kodeKabLabel)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(1, 1, 1)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(kodeKJULabel)
                                                                    .addComponent(kodeKecLabel)
                                                                    .addComponent(noUrutKabLabel))))
                                                        .addGap(204, 204, 204)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(kodeKecTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(kodeKabTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(kodeProvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(kodeKJUTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(noUrutKabTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(noTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addComponent(noLabel)
                                            .addComponent(kipLabel))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(badanHukumLabel)
                                                    .addComponent(DPPLabel)
                                                    .addComponent(subsektorLabel)
                                                    .addComponent(usahaUtamaLabel))
                                                .addGap(50, 50, 50))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(80, 80, 80)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(statusLabel)
                                                            .addComponent(isKonfirmLabel)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(81, 81, 81)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(holtikulturaLabel)
                                                            .addComponent(tanamanPanganLabel)
                                                            .addComponent(perkebunanLabel)
                                                            .addComponent(peternakanLabel)
                                                            .addComponent(kehutananLabel)
                                                            .addComponent(perikananLabel))))
                                                .addGap(0, 0, Short.MAX_VALUE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(konfirmTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(badanHukumTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tanamanPanganTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(holtikulturaTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peternakanTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kehutananTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perikananTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usahaUtamaTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perkebunanTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaProvLabel)
                    .addComponent(namaProvComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaKabLabel)
                    .addComponent(namaKabComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodeDataLabel)
                    .addComponent(periodeDataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noLabel)
                    .addComponent(noTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(badanHukumLabel)
                    .addComponent(badanHukumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kipLabel)
                    .addComponent(DPPLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kodeProvLabel)
                    .addComponent(kodeProvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isKonfirmLabel)
                    .addComponent(konfirmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kodeKabLabel)
                    .addComponent(kodeKabTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusLabel)
                    .addComponent(statusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kodeKecLabel)
                    .addComponent(kodeKecTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subsektorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kodeKJULabel)
                    .addComponent(kodeKJUTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanamanPanganLabel)
                    .addComponent(tanamanPanganTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(noUrutKabTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(holtikulturaLabel)
                        .addComponent(holtikulturaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(noUrutKabLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaPerusahaanLabel)
                    .addComponent(namaPerusahaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perkebunanLabel)
                    .addComponent(perkebunanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alamatPerusahaanLabel)
                    .addComponent(alamatPerusahaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peternakanLabel)
                    .addComponent(peternakanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noTelpLabel)
                    .addComponent(noTelpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kehutananLabel)
                    .addComponent(kehutananTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noFaxLabel)
                    .addComponent(noFaxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perikananLabel)
                    .addComponent(perikananTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usahaUtamaLabel)
                    .addComponent(usahaUtamaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(simpanButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        // TODO add your handling code here:
        CompanyForm cf = new CompanyForm();
        Company c1 = new Company();
        KIP kip = new KIP();
        BadanHukum b1 = new BadanHukum();
        
//      Set company untuk form
        cf.setCompany(c1);
        //Entri Data untuk form
        cf.setNamaProv(namaProvComboBox.getSelectedItem().toString());
        cf.setNamaKab(namaKabComboBox.getSelectedItem().toString());
        cf.setPeriodeData(Integer.parseInt(periodeDataTextField.getText()));
        c1.setNo(Integer.parseInt(noTextField.getText()));
        cf.setKodeProv(kodeProvTextField.getText());
        cf.setKodeKab(kodeKabTextField.getText());
        kip.setKodeKec(kodeKecTextField.getText());
        kip.setKodeKJU(kodeKJUTextField.getText());
        kip.setNoUrutKab(Integer.parseInt(noUrutKabTextField.getText()));
        c1.setNamaPerusahaan(namaPerusahaanTextField.getText());
        c1.setAlamatPerusahaan(alamatPerusahaanTextField.getText());
        c1.setNoTelp(noTelpTextField.getText());
        c1.setNoFax(noFaxTextField.getText());
        b1.setKode(Integer.parseInt(badanHukumTextField.getText()));
        c1.setKonfirm(Integer.parseInt(konfirmTextField.getText()));
        c1.setStatus(Integer.parseInt(statusTextField.getText()));
        c1.setTanamanPangan(tanamanPanganTextField.getText());
        c1.setHoltikultura(holtikulturaTextField.getText());
        c1.setPerkebunan(perkebunanTextField.getText());
        c1.setPeternakan(peternakanTextField.getText());
        c1.setKehutanan(kehutananTextField.getText());
        c1.setPerikanan(perikananTextField.getText());
        c1.setInputUsahaUtama(usahaUtamaTextField.getText());  

        try {
            Database.getInstance().insertCompany(cf, c1, kip, b1);
          //  clearForm();
            JOptionPane.showMessageDialog(this, "Sukses Tersimpan");
        } catch (java.sql.SQLException ex) {
            System.err. println(ex);
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data",
                "Gagal", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_simpanButtonActionPerformed

        



  
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
            java.util.logging.Logger.getLogger(ViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DPPLabel;
    private javax.swing.JLabel alamatPerusahaanLabel;
    private javax.swing.JTextField alamatPerusahaanTextField;
    private javax.swing.JLabel badanHukumLabel;
    private javax.swing.JTextField badanHukumTextField;
    private javax.swing.JLabel holtikulturaLabel;
    private javax.swing.JTextField holtikulturaTextField;
    private javax.swing.JLabel isKonfirmLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kehutananLabel;
    private javax.swing.JTextField kehutananTextField;
    private javax.swing.JLabel kipLabel;
    private javax.swing.JLabel kodeKJULabel;
    private javax.swing.JTextField kodeKJUTextField;
    private javax.swing.JLabel kodeKabLabel;
    private javax.swing.JTextField kodeKabTextField;
    private javax.swing.JLabel kodeKecLabel;
    private javax.swing.JTextField kodeKecTextField;
    private javax.swing.JLabel kodeProvLabel;
    private javax.swing.JTextField kodeProvTextField;
    private javax.swing.JTextField konfirmTextField;
    private javax.swing.JComboBox<String> namaKabComboBox;
    private javax.swing.JLabel namaKabLabel;
    private javax.swing.JLabel namaPerusahaanLabel;
    private javax.swing.JTextField namaPerusahaanTextField;
    private javax.swing.JComboBox<String> namaProvComboBox;
    private javax.swing.JLabel namaProvLabel;
    private javax.swing.JLabel noFaxLabel;
    private javax.swing.JTextField noFaxTextField;
    private javax.swing.JLabel noLabel;
    private javax.swing.JLabel noTelpLabel;
    private javax.swing.JTextField noTelpTextField;
    private javax.swing.JTextField noTextField;
    private javax.swing.JLabel noUrutKabLabel;
    private javax.swing.JTextField noUrutKabTextField;
    private javax.swing.JLabel perikananLabel;
    private javax.swing.JTextField perikananTextField;
    private javax.swing.JLabel periodeDataLabel;
    private javax.swing.JTextField periodeDataTextField;
    private javax.swing.JLabel perkebunanLabel;
    private javax.swing.JTextField perkebunanTextField;
    private javax.swing.JLabel peternakanLabel;
    private javax.swing.JTextField peternakanTextField;
    private javax.swing.JButton simpanButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextField statusTextField;
    private javax.swing.JLabel subsektorLabel;
    private javax.swing.JLabel tanamanPanganLabel;
    private javax.swing.JTextField tanamanPanganTextField;
    private javax.swing.JLabel usahaUtamaLabel;
    private javax.swing.JTextField usahaUtamaTextField;
    // End of variables declaration//GEN-END:variables
}
