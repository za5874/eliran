package controller;

import javax.swing.JFrame;

import boundry.LoginGUI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class userController {
    @FXML
    private Button lgoBtn;

    @FXML
	static public void logout(){
    	LoginGUI.err = false;
		LoginGUI log = new LoginGUI();
			log.setSize(550,320);
			log.setVisible(true);
		    log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

}

	public void checkDetails() {
		// TODO - implement userController.checkDetails
		throw new UnsupportedOperationException();
	}

	public void addBookToOrderList() {
		// TODO - implement userController.addBookToOrderList
		throw new UnsupportedOperationException();
	}

	public void setDetails() {
		// TODO - implement userController.setDetails
		throw new UnsupportedOperationException();
	}

	public void openReaderAccount() {
		// TODO - implement userController.openReaderAccount
		throw new UnsupportedOperationException();
	}

	public void checkPrivilege() {
		// TODO - implement userController.checkPrivilege
		throw new UnsupportedOperationException();
	}

	/**
	 * enables to set a new user's privilege
	 */
	public void setPrivilege() {
		// TODO - implement userController.setPrivilege
		throw new UnsupportedOperationException();
	}

	public void setUserDetails() {
		// TODO - implement userController.setUserDetails
		throw new UnsupportedOperationException();
	}

	public void getUserDetails() {
		// TODO - implement userController.getUserDetails
		throw new UnsupportedOperationException();
	}

	public void checkOrderDetails() {
		// TODO - implement userController.checkOrderDetails
		throw new UnsupportedOperationException();
	}

	public void makeTheOrder() {
		// TODO - implement userController.makeTheOrder
		throw new UnsupportedOperationException();
	}

	public void extendSubscription() {
		// TODO - implement userController.extendSubscription
		throw new UnsupportedOperationException();
	}

	public void changePrivilege() {
		// TODO - implement userController.changePrivilege
		throw new UnsupportedOperationException();
	}

	public void insertToDB() {
		// TODO - implement userController.insertToDB
		throw new UnsupportedOperationException();
	}

	public void legalDate() {
		// TODO - implement userController.legalDate
		throw new UnsupportedOperationException();
	}

}