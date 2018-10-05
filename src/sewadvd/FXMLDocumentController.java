/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sewadvd;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button Button2;

    @FXML
    private Label judul;

    @FXML
    private Label lnama;

    @FXML
    private TextField editnama;

    @FXML
    private Label lalamat;

    @FXML
    private TextField editalamat;

    @FXML
    private Label LTelepon;

    @FXML
    private TextField edittelepon;

    @FXML
    private Label LPaket;

    @FXML
    private TextArea textKonfirmasi;

    @FXML
    private Button ButtonHapus;
    @FXML
    private Label Ltanggal;

    @FXML
    private TextField edittanggal;
    @FXML
    private Label Ljumlah;
    @FXML
    private ToggleGroup PilihanPaket;
    @FXML
    private TextField editjumlah;
    @FXML
    private RadioButton film;
    @FXML
    private RadioButton game;
    @FXML
    private RadioButton music;
    @FXML
    private Label Lbiji;

    @FXML
    void Klikkedua(ActionEvent event) {
        String paket;
        int harga = 0;

        if (editnama.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harap inputkan Nama");
        } else if (editalamat.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harap inputkan Alamat");
        } else if (editjumlah.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harap inputkan Jumlah Dvd");
        } else if (edittelepon.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harap inputkan Nomor Telepon");
        } else if (edittanggal.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harap inputkan Tanggal pengembalian");
        }
        if (film.isSelected()) {
            paket = "Dvd Film";
        } else if (game.isSelected()) {
            paket = "Dvd Game";
        } else if (music.isSelected()) {
            paket = "Dvd Music";
        } else {
            paket = "";
        }

        if (!(film.isSelected() || game.isSelected() || music.isSelected())) {
            JOptionPane.showMessageDialog(null, "Harap pilih paket DVD");
        } else {
            String nama = editnama.getText();
            String alamat = editalamat.getText();
            String jumlah = editjumlah.getText() + " biji";
            String tanggal = edittanggal.getText();

            int hitung = Integer.parseInt(editjumlah.getText());

            if (film.isSelected()) {
                harga = hitung * 10000;
            }
            if (game.isSelected()) {
                harga = hitung * 15000;
            }
            if (music.isSelected()) {
                harga = hitung * 8000;
            }
            String nohp = edittelepon.getText();

            textKonfirmasi.setText("Nama : " + nama + "\n" + "Alamat : " + alamat + "\n" + "jumlah Dvd : " + jumlah + "\n" + "Nomor Telepon : "
                    + nohp + "\n" + "Pilihan Paket : " + paket + "\n" + "Tanggal Pengambilan : " + tanggal + "\n" + "Pembayaran yang harus dibayar : Rp. " + harga);
        }

    }

    @FXML
    void hapusIsian(ActionEvent event) {

        editnama.setText("");
        editalamat.setText("");
        editjumlah.setText("");
        edittelepon.setText("");
        film.setSelected(false);
        game.setSelected(false);
        music.setSelected(false);
        edittanggal.setText("");
        textKonfirmasi.setText("");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Klikkedua(MouseEvent event) {
    }

}
