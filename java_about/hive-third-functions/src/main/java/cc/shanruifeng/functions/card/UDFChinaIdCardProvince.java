package cc.shanruifeng.functions.card;

import cc.shanruifeng.functions.utils.CardUtils;
import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

/**
 * @author ruifeng.shan
 * @date 2016-07-25
 * @time 19:42
 */
@Description(name = "id_card_province"
        , value = "_FUNC_(string) - get province by given china id card."
        , extended = "Example:\n > select _FUNC_(string) from src;")
public class UDFChinaIdCardProvince extends UDF {
    private Text result = new Text();

    public UDFChinaIdCardProvince() {
    }

    public Text evaluate(Text idCard) {
        result.set(CardUtils.getIdCardProvince(idCard.toString()));
        return result;
    }
}
