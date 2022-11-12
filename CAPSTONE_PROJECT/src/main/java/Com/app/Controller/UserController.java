package Com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // @Controller + @ResponseBody
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private Com.app.Service.IUserSrv userSrv;
	public void setUserSrv(Com.app.Service.IUserSrv userSrv) {
		this.userSrv = userSrv;
	}
	
	@PostMapping(value="/new")
	public Com.app.Pojo.Response createNewUser(@RequestBody Com.app.Pojo.User user){
		
		String responseData = userSrv.createUser(user);
		Com.app.Pojo.Response resp = new Com.app.Pojo.Response(200, responseData);
		return resp;
	}
	
	@PutMapping(value="/update")
	public Com.app.Pojo.Response updateUser(@RequestBody Com.app.Pojo.User user){
		
		String responseData = userSrv.updateUser(user);
		Com.app.Pojo.Response resp = new Com.app.Pojo.Response(200, responseData);
		return resp;
	}
	
	@DeleteMapping(value="/delete/{userId}")
	public Com.app.Pojo.Response deleteUser(@PathVariable int userId) {
		
		String responseData = userSrv.deleteUser(userId);
		Com.app.Pojo.Response resp = new Com.app.Pojo.Response(200, responseData);
		return resp;
		
	}
	
	@PostMapping(value="/validate")
	public Com.app.Pojo.Response getUser(@RequestBody Com.app.Pojo.User user){
		
		Com.app.Pojo.User userObj = userSrv.getUser(user.getUserName(), user.getPwd());
		Com.app.Pojo.Response resp = new Com.app.Pojo.Response(200, userObj);
		return resp;
	}
	

}

