package com.myshare.core;

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

        setTheme("contacts");

        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();

        layout.addComponent(createToolbar());
        layout.addComponent(horizontalSplit);
        layout.setExpandRatio(horizontalSplit, 1);

        horizontalSplit.setSplitPosition(200, Sizeable.UNITS_PIXELS);
        horizontalSplit.setFirstComponent(tree);

        getMainWindow().setContent(layout);

		
	}
	

    private HorizontalLayout createToolbar() {
        HorizontalLayout lo = new HorizontalLayout();

        lo.setMargin(true);
        lo.setSpacing(true);

        lo.setStyleName("toolbar");

        lo.setWidth("100%");

        Embedded em = new Embedded("", new ThemeResource("images/logo.png"));
        lo.addComponent(em);
        lo.setComponentAlignment(em, Alignment.MIDDLE_RIGHT);
        lo.setExpandRatio(em, 1);

        return lo;
    }

	public void itemClick(ItemClickEvent event) {
		// TODO Auto-generated method stub
		
	}

	public void valueChange(ValueChangeEvent event) {
		// TODO Auto-generated method stub
		
	}

	public void buttonClick(ClickEvent event) {
		// TODO Auto-generated method stub
		
	}

}









