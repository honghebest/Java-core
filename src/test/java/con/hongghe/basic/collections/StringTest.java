package con.hongghe.basic.collections;

import com.google.gson.*;
import com.hongghe.basicjava.domain.ApiResult;
import com.hongghe.basicjava.string.StringDemo;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class StringTest {

    private static final Logger logger = LoggerFactory.getLogger(StringTest.class);

    @Autowired
    private StringDemo stringDemo;

    @Test
    public void testStringDemo() {
        //stringDemo.compareString("name", "hongghe");
        String name = "hongghe";
        String sex = "man";
        if ((name + sex) .equals("honggheman")) {
            logger.info("true");
        }

        logger.info("false");
    }

    @Test
    public void testGson() throws Exception {
        Gson gson = new Gson();
        Map map1 = new HashMap();
        map1.put("name", "123123");
        map1.put(1, 12);

        Map map = new HashMap();
        map.put("name", "123123");
        map.put(1, 12);
        map.put("map", map1);
        String parameter = gson.toJson(map);
        logger.info(gson.toJson(map));
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = jsonParser.parse(parameter);
        String name = jsonElement.getAsJsonObject().getAsJsonPrimitive("name").getAsString();
        JsonObject jsonObject = jsonElement.getAsJsonObject().getAsJsonObject("map");
        Map maps = new Gson().fromJson(jsonObject, Map.class);
        logger.info(gson.toJson(maps));
    }

    @Test
    public void testEnum() {
        switch (ApiResult.SUCCESS) {
            case SUCCESS:
                logger.info("success");
                break;
            case ERROR:
                logger.info("error");
                break;
            default:
                break;
        }

        if (ApiResult.SUCCESS == ApiResult.SUCCESS) {
            logger.info("SUCCESS");
        } else {
            logger.info("ERROR");
        }
    }
}
