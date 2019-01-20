package con.hongghe.basic.thread;

import com.hongghe.basicjava.thread.SingleThread;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author hongghe 2018/11/18
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class TestSingleThread {

    @Autowired
    private SingleThread singleThread;

    @Test
    public void testSingle() {
        log.debug("The test of test single.");
        singleThread.singleThread();
    }
}
