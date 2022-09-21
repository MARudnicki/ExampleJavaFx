package com.example.fx_example;

import javafx.scene.control.Button;

public class MyField extends Button {

    private int col, row;

    public MyField(String text, int col, int row) {
        setText(text);
        this.col = col;
        this.row = row;
        setOnMouseClicked(event -> HelloController.INSTANCE.click(this));
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}
