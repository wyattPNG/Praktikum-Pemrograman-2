package com.example.module06;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudentController {
    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, String> studentIdCol;

    @FXML
    private TableColumn<Student, String> nameCol;

    @FXML
    public void initialize() {
        studentIdCol.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        ObservableList<Student> studentList = FXCollections.observableArrayList(
                new Student(1, "YiSang",  "129993"),
                new Student(2, "Faust",  "1283"),
                new Student(3, "Don",  "12345"),
                new Student(4, "Ryoshu",  "12333"),
                new Student(5, "Meursault",  "1233"),
                new Student(6, "HongLu",  "123"),
                new Student(7, "Heathcliff",  "123123"),
                new Student(8, "Ishmael",  "1232"),
                new Student(9, "Rodion",  "1232"),
                new Student(10, "Sinclair",  "1225")
        );

        studentTable.setItems(studentList);
    }
}
