package co.grandcircus.springlab;

public class Customer {


	    private String firstname;
	    private String lastname;
	    private String email;
	    private Integer phno;
	    private String password;
	    public Customer() {
	    }
	    public Customer(String firstname, String lastname, String email, Integer phno, String password) {
	        super();
	        this.firstname = firstname;
	        this.lastname = lastname;
	        this.email = email;
	        this.phno = phno;
	        this.password = password;
	    }
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Integer getPhno() {
			return phno;
		}
		public void setPhno(Integer phoneno) {
			this.phno = phoneno;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
	    public String toString() {
	        return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", phno=" + phno
	                + ", password=" + password + "]";
	    }
	
	
}
