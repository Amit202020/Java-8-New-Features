package annodemo;



class Account {
	public void createAcc() {
		System.out.println("account created");
	}
}



class AccountDemo {

	Account acc = new Account() {
		public void createAcc() {
			System.out.println("account anno");
		}
	};

	void show() {
		acc.createAcc();
	}

	public static void main(String args[]) {
		AccountDemo ad = new AccountDemo();
		ad.show();
	}
}
