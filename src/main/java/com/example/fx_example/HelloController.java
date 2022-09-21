package com.example.fx_example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    public static HelloController INSTANCE = new HelloController();

    private HelloController() {}

    private final List<MyField> fields = new ArrayList<>();

    public void addField(MyField myField){
        this.fields.add(myField);
    }

    public void click(MyField myField) {
        int col = myField.getCol();
        int row = myField.getRow();
        System.out.println("Clicked col="+col+ " row="+row);

        myField.setText("O");
        MyField fieldOnRight = findField(col+1, row);
        fieldOnRight.setText("O");
        MyField fieldOnBottom = findField(col, row+1);
        fieldOnBottom.setText("-");
    }

    private MyField findField(int col, int row) {
        return fields.stream()
                .filter(el -> el.getCol() == col)
                .filter(el -> el.getRow() == row)
                .findFirst().orElseThrow();
    }
}