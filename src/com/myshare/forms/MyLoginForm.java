package com.myshare.forms;
import com.myshare.util.dataStoreHelper;
import com.vaadin.ui.LoginForm;
import com.vaadin.ui.LoginForm.LoginEvent;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window.Notification;

@SuppressWarnings("serial")
public class MyLoginForm extends VerticalLayout {

    public MyLoginForm() {
    	
    	final dataStoreHelper dsHelper = new dataStoreHelper();

        LoginForm login = new LoginForm();
        login.setWidth("100%");
        login.setHeight("300px");
        login.addListener(new LoginForm.LoginListener() {
            public void onLogin(LoginEvent event) {
            	
            	String username = event.getLoginParameter("username");
            	String password = event.getLoginParameter("password");
            	Boolean userExists = dsHelper.checkUser(username, password);
            	
            	if(userExists){
                getWindow().showNotification(
                        "New Login",
                        "Welcome : " + event.getLoginParameter("username")
                               );
            } else {
            	  getWindow().showNotification(
                          "Error Login",
                          "User Does not exists : Please register ",Notification.TYPE_ERROR_MESSAGE
                                 );
            }
            	}
        });
        addComponent(login);

    }
}