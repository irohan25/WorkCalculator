package com.siddhienterprises.calculator;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    //initializing labels
    @FXML
    public Label nameLabel;
    @FXML
    public Label quantityLabel;
    @FXML
    public Label rateLabel;
    @FXML
    public Label resultLabel;
    @FXML
    public Label sumLabel;
    @FXML
    public Label gstLabel;
    @FXML
    public Label totalLabel;

    //initializing quantity textFields
    @FXML
    public TextField q1;
    @FXML
    public TextField q2;
    @FXML
    public TextField q3;
    @FXML
    public TextField q4;
    @FXML
    public TextField q5;
    @FXML
    public TextField q6;
    @FXML
    public TextField q7;
    @FXML
    public TextField q8;
    @FXML
    public TextField q9;
    @FXML
    public TextField q10;
    @FXML
    public TextField q11;
    @FXML
    public TextField q12;
    @FXML
    public TextField q13;
    @FXML
    public TextField q14;
    @FXML
    public TextField q15;
    @FXML
    public TextField q16;

    //initializing rate textFields
    @FXML
    public TextField rate1;
    @FXML
    public TextField rate2;
    @FXML
    public TextField rate3;
    @FXML
    public TextField rate4;
    @FXML
    public TextField rate5;
    @FXML
    public TextField rate6;
    @FXML
    public TextField rate7;
    @FXML
    public TextField rate8;
    @FXML
    public TextField rate9;
    @FXML
    public TextField rate10;
    @FXML
    public TextField rate11;
    @FXML
    public TextField rate12;
    @FXML
    public TextField rate13;
    @FXML
    public TextField rate14;
    @FXML
    public TextField rate15;
    @FXML
    public TextField rate16;

    //initializing rate textFields
    @FXML
    public TextField result1;
    @FXML
    public TextField result2;
    @FXML
    public TextField result3;
    @FXML
    public TextField result4;
    @FXML
    public TextField result5;
    @FXML
    public TextField result6;
    @FXML
    public TextField result7;
    @FXML
    public TextField result8;
    @FXML
    public TextField result9;
    @FXML
    public TextField result10;
    @FXML
    public TextField result11;
    @FXML
    public TextField result12;
    @FXML
    public TextField result13;
    @FXML
    public TextField result14;
    @FXML
    public TextField result15;
    @FXML
    public TextField result16;

    //initializing final textField
    @FXML
    public TextField sum;
    @FXML
    public TextField gst;
    @FXML
    public TextField totalSum;


    //Initializing Buttons
    @FXML
    public Button calculateBtn;
    @FXML
    public Button clearBtn;


    @FXML
    void Cal(){
        int quantity1,quantity2,quantity3,quantity4,quantity5,quantity6,quantity7,quantity8,quantity9,quantity10,quantity11,quantity12,quantity13,quantity14,quantity15,quantity16;
        double r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16;
        double res1,res2,res3,res4,res5,res6,res7,res8,res9,res10,res11,res12,res13,res14,res15,res16;
        double sum1, gst1, totalSum1;

        quantity1 = Integer.parseInt(q1.getText());
        quantity2 = Integer.parseInt(q2.getText());
        quantity3 = Integer.parseInt(q3.getText());
        quantity4 = Integer.parseInt(q4.getText());
        quantity5 = Integer.parseInt(q5.getText());
        quantity6 = Integer.parseInt(q6.getText());
        quantity7 = Integer.parseInt(q7.getText());
        quantity8 = Integer.parseInt(q8.getText());
        quantity9 = Integer.parseInt(q9.getText());
        quantity10 = Integer.parseInt(q10.getText());
        quantity11 = Integer.parseInt(q11.getText());
        quantity12 = Integer.parseInt(q12.getText());
        quantity13 = Integer.parseInt(q13.getText());
        quantity14 = Integer.parseInt(q14.getText());
        quantity15 = Integer.parseInt(q15.getText());
        quantity16 = Integer.parseInt(q16.getText());

        r1 = Double.parseDouble(rate1.getText());
        r2 = Double.parseDouble(rate2.getText());
        r3 = Double.parseDouble(rate3.getText());
        r4 = Double.parseDouble(rate4.getText());
        r5 = Double.parseDouble(rate5.getText());
        r6 = Double.parseDouble(rate6.getText());
        r7 = Double.parseDouble(rate7.getText());
        r8 = Double.parseDouble(rate8.getText());
        r9 = Double.parseDouble(rate9.getText());
        r10 = Double.parseDouble(rate10.getText());
        r11 = Double.parseDouble(rate11.getText());
        r12 = Double.parseDouble(rate12.getText());
        r13 = Double.parseDouble(rate13.getText());
        r14 = Double.parseDouble(rate14.getText());
        r15 = Double.parseDouble(rate15.getText());
        r16 = Double.parseDouble(rate16.getText());

        res1 = quantity1 * r1;
        res2 = quantity2 * r2;
        res3 = quantity3 * r3;
        res4 = quantity4 * r4;
        res5 = quantity5 * r5;
        res6 = quantity6 * r6;
        res7 = quantity7 * r7;
        res8 = quantity8 * r8;
        res9 = quantity9 * r9;
        res10 = quantity10 * r10;
        res11 = quantity11 * r11;
        res12 = quantity12 * r12;
        res13 = quantity13 * r13;
        res14 = quantity14 * r14;
        res15 = quantity15 * r15;
        res16 = quantity16 * r16;

        result1.setText(String.valueOf(res1));
        result2.setText(String.valueOf(res2));
        result3.setText(String.valueOf(res3));
        result4.setText(String.valueOf(res4));
        result5.setText(String.valueOf(res5));
        result6.setText(String.valueOf(res6));
        result7.setText(String.valueOf(res7));
        result8.setText(String.valueOf(res8));
        result9.setText(String.valueOf(res9));
        result10.setText(String.valueOf(res10));
        result11.setText(String.valueOf(res11));
        result12.setText(String.valueOf(res12));
        result13.setText(String.valueOf(res13));
        result14.setText(String.valueOf(res14));
        result15.setText(String.valueOf(res15));
        result16.setText(String.valueOf(res16));

        sum1 = res1 + res2 + res3 + res4 + res5 + res6 + res7 + res8 + res9 + res10 + res11  + res12 + res13 + res14 + res15 + res16;
        sum.setText(String.valueOf(sum1));

        gst1 = (sum1 * 2.5) / 100 ;
        gst.setText(String.valueOf(gst1));

        totalSum1 = sum1 + gst1 + gst1;
        totalSum.setText(String.valueOf(totalSum1));

    }
    @FXML
    void Clear(){

        q1.setText("");
        q2.setText("");
        q3.setText("");
        q4.setText("");
        q5.setText("");
        q6.setText("");
        q7.setText("");
        q8.setText("");
        q9.setText("");
        q10.setText("");
        q11.setText("");
        q12.setText("");
        q13.setText("");
        q14.setText("");
        q15.setText("");
        q16.setText("");

        rate1.setText("");
        rate2.setText("");
        rate3.setText("");
        rate4.setText("");
        rate5.setText("");
        rate6.setText("");
        rate7.setText("");
        rate8.setText("");
        rate9.setText("");
        rate10.setText("");
        rate11.setText("");
        rate12.setText("");
        rate13.setText("");
        rate14.setText("");
        rate15.setText("");
        rate16.setText("");

        result1.setText("");
        result2.setText("");
        result3.setText("");
        result4.setText("");
        result5.setText("");
        result6.setText("");
        result7.setText("");
        result8.setText("");
        result9.setText("");
        result10.setText("");
        result11.setText("");
        result12.setText("");
        result13.setText("");
        result14.setText("");
        result15.setText("");
        result16.setText("");

        sum.setText("");
        gst.setText("");
        totalSum.setText("");

        q1.requestFocus();

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}