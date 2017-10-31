package com.airbus.miras.anchorFX_testapp;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MyMenuBar extends MenuBar {

	public MyMenuBar() {
		MenuItem i1 = new MenuItem("Add new Pane");
		MenuItem i2 = new MenuItem("Create new Stage");
		i2.setOnAction(e -> {
			System.out.println("sdfdsfdsfsf");
			
			Scene scene = new Scene(new MyPane(), 600, 600);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.centerOnScreen();
			stage.show();
			
		});

		Menu m1 = new Menu("Menu");
		m1.getItems().addAll(i1, i2);
		getMenus().add(m1);

	}

}
