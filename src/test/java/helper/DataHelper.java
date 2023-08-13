package helper;

import models.InfoUser;
import models.User;
import org.apache.logging.log4j.Logger;
import tests.EndToEndTest_hw;
import utils.configuration.ReadProperties;
import org.apache.logging.log4j.LogManager;

public class DataHelper {
     static Logger logger = LogManager.getLogger(DataHelper.class);
    public static User getStandartUser() {
        User user = new User();
        user.setUserName(ReadProperties.username());
        user.setPassword(ReadProperties.originalPassword());

        logger.info(user.toString());
        return user;
    }
    public static User failUserName() {
        User user = new User();
        user.setUserName(ReadProperties.failUserName());
        user.setPassword(ReadProperties.originalPassword());

        logger.info(user.toString());
        return user;
    }

    public static InfoUser getCommonProject() {
        InfoUser infoUser =  InfoUser.builder()
                .firstName("Helen")
                .lastName("Sereda")
                .code("123")
                .build();

        logger.info (infoUser.toString());
        return infoUser;
    }

}