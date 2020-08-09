package jp.co.joshua.tools.gen;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

import jp.co.joshua.common.util.FileUtil.FileSeparator;
import jp.co.joshua.common.util.StringUtil;
import jp.co.joshua.tools.db.Table;
import jp.co.joshua.tools.util.ToolUtil;

/**
 * table-define.sqlの自動生成クラス
 *
 * @version 1.0.0
 */
public class TableDefineGenerator extends BaseGenerator {

    @Override
    List<GenerateFile> generateImpl() throws Exception {

        List<Table> tableList = ToolUtil.getTableList(excel.getRowList());
        StringJoiner body = new StringJoiner(StringUtil.NEW_LINE);
        tableList.stream().forEach(e -> {
            body.add("-- " + e.getLogicalName());
            body.add("SHOW COLUMNS FROM " + e.getPhysicalName() + ";");
        });

        // 自動生成ファイル
        GenerateFile generateFile = new GenerateFile();
        generateFile.setFileName("table_define.sql");
        generateFile.setData(body.toString());
        generateFile.setOutputPath(prop.getBaseDir() + FileSeparator.SYSTEM.getValue()
                + GenerateType.TABLE_DEFINE.getPath());
        return Arrays.asList(generateFile);
    }

}
