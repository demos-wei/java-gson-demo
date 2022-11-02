package com.example.gson.entity;

public class TimeData {
  private String time;
  private Long milliseconds_since_epoch;
  private String date;

  @Override
  public String toString() {
    return new StringBuilder().append("TimeData{").append("time: ")
        .append(time).append(",milliseconds_since_epoch: ")
        .append(milliseconds_since_epoch).append(",date:").
        append(date).append("}").toString();
  }
}
