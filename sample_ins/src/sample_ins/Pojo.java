package sample_ins;

public class Pojo {
	
	private String policy_no;
	private int cost_of_policy;
	private String date_of_expiry;
	private String date_of_admission;
	private String date_of_discharge;
	private String medical_specialist;
	//private String pNoo;
	
	
	
	public Pojo(String policy_no, int cost_of_policy, String date_of_expiry, String date_of_admission,
			String date_of_discharge, String medical_specialist) {
		super();
		this.policy_no = policy_no;
		this.cost_of_policy = cost_of_policy;
		this.date_of_expiry = date_of_expiry;
		this.date_of_admission = date_of_admission;
		this.date_of_discharge = date_of_discharge;
		this.medical_specialist = medical_specialist;
		//this.pNoo=pNoo;
	}
	
	public Pojo() {
		// TODO Auto-generated constructor stub
	}

	public String getPolicy_no() {
		return policy_no;
	}
	public void setPolicy_no(String policy_no) {
		this.policy_no = policy_no;
	}
	public int getCost_of_policy() {
		return cost_of_policy;
	}
	public void setCost_of_policy(int cost_of_policy) {
		this.cost_of_policy = cost_of_policy;
	}
	public String getDate_of_expiry() {
		return date_of_expiry;
	}
	public void setDate_of_expiry(String date_of_expiry) {
		this.date_of_expiry = date_of_expiry;
	}
	public String getDate_of_admission() {
		return date_of_admission;
	}
	public void setDate_of_admission(String date_of_admission) {
		this.date_of_admission = date_of_admission;
	}
	public String getDate_of_discharge() {
		return date_of_discharge;
	}
	public void setDate_of_discharge(String date_of_discharge) {
		this.date_of_discharge = date_of_discharge;
	}
	public String getMedical_specialist() {
		return medical_specialist;
	}
	public void setMedical_specialist(String medical_specialist) {
		this.medical_specialist = medical_specialist;
	}
	/*public String getpNoo() {
		getPolicy_no().substring(0,2);
		return pNoo;
	}
	public void setpNoo(String pNoo) {
		this.pNoo = pNoo;
	}*/
	
	

}
