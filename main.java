package logingsystem;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDandPassword idandPassword = new IDandPassword();
		
		
		loginPage LoginPage = new loginPage(idandPassword.getLoginInfo());
	}

}
