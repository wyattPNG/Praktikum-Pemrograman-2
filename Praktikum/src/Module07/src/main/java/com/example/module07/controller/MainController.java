package com.example.module07.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;

public class MainController {
    @FXML private CustomerController customerTabController;

    @FXML private Tab saleTabContainer;

    @FXML
    public void initialize() {
        saleTabContainer.setOnSelectionChanged(event -> {
            if (saleTabContainer.isSelected() && saleTabContainer != null) {
                saleTabContainer.refreshData();
            }
        });
    }
}
