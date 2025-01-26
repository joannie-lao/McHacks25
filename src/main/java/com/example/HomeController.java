package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import java.util.List;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import com.example.models.GameManager;
import com.example.models.Habit;

public class HomeController {

    @FXML
    private void switchToStore() throws IOException {
        App.setRoot("store");
    }
    @FXML
    private VBox habitsContainer;
    private List<Habit> habits = GameManager.getInstance().getUser().getHabits();

    @FXML
    public void initialize(){
        populateHabits();
    }

    private void populateHabits(){
        for (Habit habit : habits){
            CheckBox checkbox = new CheckBox();
            checkbox.setGraphic(createHabitIcon(habit.getCompleted()));
            checkbox.setText("");

            // Add event listener to update the habit status when clicked
            checkbox.setOnAction(event -> {
                boolean newStatus = checkbox.isSelected();
                if(newStatus){
                    habit.isCompleted();
                } else {
                    habit.incomplete();
                }

                // Update the icon based on the new status
                checkbox.setGraphic(createHabitIcon(habit.getCompleted()));
            });

            // Set initial state based on the habit's checked status
            checkbox.setSelected(habit.getCompleted());

            // Add the checkbox to the VBox
            habitsContainer.getChildren().add(checkbox);
        }

        }
        private ImageView createHabitIcon(boolean checked){
            ImageView icon = new ImageView();
            icon.setFitWidth(20);
            icon.setFitHeight(20);
            icon.setImage(new Image(getClass().getResource(checked ? "/com/example/checkboxChecked.png" : "/com/example/checkboxUnchecked.png").toExternalForm()));
            return icon;
        }
    }