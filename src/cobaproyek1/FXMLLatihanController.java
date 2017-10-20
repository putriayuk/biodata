/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaproyek1;

import com.jfoenix.controls.JFXTextArea;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author Pesek
 */
public class FXMLLatihanController implements Initializable {

    @FXML
    private TextField editnama;

    @FXML
    private TextField editalamat;

    @FXML
    private TextField editabsen;

    @FXML
    private TextField edittelepon;

    @FXML
    private Button proses;

    @FXML
    private JFXTextArea hasil;

    @FXML
    private Button hapus;

    
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 

    @FXML
    void Proses(ActionEvent event) {
     String nama=editnama.getText();
        String alamat=editalamat.getText();
        String absen=editabsen.getText();
        String telepon=edittelepon.getText();
        
        hasil.setText("Nama Anda "+nama+"\n"
        +"Alamat Anda "+alamat+"\n"
        +"Absen Anda "+absen+"\n"
        +"Telepon Anda "+telepon+"\n");
    }
    @FXML
    void Hapus(ActionEvent event) {
        hasil.setText("");
        editnama.setText("");
        editalamat.setText("");
        editabsen.setText("");
        edittelepon.setText("");
    }  
    
     }
