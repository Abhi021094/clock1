
package clock1;


class clock1
{
    public static void main(String args[])
    {
        int sec =0;
        int min =0;
        int hour =0;
        int temp=0;
        int j=0;
        for(j=0;j<2;j++){
        	
            for(hour=1;hour<=12;hour++)
            {
            	
            	
                for(min=0;min<60;min++)
                {
                    for(sec=0;sec<60;sec++)
                    {
       
                    	
                    
              
                    	    if(hour<10 && min<10 && sec<10){                                                 //hour,min,sec<10
                    		   System.out.println("0"+hour+":0"+ min+":0"+sec+" AM");
                    		   }
                    	    else if(hour<10 && min<10 && sec>9){                                            //hour,min<10 and sec>9
                 			   System.out.println("0"+hour+":0"+ min+":"+sec+" AM");
                 		   }
                    	    else if (hour<10 && min>10 && sec<10){                                           //hour,sec<10 and min>9
                    	    	System.out.println("0"+hour+":"+ min+":0"+sec+" AM");
                    	    	
                    	    }
                    	                     		   
                    		   else if(hour>9 && min<10 && sec<10){                                             //hour>9 but min,sec<10
                    			   System.out.println(hour+":0"+ min+":0"+sec+" AM");
                    		   }
                    		  
                    		   else if(hour<10 && min>9 && sec>9){                                              //min,sec>9 but hour<10
                    			   
                    	   
                    	   System.out.println("0"+hour+":"+ min+":"+sec+"  AM");
                    	   }
                    		   else if(hour>9 && hour<12 && min>9 && sec<10){                                                 //hour,min>9 but sec<10
                    			   
                            	   
                            	   System.out.println(""+hour+":"+ min+":0"+sec+"  AM");
                            	   }
                    	    
                                else if(hour>9 && hour<12 && min<10 && sec>9){                                               //hour,sec>9 but min<10
                    			   
                            	   
                            	   System.out.println(""+hour+":0"+ min+":"+sec+"  AM");
                            	   }
                                else if(hour>9 && hour<12 && min>9 && sec>9){                                                 //hour,min.sec>9
                     			   
                             	   
                             	   System.out.println(""+hour+":"+ min+":"+sec+"  AM");
                             	   }
                                else if(hour==12 && min<10 && sec<10){
                                   System.out.println(hour+":0"+min+":0"+sec+" PM");     	
                                }
                                else if(hour==12 && min>=10 && sec<10){
                                	System.out.println(hour+":"+min+":0"+sec+" PM");
                                	
                                }
                                else if(hour==12 && min>=10 && sec>=10){
                                	System.out.println(hour+":"+min+":"+sec+" PM");
                                }
                    	   try{Thread.sleep(1000);}
                            catch(Exception e){}
                            for(int i=0;i<10;i++)
                            {
                                System.out.println("");
                      }                   
                    	    
                   	   
              	 }
               }
            }
                
                  
                temp=hour;   
                    if(temp==13)
                       {
                    	temp=1;
                       
                       for(temp=1;temp<13;temp++){
                    	  for(min=0;min<60;min++){
                    		  for(sec=0;sec<60;sec++){
                    			  
                    			  
                    			  if(temp<10 && min<10 && sec<10){                                                 //hour,min,sec<10
                           		   System.out.println("0"+temp+":0"+ min+":0"+sec+" PM");
                           		   }
                           	    else if(temp<10 && min<10 && sec>9){                                            //hour,min<10 and sec>9
                        			   System.out.println("0"+hour+":0"+ min+":"+sec+" PM");
                        		   }
                           	    else if (temp<10 && min>10 && sec<10){                                           //hour,sec<10 and min>9
                           	    	System.out.println("0"+hour+":"+ min+":0"+sec+" PM");
                           	    	
                           	    }
                           	                     		   
                           		   else if(temp>9 && min<10 && sec<10){                                             //hour>9 but min,sec<10
                           			   System.out.println(temp+":0"+ min+":0"+sec+" PM");
                           		   }
                           		  
                           		   else if(temp<10 && min>9 && sec>9){                                              //min,sec>9 but hour<10
                         			   
                           	   
                           	   System.out.println("0"+temp+":"+ min+":"+sec+"  PM");
                           	   }
                           		   else if(temp>9 && min>9 && sec<10){                                                 //hour,min>9 but sec<10
                           			   
                                   	   
                                   	   System.out.println(""+temp+":"+ min+":0"+sec+"  PM");
                                   	   }
                           	    
                                       else if(temp>9 && min<10 && sec>9){                                               //hour,sec>9 but min<10
                           			   
                                   	   
                                   	   System.out.println(""+temp+":0"+ min+":"+sec+"  PM");
                                   	   }
                                       else if(temp>9 && min>9 && sec>9){                                                 //hour,min.sec>9
                            			   
                                    	   
                                    	   System.out.println(""+temp+":"+ min+":"+sec+"  PM");
                                    	   }
                                       else if(temp==12 && min<10 && sec<10){
                                           System.out.println(temp+":0"+min+":0"+sec+" AM");     	
                                        }
                                        else if(temp==12 && min>=10 && sec<10){
                                        	System.out.println(temp+":"+min+":0"+sec+" AM");
                                        	
                                        }
                                        else if(temp==12 && min>=10 && sec>=10){
                                        	System.out.println(temp+":"+min+":"+sec+" AM");
                                        }
                    			  try{Thread.sleep(1000);}
                                  catch(Exception e){}
                                  for(int i=0;i<10;i++)
                                  {
                                      System.out.println("");
                                  }
                    		  }
                    	  }
                         
                    		  }
                    	  }
                    	  		  
                    			  
                    	  j--;
                  
                    			  
                    		  } 
    }
}
               
            
               
            

        


    




