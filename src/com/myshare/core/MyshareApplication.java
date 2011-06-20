package com.myshare.core;

import com.myshare.forms.MyLoginForm;
import com.vaadin.Application;
import com.vaadin.terminal.ExternalResource;
import com.vaadin.ui.*;
import com.vaadin.ui.UriFragmentUtility.FragmentChangedEvent;
import com.vaadin.ui.UriFragmentUtility.FragmentChangedListener;
import com.vaadin.ui.Window.CloseEvent;
import com.vaadin.ui.Window.CloseListener;

public class MyshareApplication extends Application {
	@Override
	public void init() {
		
		setMainWindow(new MyShareWindow());
		
/*		
		MyLoginForm loginform = new MyLoginForm();
		mainWindow.addComponent(loginform);
		setMainWindow(mainWindow);
*/	
		}
	class MyShareWindow extends Window {
		
		MyShareWindow(){
			
			
			
		}
		
	}

}









