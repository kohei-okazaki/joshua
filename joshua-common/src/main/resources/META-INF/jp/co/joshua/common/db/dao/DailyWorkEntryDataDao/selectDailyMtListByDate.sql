SELECT
  *
FROM
  DAILY_WORK_ENTRY_DATA
WHERE
  SEQ_WORK_USER_MT_ID =/* seqWorkUserMtId */1
  AND DATE_FORMAT(BEGIN, '%Y%m') = /* date */202008
ORDER BY
  BEGIN;
