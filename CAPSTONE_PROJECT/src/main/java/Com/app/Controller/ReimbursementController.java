package Com.app.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/reimbursement")
public class ReimbursementController<Response> {

	@Autowired
	private Com.app.Service.IReimbursementSrv rmtSrv;
	public void setRmtSrv(Com.app.Service.IReimbursementSrv rmtSrv) {
		this.rmtSrv = rmtSrv;
	}
	
	@PostMapping(value="/apply")
	public Response applyForReimbursement(@RequestBody Com.app.Pojo.Reimbursement rObj){
		
		String responseData = rmtSrv.applyReimbursement(rObj);
		
		Response response = new Response(200, responseData);
		return response;
		
	}
	
	@GetMapping(value="/all/{userId}")
	public Response getAllReimbursements(@PathVariable int userId){
		 
		List<Com.app.Pojo.Reimbursement> reimbursements = rmtSrv.getReimbursements(userId);
		Response response = new Response(200, reimbursements);
		return response;
	}
	
	// view all reimbursements
	@GetMapping(value="/all")
	public Response getAllReimbursements() {
		List<Com.app.Pojo.Reimbursement> reimbursements = rmtSrv.getAllReimbursements();
		Response response = new Response(200, reimbursements);
		return response;
	}
	
	// resolve reimbursement -- update the status of reimbursement
	@PutMapping(value="/resolve")
	public Response resolveReimbursement(@RequestBody Com.app.Pojo.Reimbursement rObj) {
		  String result = rmtSrv.updateReimbursements(rObj);
		  Response response = new Response(200, result);
		  return response;
	}
	
}
