import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//For java.time.LocalDateTime, uses LocalDateTime.now()

public class Times {

    private String UserId = "TestUserId";
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH:mm:ssK");

    private LocalDateTime now = LocalDateTime.now();
    private String channelListName = "list_" + dtf.format(now) + "_" + UserId;

    public Times() {
    }


    public String getChannelListName() {
        return channelListName;
    }

}
