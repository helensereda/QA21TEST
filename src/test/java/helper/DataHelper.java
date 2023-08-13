package helper;

import models.InfoUser;
import models.User;
import utils.configuration.ReadProperties;

public class DataHelper {

    public static User getStandartUser() {
        User user = new User();
        user.setUserName(ReadProperties.standartUserName());
        user.setPassword(ReadProperties.originalPassword());

        return user;
    }
    public static User failUserName() {
        User user = new User();
        user.setUserName(ReadProperties.failUserName());
        user.setPassword(ReadProperties.originalPassword());

        return user;
    }

    public static InfoUser getCommonProject() {
        InfoUser infoUser =  InfoUser.builder()
                .firstName("Helen")
                .lastName("Sereda")
                .code("123")
                .build();

        return infoUser;
    }

}