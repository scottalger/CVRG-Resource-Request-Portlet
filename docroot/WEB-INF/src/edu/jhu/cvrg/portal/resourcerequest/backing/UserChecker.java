package edu.jhu.cvrg.portal.resourcerequest.backing;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import edu.jhu.cvrg.portal.resourcerequest.utility.ResourceUtility;

/*
Copyright 2011 Johns Hopkins University Institute for Computational Medicine

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
/**
* @author Chris Jurado
* 
*/

@ManagedBean(name = "userChecker")
@ViewScoped
public class UserChecker {

	public String getAuthorized() {
		if(ResourceUtility.getCurrentUser() == null || !ResourceUtility.isApprover())
			return "false"; 
		else 
			return "true";
	}
	
}
