package ProjectController;

import Views.GianHangCaoCap;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.IntegerStringConverter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerMainObj implements Initializable {
    @FXML
    private TableView<GianHangCaoCap> tableView = new TableView<GianHangCaoCap>();

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
    private ObservableList<GianHangCaoCap> ghccList;

    /*Nếu không có try catch nó sẽ chạy in ra lỗi "Caused by: java.lang.NullPointerException: Cannot invoke "javafx.scene.control.TableColumn.setCellValueFactory(javafx.util.Callback)" because "this.maGianHangC" is null
    at ProjectController.ControllerMainObj.initialize(ControllerMainObj.java:65)" */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            //Đưa vào bảng
            ghccList = FXCollections.observableArrayList(new GianHangCaoCap());
            maGianHangC.setCellValueFactory(new PropertyValueFactory<GianHangCaoCap, String>("maGianHang"));  //Cung cấp cách hiển thị
            viTriC.setCellValueFactory(new PropertyValueFactory<GianHangCaoCap, String>("viTri"));
            dienTichC.setCellValueFactory(new PropertyValueFactory<GianHangCaoCap, Double>("dienTich"));
            soLuongGheC.setCellValueFactory(new PropertyValueFactory<GianHangCaoCap, Integer>("soLuongGhe"));
            soLuongQuatC.setCellValueFactory(new PropertyValueFactory<GianHangCaoCap, Integer>("soLuongQuat"));
            tableView.setItems(ghccList);

            //Edit
            tableView.setEditable(true);
            viTriC.setCellFactory(TextFieldTableCell.forTableColumn());
            //Lưu giá trị mới
            viTriC.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<GianHangCaoCap, String>>() {
                @Override
                public void handle(TableColumn.CellEditEvent<GianHangCaoCap, String> gianHangCaoCapStringCellEditEvent) {
                    GianHangCaoCap gianHangCaoCap = gianHangCaoCapStringCellEditEvent.getRowValue();
                    gianHangCaoCap.setViTri(gianHangCaoCapStringCellEditEvent.getNewValue());
                }
            });

            dienTichC.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter())); //Cần đưa về đúng định dạng
            dienTichC.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<GianHangCaoCap, Double>>() {
                @Override
                public void handle(TableColumn.CellEditEvent<GianHangCaoCap, Double> gianHangCaoCapStringCellEditEvent) {
                    GianHangCaoCap gianHangCaoCap = gianHangCaoCapStringCellEditEvent.getRowValue();
                    gianHangCaoCap.setDienTich(gianHangCaoCapStringCellEditEvent.getNewValue());
                }
            });

            soLuongGheC.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
            soLuongGheC.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<GianHangCaoCap, Integer>>() {
                @Override
                public void handle(TableColumn.CellEditEvent<GianHangCaoCap, Integer> gianHangCaoCapStringCellEditEvent) {
                    GianHangCaoCap gianHangCaoCap = gianHangCaoCapStringCellEditEvent.getRowValue();
                    gianHangCaoCap.setSoLuongGhe(gianHangCaoCapStringCellEditEvent.getNewValue());
                }
            });

            maGianHangC.setCellFactory(TextFieldTableCell.forTableColumn());
            maGianHangC.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<GianHangCaoCap, String>>() {
                @Override
                public void handle(TableColumn.CellEditEvent<GianHangCaoCap, String> gianHangCaoCapStringCellEditEvent) {
                    GianHangCaoCap gianHangCaoCap = gianHangCaoCapStringCellEditEvent.getRowValue();
                    gianHangCaoCap.setMaGianHang(gianHangCaoCapStringCellEditEvent.getNewValue());
                }
            });

            soLuongQuatC.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
            soLuongQuatC.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<GianHangCaoCap, Integer>>() {
                @Override
                public void handle(TableColumn.CellEditEvent<GianHangCaoCap, Integer> gianHangCaoCapStringCellEditEvent) {
                    GianHangCaoCap gianHangCaoCap = gianHangCaoCapStringCellEditEvent.getRowValue();
                    gianHangCaoCap.setSoLuongQuat(gianHangCaoCapStringCellEditEvent.getNewValue());
                }
            });
            //Lưu vào list
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Tạo ra một Stage mới để nhập thông tin và sau đó hiển thị ra màn hình.
    @FXML
    void addGHCC(ActionEvent event) throws IOException {
        FXMLLoader loaderAdd = new FXMLLoader();
        loaderAdd.setLocation(getClass().getResource("/Views/AddGianHangCaoCap.fxml"));
        Parent parentAdd = loaderAdd.load();
        Scene sceneAdd = new Scene(parentAdd);
        AddGianHangCaoCap controller = loaderAdd.getController();
        controller.setList(ghccList);
        Stage stageAdd = new Stage();   //Tạo ra một cửa sổ mới
        stageAdd.setScene(sceneAdd);
        stageAdd.initModality(Modality.APPLICATION_MODAL);
        stageAdd.show(); //Khi đóng mới hiển thị kết quả
    }

    @FXML
    void searchGHCC(ActionEvent event) throws IOException {
        FXMLLoader loaderSearch = new FXMLLoader();
        loaderSearch.setLocation(getClass().getResource("/Views/SearchGianHangCaoCap.fxml"));
        Parent parentSearch = loaderSearch.load();
        Scene sceneSearch = new Scene(parentSearch);
        SearchGianHangCaoCap controller = loaderSearch.getController();
        controller.setTableViewSeaerch(ghccList);
        Stage stageSearch = new Stage();   //Tạo ra một cửa sổ mới
        stageSearch.setScene(sceneSearch);
        stageSearch.initModality(Modality.APPLICATION_MODAL);
        stageSearch.showAndWait(); //Khi đóng mới hiển thị kết quả
    }

    @FXML
    void deleteGianHangCaoCap(ActionEvent event) {
        GianHangCaoCap slected = tableView.getSelectionModel().getSelectedItem();
        ghccList.remove(slected);
    }

}
