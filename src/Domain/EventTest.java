package Domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EventTest {
    private Event EventTest = new Event ("1", "test", "04.04.2019",  30, 1550);

    @Test
    void getIDShouldReturnCorrectID(){
        assertEquals("1", EventTest.getId());
    }

    @Test
    void setIDShouldSetCorrectly(){
        EventTest.setId("2");
        assertEquals("2", EventTest.getId());
    }

    @Test
    void getDescriptionShouldReturnCorrectDescription(){
        assertEquals("test", EventTest.getDescription());
    }

    @Test
    void setDescriptionShouldSetCorrectly(){
        EventTest.setDescription("test3");
        assertEquals("test3", EventTest.getDescription());
    }

    @Test
    void getDateReturnCorrectDate() {
        assertEquals("04.04.2019", EventTest.getDate());
    }

    @Test
    void setDateShouldSetCorrectly() {
        EventTest.setDate("05.04.2019");
        assertEquals("05.04.2019", EventTest.getDate());
    }

    @Test
    void getDurationReturnCorrectDuration() {
        assertEquals(30, EventTest.getDuration());
    }

    @Test
    void setDurationShouldSetCorrectly() {
        EventTest.setDuration(60);
        assertEquals(60, EventTest.getDuration());
    }
    @Test
    void getStartTimeReturnCorrectStartTime() {
        assertEquals(1550, EventTest.getStartTime());
    }

    @Test
    void setStartTimeShouldSetCorrectly() {
        EventTest.setStartTime(1630);
        assertEquals(1630, EventTest.getStartTime());
    }
}
