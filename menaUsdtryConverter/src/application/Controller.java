package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextArea cnv_price_display;

    @FXML
    private TextField exc_rate;

    @FXML
    void b_convert(ActionEvent event) {
    	double dollar = Double.valueOf(exc_rate.getText());
    	cnv_price_display.setText(
    			"U.S. Price - MENA USD/TRY Converted \n\n"
    			+"0.99 USD - "+String.valueOf(0.89*dollar)+" TRY \n"
    			+"1.99 USD - "+String.valueOf(1.49*dollar)+" TRY \n"
    			+"2.99 USD - "+String.valueOf(1.99*dollar)+" TRY \n"
    			+"3.99 USD - "+String.valueOf(2.49*dollar)+" TRY \n"
    			+"4.99 USD - "+String.valueOf(2.99*dollar)+" TRY \n"
    			+"5.99 USD - "+String.valueOf(3.59*dollar)+" TRY \n"
    			+"6.99 USD - "+String.valueOf(3.99*dollar)+" TRY \n"
    			+"7.99 USD - "+String.valueOf(4.49*dollar)+" TRY \n"
    			+"8.99 USD - "+String.valueOf(4.99*dollar)+" TRY \n"
    			+"9.99 USD - "+String.valueOf(5.79*dollar)+" TRY \n"
    			+"10.99 USD - "+String.valueOf(6.29*dollar)+" TRY \n"
    			+"11.99 USD - "+String.valueOf(6.59*dollar)+" TRY \n"
    			+"12.99 USD - "+String.valueOf(7.29*dollar)+" TRY \n"
    			+"13.99 USD - "+String.valueOf(7.79*dollar)+" TRY \n"
    			+"14.99 USD - "+String.valueOf(7.99*dollar)+" TRY \n"
    			+"15.99 USD - "+String.valueOf(8.49*dollar)+" TRY \n"
    			+"16.99 USD - "+String.valueOf(8.99*dollar)+" TRY \n"
    			+"17.99 USD - "+String.valueOf(9.29*dollar)+" TRY \n"
    			+"18.99 USD - "+String.valueOf(9.89*dollar)+" TRY \n"
    			+"19.99 USD - "+String.valueOf(10.49*dollar)+" TRY \n"
    			+"24.99 USD - "+String.valueOf(12.49*dollar)+" TRY \n"
    			+"29.99 USD - "+String.valueOf(14.99*dollar)+" TRY \n"
    			+"34.99 USD - "+String.valueOf(17.99*dollar)+" TRY \n"
    			+"39.99 USD - "+String.valueOf(18.99*dollar)+" TRY \n"
    			+"44.99 USD - "+String.valueOf(20.99*dollar)+" TRY \n"
    			+"49.99 USD - "+String.valueOf(22.99*dollar)+" TRY \n"
    			+"54.99 USD - "+String.valueOf(25.99*dollar)+" TRY \n"
    			+"59.99 USD - "+String.valueOf(25.99*dollar)+" TRY \n"
    			+"64.99 USD - "+String.valueOf(29.99*dollar)+" TRY \n"
    			+"69.99 USD - "+String.valueOf(32.99*dollar)+" TRY \n"
    			+"74.99 USD - "+String.valueOf(34.99*dollar)+" TRY \n"
    			+"79.99 USD - "+String.valueOf(36.99*dollar)+" TRY \n"
    			+"84.99 USD - "+String.valueOf(38.99*dollar)+" TRY \n"
    			+"89.99 USD - "+String.valueOf(41.99*dollar)+" TRY \n"
    			+"99.99 USD - "+String.valueOf(45.99*dollar)+" TRY \n"
    			+"119.99 USD - "+String.valueOf(55.99*dollar)+" TRY \n"
    			+"129.99 USD - "+String.valueOf(59.99*dollar)+" TRY \n"
    			+"149.99 USD - "+String.valueOf(69.99*dollar)+" TRY \n"
    			+"199.99 USD - "+String.valueOf(92.99*dollar)+" TRY \n\n"
    			+"You can check the MENA prices at: \nhttps://steamdb.info/blog/steam-turkey-argentina-usd/"
    			);
    }

}
