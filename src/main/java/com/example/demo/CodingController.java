package com.example.demo;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CodingController {
    @RequestMapping("/coding")
    public String index(){
    	return "Hello Coding Dojo!";
    
    }
    
    @RequestMapping("coding/python")
    public String index1(){
    	return "Python/Django was awesome!";
    
    }
    
    @RequestMapping("coding/java")
    public String index2(){
    	return "java/Spring is better!";
    
    }
    
    @RequestMapping("/coding/dojo/{dojo}")
    public String show(@PathVariable("dojo") String dojo){
    	return "The dojo is " + dojo;
    }
    
    @RequestMapping("/coding/burbank-dojo/{dojo}")
    public String show2(@PathVariable("dojo") String dojo){
    	return "Burbank Dojo is located in Southern California" + dojo;
    }
    
    @RequestMapping("/coding/san-jose/{dojo}")
    public String show3(@PathVariable("dojo") String dojo){
    	return "SJ dojo is the headquarters" + dojo;
    }
    
    

   
    
}