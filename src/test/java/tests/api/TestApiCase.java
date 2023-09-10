package tests.api;

import baseEntities.BaseApiTest;
import com.google.gson.Gson;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.Cases;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Endpoints;

import static io.restassured.RestAssured.given;

public class TestApiCase extends BaseApiTest {
    @Test
    public void addCase(){
        int sectionId = 1;
        Gson gson = new Gson();
        Cases expectedCase = Cases.builder()
                .titleCase("TestCase1")
                .sectionId(1)
                .templateId(2)
                .typeId(1)
                .priorityId(2)
                .build();
        Response response = given()
                .body(expectedCase, ObjectMapperType.GSON)
                .pathParam("section_id",sectionId)
                .post(Endpoints.ADD_CASE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();
        Cases actualCase = gson.fromJson(response.getBody().asString(), Cases.class);
        System.out.println(actualCase.toString());
        Assert.assertTrue(expectedCase.equals(actualCase));
    }
    @Test
    public void getCase(){
        int caseId = 1;
        Gson gson = new Gson();
        Cases expectedCase = Cases.builder()
                .titleCase("TestCase1")
                .sectionId(1)
                .templateId(2)
                .typeId(1)
                .priorityId(2)
                .build();
        Response response = given()
                .body(expectedCase, ObjectMapperType.GSON)
                .pathParam("case_id",caseId)
                .get(Endpoints.GET_CASE);
        Cases actualCase = gson.fromJson(response.getBody().asString(), Cases.class);
        System.out.println(actualCase.toString());
        Assert.assertTrue(expectedCase.equals(actualCase));
    }
    @Test
    public void updateCase(){
        int caseId = 1;
        Gson gson = new Gson();
        Cases expectedCase = Cases.builder()
                .titleCase("TestCase100")
                .sectionId(1)
                .templateId(2)
                .typeId(1)
                .priorityId(2)
                .build();
        Response response = given()
                .body(expectedCase, ObjectMapperType.GSON)
                .pathParam("case_id",caseId)
                .post(Endpoints.UPDATE_CASE);
        Cases actualCase = gson.fromJson(response.getBody().asString(), Cases.class);
        System.out.println(actualCase.toString());
        Assert.assertTrue(expectedCase.equals(actualCase));
    }
    @Test
    public void deleteCase(){
        int caseId = 1;
        given()
                .pathParam("case_ad",caseId)
                .when()
                .post(Endpoints.DELETE_CASE)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}