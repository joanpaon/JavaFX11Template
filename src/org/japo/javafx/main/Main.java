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
package org.japo.javafx.main;

import java.io.InputStream;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author JAPO Labs - japolabs@gmail.com
 */
public class Main extends Application {

    // Constants
    public static final String FAVICON = "/org/japo/javafx/images/favicon.png";
    public static final String VIEW = "/org/japo/javafx/views/main-view.fxml";

    // Command Line Arguments
    public static void main(String[] args) {
        Application.launch(args);
    }

    // Application Starting    
    @Override
    public void start(Stage stage) throws Exception {
        // Primary View
        URL urlView = getClass().getResource(VIEW);
        Parent root = FXMLLoader.load(urlView);

        // Primary Scene
        Scene scene = new Scene(root);
        stage.setScene(scene);

        // Favicon
        InputStream favicon = getClass().getResourceAsStream(FAVICON);
        Image image = new Image(favicon);
        stage.getIcons().add(image);        
        
        // Primary Stage
        stage.setTitle("Hello JavaFX!");
        stage.show();
    }
}
