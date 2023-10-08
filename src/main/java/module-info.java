module bcs.csc325.capstonetesting {
    requires javafx.controls;
    requires javafx.fxml;

    opens bcs.csc325.capstonetesting to javafx.fxml;
    exports bcs.csc325.capstonetesting;
}
