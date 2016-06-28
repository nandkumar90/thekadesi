package com.nandu.Report;

public class ReportProfile {
  private String docotr_referred_id;
  private String doctor_performed_id;
  private String doctor_verified_id;
  public enum  report_status {waiting, in_process, completed, delivered };
  
  //it can be list to store all timestamp from referred to delivered
  private String TimeStamp;
  
  public enum  report_type {text,dicom, compressed, normal_image };
 
  private String report_department;
  
  private String report_outLineText;
  
  
  
}
