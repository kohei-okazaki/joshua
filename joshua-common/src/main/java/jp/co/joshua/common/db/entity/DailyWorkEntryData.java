package jp.co.joshua.common.db.entity;

import jp.co.joshua.common.db.entity.BaseEntity;
import org.seasar.doma.Entity;
import org.seasar.doma.jdbc.entity.NamingType;
import org.seasar.doma.Id;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import java.lang.Integer;
import java.time.LocalDateTime;
import jp.co.joshua.common.db.type.WorkAuthStatus;
import java.lang.String;

/**
 * 日別勤怠登録情報 Entity
 *
 * @version 1.0.0
 */
@Entity(naming = NamingType.SNAKE_UPPER_CASE)
public class DailyWorkEntryData extends BaseEntity {

    /** 日別勤怠登録情報ID */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer seqDailyWorkEntryDataId;
    /** 勤怠ユーザ管理マスタID */
    private Integer seqWorkUserMngMtId;
    /** 始業時間 */
    private LocalDateTime begin;
    /** 終業時間 */
    private LocalDateTime end;
    /** 承認ステータス */
    private WorkAuthStatus workAuthStatus;
    /** 備考 */
    private String note;

    public void setSeqDailyWorkEntryDataId(Integer seqDailyWorkEntryDataId) {
        this.seqDailyWorkEntryDataId = seqDailyWorkEntryDataId;
    }

    public Integer getSeqDailyWorkEntryDataId() {
        return seqDailyWorkEntryDataId;
    }

    public void setSeqWorkUserMngMtId(Integer seqWorkUserMngMtId) {
        this.seqWorkUserMngMtId = seqWorkUserMngMtId;
    }

    public Integer getSeqWorkUserMngMtId() {
        return seqWorkUserMngMtId;
    }

    public void setBegin(LocalDateTime begin) {
        this.begin = begin;
    }

    public LocalDateTime getBegin() {
        return begin;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setWorkAuthStatus(WorkAuthStatus workAuthStatus) {
        this.workAuthStatus = workAuthStatus;
    }

    public WorkAuthStatus getWorkAuthStatus() {
        return workAuthStatus;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

}