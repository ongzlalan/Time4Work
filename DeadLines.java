public class DeadLines {
 
 private String startDate = "";  //date format is �gDDMMYY�h
 private String startTime = "";  //time is 24hrs �g0000�h
 private String endDate = "";
 private String endTime = "";
 private int type = 0;    //1 = deadline task, 2 = duration
 private final int DeadlineType = 1;
 private final int DurationType = 2;

 public DeadLines(String sDate, String sTime, String eDate, String eTime) {
  setStartDate(sDate);
  setStartTime(sTime);
  setEndDate(eDate);
  setEndTime(eTime);
  setType(DurationType);
 }
 
 public DeadLines(String eDate, String eTime) {
  setEndDate(eDate);
  setEndTime(eTime);
  setType(DeadlineType);
 }
 
 public String getStartDate() {
  return startDate;
 }

 public void setStartDate(String startDate) {
  this.startDate = startDate;
 }

 public String getStartTime() {
  return startTime;
 }

 public void setStartTime(String startTime) {
  this.startTime = startTime;
 }

 public String getEndDate() {
  return endDate;
 }

 public void setEndDate(String endDate) {
  this.endDate = endDate;
 }

 public String getEndTime() {
  return endTime;
 }

 public void setEndTime(String endTime) {
  this.endTime = endTime;
 }

 public int getType() {
  return type;
 }

 public void setType(int type) {
  this.type = type;
 }
}