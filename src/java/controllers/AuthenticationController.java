/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author adickinson
 */
public class AuthenticationController {
    private static AuthenticationController instance = new AuthenticationController();
    
    private AuthenticationController(){
        
    }
    
    public static AuthenticationController getInstace(){
        return instance;
    }
    
    /** 
     * User submits request with email + pass
     * 
     * Server validates, if valid grants an access token which user can store in cookies
     * 
     * Whenever a user tries to submit an authentication sensitive request, they also submit 
     * the token.
     * Server then validates the token, and if token is good the user gets to proceed.
     * 
     * Token is time sensitive, with a new one being issued whenever they successfully perform an action.
     * 
     * The danger is that this potentially allows malicious agents to spoof the token to gain access.
     * As such the IP of the user, accessed by the request header X-FORWARDED-FOR could be compared to 
     * the the IP address supplied by the client, with the request only being accepted should the 
     * IPs match, however this is potentially tricky and should not be attempted until the end.
     * 
     */
    
    //Method to validate email + pass
    
    //Method to validate token
    
    //Method to generate auth token
    
    //Method to 
    
    
}
