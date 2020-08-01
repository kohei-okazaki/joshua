-- 日別勤怠登録情報
CREATE TABLE IF NOT EXISTS DAILY_WORK_ENTRY_DATA (
  -- 日別勤怠登録情報ID
  SEQ_DAILY_WORK_ENTRY_DATA_ID INT AUTO_INCREMENT NOT NULL PRIMARY KEY COMMENT '日別勤怠登録情報ID',
  -- 勤怠ユーザマスタID
  SEQ_WORK_USER_MT_ID INT NOT NULL COMMENT '勤怠ユーザマスタID',
  -- 始業時間
  BEGIN TIMESTAMP NOT NULL COMMENT '始業時間',
  -- 終業時間
  END TIMESTAMP NOT NULL COMMENT '終業時間',
  -- 承認ステータス
  STATUS VARCHAR(2) NOT NULL COMMENT '承認ステータス',
  -- 備考
  NOTE VARCHAR(256) COMMENT '備考',
  -- バージョン情報
  VERSION INT NOT NULL COMMENT 'バージョン情報',
  -- 登録日時
  REG_DATE TIMESTAMP NOT NULL COMMENT '登録日時',
  -- 更新日時
  UPDATE_DATE TIMESTAMP NOT NULL COMMENT '更新日時'
);