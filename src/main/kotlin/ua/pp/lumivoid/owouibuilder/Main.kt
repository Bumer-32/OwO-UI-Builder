package ua.pp.lumivoid.owouibuilder

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.image.Image
import javafx.stage.Stage
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class Main : Application() {
    private val logger: Logger = LoggerFactory.getLogger("TEST")

    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(javaClass.getResource("views/main-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        stage.title = "OwO UI Builder"
        stage.scene = scene
        stage.icons.add(Image(javaClass.getResourceAsStream("icons/owo.png")))
        stage.show()

        logger.info("test")
    }
}

fun main() {
    Application.launch(Main::class.java)
}