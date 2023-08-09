module com.java.practice.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.java.practice.javafxdemo to javafx.fxml;
    exports com.java.practice.javafxdemo;
}