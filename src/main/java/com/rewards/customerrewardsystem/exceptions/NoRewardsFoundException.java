package com.rewards.customerrewardsystem.exceptions;

public class NoRewardsFoundException extends Exception{

      public   NoRewardsFoundException(){
        super("NO REWARDS FOUND FOR GIVEN CUSTOMER");
    }
}
