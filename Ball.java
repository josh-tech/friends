public class Ball extends BingoExodus{
private String date;
private int bNumber;
private String time;
   public Ball(String time, String date,int bNumber) {
      time = "empty";
      date = "empty";
      bNumber = -1;
   }
   
   //set ball number
  public void setNumber(int x){
   bNumber = x;
  }
  
  
  //get ball number
  public int getNumber(){
     return bNumber;
  }
  
  
  //set date
  public void setDate(String d){
      date = d;
  }
  
  //get date
  public String getDate(){
      return date;
  }
  
  //set time
  public void setTime(String t){
      time = t;
  }    
  
  //print ball
  public String printOut(){;
      String answer = this.date + " " + this.time+ " " +this.bNumber;
      return answer; 
  } 
}               