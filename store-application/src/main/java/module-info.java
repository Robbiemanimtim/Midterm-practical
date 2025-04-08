module org.rocs.sta {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.rocs.sta to javafx.fxml;
    exports org.rocs.sta;
}