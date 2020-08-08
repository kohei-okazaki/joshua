package jp.co.joshua.dashboard.work.form;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * 1日あたりの勤怠データ
 *
 * @version 1.0.0
 */
public class DailyEntryForm {

    /** 日にち */
    private String date;
    /** 始業時間(時) */
    @Min(value = 0)
    @Max(value = 23)
    private Integer workBeginHour;
    /** 始業時間(分) */
    @Min(value = 0)
    @Max(value = 59)
    private Integer workBeginMinute;
    /** 終業時間(時) */
    @Min(value = 0)
    @Max(value = 23)
    private Integer workEndHour;
    /** 終業時間(分) */
    @Min(value = 0)
    @Max(value = 59)
    private Integer workEndMinute;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getWorkBeginHour() {
        return workBeginHour;
    }

    public void setWorkBeginHour(Integer workBeginHour) {
        this.workBeginHour = workBeginHour;
    }

    public Integer getWorkBeginMinute() {
        return workBeginMinute;
    }

    public void setWorkBeginMinute(Integer workBeginMinute) {
        this.workBeginMinute = workBeginMinute;
    }

    public Integer getWorkEndHour() {
        return workEndHour;
    }

    public void setWorkEndHour(Integer workEndHour) {
        this.workEndHour = workEndHour;
    }

    public Integer getWorkEndMinute() {
        return workEndMinute;
    }

    public void setWorkEndMinute(Integer workEndMinute) {
        this.workEndMinute = workEndMinute;
    }

}