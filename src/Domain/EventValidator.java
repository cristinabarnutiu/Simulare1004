package Domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class EventValidator {

    public void validate(Event event) throws DateFormatException {

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            format.parse(event.getDate());
        } catch (ParseException pe) {
            throw new DateFormatException("The date is not in a correct format!");
        }

    }

}