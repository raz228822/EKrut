package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import java.util.ArrayList;

public class ViewReportsController extends AbstractController {

    /**
     *
     * @param event
     */
    public void stockStatusReportsBtnClick(ActionEvent event) {
        // mock object
        ArrayList arr = new ArrayList<String>();
        ObservableList data = FXCollections.observableArrayList();
        data.add("Qiryat Ata");data.add("Karmiel");


        try {
            switchScreen("StockReportPanel","Stock Reports Panel");
            
        } catch (Exception e) {
// TODO: handle exception
            e.printStackTrace();
        }
    }

    /**
     *
     * @param event
     */
    public void OrderReportsBtnClick(ActionEvent event) {
        try {
            switchScreen("OrderReport","Order Reports Panel");
        } catch (Exception e) {
// TODO: handle exception
            e.printStackTrace();
        }
    }

    /**
     *
     * @param event
     */
    public void customerReportsBtnClick(ActionEvent event) {
        try {
            switchScreen("CustomersReport","Customers Reports Panel");
        } catch (Exception e) {
// TODO: handle exception
            e.printStackTrace();
        }
    }

}
