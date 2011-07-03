package com.myshare.core;

import org.apache.xalan.xsltc.runtime.MessageHandler;

import com.myshare.forms.MyLoginForm;
import com.myshare.forms.RegisterForm;
import com.vaadin.Application;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.terminal.Sizeable;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class MyShareApplication extends Application implements
ClickListener, ValueChangeListener, ItemClickListener {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -8348580599341774118L;
	private NavigationTree tree = new NavigationTree(this);

	private  Button register = new Button("Register");
	

    private Label heading = new Label("My Share");

	
    private HorizontalSplitPanel horizontalSplit = new HorizontalSplitPanel();

	
	@Override
	public void init() {

        buildMainLayout();

/*		
		MyLoginForm loginform = new MyLoginForm();
		mainWindow.addComponent(loginform);
		setMainWindow(mainWindow);
*/	
		}
	
	private void buildMainLayout() {
		// TODO Auto-generated method stub
		
        setMainWindow(new Window("Whats My Share"));
        

        setTheme("myshare");


        Boolean loggedIn = hasLoggedIn();
        
       if(loggedIn){ 
        
        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();

        layout.addComponent(createToolbar());
        layout.addComponent(horizontalSplit);
        layout.setExpandRatio(horizontalSplit, 1);

        horizontalSplit.setSplitPosition(200, Sizeable.UNITS_PIXELS);
        horizontalSplit.setFirstComponent(tree);

        getMainWindow().setContent(layout);

       }
	}
	

    private Boolean hasLoggedIn() {
    	
    	Boolean loggedIn = false;
    	
    	MyLoginForm myLoginForm = new MyLoginForm();
    	
    	VerticalLayout layout = new VerticalLayout();
    	//layout.setSizeFull();
    	layout.addStyleName("loginBox");
    	getMainWindow().showNotification(
                ("You have not logged Please login"));
    	layout.addComponent(myLoginForm);
    	
    	layout.addComponent(register);

    	register.addListener((ClickListener) this);
    	
    	getMainWindow().setContent(layout);
    	
    	
    	return loggedIn;
	}

    
    private HorizontalLayout createToolbar() {
        HorizontalLayout lo = new HorizontalLayout();

        lo.addComponent(heading);
        lo.setStyleName("toolbar");
  
        lo.setWidth("100%");


        return lo;
    }

	public void itemClick(ItemClickEvent event) {
		// TODO Auto-generated method stub
		
	}

	public void valueChange(ValueChangeEvent event) {
		// TODO Auto-generated method stub
		
	}

	public void buttonClick(ClickEvent event) {

        final Button source = event.getButton();

        if (source == register) {
            displayRegisterForm();
        }
		
	}
	
	private void displayRegisterForm() {

		
		RegisterForm registerForm = new RegisterForm();
    	
    	VerticalLayout layout = new VerticalLayout();
    	//layout.setSizeFull();
    	layout.addStyleName("loginBox");
    	layout.addComponent(registerForm);
    	layout.addComponent(register);
  	  
    	
    	getMainWindow().setContent(layout);
    	
		
	}



}









