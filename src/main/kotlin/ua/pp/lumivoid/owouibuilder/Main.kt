package ua.pp.lumivoid.owouibuilder

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.image.Image
import javafx.stage.Stage

class Main : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(javaClass.getResource("views/main-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        stage.title = "OwO UI Builder"
        stage.scene = scene
        stage.icons.add(Image(javaClass.getResourceAsStream("icons/owo.png")))
        stage.show()
    }
}

fun main() {
    Application.launch(Main::class.java)
}