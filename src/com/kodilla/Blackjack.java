package com.kodilla;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Blackjack extends Application {
    private Image imageback = new Image("file:resources/table_crop.jpg");
    private Image card = new Image("file:resources/2trefl.jpg");
    private Image card2 = new Image("file:resources/2trefl.jpg", 100, 100, true, true);
    private Image card3 = new Image("file:resources/2trefl.jpg", 100, 100, true, true);
    private Image card4 = new Image("file:resources/2trefl.jpg", 100, 100, true, true);

    private FlowPane cards = new FlowPane(Orientation.HORIZONTAL, 5.0, 5.0);
    private FlowPane cards2 = new FlowPane(Orientation.HORIZONTAL);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setPadding(new Insets(8, 12.5, 13.5, 10));
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setBackground(background);

        ImageView img = new ImageView(card);
        img.setFitHeight(100);
        img.setPreserveRatio(true);
        cards.getChildren().add(img);
        ImageView img2 = new ImageView(card2);
        cards.getChildren().add(img2);
        ImageView img3 = new ImageView(card3);
        cards.getChildren().add(img3);
        ImageView img4 = new ImageView(card4);
        cards2.getChildren().add(img4);

        grid.add(cards, 0, 0, 20, 20);
        grid.add(cards2, 0, 20, 20, 20);

        Scene scene = new Scene(grid, 1600, 900, Color.BLACK);

        primaryStage.setTitle("BlackJack");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
