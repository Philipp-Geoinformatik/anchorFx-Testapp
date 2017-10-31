package com.airbus.miras.anchorFX_testapp;

import com.anchorage.docks.node.DockNode;
import com.anchorage.docks.stations.DockStation;
import com.anchorage.system.AnchorageSystem;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane mainPane = new BorderPane();
		
		//create DockStation and adding it to mainPane
		DockStation dockStation = new DockStation();
		mainPane.setCenter(dockStation);
		mainPane.setTop(new MyMenuBar());
		//left docking area
		DockNode node1 = AnchorageSystem.createDock("MyPane", new MyPane());
		node1.dock(dockStation, DockNode.DockPosition.LEFT);
		node1.resizableProperty().set(true);
		node1.maximizableProperty().set(true);
		node1.floatableProperty().set(true);
		node1.closeableProperty().set(true);
		
		
		//right docking area
		DockNode node2 = AnchorageSystem.createDock("HTML Editor", new HTMLEditor());
		node2.dock(dockStation, DockNode.DockPosition.RIGHT);
		node2.resizableProperty().set(false);
		
		// create scene with docking parts
		Scene pimaryScene = new Scene(mainPane, 800,600);
		
		// create Menu
		
		// show application
		primaryStage.setTitle("My AchnchorFX TestApplication");
		primaryStage.setScene(pimaryScene);
		primaryStage.centerOnScreen();
		primaryStage.show();
	}
}
