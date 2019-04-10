package UI;

import java.lang.Math;
import Domain.Event;
import Service.EventService;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MainController {

    public TableView tblEvent;
    public TableColumn colIdEvent;
    public TableColumn colDescription;
    public TableColumn colDate;
    public TableColumn colDuration;
    public TableColumn colStartTime;
    public TextField txtId;
    public TextField txtDescription;
    public TextField txtDate;
    public TextField txtDuration;
    public TextField txtStartTime;
    public Button btnAddEvent;


    private EventService eventService;

    private ObservableList<Event> events = FXCollections.observableArrayList();

    public void setServices(EventService eventService) {
        this.eventService = eventService;
    }


    @FXML
    private void initialize() {

        Platform.runLater(() -> {
            events.addAll(eventService.getAll());
            tblEvent.setItems(events);
        });
    }


    public void btnAddEventClick(ActionEvent actionEvent) {
        try {
            String id = txtId.getText();
            String description = txtDescription.getText();
            String date = txtDate.getText();
            int duration = Integer.parseInt(txtDuration.getText());
            int startTime = Integer.parseInt(txtStartTime.getText());

            eventService.insert(id, description, date, duration, startTime);

            events.clear();
            events.addAll(eventService.getAll());
        } catch (RuntimeException rex) {
            Common.showValidationError(rex.getMessage());
        }
    }
}


