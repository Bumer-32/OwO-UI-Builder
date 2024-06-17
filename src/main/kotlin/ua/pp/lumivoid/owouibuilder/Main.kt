package ua.pp.lumivoid.owouibuilder

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.image.Image
import javafx.stage.Stage
import org.slf4j.LoggerFactory

class Main : Application() {
    private val logger = LoggerFactory.getLogger(this.javaClass)

    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(javaClass.getResource("views/main-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        stage.title = "OwO UI Builder"
        stage.scene = scene
        stage.icons.add(Image(javaClass.getResourceAsStream("icons/owo.png")))
        stage.show()

        logger.trace("This is a trace message");
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
        println("This in an println")
    }
}

fun main() {
    Application.launch(Main::class.java)
}