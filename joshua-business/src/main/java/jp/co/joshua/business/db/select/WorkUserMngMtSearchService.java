package jp.co.joshua.business.db.select;

import jp.co.joshua.common.db.entity.CompositeWorkUserMt;
import jp.co.joshua.common.db.entity.WorkUserMngMt;

/**
 * 勤怠ユーザ管理マスタ検索サービスインタフェース
 *
 * @version 1.0.0
 */
public interface WorkUserMngMtSearchService {

    long count();

    WorkUserMngMt selectBySeqLoginId(Integer seqLoginId);

    CompositeWorkUserMt selectActiveRegularMt(Integer seqLoginId);

}
