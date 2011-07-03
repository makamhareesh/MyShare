package com.myshare.forms;

import java.util.Arrays;

import com.myshare.util.dataStoreHelper;
import com.myshare.vo.PersonVO;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Form;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.themes.BaseTheme;

public class RegisterForm  extends VerticalLayout{
	
    // the 'POJO' we're editing
    PersonVO person;
    
    dataStoreHelper dsHelper = new dataStoreHelper();
    
    public RegisterForm(){
    	
        person = new PersonVO(); // a person POJO
        BeanItem<PersonVO> personItem = new BeanItem<PersonVO>(person); // item from
                                                                    // POJO

        // Create the Form
        final Form personForm = new Form();
        personForm.setCaption("Personal details");
        personForm.setWriteThrough(false); // we want explicit 'apply'
        personForm.setInvalidCommitted(false); // no invalid values in datamodel

        personForm.setItemDataSource(personItem); // bind to POJO via BeanItem

        // Determines which properties are shown, and in which order:
        personForm.setVisibleItemProperties(Arrays.asList(new String[] {
                "name", "login_id", "email", "password"
                }));

        // Add form to layout
        addComponent(personForm);

        // The cancel / apply buttons
        HorizontalLayout buttons = new HorizontalLayout();
        buttons.setSpacing(true);
        Button discardChanges = new Button("Discard changes",
                new Button.ClickListener() {
                    public void buttonClick(ClickEvent event) {
                        personForm.discard();
                    }
                });
        discardChanges.setStyleName(BaseTheme.BUTTON_LINK);
        buttons.addComponent(discardChanges);
        buttons.setComponentAlignment(discardChanges, Alignment.MIDDLE_LEFT);

        Button apply = new Button("Apply", new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {
                try {
                	
                	Boolean userAdded = dsHelper.addUser(personForm);
                	
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        buttons.addComponent(apply);
        personForm.getFooter().addComponent(buttons);
        personForm.getFooter().setMargin(false, false, true, true);

    }

}
