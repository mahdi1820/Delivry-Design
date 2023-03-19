package application;
	
import javafx.animation.FillTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;

import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Image icon0 =new Image(getClass().getResourceAsStream("icon3.png"));
//********************************************************************************************************
			Image back1 =new Image(getClass().getResourceAsStream("del.jpg"));
			BackgroundImage bgImage = new BackgroundImage(
					back1,
					BackgroundRepeat.NO_REPEAT,
					BackgroundRepeat.NO_REPEAT,
					BackgroundPosition.CENTER,
					new BackgroundSize(100,100,false,false,true,false)
					);
			Background bg = new Background(bgImage);
//********************************************************************************************************			
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER_RIGHT);
		    grid.setVgap(10);
		    grid.setHgap(10);
		    Text text1 = new Text("Welcome to our delivery service page");
			text1.setTranslateX(-75);
			
			Label lbl1 = new Label("Adress:");
			lbl1.setTranslateX(20);
			Label lbl2 = new Label("Email:Exempel@delivery.com");
			lbl2.setTranslateX(20);
			Label lbl3 = new Label("Tel:0000000000");
			lbl3.setTranslateX(20);
			
			Text lbl4 = new Text("Delivering Happiness and Needs");
			lbl4.setFont(new Font("Book Antiqua Italic",20));
			lbl4.setTranslateX(0);
			lbl4.setTranslateY(0);
			lbl4.setStyle("-fx-background-color: #fce49c;");
	        grid.add(lbl4, 0, 14);
//********************************************************************************************************	        
	        Button send = new Button("Send");
			send.setTranslateX(30);
			send.setOnAction(new EventHandler<ActionEvent>() {
	             public void handle(ActionEvent event) {
	             Stage Stage =new Stage ();
	             GridPane grid2 = new GridPane();
	             grid2.setAlignment(Pos.CENTER);
	                grid2.setVgap(5);
	                grid2.setHgap(5);
	                Image send =new Image(getClass().getResourceAsStream("send.png"));
	                Text welcomText=new Text("Send an order");
	                welcomText.setFont(new Font("Book Antiqua Italic",50));
	                welcomText.setTranslateX(-40);
	                grid2.add(welcomText, 1, 0);
	                Label nom1 = new Label("First name:");
	                grid2.add(nom1, 0, 4);
	                TextField Nom0= new TextField();
	                Nom0.setPromptText("");
	                grid2.add(Nom0,1,4);
	                Label pren1 =new Label("Last name:" );
	                grid2.add(pren1, 0, 5);
	                TextField Nom1= new TextField();
	                Nom1.setPromptText("");
	                grid2.add(Nom1,1,5);
	                Label tel=new Label("Tel:");
	                grid2.add(tel, 0, 6);
	                TextField Nom2= new TextField();
	                Nom2.setPromptText("");
	                grid2.add(Nom2,1,6);
	                Label em1 = new Label("Email:");
	                 grid2.add(em1, 0, 7);
	                TextField Nom3= new TextField();
	                Nom3.setPromptText("");
	                grid2.add(Nom3,1,7);
	                Label pass1=new Label("Wilaya:");
	                grid2.add(pass1, 0, 8);
	                TextField Nom4= new TextField();
	                Nom4.setPromptText("");
	                grid2.add(Nom4,1,8);
                    Label da =new Label("City:");
	                grid2.add(da, 0, 9);
	                TextField Nom5= new TextField();
	                Nom5.setPromptText("");
	                grid2.add(Nom5,1,9);
	                Label lo = new Label("Location:");
	                grid2.add(lo, 0,10);
	                TextField Nom7= new TextField();
	                Nom7.setPromptText("");
	                grid2.add(Nom7,1,10);
	                Label ct = new Label("Order Type: ");
	                grid2.add(ct, 0,11);
	                TextField area = new TextField();
	                grid2.add(area, 1, 11);
	                Label login2 = new Label();
	                grid2.add(login2,0,16);
	                login2.setTranslateX(100);
	                login2.setTranslateY(-35);
//********************************************************************************************************	                
	                Button save = new Button("Save");
	                save.setOnAction(e->{
			        	 if(Nom0.getText().isEmpty()) {
			        		 Nom0.setStyle("-fx-background-color:FE5454;");
			        	 }
			        	 else
			        		 Nom0.setStyle("-fx-background-color:#6EFE54;"); 
			        	 if(Nom1.getText().isEmpty()) {
			        		 Nom1.setStyle("-fx-background-color:FE5454;");
			        	 }
			        	 else
			        		 Nom1.setStyle("-fx-background-color:#6EFE54;"); 
			        	 if(Nom2.getText().isEmpty()) {
			        		 Nom2.setStyle("-fx-background-color:FE5454;");
			        	 }
			        	 else
			        		 Nom2.setStyle("-fx-background-color:#6EFE54;"); 
			        	 if(Nom3.getText().isEmpty()) {
			        		 Nom3.setStyle("-fx-background-color:FE5454;"); 
			        	 }
			        	 else
			        		 Nom3.setStyle("-fx-background-color:#6EFE54;"); 
			        	if(Nom4.getText().isEmpty()) {
			        		 Nom4.setStyle("-fx-background-color:FE5454;");
			        	 }
			        	 else
			        		 Nom4.setStyle("-fx-background-color:#6EFE54;"); 
			        	 if(Nom7.getText().isEmpty()) {
			        		 Nom7.setStyle("-fx-background-color:FE5454;"); 
			        	 }
			        	 else
			        		 Nom7.setStyle("-fx-background-color:#6EFE54;"); 
			        	 if(area.getText().isEmpty()) {
			        		 area.setStyle("-fx-background-color:FE5454;");
			        	 }
			        	 else
			        		 area.setStyle("-fx-background-color:#6EFE54;"); 
			        	 if(!Nom0.getText().equals("") && !Nom1.getText().equals("") && !Nom2.getText().equals("")
			        			 && !Nom3.getText().equals("") && !Nom4.getText().equals("") &&
			        			 !Nom7.getText().equals("") &&
			        			 !area.getText().equals("")) {
			        		 login2.setText("Saved");
			        		 login2.setStyle("-fx-background-color : #6EFE54;");
			        	 }
			         });
	                save.setTranslateX(200);
	                grid2.add(save, 0, 15);
//********************************************************************************************************
	                Button ann = new Button("Clear");
	                ann.setOnAction(e->{
	                	Nom0.setText("");
	                	Nom1.setText("");
	                	Nom2.setText("");
	                	Nom3.setText("");
	                	Nom4.setText("");
	                	Nom5.setText("");
	                	Nom7.setText("");
	                	area.setText("");
	                	login2.setText("");
	                	Nom0.setStyle("-fx-background-color:#FCF3CF;");
	                	Nom1.setStyle("-fx-background-color:#FCF3CF;");
	                	Nom2.setStyle("-fx-background-color:#FCF3CF;");
	                	Nom3.setStyle("-fx-background-color:#FCF3CF;");
	                	Nom4.setStyle("-fx-background-color:#FCF3CF;");
	                	Nom7.setStyle("-fx-background-color:#FCF3CF;");
	                	area.setStyle("-fx-background-color:#FCF3CF;");
	                });
	                ann.setTranslateX(200);
	                grid2.add(ann, 1, 15);
//********************************************************************************************************
	                BorderPane root3 = new  BorderPane();
	                root3.setStyle("-fx-background-color:black;");
	                root3.setCenter(grid2);
	                root3.setPadding(new Insets(20,20,20,20));
	                Scene scene=new Scene(root3,520,520);
	                Stage.getIcons().add(send);
	                root3.setStyle("-fx-background-color: #fce49c;");
	                scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	                Stage.initModality(Modality.APPLICATION_MODAL);
	                Stage.setTitle("Inscripte");
	                Stage.setResizable(false);
	                Stage.setScene(scene);
	                Stage.show();
	                 }});
//********************************************************************************************************			
			Button rec = new Button("Receive");
			rec.setTranslateX(30);
			rec.setOnAction(new EventHandler<ActionEvent>() {
	             public void handle(ActionEvent event) {
	             Stage Stage =new Stage ();
	             GridPane grid2 = new GridPane();
	             grid2.setAlignment(Pos.CENTER);
	                grid2.setVgap(5);
	                grid2.setHgap(5);
	                grid2.setPadding(new Insets(10));
	                Image receive =new Image(getClass().getResourceAsStream("receive.png"));
	                Text welcomText=new Text("Receive an order");
	                welcomText.setFont( new Font("Book Antiqua Italic",50));
	                welcomText.setTranslateX(-40);
	                grid2.add(welcomText, 1, 0);
	                Label nem = new Label("Order number:");
	                grid2.add(nem, 0, 3);
	                TextField Nem0= new TextField();
	                Nem0.setPromptText("");
	                grid2.add(Nem0,1,3);
	                Label nom1 = new Label("First name:");
	                grid2.add(nom1, 0, 4);
	                TextField Nom1= new TextField();
	                Nom1.setPromptText("");
	                grid2.add(Nom1,1,4);
	                Label pren1 =new Label("Last name:" );
	                grid2.add(pren1, 0, 5);
	                TextField Nom2= new TextField();
	                Nom2.setPromptText("");
	                grid2.add(Nom2,1,5);
	                Label tel=new Label("Tel: ");
	                grid2.add(tel, 0, 6);
	                TextField Nom3= new TextField();
	                Nom3.setPromptText("");
	                grid2.add(Nom3,1,6);
	                Label em1 = new Label("Email:");
	                grid2.add(em1, 0, 7);
	                TextField Nom4= new TextField();
	                Nom4.setPromptText("");
	                grid2.add(Nom4,1,7);
	                Label ct = new Label("Order Type: ");
	                grid2.add(ct, 0,8);
	                TextField area1 = new TextField();
	                grid2.add(area1, 1, 8);
	                Label dc = new Label("Discount code: ");
	                grid2.add(dc, 0,9);
	                TextField dc2 = new TextField();
	                grid2.add(dc2, 1, 9);
	                dc2.setEditable(false);
	                Label login2 = new Label();
	                grid2.add(login2,0,12);
	                login2.setTranslateX(100);
	                login2.setTranslateY(-35);
//********************************************************************************************************
	                Button save = new Button("Save");
	                save.setOnAction(e->{
			        	 if(Nem0.getText().isEmpty()) {
			        		 Nem0.setStyle("-fx-background-color:#FE5454;");
			        	 }
			        	 else
			        		 Nem0.setStyle("-fx-background-color:#6EFE54;"); 
			        	 
			        	 if(Nom1.getText().isEmpty()) {
			        		 Nom1.setStyle("-fx-background-color:#FE5454;");
			        	 }
			        	 else
			        		 Nom1.setStyle("-fx-background-color:#6EFE54;"); 
			        	 
			        	 if(Nom2.getText().isEmpty()) {
			        		 Nom2.setStyle("-fx-background-color:#FE5454;");
			        	 }
			        	 else
			        		 Nom2.setStyle("-fx-background-color:#6EFE54;");
			        	 
			        	 if(Nom3.getText().isEmpty()) {
			        		 Nom3.setStyle("-fx-background-color:#FE5454;");
			        	 }
			        	 else
			        		 Nom3.setStyle("-fx-background-color:#6EFE54;");
			        	 
			        	 if(Nom4.getText().isEmpty()) {
			        		 Nom4.setStyle("-fx-background-color:#FE5454;");
			        	 }
			        	 else
			        		 Nom4.setStyle("-fx-background-color:#6EFE54;");
			        	 
			        	 if(area1.getText().isEmpty()) {
			        		 area1.setStyle("-fx-background-color:#FE5454;");
			        	 }
			        	 else
			        		 area1.setStyle("-fx-background-color:#6EFE54;");
			        	 
			        	 if(!Nem0.getText().equals("") && !Nom1.getText().equals("") && !Nom2.getText().equals("")
			        			 && !Nom3.getText().equals("") && !Nom4.getText().equals("") &&
			        			 !area1.getText().equals("")) {
			        		 
			        		 login2.setText("Saved");
			        		 login2.setStyle("-fx-background-color : #6EFE54;");
			        	 }
			        	 else
			        		 login2.setText("");
			         });
	                save.setTranslateX(250);
	                grid2.add(save, 0, 11);
//********************************************************************************************************
	                Button ann = new Button("Clear");
	                ann.setOnAction(e->{
	                	Nem0.setText("");
	                	Nom1.setText("");
	                	Nom2.setText("");
	                	Nom3.setText("");
	                	Nom4.setText("");
	                	area1.setText("");
	                	login2.setText("");
	                	Nem0.setStyle("-fx-background-color:#FCF3CF;");
	                	Nom1.setStyle("-fx-background-color:#FCF3CF;");
	                	Nom2.setStyle("-fx-background-color:#FCF3CF;");
	                	Nom3.setStyle("-fx-background-color:#FCF3CF;");
	                	Nom4.setStyle("-fx-background-color:#FCF3CF;");
	                	area1.setStyle("-fx-background-color:#FCF3CF;");
	                	
	                });
	                ann.setTranslateX(230);
	                grid2.add(ann, 1, 11);
//********************************************************************************************************
	                BorderPane root4 = new  BorderPane();
	                root4.setCenter(grid2);
	                Scene scene=new Scene(root4,550,480);
	                root4.setPadding(new Insets(20,20,20,20));
	                Stage.getIcons().add(receive);
	                root4.setStyle("-fx-background-color:#fce49c;");
	                scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	                Stage.initModality(Modality.APPLICATION_MODAL);
	                Stage.setTitle("Inscripte");
	                Stage.setResizable(false);
	                Stage.setScene(scene);
	                Stage.show();
	                 }});
//********************************************************************************************************
			Button con = new Button("Iog in");
			con.setTranslateX(600);
			con.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
			     Stage Stage =new Stage ();
			      Image icon1 =new Image(getClass().getResourceAsStream("user.png"));
			      GridPane grid2 = new GridPane();
			      grid2.setAlignment(Pos.CENTER);
			         grid2.setVgap(10);
			         grid2.setHgap(10);
			         Text welcomText=new Text("Log in");
			         welcomText.setFont( new Font("Book Antiqua Italic",50));
			         welcomText.setTranslateX(-25);
			         grid2.add(welcomText, 1, 0);
			         Label Email=new Label("Email:");
			         Email.setTranslateX(92);
			         grid2.add(Email, 0, 3);
			         TextField txtEm= new TextField();
			         txtEm.setTranslateX(0);
			         grid2.add(txtEm,1,3);
			         Label pass=new Label("Password:");
			         pass.setTranslateX(92);
			         grid2.add(pass, 0, 4);
			         PasswordField txtpass= new PasswordField();
			         txtpass.setTranslateX(0);
			         grid2.add(txtpass,1,4);
			         Button con1 = new Button("Connection");
			         con1.setOnAction(e->{
			        	 Label login =new Label();
			        	 grid2.add(login, 1, 8);
			        	 if(txtEm.getText().equals("")) {
			        		 txtEm.setStyle("-fx-background-color:#FE5454;");
			        	 }
			        	 else
			        		 txtEm.setStyle("-fx-background-color:#6EFE54;"); 
			        	 if(txtpass.getText().equals("") || txtpass.getText().length()<8) {
			        		 txtpass.setStyle("-fx-background-color:#FE5454;");
			        	 }
			        	 else
			        		 txtpass.setStyle("-fx-background-color:#6EFE54;");
			        	 if(!txtEm.getText().equals("") && !txtpass.getText().equals(""))
			        		 {
			        		 
			        		 login.setText("");
			        		 login.setStyle("-fx-background-color:#FCF3CF;");
			        		 login.setText("Login Cerrect");
			        		 login.setStyle("-fx-background-color: #6EFE54;");
			        		 
			                }
			        	 else
			        		 
			        		 login.setText("");
			        	     login.setStyle("-fx-background-color: #FCF3CF;");
			        	     login.setText("Login in Cerrect");
			        	     login.setStyle("-fx-background-color: #FE5454;");
			        	     
			        });
			         con1.setTranslateX(50);
			         grid2.add(con1, 1, 6);
//********************************************************************************************************    
			     Button con2 = new Button("Create an account");
		         Image ma =new Image(getClass().getResourceAsStream("man.png"));
		         Image wo =new Image(getClass().getResourceAsStream("woman.png"));
		         Image icon2 =new Image(getClass().getResourceAsStream("login-.png"));
		         grid2.add(con2, 0, 6);
		         con2.setTranslateX(40);
		         con2.setOnAction(new EventHandler<ActionEvent>() {
		             public void handle(ActionEvent event) {
		             Stage Stage =new Stage ();
		             GridPane grid2 = new GridPane();
		             grid2.setAlignment(Pos.CENTER);
		                grid2.setVgap(10);
		                grid2.setHgap(10);
		                grid2.setPadding(new Insets(10));
		                Text welcomText=new Text("Information");
		                welcomText.setFont( new Font("Book Antiqua Italic",50));
		                welcomText.setTranslateX(-70);
		                grid2.add(welcomText, 1, 0);
		                Label nom = new Label("First name:");
		                nom.setTranslateX(0);
		                grid2.add(nom, 0, 4);
		                TextField Nom0= new TextField();
		                Nom0.setPromptText("");
		                grid2.add(Nom0,1,4);
		                Label pren =new Label("Last name:" );
		                pren.setTranslateX(0);
		                grid2.add(pren, 0, 5);
		                TextField Nom1= new TextField();
		                Nom1.setPromptText("");
		                grid2.add(Nom1,1,5);
		                Label user=new Label("User name: ");
		                user.setTranslateX(0);
		                grid2.add(user, 0, 6);
		                TextField Nom2= new TextField();
		                Nom2.setPromptText("");
		                grid2.add(Nom2,1,6);
		                Label em = new Label("Email:");
		                em.setTranslateX(0);
		                grid2.add(em, 0, 7);
		                TextField Nom3= new TextField();
		                Nom3.setPromptText("");
		                grid2.add(Nom3,1,7);
		                Label pass1=new Label("Password:");
		                pass1.setTranslateX(0);
		                grid2.add(pass1, 0, 8);
		                PasswordField Nom4= new PasswordField();
		                Nom4.setPromptText("more than 8 letters");
		                grid2.add(Nom4,1,8);
		                Label pass2=new Label("Remamber Password:");
		                grid2.add(pass2, 0, 9);
		                PasswordField Nom5= new PasswordField();
		                Nom5.setPromptText("");
		                grid2.add(Nom5,1,9);
		                Label se = new Label("Sex:");
		                se.setTranslateX(0);
		                grid2.add(se, 0,10);
		                RadioButton rdb1 =new RadioButton();
		                rdb1.setTranslateX(60);
		                RadioButton rdb2 =new RadioButton();
		                rdb2.setTranslateX(60);
		                ImageView se1 = new ImageView(ma);
		                ImageView se2 = new ImageView(wo);
		                HBox hbox3 = new HBox();
		                hbox3.setSpacing(10);
		                hbox3.getChildren().addAll(rdb1,se1,rdb2,se2);
		                grid2.add(hbox3, 1, 10);
		                Label login2 = new Label();
		                grid2.add(login2,0,13);
		                login2.setTranslateX(0);
		                login2.setTranslateY(-45);
//********************************************************************************************************
		                Button con3 = new Button("Connection");
		                con3.setOnAction(e->{
				        	 if(Nom0.getText().isEmpty()) {
				        		 Nom0.setStyle("-fx-background-color:#FE5454;");
				        	     }
				        	 else
				        		 Nom0.setStyle("-fx-background-color:#6EFE54;");   
				        	 if(Nom1.getText().isEmpty()) {
				        		 Nom1.setStyle("-fx-background-color:#FE5454;");
				        		 }
				        	 else
				        		 Nom1.setStyle("-fx-background-color:#6EFE54;");  
				        	 if(Nom2.getText().isEmpty()) {
				        		 Nom2.setStyle("-fx-background-color:#FE5454;");
				        	     }
				        	 else
				        		 Nom2.setStyle("-fx-background-color:#6EFE54;"); 
				        	  if(Nom3.getText().isEmpty()) {
				        		 Nom3.setStyle("-fx-background-color:#FE5454;");
				        	}
				        	 else
				        		 Nom3.setStyle("-fx-background-color:#6EFE54;"); 
				        	 if(Nom4.getText().isEmpty() || Nom4.getText().length()<8) {
				        		 Nom4.setStyle("-fx-background-color:#FE5454;");
				        	}
				        	 else
				        		 Nom4.setStyle("-fx-background-color:#6EFE54;"); 
				        	 if(Nom5.getText().isEmpty() || Nom5.getText().length()<8) {
				        		 Nom5.setStyle("-fx-background-color:#FE5454;");
				        	}
				        	 else
				        		 Nom5.setStyle("-fx-background-color:#6EFE54;");  
				        	 if(Nom0.getText().isEmpty() && Nom1.getText().isEmpty() && Nom2.getText().isEmpty()
				        			 && Nom3.getText().isEmpty() && Nom4.getText().isEmpty() &&
				        			 Nom5.getText().isEmpty() && !rdb1.isSelected() || !rdb2.isSelected())
				        		 {
				        		 
				        		 login2.setText("");
				        		 login2.setText("Login in Cerrect");
				        		 login2.setStyle("-fx-background-color: #FE5454;");
				        	 }
				        	 else
				        		 
				        		 login2.setText("");
				        		 login2.setText("Login Cerrect");
				        	     login2.setStyle("-fx-background-color: #6EFE54;");
				         });
//********************************************************************************************************
		                Button ann = new Button("Clear");
		                ann.setOnAction(e->{
		                	Nom0.setText("");
		                	Nom1.setText("");
		                	Nom2.setText("");
		                	Nom3.setText("");
		                	Nom4.setText("");
		                	Nom5.setText("");
		                	
		                	login2.setText("");
		                	Nom0.setStyle("-fx-background-color:#FCF3CF;");
		                	Nom1.setStyle("-fx-background-color:#FCF3CF;");
		                	Nom2.setStyle("-fx-background-color:#FCF3CF;");
		                	Nom3.setStyle("-fx-background-color:#FCF3CF;");
		                	Nom4.setStyle("-fx-background-color:#FCF3CF;");
		                	Nom5.setStyle("-fx-background-color:#FCF3CF;");
		                });
		                ann.setTranslateX(320);
		                grid2.add(ann, 0, 12);
	            con3.setTranslateX(150);
	            grid2.add(con3, 0, 12);
//********************************************************************************************************
	            BorderPane root2 = new  BorderPane();
	            root2.setPadding(new Insets(10,10,10,10));
	            root2.setCenter(grid2);
	            Scene scene=new Scene(root2,520,500);
	            Stage.getIcons().add(icon2); 
	            scene.getStylesheets().add(getClass().getResource("creat.css").toExternalForm());
	            Stage.initModality(Modality.APPLICATION_MODAL);
	            Stage.setTitle("Information");
	            Stage.setResizable(false);
	            Stage.setScene(scene);
	            Stage.show();
	             }});
//********************************************************************************************************        
         BorderPane root1=new  BorderPane();
         root1.setCenter(grid2);
         root1.setPadding(new Insets(10,10,10,10));
         Scene scene=new Scene(root1,500,350);
         scene.getStylesheets().add(getClass().getResource("login.css").toExternalForm());
         Stage.initModality(Modality.WINDOW_MODAL);
         Stage.setTitle("Login");
         Stage.getIcons().add(icon1);
         Stage.setResizable(false);
         Stage.setScene(scene);
         Stage.show();
          }});
//********************************************************************************************************
			Image ser =new Image(getClass().getResourceAsStream("24-2.png"));
			ImageView se3 = new ImageView(ser);
//********************************************************************************************************
			TranslateTransition app = new TranslateTransition();
			app.setDuration(Duration.seconds(0.8));
			app.setNode(lbl4);
			app.setByY(50);
			app.setCycleCount(-1);
			app.setAutoReverse(true);
			app.play();
//********************************************************************************************************
			FillTransition fill = new FillTransition();
			fill.setDuration(Duration.seconds(1.5));
			fill.setShape(text1);
			fill.setFromValue(Color.BLACK);
			fill.setToValue(Color.CORAL);
			fill.setCycleCount(-1);
			fill.setAutoReverse(true);
			fill.play();
//********************************************************************************************************
			FillTransition fill1 = new FillTransition();
			fill1.setDuration(Duration.seconds(1.5));
			fill1.setShape(lbl4);
			fill1.setFromValue(Color.BLACK);
			fill1.setToValue(Color.CORAL);
			fill1.setCycleCount(-1);
			fill1.setAutoReverse(true);
			fill1.play();
//********************************************************************************************************
			RotateTransition rotate = new RotateTransition();
	        rotate.setDuration(Duration.seconds(1.5));
	        rotate.setNode(se3);
	        rotate.setByAngle(180);
	        rotate.setCycleCount(-1);
	        rotate.setAutoReverse(true);
	        rotate.play();
//********************************************************************************************************
            HBox hbox =new HBox();
			hbox.getChildren().addAll(se3,con,text1);
//********************************************************************************************************
			VBox vbox = new VBox();
			vbox.getChildren().addAll(lbl1,lbl2,lbl3);
			vbox.setSpacing(10);
			grid.add(vbox, 0, 28);
//********************************************************************************************************
			HBox hbox1 =new HBox();
			hbox1.setSpacing(20);
			hbox1.getChildren().addAll(send,rec);
		    grid.add(hbox1, 0, 12);
//********************************************************************************************************
			BorderPane root0 = new BorderPane();
			root0.setPadding(new Insets(30,20,20,20));
			root0.setCenter(grid);
			BorderPane.setAlignment(grid, Pos.CENTER_RIGHT);
			root0.setTop(hbox);
			BorderPane.setAlignment(hbox, Pos.CENTER_RIGHT);
			root0.setBackground(bg);
			Scene scene = new Scene(root0,800,563);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.getIcons().add(icon0);
			primaryStage.setResizable(false);
		    primaryStage.setTitle("Delivery service");
			primaryStage.setScene(scene);
			primaryStage.show();
//********************************************************************************************************
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
