module com.alfaisal.syncopation {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    requires java.sql;

    opens com.alfaisal.syncopation to javafx.fxml;
    exports com.alfaisal.syncopation;
}