package tests.api;

import baseEntities.BaseApiTest;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.Milestone;
import models.Project;
import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utils.Endpoints;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class TestMilestoneApi extends BaseApiTest {
    static Logger logger = LogManager.getLogger(TestMilestoneApi.class);

        @Test
        public void addMilestone(){
            int projectId = 1;
            Milestone expectedMilestone = Milestone.builder()
                    .milestoneName("TestMilestone 1")
                    .milestoneDescription("My Milestone")
                    .build();
            Response response = given()
                    .body(expectedMilestone, ObjectMapperType.GSON)
                    .pathParam("project_id",projectId)
                    .when()
                    .post(Endpoints.ADD_MILESTONE)
                    .then()
                    .log().body()
                    .statusCode(HttpStatus.SC_OK)
                    .body("name",is(expectedMilestone.getMilestoneName()))
                    .extract()
                    .response();
        }
    @Test
    public void getMilestone(){
        int projectId = 1;
        Response response = given()
                .pathParam("project_id",projectId)
                .when()
                .get(Endpoints.GET_MILESTONES)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();
    }

    @Test
    public void updateMilestone(){
        int milestoneId = 58;
        Milestone expectedMilestone = Milestone.builder()
                .milestoneName("TestMilestone 2")
                .milestoneDescription("My Milestone")
                .build();
        Response response = given()
                .body(expectedMilestone, ObjectMapperType.GSON)
                .pathParam("milestone_id",milestoneId)
                .when()
                .post(Endpoints.UPDATE_MILESTONE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .body("description",is(expectedMilestone.getMilestoneDescription()))
                .extract()
                .response();
    }

    @Test
    public void deleteMilestone() {
        int milestoneId = 58;
        given()
                .pathParam("milestone_id", milestoneId)
                .when()
                .post(Endpoints.DELETE_MILESTONE)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}
