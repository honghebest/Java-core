package con.hongghe.basic.collections;

import com.google.gson.*;
import com.hongghe.basicjava.domain.ApiResult;
import com.hongghe.basicjava.string.StringDemo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class StringTest {

    @Autowired
    private StringDemo stringDemo;

    @Test
    public void testStringDemo() {
        //stringDemo.compareString("name", "hongghe");
        String name = "hongghe";
        String sex = "man";
        if ((name + sex) .equals("honggheman")) {
            log.info("true");
        }

        log.info("false");
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
        log.info(gson.toJson(map));
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = jsonParser.parse(parameter);
        String name = jsonElement.getAsJsonObject().getAsJsonPrimitive("name").getAsString();
        JsonObject jsonObject = jsonElement.getAsJsonObject().getAsJsonObject("map");
        Map maps = new Gson().fromJson(jsonObject, Map.class);
        log.info(gson.toJson(maps));
    }

    @Test
    public void testEnum() {
        switch (ApiResult.SUCCESS) {
            case SUCCESS:
                log.info("success");
                break;
            case ERROR:
                log.info("error");
                break;
            default:
                break;
        }

        if (ApiResult.SUCCESS == ApiResult.SUCCESS) {
            log.info("SUCCESS");
        } else {
            log.info("ERROR");
        }
    }
}
