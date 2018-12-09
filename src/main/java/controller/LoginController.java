package controller;

import app.App;
import app.Login;
import config.ConstantConfig;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginController {

  public AnchorPane apSecureQuestion;
  public AnchorPane apLogin;
  public ComboBox<String> cbQuestions;
  public TextField tfAnswer;
  public Button btOK;
  public Button btCancel;
  public Label lbSecureQuestion;

  @FXML
  private ProgressIndicator progressIndicator;

  @FXML
  private PasswordField pfPass;
  @FXML
  private Label lbErrorLogin;
  @FXML
  private TextField tfUser;
  private boolean isLoginPressed = false;


  @FXML
  void login(ActionEvent event) {
    if (ConstantConfig.FAKE){
      startMain();
    }
  }

  private void startMain() {
    new App().start(new Stage());
    Login.getmStage().close();
  }

  @FXML
  void initialize() {
    pfPass.setOnKeyReleased((KeyEvent key) -> {
      if (key.getCode() == KeyCode.ENTER) {
        login(null);
      }
    });
  }

  public void forgotPassword(ActionEvent event) {

  }

  public void ok(ActionEvent event) {

  }

  public void cancel(ActionEvent event) {

  }
}
