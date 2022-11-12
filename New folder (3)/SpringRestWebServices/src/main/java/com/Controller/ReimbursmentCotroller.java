package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Reimbursement;
import com.pojo.ResponseEntity;
import com.service.IReimbursementSrv;

@Controller
@RequestMapping(value="/reimbursement")
public class ReimbursementController {
	
	@Autowired
	private IReimbursementSrv reimSrv;
	public void setReimSrv(IReimbursementSrv reimSrv) {
		this.reimSrv = reimSrv;
	}
	
	// As an employee i should be able to raise a new reimbursement
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public @ResponseBody ResponseEntity createReimbursement(@RequestBody Reimbursement rObj) {  // step 2
		
		String data = reimSrv.createReimbursement(rObj);  // step 3
		ResponseEntity resp = new ResponseEntity(data, 200);
		return resp;   // STEP 8
	}
	
	// As an employee, i can make changes in the existing reimbursement
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public @ResponseBody ResponseEntity updateReimbursement(@RequestBody Reimbursement rObj){
		
		String data = reimSrv.updateReimbursement(rObj);
		ResponseEntity resp = new ResponseEntity(data, 200);
		return resp;
	}
	
	// As an employee, i can delete my reimbursement
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public @ResponseBody ResponseEntity deleteReimbursement(@RequestParam int rId) {
		
		String data = reimSrv.deleteReimbursement(rId);
		ResponseEntity resp = new ResponseEntity(data, 200);
		return resp;
	}
	
	// As an employee, i should be able to see my reimbursements
	@RequestMapping(value="/display", method=RequestMethod.GET)
	public @ResponseBody ResponseEntity displayReimbursements(){
		
		List<Reimbursement> reimbursements = reimSrv.getReimbursements();
		
		ResponseEntity resp = new ResponseEntity(reimbursements, 200);
		return resp;
	}

}


// http://localhost:8080/project_name/reimbursement/create


