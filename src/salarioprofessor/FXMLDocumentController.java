package salarioprofessor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLDocumentController {
String nome;
Integer nivel;
Float hora, salario;

    @FXML
    private Button button;

    @FXML
    private TextField cxnome;

    @FXML
    private TextField cxnivel;

    @FXML
    private TextField cxhoras;

    @FXML
    private Label label;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private TextArea cxresult;

    @FXML
    private Label label3;

    @FXML
    void calcular(ActionEvent event) {
        nome=String.valueOf(cxnome.getText());
        nivel=Integer.valueOf(cxnivel.getText());
        hora=Float.valueOf(cxhoras.getText());
        cxresult.setText(verificaSalario(salario));
        
    }

    private String verificaSalario(Float salario) {
        String sal=null;
        
        if (nivel == 1)
            sal=" Olá, " +nome+ "! seu salario é de "+hora*36+".";
        else if (nivel == 2)
            sal=" Olá, " +nome+ "! seu salario é de "+hora*41+".";
        else if (nivel == 3)
            sal=" Olá, " +nome+ "! seu salario é de "+hora*47+".";
        else
            sal="Nivel invalido. Digite as opções de nivel: 1, 2 ou 3.";
        return sal;
    }

}
