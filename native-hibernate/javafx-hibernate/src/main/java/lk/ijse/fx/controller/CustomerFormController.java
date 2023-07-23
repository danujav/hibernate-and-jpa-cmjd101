package lk.ijse.fx.controller;

/*
    @author DanujaV
    @created 7/23/23 - 9:16 AM   
*/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.ijse.fx.business.BoType;
import lk.ijse.fx.business.FactoryBo;
import lk.ijse.fx.business.custom.CustomerBo;
import lk.ijse.fx.business.custom.impl.CustomerBoImpl;
import lk.ijse.fx.dto.CustomerDto;

public class CustomerFormController {
    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtSalary;

    private CustomerBo customerBo = FactoryBo.getBo(BoType.CUSTOMER);

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {
        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        double salary = Double.parseDouble(txtSalary.getText());

        CustomerDto customerDto = new CustomerDto(id, name, address, salary);

        try {
            boolean isSaved = customerBo.saveCustomer(customerDto);
            if(isSaved) {
                new Alert(Alert.AlertType.CONFIRMATION, "Customer saved!").show();
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }
    }
}