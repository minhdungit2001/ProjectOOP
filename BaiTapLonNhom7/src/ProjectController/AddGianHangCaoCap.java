package ProjectController;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import Views.GianHangCaoCap;


import java.io.IOException;

public class AddGianHangCaoCap {
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
    ObservableList<GianHangCaoCap> list = FXCollections.observableArrayList();

    public AddGianHangCaoCap() {
    }

    public void setList(ObservableList<GianHangCaoCap> list) {
        this.list = list;
    }

    //Lúc này stageReturn đang lưu Stage có thông tin cũ nên sẽ được đóng đi
    @FXML
    void returnStage(ActionEvent event) throws IOException {
        Stage stageReturn = (Stage) ((Node) event.getSource()).getScene().getWindow();  //Lấy ra Stage sẵn có
        stageReturn.close();
    }


    @FXML
    void submitGianHangCaoCap(ActionEvent event) throws IOException {
        GianHangCaoCap ghcc = new GianHangCaoCap();
        ghcc.setMaGianHang(maGianHangText.getText());
        ghcc.setViTri(viTriText.getText());
        ghcc.setDienTich(Double.parseDouble(dienTichText.getText()));
        ghcc.setSoLuongQuat(Integer.parseInt(soLuongQuatText.getText()));
        ghcc.setSoLuongGhe(Integer.parseInt(soLuongGheText.getText()));
        list.add(ghcc);
        maGianHangText.clear();
        viTriText.clear();
        dienTichText.clear();
        soLuongGheText.clear();
        soLuongQuatText.clear();
    }
}