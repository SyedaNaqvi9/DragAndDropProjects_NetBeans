/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellodraganddrop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ImageView imageView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleDragOver(DragEvent event) {
        if (event.getDragboard().hasFiles()) {
            event.acceptTransferModes(TransferMode.ANY);
    }
    
    }

    @FXML
    private void handleDrop(DragEvent event) throws FileNotFoundException {
         List<File> files=event.getDragboard().getFiles();
        Image img= new Image(new FileInputStream(files.get(0)));
        imageView.setImage(img);
    }
    
}
