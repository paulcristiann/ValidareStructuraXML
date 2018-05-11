package main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilePermission;
import java.io.IOException;
import java.net.URL;


public class Controller {

    public Label xmlUzualLabel;
    public Label xmlPRLabel;
    public Label xmlSVLabel;
    public Label xmlTaxiLabel;

    @FXML
    private void xmlUzual(){
        System.out.println("XML Uzual");

        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

            File f = new File("scheme/xmlUzual.xsd");

            Schema schema = factory.newSchema(f);

            Validator validator = schema.newValidator();

            FileChooser fileChooser = new FileChooser();
            File selectedFile = fileChooser.showOpenDialog(null);

            validator.validate(new StreamSource(selectedFile));
            xmlUzualLabel.setText("Validat!");

        } catch (IOException e){
            System.out.println(e.getMessage());
            xmlUzualLabel.setText(e.getMessage());
        }catch(SAXException e1){
            xmlUzualLabel.setText(e1.getMessage());
            System.out.println("SAX Exception: "+e1.getMessage());
        }


    }

    @FXML
    private void xmlPR(){
        System.out.println("XML Perioada de raportare");
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

            File f = new File("scheme/xmlPR.xsd");

            Schema schema = factory.newSchema(f);

            Validator validator = schema.newValidator();

            FileChooser fileChooser = new FileChooser();
            File selectedFile = fileChooser.showOpenDialog(null);

            validator.validate(new StreamSource(selectedFile));
            xmlPRLabel.setText("Validat!");

        } catch (IOException e){
            System.out.println(e.getMessage());
            xmlPRLabel.setText(e.getMessage());
        }catch(SAXException e1){
            xmlPRLabel.setText(e1.getMessage());
            System.out.println("SAX Exception: "+e1.getMessage());
        }
    }

    @FXML
    private void xmlSV(){
        System.out.println("XML Schimb Valutar");
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

            File f = new File("scheme/xmlSV.xsd");

            Schema schema = factory.newSchema(f);

            Validator validator = schema.newValidator();

            FileChooser fileChooser = new FileChooser();
            File selectedFile = fileChooser.showOpenDialog(null);

            validator.validate(new StreamSource(selectedFile));
            xmlSVLabel.setText("Validat!");

        } catch (IOException e){
            System.out.println(e.getMessage());
            xmlSVLabel.setText(e.getMessage());
        }catch(SAXException e1){
            xmlSVLabel.setText(e1.getMessage());
            System.out.println("SAX Exception: "+e1.getMessage());
        }
    }

    @FXML
    private void xmlTaxi(){
        System.out.println("XML Taxi");
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

            File f = new File("scheme/xmlTaxi.xsd");

            Schema schema = factory.newSchema(f);

            Validator validator = schema.newValidator();

            FileChooser fileChooser = new FileChooser();
            File selectedFile = fileChooser.showOpenDialog(null);

            validator.validate(new StreamSource(selectedFile));
            xmlTaxiLabel.setText("Validat!");

        } catch (IOException e){
            System.out.println(e.getMessage());
            xmlTaxiLabel.setText(e.getMessage());
        }catch(SAXException e1){
            xmlTaxiLabel.setText(e1.getMessage());
            System.out.println("SAX Exception: "+e1.getMessage());
        }
    }


}
