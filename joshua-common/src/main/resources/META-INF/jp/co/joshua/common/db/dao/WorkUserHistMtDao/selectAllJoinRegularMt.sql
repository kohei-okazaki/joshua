SELECT
  WUHM.SEQ_WORK_USER_HIST_MT_ID
  , WUHM.SEQ_WORK_USER_MNG_MT_ID
  , WUHM.SEQ_WORK_USER_DETAIL_MT_ID
  , WUHM.SEQ_LOGIN_ID
  , WUHM.SEQ_REGULAR_WORK_MT_ID
  , RWM.BEGIN_HOUR
  , RWM.BEGIN_MINUTE
  , RWM.END_HOUR
  , RWM.END_MINUTE
  , WUHM.REG_DATE
FROM
  WORK_USER_HIST_MT WUHM
  LEFT OUTER JOIN REGULAR_WORK_MT RWM
    ON WUHM.SEQ_REGULAR_WORK_MT_ID = RWM.SEQ_REGULAR_WORK_MT_ID
ORDER BY
  WUHM.SEQ_LOGIN_ID
  , WUHM.SEQ_REGULAR_WORK_MT_ID;
