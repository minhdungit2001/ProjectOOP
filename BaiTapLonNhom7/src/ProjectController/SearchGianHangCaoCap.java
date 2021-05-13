package ProjectController;

import Views.GianHangCaoCap;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SearchGianHangCaoCap implements Initializable {
    //Nếu khởi tạo thì nó k thêm được list như í??
    @FXML
    private TableView<GianHangCaoCap> tableViewSearch ;

    @FXML
    private TableColumn<GianHangCaoCap, String> maGianHangCol;

    @FXML
    private TableColumn<GianHangCaoCap, String> viTriCol;

    @FXML
    private TableColumn<GianHangCaoCap, Double> dienTichCol;

    @FXML
    private TableColumn<GianHangCaoCap, Integer> soLuongQuatCol;

    @FXML
    private TableColumn<GianHangCaoCap, Integer> soLuongGheCol;

    @FXML
    private TextField textField;

    @FXML
    private ObservableList<GianHangCaoCap> list;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Đưa vào bảng
        try {

            list = FXCollections.observableArrayList(new GianHangCaoCap());
            maGianHangCol.setCellValueFactory(new PropertyValueFactory<GianHangCaoCap, String>("maGianHang"));  //Cung cấp cách hiển thị
            viTriCol.setCellValueFactory(new PropertyValueFactory<GianHangCaoCap, String>("viTri"));
            dienTichCol.setCellValueFactory(new PropertyValueFactory<GianHangCaoCap, Double>("dienTich"));
            soLuongGheCol.setCellValueFactory(new PropertyValueFactory<GianHangCaoCap, Integer>("soLuongGhe"));
            soLuongQuatCol.setCellValueFactory(new PropertyValueFactory<GianHangCaoCap, Integer>("soLuongQuat"));
            tableViewSearch.setItems(list);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void setTableViewSeaerch(ObservableList<GianHangCaoCap> m){
        this.list = m;
        this.tableViewSearch.setItems(list);
    }


    public void setList(ObservableList<GianHangCaoCap> list) {
        this.list = list;
    }


    //Lúc này stageReturn đang lưu Stage có thông tin cũ nên sẽ được đóng đi
    @FXML
    void returnStage(ActionEvent event) throws IOException {
        Stage stageSearch = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageSearch.close();
    }


    /*
    Nếu không có try catch/ throws IOException nó sẽ chạy in ra lỗi "Caused by: java.lang.NullPointerException: Cannot invoke "javafx.scene.control.TableColumn.setCellValueFactory(javafx.util.Callback)" because "this.maGianHangC" is null
    at ProjectController.ControllerMainObj.initialize(ControllerMainObj.java:65)"
    */
    @FXML
    void searchMaGianHang(ActionEvent event) throws IOException {
        if (textField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nhập thiếu thông tin");
            return;
        }
        //FilteredList bộ lọc những thứ thõa mãn chứa textField
        FilteredList<GianHangCaoCap> filteredData = new FilteredList<>(list, p -> true);
        filteredData.predicateProperty().bind(Bindings.createObjectBinding(() ->
                o -> o.getMaGianHang().contains(textField.getText()),
                textField.textProperty()
        ));
        tableViewSearch.setItems(filteredData);
    }
}
