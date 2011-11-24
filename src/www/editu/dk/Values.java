package www.editu.dk;

import java.util.ArrayList;

public class Values {

	private ArrayList<String> usersList = new ArrayList<String>();
	private ArrayList<String> passwordsList = new ArrayList<String>();
	private int length = usersList.toArray().length;
	private int loggedInAs = -1;

	public int getLength() {
		return length;
	}

	public boolean addUser(String... user) {
		boolean valid = false;
		for (int i = 0; i < length; i++) {
			if (!user[0].contentEquals(usersList.get(i))) {
				usersList.add(user[0]);
				passwordsList.add(user[1]);
				length++;
				valid = true;
				break;
			} else {
				valid = false;
			}
		}
		return valid;
	}

	public void setCurrentUser(int index) {
		// TODO Check boundaries against index.
		loggedInAs = index;
	}

	public int getCurrentUser() {
		return loggedInAs;
	}

	public String getCurrentUserName() {
		return getUser(loggedInAs);
	}

	public String getUser(int index) {
		// TODO Check boundaries against index.
		return usersList.get(index);
	}

	public String getPassword(int index) {
		// TODO Check boundaries against index.
		return passwordsList.get(index);
	}
}