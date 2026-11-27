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
                new Student(1, "YiSang",  "0001"),
                new Student(2, "Faust",  "0002"),
                new Student(3, "Don",  "0003"),
                new Student(4, "Ryoshu",  "0004"),
                new Student(5, "Meursault",  "0005"),
                new Student(6, "HongLu",  "0006"),
                new Student(7, "Heathcliff",  "0007"),
                new Student(8, "Ishmael",  "0008"),
                new Student(9, "Rodion",  "0009"),
                new Student(10, "Dante",  "0010")
        );

        studentTable.setItems(studentList);
    }
}