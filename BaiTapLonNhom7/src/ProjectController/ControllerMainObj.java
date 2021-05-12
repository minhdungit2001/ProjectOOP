package ProjectController;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.GianHangCaoCap;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerMainObj implements  Initializable{
    @FXML
    private TableView<GianHangCaoCap> tableView;

    @FXML
    private TableColumn<GianHangCaoCap, String> maGianHangC;

    @FXML
    private TableColumn<GianHangCaoCap, String> viTriC;

    @FXML
    private TableColumn<GianHangCaoCap, Double> dienTichC;

    @FXML
    private TableColumn<GianHangCaoCap, Integer> soLuongGheC;

    @FXML
    private TableColumn<GianHangCaoCap, Integer> soLuongQuatC;

    @FXML
    private TextField maGianHangText;

    @FXML
    private TextField viTriText;

    @FXML
    private TextField dienTichText;

    @FXML
    private TextField soLuongQuatText;

    @FXML
    private TextField soLuongGheText;

    @FXML
    private ObservableList <GianHangCaoCap> ghccList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ghccList = FXCollections.observableArrayList(new GianHangCaoCap());

        maGianHangC.setCellValueFactory(new PropertyValueFactory<GianHangCaoCap, String>("maGianHang"));
        viTriC.setCellValueFactory(new PropertyValueFactory<GianHangCaoCap, String>("viTri"));
        dienTichC.setCellValueFactory(new PropertyValueFactory<GianHangCaoCap, Double>("dienTich"));
        soLuongGheC.setCellValueFactory(new PropertyValueFactory<GianHangCaoCap, Integer>("soLuongGhe"));
        soLuongQuatC.setCellValueFactory(new PropertyValueFactory<GianHangCaoCap, Integer>("soLuongQuat"));

        tableView.setItems(ghccList);
    }

    @FXML
    void addGHCC(ActionEvent event) throws IOException {
            Stage stageAdd = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loaderAdd = new FXMLLoader();
            loaderAdd.setLocation(getClass().getResource("/Views/AddGianHangCaoCap.fxml"));
            Parent parentAdd = loaderAdd.load();
            Scene sceneAdd = new Scene(parentAdd);
            stageAdd.setScene(sceneAdd);
    }

    @FXML
    void deleteGianHangCaoCap(ActionEvent event) {
        GianHangCaoCap slected = tableView.getSelectionModel().getSelectedItem();
        ghccList.remove(slected);
    }

    @FXML
    void returnStage(ActionEvent event) throws IOException {
            Stage stageReturn = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loaderReturn = new FXMLLoader();
            loaderReturn.setLocation(getClass().getResource("/Views/NewScene.fxml"));
            Parent parentReturn = loaderReturn.load();
            Scene sceneReturn = new Scene(parentReturn);
            stageReturn.setScene(sceneReturn);
    }

    @FXML
    void submitGianHangCaoCap(ActionEvent event) {
        GianHangCaoCap ghcc = new GianHangCaoCap();
        ghcc.setMaGianHang(maGianHangText.getText());
        ghcc.setViTri(viTriText.getText());
        ghcc.setDienTich(Double.parseDouble(dienTichText.getText()));
        ghcc.setSoLuongQuat(Integer.parseInt(soLuongQuatText.getText()));
        ghcc.setSoLuongGhe(Integer.parseInt(soLuongGheText.getText()));
        ghccList.add(ghcc);
    }

}
