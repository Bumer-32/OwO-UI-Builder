module ua.pp.lumivoid.owouibuilder {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires org.slf4j;


    opens ua.pp.lumivoid.owouibuilder to javafx.fxml;
    exports ua.pp.lumivoid.owouibuilder;
}