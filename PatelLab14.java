package javatestfx;

// Author: Yash Patel
// Creation Date: April 22nd, 2021
// Purpose: To create a program that utilizes the JavaFX GUI with Mouse clicks.

// Test Data: Please see the bottom of the page for test inputs and outputs 

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;


/**
 *  Coin game application
 */

public class PatelLab14 extends Application
{
   // Creating private labels 
  
   private Label greeting;
   private Label resultText;

   // private variable for calculating the total
   private double coins = 0.0;
   
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
     
   
      // Create a Label to display a prompt.
      Label greeting = new Label("Click Coin Combinations to $1.00. The coins from left to right are:" +
      " \npenny, nickel, dime, quarter, half dollar. When you are done click here.");
      greeting.setFont(new Font("Arial", 14));
      
      // Create Image objects for the coins.
      Image penny = new Image("Penny.png");
      Image nickel = new Image("Nickel.png");
      Image dime = new Image("Dime.png");
      Image quarter = new Image("Quarter.png");
      Image halfDollar = new Image("HalfDollar.png");


      
      // Create an ImageView object.
      ImageView imageView1 = new ImageView(penny);
      
      // Resize the ImageView, preserving its aspect ratio.
      imageView1.setFitWidth(200);
      imageView1.setPreserveRatio(true);
      
      
      // Create an ImageView object.
      ImageView imageView2 = new ImageView(nickel);
      
      // Resize the ImageView, preserving its aspect ratio.
      imageView2.setFitWidth(200);
      imageView2.setPreserveRatio(true);
      
      
      
      // Create an ImageView object.
      ImageView imageView3 = new ImageView(dime);
      
      // Resize the ImageView, preserving its aspect ratio.
      imageView3.setFitWidth(200);
      imageView3.setPreserveRatio(true);



      // Create an ImageView object.
      ImageView imageView4 = new ImageView(quarter);
      
      // Resize the ImageView, preserving its aspect ratio.
      imageView4.setFitWidth(200);
      imageView4.setPreserveRatio(true);
      
      
       // Create an ImageView object.
      ImageView imageView5 = new ImageView(halfDollar);
      
      // Resize the ImageView, preserving its aspect ratio.
      imageView5.setFitWidth(200);
      imageView5.setPreserveRatio(true);


      
      
      
      // Put the ImageView in an HBox.
      HBox imageHBox = new HBox( imageView1, imageView2, imageView3, imageView4, imageView5);
      
      // Center the HBox contents.
      imageHBox.setAlignment(Pos.CENTER);
      
      //registering an event handler for mouse clicks for the corresponding imageView object
      imageView1.setOnMouseClicked(event -> 
        {
         coins+=0.01;
      });
    //registering an event handler for mouse clicks for the corresponding imageView object  
      imageView2.setOnMouseClicked(event -> 
      {
         coins+=0.05;
      });
    //registering an event handler for mouse clicks for the corresponding imageView object  
      imageView3.setOnMouseClicked(event -> 
      {
         coins+=0.10;
      });
     //registering an event handler for mouse clicks for the corresponding imageView object 
       imageView4.setOnMouseClicked(event -> 
      {
         coins+=0.25;
      });
   //registering an event handler for mouse clicks for the corresponding imageView object   
       imageView5.setOnMouseClicked(event -> 
      {
         coins+=0.50;
      });
      // vreating bank label that can be changed based on the output from the if statement below
      resultText = new Label();

//registering an event handler for mouse clicks for the corresponding label object
      greeting.setOnMousePressed(event -> 
      {
        //if statement to check if the total coins selected equal exactly $1.00
         if (coins == 1.00)
         {
         // Create a Label to display a prompt.
           resultText.setText(String.format("You won! Your total is $%,.2f!\n"+
                        "Click the coins to play again.", coins));
           resultText.setFont(new Font("Arial", 14));
           //reset coin counter
           coins = 0.0;

         }
        // if coins does not equal $1.00 , all other combinations follow this 
         else
         {
         // Create a Label to display a prompt.
           resultText.setText(String.format("Sorry you did not get exactly $1.00! \nYour total is $%,.2f.\n"+
                        "Click the coins to play again.", coins));
           resultText.setFont(new Font("Arial", 14));
           //reset coin counter
           coins =0.0;
         }
         
         
      });

       
      // Put the HBoxs, calcButton, and points in a VBox.
      VBox vbox = new VBox( greeting, imageHBox, resultText);
      
      //align vbox in the center
      vbox.setAlignment(Pos.CENTER);

            
            
      // Create a 700x300 scene to hold all the objects
      Scene scene = new Scene(vbox, 1000, 500);


      // Add the Scene to the Stage.
     primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("$1 Coin Game");
      
      // Show the window.
      primaryStage.show();   
   }
     
   
}

/* 
Test Data for Lab 14

- All coin combinations work 
______________________________________________________________________
One combo where user wins:

Input: 2 half dollars

Output: Winner Label and Coins is reset to 0.00 for new round
_______________________________________________________________________
One Combo were user loses: 

Input: 1 penny

Output: Loser Label and Coins is reset to 0.00 for new round



*/
