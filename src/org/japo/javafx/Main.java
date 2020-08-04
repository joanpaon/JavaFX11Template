/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.japo.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author JAPO Labs - japolabs@gmail.com
 */
public class Main extends Application {

    // Argumentos Línea de Comandos
    public static void main(String[] args) {
        Application.launch(args);
    }

    // Punto de Inicio de la Aplicación    
    @Override
    public void start(Stage stage) throws Exception {
        // Componentes Vista
        String version = System.getProperty("java.version");
        Label lblText = new Label("Hello, JavaFX is running on Java" + version);

        // Contenedor Principal
        StackPane root = new StackPane();
        root.getChildren().addAll(lblText);

        // Escena Primaria
        Scene scene = new Scene(root, 300, 200);

        // Escenario Primario
        stage.setTitle("Hello JavaFX!");
        stage.setScene(scene);
        stage.show();
    }
}
