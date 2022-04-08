package com.springRest2;

import org.springframework.stereotype.Service;

@Service
public class UserService
{
	public String validate(String username,String Password)
	{
        if (username.equals("Novel") && Password.equals("Malla"))
        {
            return "Valid User";
        }
        else
        {
        	return "Invalid User";
        }
    }

}
