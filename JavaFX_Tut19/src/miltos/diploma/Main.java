package miltos.diploma;

import com.aquafx_project.AquaFx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    TableView<Product> table;
    Button add;
    Button delete;
    TextField nameInput, priceInput,quantityInput;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("thenewboston - JavaFX");
        
        // Change the template
        AquaFx.style();
        // Create the componenets
        // Name Input
        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(100);
        
        // Price Input
        priceInput = new TextField();
        priceInput.setPromptText("Price");
        priceInput.setMinWidth(100);
        // Quantity Input
        quantityInput = new TextField();
        quantityInput.setPromptText("Quantity");
        quantityInput.setMinWidth(100);
        // Buttons
        add = new Button("Add");
        delete = new Button("Delete");
        
        // Create the listeners...
        add.setOnAction(e -> addButtonClicked());
        delete.setOnAction(e -> deleteButtonClicked());
        
        //Name column
        TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        //Price column
        TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        //Quantity column
        TableColumn<Product, String> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

        // Create the horizontal layout that is going to be placed at the bottom of tht scene!!
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, priceInput, quantityInput, add, delete);
        
        // Create the general layout of the scene!!
        VBox vBox = new VBox();
        vBox.getChildren().addAll(table, hBox);
        
     
        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
    }
    
    private void addButtonClicked(){
    	Product tempProduct = new Product();
    	tempProduct.setName(nameInput.getText());
    	tempProduct.setPrice(Double.parseDouble(priceInput.getText()));
    	tempProduct.setQuantity(Integer.parseInt(quantityInput.getText()));
    	
    	table.getItems().add(tempProduct);
    	
    	/* Alternativelly : 
    	ObservableList<Product> products = table.getItems();
    	products.add(tempProduct);
    	*/
    }
    
    //Delete button clicked
    public void deleteButtonClicked(){
        ObservableList<Product> productSelected, allProducts;
        allProducts = table.getItems();
        productSelected = table.getSelectionModel().getSelectedItems();

        productSelected.forEach(allProducts::remove);
    }

    //Get all of the products
    public ObservableList<Product> getProduct(){
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("Laptop", 859.00, 20));
        products.add(new Product("Bouncy Ball", 2.49, 198));
        products.add(new Product("Toilet", 99.00, 74));
        products.add(new Product("The Notebook DVD", 19.99, 12));
        products.add(new Product("Corn", 1.49, 856));
        return products;
    }


}