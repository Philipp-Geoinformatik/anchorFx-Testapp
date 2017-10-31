package com.airbus.miras.anchorFX_testapp;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;

public class MyPane extends Pane {

	public MyPane() {
		setBackground(new Background(
				new BackgroundFill(null, new CornerRadii(0.5), new Insets(1.0))));
		
	}

}
