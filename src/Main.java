
import Domain.EventValidator;
import Repository.EventRepository;
import Service.EventService;
import UI.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UI/mainWindow.fxml"));
        Parent root = fxmlLoader.load();

        EventValidator eventValidator = new EventValidator();

        EventRepository eventRepository = new EventRepository(eventValidator);

        EventService eventService = new EventService(eventRepository);


        MainController mainController =  fxmlLoader.getController();
        mainController.setServices(eventService);

        primaryStage.setTitle("Event manager");
        primaryStage.setScene(new Scene(root, 600, 475));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
